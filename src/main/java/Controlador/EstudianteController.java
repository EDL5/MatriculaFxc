package Controlador;

import ClasesObjeto.Estudiante;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import javafx.scene.control.Alert.AlertType;

public class EstudianteController {

    @FXML
    private TableView<Estudiante> estudianteTabla;

    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoPaterno;
    @FXML
    private TextField txtApellidoMaterno;
    @FXML
    private ComboBox cbGrado;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private TextField txtDireccion;


    @FXML
    public void btnGuardar(){

        Estudiante estudiante = new Estudiante();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegio");
        EntityManager em = emf.createEntityManager();

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

    public List<Estudiante> listarEstudiantes(EntityManager em){
        String jpql = "SELECT e FROM Estudiante AS e";
        return em.createQuery(jpql, Estudiante.class).getResultList();
    }

    public List<Estudiante> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT e FROM Estudiante AS e WHERE e.nombre =: nombre";
        return em.createQuery(jpql, Estudiante.class).setParameter("nombre", nombre).getResultList();
    }

}
