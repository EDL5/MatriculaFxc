package ClasesObjeto;

public class Persona {
    private int Edad;
    private String Nombre;
    private String ApelldioPaterno;
    private String ApelldioMaterno;
    private String Direccion;
    private String DNI;

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
    
}
