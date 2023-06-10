package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
    private ChoiceBox<String> chbGrado;

    @FXML
    private ChoiceBox<String> chbNivel;

    @FXML
    private ChoiceBox<String> chbSeccion;

    @FXML
    private ChoiceBox<String> chbSituacion;

    @FXML
    private DatePicker dapFechaNacimiento;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtCiudadNacimiento;

    @FXML
    private TextField txtCodigoEstudiantil;

    @FXML
    private TextField txtColegioProcedente;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtProvinciaNacimiento;
    
    @FXML
    private TextField txtDNI;

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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        chbGrado.getItems().addAll(gradito2);
        chbNivel.getItems().addAll(nivelito);
        chbSeccion.getItems().addAll(secshion);
        chbSituacion.getItems().addAll(situasau);
    }

}