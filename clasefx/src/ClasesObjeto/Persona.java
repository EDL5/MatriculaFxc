package ClasesObjeto;

import java.util.Objects;

public class Persona {
    private int Edad;
    private String Nombre;
    private String ApelldioPaterno;
    private String ApelldioMaterno;
    private String Direccion;
    private String DNI;

    //constructores
    public Persona(int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApelldioMaterno = ApelldioMaterno;
    }

    public Persona(int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApelldioMaterno = ApelldioMaterno;
        this.Direccion = Direccion;
        this.DNI = DNI;
    }

    public Persona(String Nombre, String ApelldioPaterno, String ApelldioMaterno, String DNI) {
        this.Nombre = Nombre;
        this.ApelldioPaterno = ApelldioPaterno;
        this.ApelldioMaterno = ApelldioMaterno;
        this.DNI = DNI;
    }
    
    //geter y seter
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApelldioPaterno() {
        return ApelldioPaterno;
    }

    public void setApelldioPaterno(String ApelldioPaterno) {
        this.ApelldioPaterno = ApelldioPaterno;
    }

    public String getApelldioMaterno() {
        return ApelldioMaterno;
    }

    public void setApelldioMaterno(String ApelldioMaterno) {
        this.ApelldioMaterno = ApelldioMaterno;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.DNI, other.DNI);
    }
    
}
