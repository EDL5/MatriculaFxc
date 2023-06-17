package ClasePrincipal;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMain extends Application {

    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage)

    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Matricula");
    
        // Set the application icon.
        this.primaryStage.getIcons().add(new Image("file:resources/images/pagomatricula.jpg"));
    
        Borde();
    }
    private void Borde() 
    {
        try{
            // Load Borde.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXMain.class.getResource("/visual/Borde.fxml"));
            BorderPane Margen = (BorderPane) loader.load();
        
            // Show the scene containing the Borde.
            Scene scene = new Scene(Margen);
            primaryStage.setScene(scene);
            primaryStage.show();
        } 
    
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    } 
}
