package ClasesObjeto;

public class Padres extends Persona{
    
    private String LugarTrabajo;
    private String Telefono;

    public Padres(String LugarTrabajo, String Telefono, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.LugarTrabajo = LugarTrabajo;
        this.Telefono = Telefono;
    }

    public Padres(String LugarTrabajo, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.LugarTrabajo = LugarTrabajo;
    }

    public Padres(String LugarTrabajo, String Telefono, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.LugarTrabajo = LugarTrabajo;
        this.Telefono = Telefono;
    }

    public Padres(String LugarTrabajo, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.LugarTrabajo = LugarTrabajo;
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
    
}
