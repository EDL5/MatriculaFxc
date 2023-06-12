package ClasesObjeto;

public class Alumno extends Persona{
    
    private String Nivel;
    private String Seccion;
    private String Grado;
    private String CodEstudiantil;
    private String InstProcedente;
    private String Ciudad;
    private String Provincia;
    private String Situacion;
    private String FechaNacimiento;

    public Alumno(String Nivel, String Seccion, String Grado, String CodEstudiantil, String InstProcedente, String Ciudad, String Provincia, String Situacion, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.Nivel = Nivel;
        this.Seccion = Seccion;
        this.Grado = Grado;
        this.CodEstudiantil = CodEstudiantil;
        this.InstProcedente = InstProcedente;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.Situacion = Situacion;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Alumno(String Nivel, String Seccion, String Grado, String CodEstudiantil, String InstProcedente, String Ciudad, String Provincia, String Situacion, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Nivel = Nivel;
        this.Seccion = Seccion;
        this.Grado = Grado;
        this.CodEstudiantil = CodEstudiantil;
        this.InstProcedente = InstProcedente;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.Situacion = Situacion;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getCodEstudiantil() {
        return CodEstudiantil;
    }

    public void setCodEstudiantil(String CodEstudiantil) {
        this.CodEstudiantil = CodEstudiantil;
    }

    public String getInstProcedente() {
        return InstProcedente;
    }

    public void setInstProcedente(String InstProcedente) {
        this.InstProcedente = InstProcedente;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getSituacion() {
        return Situacion;
    }

    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
}
