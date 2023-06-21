
package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BordeController implements Initializable {

    @FXML
    private Button btnAlumno;

    @FXML
    private Button btnInforme;

    @FXML
    private Button btnPadres;

    @FXML
    private Button btnPagos;

    @FXML
    private StackPane spContendor;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    void pantallaEstudiantes(ActionEvent event) {
        try {
            Parent btnAlumno = FXMLLoader.load(getClass().getResource("/visual/EstudianteDatos.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnAlumno);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void pantallaPadres(ActionEvent event) {
        try {
            Parent btnPadres = FXMLLoader.load(getClass().getResource("/visual/Padres.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnPadres);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void pantallaPagos(ActionEvent event) {
        try {
            Parent btnPagos = FXMLLoader.load(getClass().getResource("/visual/Pagos.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnPagos);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void pantallaInformes(ActionEvent event) {
        try {
            Parent btnInforme = FXMLLoader.load(getClass().getResource("/visual/InformeAlumno.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnInforme);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
