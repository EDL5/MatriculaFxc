package Controlador;

import ClasesObjeto.Alumno;
import javafx.fxml.FXML;
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

public class InformeAlumnoController implements Initializable {

    @FXML
    private TableColumn colApellidoMaterno;

    @FXML
    private TableColumn colApellidoPaterno;

    @FXML
    private TableColumn colDNI;

    @FXML
    private TableColumn colGrado;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colNombre;

    @FXML
    private TableColumn colPadres;

    @FXML
    private TableView<Alumno> tblAlumnodos;

    @FXML
    private TextField txtnobreAlumnoBusca;
    
    private ObservableList<Alumno> OSInforme;
    private ObservableList<Alumno> OSfiltroInforme;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OSInforme = FXCollections.observableArrayList();
        OSfiltroInforme = FXCollections.observableArrayList();
        
        this.tblAlumnodos.setItems(OSInforme);
        
        this.colNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
        this.colApellidoPaterno.setCellValueFactory(new PropertyValueFactory("ApelldioPaterno"));
        this.colApellidoMaterno.setCellValueFactory(new PropertyValueFactory("ApelldioMaterno"));
        this.colDNI.setCellValueFactory(new PropertyValueFactory("DNI"));
    }
    
    @FXML
    void filtrarNombre(KeyEvent event) {
        String filtronombre = this.txtnobreAlumnoBusca.getText();
        
        if(filtronombre.isEmpty()){
            this.tblAlumnodos.setItems(OSInforme);
        }else{
            this.OSfiltroInforme.clear();
            for (Alumno p:this.OSInforme) {
                if(p.getNombre().toLowerCase().contains(filtronombre.toLowerCase())){
                    this.OSfiltroInforme.add(p);
                }
            }
            
            this.tblAlumnodos.setItems(OSfiltroInforme);
        }
    }
}
