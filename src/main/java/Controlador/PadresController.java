
package Controlador;

import ClasesObjeto.Estudiante;
import ClasesObjeto.Padres;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PadresController implements Initializable {

    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoPaterno;
    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;

    @FXML
    void Guardar(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void btnGuardar(){

        Padres padres = new Padres();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegio");
        EntityManager em = emf.createEntityManager();

        padres.setNombre(txtNombre.getText());
        padres.setDni(txtDni.getText());
        padres.setApellidoPaterno(txtApellidoPaterno.getText());
        padres.setApellidoMaterno(txtApellidoMaterno.getText());
        padres.setDireccion(txtDireccion.getText());
        padres.setTelefono(txtTelefono.getText());

        try {
            em.getTransaction().begin();
            em.persist(padres);
            em.getTransaction().commit();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Apoderado Agregado");
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<Padres> listarPadres(EntityManager em){
        String jpql = "SELECT p FROM Padres AS p";
        return em.createQuery(jpql, Padres.class).getResultList();
    }

    public List<Padres> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT p FROM Padres AS p WHERE p.nombre =: nombre";
        return em.createQuery(jpql, Padres.class).setParameter("nombre", nombre).getResultList();
    }
    
}
