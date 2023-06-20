
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
    private Button btnApoderados;

    @FXML
    private Button btnEstudiantes;

    @FXML
    private Button btnInforme;

    @FXML
    private Button btnPagos;

    @FXML
    private StackPane spContenedor;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    void EntraPadres(ActionEvent event){
        try {
            Parent btnApoderados = FXMLLoader.load(getClass().getResource("/visual/Padres.fxml"));
            spContenedor.getChildren().removeAll();//e
            spContenedor.getChildren().setAll(btnApoderados);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void EntraPago(ActionEvent event) {
        try {
            Parent btnPagos = FXMLLoader.load(getClass().getResource("/visual/Matriculas.fxml"));
            spContenedor.getChildren().removeAll();//d
            spContenedor.getChildren().setAll(btnPagos);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void EntrarEstudiante(ActionEvent event) {
        try {
            Parent btnEstudiantes = FXMLLoader.load(getClass().getResource("/visual/EstudianteDatos.fxml"));
            spContenedor.getChildren().removeAll();//w
            spContenedor.getChildren().setAll(btnEstudiantes);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void EntraInforme(ActionEvent event) {
        try {
            Parent btnInforme = FXMLLoader.load(getClass().getResource("/visual/InformeAlumno.fxml"));
            spContenedor.getChildren().removeAll();//rd
            spContenedor.getChildren().setAll(btnInforme);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
