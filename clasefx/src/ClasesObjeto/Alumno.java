package ClasesObjeto;

import java.util.Objects;

public class Alumno extends Persona{
    private String Grado;
    private String Seccion;
    private String Mes;
    private String Estado;
    private float Pago;

    public Alumno(String Grado, String Seccion, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Grado = Grado;
        this.Seccion = Seccion;
    }

    public Alumno(int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
    }

    public Alumno(int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
    }

    public Alumno(String Mes, String Estado, float Pago, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String DNI) {
        super(Nombre, ApelldioPaterno, ApelldioMaterno, DNI);
        this.Mes = Mes;
        this.Estado = Estado;
        this.Pago = Pago;
    }

    
    
    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public float getPago() {
        return Pago;
    }

    public void setPago(float Pago) {
        this.Pago = Pago;
    }
    
    
    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }
    
    
    
}
