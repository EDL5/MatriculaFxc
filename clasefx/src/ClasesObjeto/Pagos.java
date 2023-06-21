package ClasesObjeto;

public class Pagos {
    private String Mes;
    private String Estado;
    private float Mesualidad;
    private float pago;

    public Pagos(String Mes, String Estado, float Mesualidad, float pago) {
        this.Mes = Mes;
        this.Estado = Estado;
        this.Mesualidad = Mesualidad;
        this.pago = pago;
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

    public float getMesualidad() {
        return Mesualidad;
    }

    public void setMesualidad(float Mesualidad) {
        this.Mesualidad = Mesualidad;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

}
