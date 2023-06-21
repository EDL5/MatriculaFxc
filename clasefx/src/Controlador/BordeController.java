package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

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
        // TODO
    }
     @FXML
    void IngresarAlumno(ActionEvent event) {
        try {
            Parent btnAlumno = FXMLLoader.load(getClass().getResource("/visual/EstudianteDatos.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnAlumno);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void IngresarPadres(ActionEvent event) {
        try {
            Parent btnPadres = FXMLLoader.load(getClass().getResource("/visual/Padres.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnPadres);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void IngresarPago(ActionEvent event) {
        try {
            Parent btnPagos = FXMLLoader.load(getClass().getResource("/visual/Pagos.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnPagos);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void Ingresarinforme(ActionEvent event) {
        try {
            Parent btnInforme = FXMLLoader.load(getClass().getResource("/visual/InformeAlumno.fxml"));
            spContendor.getChildren().removeAll();//d
            spContendor.getChildren().setAll(btnInforme);
        } catch (IOException ex) {
            Logger.getLogger(BordeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
