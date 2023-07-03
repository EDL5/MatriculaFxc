package ClasesObjeto;

public class PagoRealizado {

    private String estudiante;
    private String montoPago;
    private String mes;
    private String persona;

    public PagoRealizado(String estudiante, String montoPago, String mes, String persona) {
        this.estudiante = estudiante;
        this.montoPago = montoPago;
        this.mes = mes;
        this.persona = persona;
    }

    public String getEstudiante() {

        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getPersona()  { return persona; }

    public void setPersona(String persona) { this.persona = persona; }
}