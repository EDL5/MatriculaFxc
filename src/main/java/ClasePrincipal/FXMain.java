package ClasePrincipal;

import ClasesObjeto.Padres;
import Controlador.PadresController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

       /* Alumno alumno = new Alumno();
        Padres padres = new Padres();

        alumno.setNombre("adios");
        alumno.setDni("55555");
        alumno.setGrado("6to");

        padres.setNombre("wewew");
        padres.setDni("123123");
        padres.setTelefono("22142");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegio");
        EntityManager em = emf.createEntityManager();




        try {
            em.getTransaction().begin();
            //AlumnoController alumnoController = new AlumnoController();
            //alumnoController.registrarAlumno(alumno, em);
            /*PadresController padresController = new PadresController();
            //List<Alumno> alumnos = alumnoController.listarAlumnos(em);
            List<Padres> padresTale = padresController.buscarPorNombre("wewew", em);
            System.out.println(padresTale.get(0).getNombre());
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }*/



        launch(args);
    } 
}
