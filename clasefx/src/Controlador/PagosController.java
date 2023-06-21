package Controlador;


import ClasesObjeto.Alumno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class PagosController implements Initializable {

    @FXML
    private Button btnDeuda;

    @FXML
    private Button btnPagar;

    @FXML
    private TableColumn colApeMaterno;

    @FXML
    private TableColumn colApePaterno;

    @FXML
    private TableColumn colCantidad;

    @FXML
    private TableColumn colDNI;

    @FXML
    private TableColumn colMes;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableView<Alumno> tblAlumnos;

    @FXML
    private TableView<String> tblDeuda;

    @FXML
    private TextField txtNombreAlu;

    @FXML
    private TextField txtPagoMensualidad;

    @FXML
    void RealisarPago(ActionEvent event) {

    }

    @FXML
    void VerDeuda(ActionEvent event) {

    }

    @FXML
    void filtrarNombre(KeyEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
