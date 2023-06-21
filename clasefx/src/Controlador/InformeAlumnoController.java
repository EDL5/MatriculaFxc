package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class InformeAlumnoController implements Initializable {

    @FXML
    private TableColumn<String, String> colApellidoMaterno;

    @FXML
    private TableColumn<String, String> colApellidoPaterno;

    @FXML
    private TableColumn<String, String> colDNI;

    @FXML
    private TableColumn<String, String> colGrado;

    @FXML
    private TableColumn<String, String> colID;

    @FXML
    private TableColumn<String, String> colNombre;

    @FXML
    private TableColumn<String, String> colPadres;

    @FXML
    private TableView<String> tblAlumno;

    @FXML
    private TextField txtnobreAlumnoBusca;


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }
}
