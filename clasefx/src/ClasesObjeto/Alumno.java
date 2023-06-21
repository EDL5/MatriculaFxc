package ClasesObjeto;

public class Alumno extends Persona{
    private String Grado;
    private String FechaNacimiento;

    public Alumno(String Grado, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.Grado = Grado;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Alumno(String Grado, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Grado = Grado;
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
}
