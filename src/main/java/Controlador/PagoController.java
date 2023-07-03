package Controlador;
import ClasesObjeto.Estudiante;
import ClasesObjeto.Pago;
import ClasesObjeto.PagoRealizado;
import Utils.ColegioEntity;
import Utils.JasperGenerador;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class PagoController{

    @FXML private TableView<Estudiante> estudiantesTabla;
    @FXML private TableView<Pago> pagosTabla;

    @FXML private TextField txtMes;
    @FXML private TextField txtMontoPagar;
    @FXML private TextField txtNombres;
    @FXML private TextField txtDni;

    @FXML private ComboBox<String> cbTipoPago;
    @FXML private ComboBox<String> cbMes;

    @FXML private TableColumn<Estudiante, String> colNombres;
    @FXML private TableColumn<Estudiante, String> colApellidos;
    @FXML private TableColumn<Estudiante, String> colDni;
    @FXML private TableColumn<Pago, String> colFechaPago;
    @FXML private TableColumn<Pago, String> colTipoPago;
    @FXML private TableColumn<Pago, String> colMes;
    private List<Estudiante> estudiantes;
    private List<Pago> pagos;
    private Estudiante estudianteAgregado = null;

    List<PagoRealizado> result = new LinkedList<>();
    private EntityManager em = ColegioEntity.getEntityManager();


    public void initialize() {
        listarEstudiantes();

        cbMes.setItems(meses());
        cbTipoPago.setItems(tipoDePago());
    }

    @FXML
    public void btnPagar(){
        Pago pago = new Pago();

        pago.setMes(cbMes.getValue());
        SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
        pago.setFechaDePago(fechaFormato.format(new Date()));
        pago.setMontoDePago(new BigDecimal(txtMontoPagar.getText()));
        pago.setTipoDePago(cbTipoPago.getValue());
        pago.setEstudiante(estudianteAgregado);

        PagoRealizado pagoRealizado = new PagoRealizado(txtNombres.getText(), txtMontoPagar.getText(), cbMes.getValue());
        List<PagoRealizado> result = new LinkedList<>();

        result.add(pagoRealizado);


        try {
            em.getTransaction().begin();
            em.persist(pago);
            em.getTransaction().commit();
            JasperGenerador.generarJasper(result);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Pago Agregado");
            alert.showAndWait();
            listarEstudiantes();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    @FXML
    public void btnAgregar(){ //Tambien muestra los pagos del alumno agregado
        em = ColegioEntity.getEntityManager();
        Estudiante estudianteSeleccionado = estudiantesTabla.getSelectionModel().getSelectedItem();
        if (estudianteSeleccionado != null) {
            //Agrega al estudiante
            String jpql = "SELECT e FROM Estudiante AS e WHERE e.id =: id";
            estudianteAgregado = em.createQuery(jpql, Estudiante.class).setParameter("id", estudianteSeleccionado.getId()).getSingleResult();

            txtDni.setText(estudianteAgregado.getDni());
            txtNombres.setText(estudianteAgregado.getNombre());

            //Agrega los pagos del estudiante
            colMes.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getMes()));
            colTipoPago.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getTipoDePago()));
            colFechaPago.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getFechaDePago()));

            String jpql2 = "SELECT p FROM Pago AS p WHERE p.estudiante.id =: id";
            pagos = em.createQuery(jpql2, Pago.class).setParameter("id", estudianteSeleccionado.getId()).getResultList();
            ObservableList<Pago> obPagos = FXCollections.observableArrayList(pagos);
            pagosTabla.setItems(obPagos);


        }
    }

    public void listarEstudiantes(){
        colNombres.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getNombre())); ;
        colApellidos.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getApellidos()));
        colDni.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getDni()));

        String jpql = "SELECT e FROM Estudiante AS e";
        estudiantes  = em.createQuery(jpql, Estudiante.class).getResultList();
        ObservableList<Estudiante> obEstudiantes = FXCollections.observableArrayList(estudiantes);
        estudiantesTabla.setItems(obEstudiantes);
    }

    public List<Estudiante> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT e FROM Estudiante AS e WHERE e.nombre =: nombre";
        return em.createQuery(jpql, Estudiante.class).setParameter("nombre", nombre).getResultList();
    }
    public ObservableList<String> meses(){
        List<String> meses = new ArrayList<String>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        ObservableList<String> obMeses = FXCollections.observableArrayList(meses);
        return obMeses;
    }
    public ObservableList<String> tipoDePago(){
        List<String> tipo = new ArrayList<String>();
        tipo.add("Matricula");
        tipo.add("Mensualidad");

        ObservableList<String> obTipo = FXCollections.observableArrayList(tipo);
        return obTipo;
    }

}