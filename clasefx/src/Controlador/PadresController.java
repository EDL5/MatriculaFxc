package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PadresController  implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtApellidoMP;

    @FXML
    private TextField txtApellidoPP;

    @FXML
    private TextField txtDNIMadre;

    @FXML
    private TextField txtDireccionPadre;

    @FXML
    private TextField txtNombrePadre;

    @FXML
    private TextField txtTelefonoPadre;

    @FXML
    void Guardar(ActionEvent event) {

    }  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
