package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class MatriculaController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblCodMatricula;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtDescuento;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtMensualidad;

    @FXML
    private TextField txtMensualidadFinal;

    @FXML
    private TextField txtPagoTotal;

    @FXML
    void Guardar(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
