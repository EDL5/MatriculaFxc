package ClasePrincipal;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXMain.class.getResource("/visual/Borde.fxml"));
            BorderPane Margen = (BorderPane) loader.load();
            
            Scene scene = new Scene(Margen);
            primaryStage.setScene(scene);
            primaryStage.setTitle("    Matricula");
            primaryStage.show();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        launch(args);
    } 
}
