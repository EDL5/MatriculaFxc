
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PadresController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtApellidoMM;

    @FXML
    private TextField txtApellidoMP;

    @FXML
    private TextField txtApellidoPM;

    @FXML
    private TextField txtApellidoPP;

    @FXML
    private TextField txtDNIMadre;

    @FXML
    private TextField txtDireccionMadre;

    @FXML
    private TextField txtDireccionPadre;

    @FXML
    private TextField txtNombreEmegencia;

    @FXML
    private TextField txtNombreMadre;

    @FXML
    private TextField txtNombrePadre;

    @FXML
    private TextField txtTelefonoEmergencia;

    @FXML
    private TextField txtTelefonoMadre;

    @FXML
    private TextField txtTelefonoPadre;

    @FXML
    private TextField txtTrabajoMadre;

    @FXML
    private TextField txtTrabajoPadre;

    @FXML
    void Guardar(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
