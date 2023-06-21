package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class PagosController implements Initializable {

    @FXML
    private Button btnDeuda;

    @FXML
    private Button btnPagar;

    @FXML
    private TextField txtNombreAlu;

    @FXML
    private TextField txtPagoMensualidad;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    void RealisarPago(ActionEvent event) {

    }
    
    @FXML
    void VerDeuda(ActionEvent event) {

    }
}
