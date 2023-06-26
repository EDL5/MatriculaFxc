package Controlador;

import ClasesObjeto.Estudiante;
import Utils.ColegioEntity;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class EstudianteController {

    @FXML
    private TableView<Estudiante> estudianteTablas;

    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoPaterno;
    @FXML
    private TextField txtApellidoMaterno;
    @FXML
    private ComboBox<String> cbGrado;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TableColumn<Estudiante, String> colNombre;
    @FXML
    private TableColumn<Estudiante, String> colApellidoPaterno;

    private List<Estudiante> estudiantes;
    private EntityManager em = ColegioEntity.getEntityManager();

    @FXML
    private void initialize() {
        listarEstudiantes();
    }


    @FXML
    public void btnGuardar(ActionEvent event){

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(txtNombre.getText());
        estudiante.setDni(txtDni.getText());
        estudiante.setApellidoPaterno(txtApellidoPaterno.getText());
        estudiante.setApellidoMaterno(txtApellidoMaterno.getText());
        estudiante.setGrado(cbGrado.getAccessibleText());
        estudiante.setFechaNacimiento(dpFechaNacimiento.getAccessibleText());
        estudiante.setDireccion(txtDireccion.getText());

        try {
            em.getTransaction().begin();
            em.persist(estudiante);
            em.getTransaction().commit();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Estudiante Agregado");
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<Estudiante> listarEstudiantes(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegio");
        EntityManager em = emf.createEntityManager();



        colNombre.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getNombre())); ;
        colApellidoPaterno.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getApellidoPaterno()));

        String jpql = "SELECT e FROM Estudiante AS e";
        estudiantes  = em.createQuery(jpql, Estudiante.class).getResultList();
        for(Estudiante e : estudiantes){
            System.out.println(e.getNombre());
        }
        ObservableList<Estudiante> obEstudiantes = FXCollections.observableArrayList(estudiantes);
        estudianteTablas.setItems(obEstudiantes);
        return em.createQuery(jpql, Estudiante.class).getResultList();
    }

    public List<Estudiante> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT e FROM Estudiante AS e WHERE e.nombre =: nombre";
        return em.createQuery(jpql, Estudiante.class).setParameter("nombre", nombre).getResultList();
    }

}
