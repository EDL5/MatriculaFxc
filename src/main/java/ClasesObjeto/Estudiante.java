package ClasesObjeto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante extends Persona{
    private String Grado;

    private String fechaNacimiento;

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
