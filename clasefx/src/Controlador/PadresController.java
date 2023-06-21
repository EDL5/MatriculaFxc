package Controlador;

import ClasesObjeto.Padres;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PadresController  implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private TableColumn colApelldioPadre;

    @FXML
    private TableColumn colApellidoMadre;

    @FXML
    private TableColumn colDNIPadres;

    @FXML
    private TableColumn colDireccion;

    @FXML
    private TableColumn colNombrePadres;
    
    @FXML
    private TableColumn colEdad;
    
    @FXML
    private TableColumn colTelefono;

    @FXML
    private TableView<Padres> tblApoderados;

    @FXML
    private TextField txtApellidoMP;

    @FXML
    private TextField txtApellidoPP;

    @FXML
    private TextField txtDNIMadre;

    @FXML
    private TextField txtDireccionPadre;
    
    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombrePadre;

    @FXML
    private TextField txtTelefonoPadre;
    
    private ObservableList<Padres> OSpadres;
    @FXML
    void Guardar(ActionEvent event) {
        String nom = this.txtNombrePadre.getText();
        String ApePa = this.txtApellidoPP.getText();
        String ApeMa = this.txtApellidoMP.getText();
        String docDNI = this.txtDNIMadre.getText();
        String direc = this.txtDireccionPadre.getText();
        int edad = Integer.parseInt(this.txtEdad.getText());
        String tel = this.txtTelefonoPadre.getText();
        
        Padres al = new Padres(tel,edad,nom,ApePa,ApeMa,direc,docDNI);
        try{
            if (!this.OSpadres.contains(al)){
               this.OSpadres.add(al);
               this.tblApoderados.setItems(OSpadres);
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OSpadres = FXCollections.observableArrayList();
        this.colNombrePadres.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.colApelldioPadre.setCellValueFactory(new PropertyValueFactory("ApelldioPaterno"));
        this.colApellidoMadre.setCellValueFactory(new PropertyValueFactory("ApelldioMaterno"));
        this.colDNIPadres.setCellValueFactory(new PropertyValueFactory("DNI"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory("Direccion"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("Edad"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory("Telefono"));
    }
    
}
