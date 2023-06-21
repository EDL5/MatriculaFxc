package ClasesObjeto;

public class Pagos {
    private String Mes;
    private float Mesualidad;
    private float pago;

    public Pagos(String Mes, float Mesualidad, float pago) {
        this.Mes = Mes;
        this.Mesualidad = Mesualidad;
        this.pago = pago;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
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
