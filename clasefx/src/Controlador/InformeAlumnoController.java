package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InformeAlumnoController implements Initializable {

    
    @FXML
    private TableColumn<?, ?> colApellidoMaterno;

    @FXML
    private TableColumn<?, ?> colApellidoPaterno;

    @FXML
    private TableColumn<?, ?> colDNI;

    @FXML
    private TableColumn<?, ?> colGrado;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colPadres;

    @FXML
    private TableView<?> tblAlumno;

    @FXML
    private TextField txtnobreAlumnoBusca;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
