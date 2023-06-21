package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class EstudianteDatosController implements Initializable{

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox<String> cbxGrado;

    @FXML
    private DatePicker dapFechaNacimiento;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtDNI;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    private String[] gradito2 = {null,"1°","2°","3°","4°","5°","6°"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbxGrado.getItems().addAll(gradito2);
    }
    
    @FXML
    void DateFecha(ActionEvent event) {

    }

    @FXML
    void Guardar(ActionEvent event) {

    }
}