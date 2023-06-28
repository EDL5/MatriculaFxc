package Controlador;

import ClasesObjeto.Grado;
import Utils.ColegioEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class GradoController {

    private List<Grado> grados;

    private EntityManager em = ColegioEntity.getEntityManager();


    public ObservableList<String> listaGrados(){

        String jpql = "SELECT g FROM Grado AS g";

        grados  = em.createQuery(jpql, Grado.class).getResultList();

        List<String> listaGrados = new ArrayList<>();

        for(int i = 0; i < grados.size(); i++){
            listaGrados.add(grados.get(i).getGrado());
        }

        ObservableList<String> obGrados = FXCollections.observableArrayList(listaGrados);

        return obGrados;
    }
}
