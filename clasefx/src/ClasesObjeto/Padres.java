package ClasesObjeto;

public class Padres extends Persona{
    
    private String LugarTrabajo;
    private String Telefono;
    private String Emergencia;

    public Padres(String LugarTrabajo, String Telefono, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.LugarTrabajo = LugarTrabajo;
        this.Telefono = Telefono;
        this.Emergencia = Emergencia;
    }

    public Padres(String LugarTrabajo, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.LugarTrabajo = LugarTrabajo;
        this.Emergencia = Emergencia;
    }

    public Padres(String LugarTrabajo, String Telefono, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.LugarTrabajo = LugarTrabajo;
        this.Telefono = Telefono;
        this.Emergencia = Emergencia;
    }

    public Padres(String LugarTrabajo, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.LugarTrabajo = LugarTrabajo;
        this.Emergencia = Emergencia;
    }

    public String getLugarTrabajo() {
        return LugarTrabajo;
    }

    public void setLugarTrabajo(String LugarTrabajo) {
        this.LugarTrabajo = LugarTrabajo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmergencia() {
        return Emergencia;
    }

    public void setEmergencia(String Emergencia) {
        this.Emergencia = Emergencia;
    }

    
}
