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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;

public class PagosController implements Initializable {

    @FXML
    private Button btnPagar;

    @FXML
    private TableColumn colApellidoMater;

    @FXML
    private TableColumn colApellidoPater;

    @FXML
    private TableColumn colDNI;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableView<Alumno> tblTablaPago;

    @FXML
    private TextField txtEstadoAlumno;

    @FXML
    private TextField txtMes;

    @FXML
    private TextField txtMontoPagar;

    @FXML
    private TextField txtNombre;
    
    private ObservableList<Alumno> OSalumnos;
    private ObservableList<Alumno> OSFiltroalumnos;

         
    @FXML
    void FlltarNombre(KeyEvent event) {
        String filtronombre = this.txtNombre.getText();
        
        if(filtronombre.isEmpty()){
            this.tblTablaPago.setItems(OSalumnos);
        }else{
            this.OSFiltroalumnos.clear();
            for (Alumno p:this.OSalumnos) {
                if(p.getNombre().toLowerCase().contains(filtronombre.toLowerCase())){
                    this.OSFiltroalumnos.add(p);
                }
            }
            
            this.tblTablaPago.setItems(OSFiltroalumnos);
        }
    }

    @FXML
    void Pagar(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OSalumnos = FXCollections.observableArrayList();
        this.colNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.colApellidoPater.setCellValueFactory(new PropertyValueFactory("ApelldioPaterno"));
        this.colApellidoMater.setCellValueFactory(new PropertyValueFactory("ApelldioMaterno"));
        this.colDNI.setCellValueFactory(new PropertyValueFactory("DNI"));
        
        OSalumnos = FXCollections.observableArrayList();
        OSFiltroalumnos = FXCollections.observableArrayList();
        
        this.tblTablaPago.setItems(OSalumnos);
        
        this.colNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.colApellidoPater.setCellValueFactory(new PropertyValueFactory("ApelldioPaterno"));
        this.colApellidoMater.setCellValueFactory(new PropertyValueFactory("ApelldioMaterno"));
        this.colDNI.setCellValueFactory(new PropertyValueFactory("DNI"));
    }
}
