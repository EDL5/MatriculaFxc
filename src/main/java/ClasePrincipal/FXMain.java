package ClasePrincipal;

import ClasesObjeto.Grado;
import Utils.ColegioEntity;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import java.io.IOException;

public class FXMain extends Application {

    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage)

    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Matricula");
    
        // Set the application icon.
        this.primaryStage.getIcons().add(new Image("file:resources/images/Matricula.jpg"));
    
        Borde();
    }
    private void Borde() 
    {
        try{
            // Load Borde.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXMain.class.getResource("/Visual/Borde.fxml"));
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

        // crearGrados();


        launch(args);
    }

    public static void crearGrados(){
        Grado grado1 = new Grado("1ro de Primaria");
        Grado grado2 = new Grado("2do de Primaria");
        Grado grado3 = new Grado("3ro de Primaria");
        Grado grado4 = new Grado("4to de Primaria");
        Grado grado5 = new Grado("5to de Primaria");
        Grado grado6 = new Grado("6to de Primaria");

        Grado grado7 = new Grado("1ro de Secundaria");
        Grado grado8 = new Grado("2do de Secundaria");
        Grado grado9 = new Grado("3ro de Secundaria");
        Grado grado10 = new Grado("4to de Secundaria");
        Grado grado11 = new Grado("5to de Secundaria");

        EntityManager em = ColegioEntity.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(grado1);
            em.persist(grado2);
            em.persist(grado3);
            em.persist(grado4);
            em.persist(grado5);
            em.persist(grado6);
            em.persist(grado7);
            em.persist(grado8);
            em.persist(grado9);
            em.persist(grado10);
            em.persist(grado11);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
