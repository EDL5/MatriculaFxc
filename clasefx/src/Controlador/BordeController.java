
package Controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class BordeController implements Initializable {

    @FXML
    private Button btnEntraEstudiante;

    @FXML
    private Button btnEntraPadre;

    @FXML
    private Button btnEntraPago;
    
    @FXML
    private Button btnRegistro;
    
    @FXML
    private StackPane spContenedor;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    void EntraPadres(ActionEvent event){
        try {
            Parent spPadres = FXMLLoader.load(getClass().getResource("/visual/Padres.fxml"));
            spContenedor.getChildren().removeAll();
            spContenedor.getChildren().setAll(spPadres);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void EntraPago(ActionEvent event) {
        try {
            Parent spPago = FXMLLoader.load(getClass().getResource("/visual/Matriculas.fxml"));
            spContenedor.getChildren().removeAll();
            spContenedor.getChildren().setAll(spPago);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void EntrarEstudiante(ActionEvent event) {
        try {
            Parent spEstudiante = FXMLLoader.load(getClass().getResource("/visual/EstudianteDatos.fxml"));
            spContenedor.getChildren().removeAll();
            spContenedor.getChildren().setAll(spEstudiante);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    void RegistroAlumno(ActionEvent event) {
        try {
            Parent spRegistroAlumno = FXMLLoader.load(getClass().getResource("/visual/InformeAlumno.fxml"));
            spContenedor.getChildren().removeAll();
            spContenedor.getChildren().setAll(spRegistroAlumno);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
