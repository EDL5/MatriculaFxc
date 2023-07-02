package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EstudianteDatosController implements Initializable{

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox<String> cbxNivel;
    @FXML
    private ComboBox<String> cbxGrado;

    /*@FXML
    private ComboBox<String> cbxNivel;*/

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

    @FXML
    void Guardar(ActionEvent event) {

    }
    
    @FXML
    void DateFecha(ActionEvent event) {

    }
    private String[] gradito2 = {null,"1°","2°","3°","4°","5°","6°"};

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        cbxGrado.getItems().addAll(gradito2);
       /* if (cbxNivel.equals("Primaria")) {
            cbxGrado.getItems().addAll(gradito1);
        } else if (cbxNivel.equals("Secundaria")) {
            cbxGrado.getItems().addAll(gradito2);
        } else if (cbxNivel.equals("Inicial")) {
            cbxGrado.getItems().addAll(gra);
        }
        cbxSeccion.getItems().addAll(secshion);
        cbxSituacion.getItems().addAll(situasau);*/
    }

}