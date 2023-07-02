package ClasesObjeto;

public class PagoRealizado {

    private String estudiante;
    private String montoPago;
    private String mes;

    public PagoRealizado(String estudiante, String montoPago, String mes) {
        this.estudiante = estudiante;
        this.montoPago = montoPago;
        this.mes = mes;
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
}
