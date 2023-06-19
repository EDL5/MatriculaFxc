package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.util.StringConverter;

public class EstudianteDatosController implements Initializable{

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox<String> cbxNivel;

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
    private String[] gradito1 = {null,"1°","2°","3°","4°","5°"};
    private String[] gradito2 = {null,"1°","2°","3°","4°","5°","6°"};
    private String[] nivelito = {null,"Inicial","Primaria","Secundaria"};
    private String[] secshion = {null,"A","B","C","D","E","F"};
    private String[] situasau = {null,"Promovido","Ingresante","Repitiente"};
    private String[] gra = {null,"el niño tiene 3 años","el niño tiene 4 años","el niño tiene 5 años"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cbxNivel.getItems().addAll(nivelito);
    }

}