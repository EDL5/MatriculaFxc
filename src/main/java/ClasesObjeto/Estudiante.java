package ClasesObjeto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante extends Persona{
    private String Grado;

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }
}
