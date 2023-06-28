package Controlador;

import ClasesObjeto.Estudiante;
import Utils.ColegioEntity;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.persistence.EntityManager;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javafx.scene.control.Alert.AlertType;

public class EstudianteController {

    @FXML private TableView<Estudiante> estudianteTabla;

    @FXML private TextField txtDni;
    @FXML private TextField txtNombres;
    @FXML private TextField txtApellidos;
    @FXML private ComboBox<String> cbGrado;
    @FXML private DatePicker dpFechaNacimiento;
    @FXML private TableColumn<Estudiante, String> colNombres;
    @FXML private TableColumn<Estudiante, String> colApellidos;
    @FXML private TableColumn<Estudiante, String> colDni;
    @FXML private TableColumn<Estudiante, String> colGrado;
    @FXML private TableColumn<Estudiante, String> colFechaNacimiento;


    private List<Estudiante> estudiantes;
    private EntityManager em = ColegioEntity.getEntityManager();

    @FXML
    private void initialize() {

        listarEstudiantes();
        GradoController gradoController = new GradoController();
        cbGrado.setItems(gradoController.listaGrados());
    }


    @FXML
    public void btnGuardar(ActionEvent event){

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(txtNombres.getText());
        estudiante.setDni(txtDni.getText());
        estudiante.setApellidos(txtApellidos.getText());
        estudiante.setGrado(cbGrado.getValue());
        estudiante.setFechaNacimiento(dpFechaNacimiento.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        try {
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Estudiante Agregado");
            alert.showAndWait();
            listarEstudiantes();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void listarEstudiantes(){
        colNombres.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getNombre())); ;
        colApellidos.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getApellidos()));
        colDni.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getDni()));
        colGrado.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getGrado()));
        colFechaNacimiento.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getFechaNacimiento()));

        String jpql = "SELECT e FROM Estudiante AS e";
        estudiantes  = em.createQuery(jpql, Estudiante.class).getResultList();
        ObservableList<Estudiante> obEstudiantes = FXCollections.observableArrayList(estudiantes);
        estudianteTabla.setItems(obEstudiantes);
    }

    public List<Estudiante> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT e FROM Estudiante AS e WHERE e.nombre =: nombre";
        return em.createQuery(jpql, Estudiante.class).setParameter("nombre", nombre).getResultList();
    }

}
