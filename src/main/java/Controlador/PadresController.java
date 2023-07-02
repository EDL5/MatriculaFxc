
package Controlador;

import ClasesObjeto.Estudiante;
import ClasesObjeto.Padres;
import Utils.ColegioEntity;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PadresController{

    @FXML private TableView padresTabla;
    @FXML private TextField txtDni;
    @FXML private TextField txtNombres;
    @FXML private TextField txtApellidos;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtDireccion;
    @FXML private TableColumn<Padres, String> colNombres;
    @FXML private TableColumn<Padres, String> colApellidos;
    @FXML private TableColumn<Padres, String> colDireccion;
    @FXML private TableColumn<Padres, String> colDni;
    @FXML private TableColumn<Padres, String> colTelefono;

    private List<Padres> padres;
    private EntityManager em = ColegioEntity.getEntityManager();

    @FXML
    void Guardar(ActionEvent event) {

    }
    
    @FXML
    public void initialize() {
        listarPadres();
    }

    @FXML
    public void btnGuardar(){

        Padres padres = new Padres();

        padres.setNombre(txtNombres.getText());
        padres.setDni(txtDni.getText());
        padres.setApellidos(txtApellidos.getText());
        padres.setDireccion(txtDireccion.getText());
        padres.setTelefono(txtTelefono.getText());

        try {
            em.getTransaction().begin();
            em.persist(padres);
            em.getTransaction().commit();
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Apoderado Agregado");
            alert.showAndWait();
            listarPadres();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void listarPadres(){
        String jpql = "SELECT p FROM Padres AS p";

        colNombres.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getNombre())); ;
        colApellidos.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getApellidos()));
        colDni.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getDni()));
        colDireccion.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getDireccion()));
        colTelefono.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getTelefono()));

        padres  = em.createQuery(jpql, Padres.class).getResultList();
        ObservableList<Padres> obPadres = FXCollections.observableArrayList(padres);
        padresTabla.setItems(obPadres);
    }

    public List<Padres> buscarPorNombre(String nombre, EntityManager em){
        String jpql = "SELECT p FROM Padres AS p WHERE p.nombre =: nombre";
        return em.createQuery(jpql, Padres.class).setParameter("nombre", nombre).getResultList();
    }
    
}
