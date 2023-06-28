package ClasesObjeto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "padres")
public class Padres extends Persona{
    private String Telefono;

    private String direccion;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}