package ClasesObjeto;

import javax.persistence.*;

@MappedSuperclass
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String nombre;
    private String apellidos;

    public Long getId(){
        return id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }


}
