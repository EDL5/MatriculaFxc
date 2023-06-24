package Controlador;

import ClasesObjeto.Alumno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class EstudianteDatosController implements Initializable{

    @FXML
    private Button btnGuardar;

    @FXML
    private TableColumn colApellPaterAlumno;

    @FXML
    private TableColumn  colApelliMaterAlumno;
    
    @FXML
    private TableColumn colSeccion;
    
    @FXML
    private TableColumn colGradoAlumno;

    @FXML
    private TableColumn  colDNI;
    
    @FXML
    private TableColumn colEdad;

    @FXML
    private TableColumn colNombreAlumno;
    
    @FXML
    private TextField txtEdad;

    @FXML
    private TableView<Alumno> tblAlumno;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtDNI;
    
    @FXML
    private TextField txtGrado;
    
    @FXML
    private TextField txtSeccion;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;
    
    private ObservableList<Alumno> OSalumno;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        OSalumno = FXCollections.observableArrayList();
        this.colNombreAlumno.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.colApellPaterAlumno.setCellValueFactory(new PropertyValueFactory("ApelldioPaterno"));
        this.colApelliMaterAlumno.setCellValueFactory(new PropertyValueFactory("ApelldioMaterno"));
        this.colDNI.setCellValueFactory(new PropertyValueFactory("DNI"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("Edad"));
        this.colGradoAlumno.setCellValueFactory(new PropertyValueFactory("Grado"));
        this.colSeccion.setCellValueFactory(new PropertyValueFactory("Seccion"));
    }

    @FXML
    void Guardar(ActionEvent event) {
        String nom = this.txtNombre.getText();
        String ApePa = this.txtApellidoPaterno.getText();
        String ApeMa = this.txtApellidoMaterno.getText();
        String docDNI = this.txtDNI.getText();
        String direc = this.txtDireccion.getText();
        String grad = this.txtGrado.getText();
        String secc = this.txtSeccion.getText();
        int edad = Integer.parseInt(this.txtEdad.getText());
        
        Alumno al = new Alumno(grad,secc,edad,nom,ApePa,ApeMa,direc,docDNI);
        try{
            if (!this.OSalumno.contains(al)){
               this.OSalumno.add(al);
               this.tblAlumno.setItems(OSalumno);
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("el alumno Existe");
                alert.showAndWait();
            }
        }catch(NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("el alumno Existe");
            alert.showAndWait();
        }
    }
}