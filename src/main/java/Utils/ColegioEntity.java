package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ColegioEntity {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("colegio");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

}
