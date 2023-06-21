package ClasesObjeto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "padres")
public class Padres extends Persona{
    private String Telefono;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
