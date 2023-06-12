package ClasesObjeto;

public class Matricula {
    private String CodMatricula;
    private String Fecha;
    private float Mensualidad;
    private float Descuento;
    private float MenFinal;
    private float CostoMatricula;
    private float PagoTotal;

    public Matricula(String CodMatricula, String Fecha, float Mensualidad, float Descuento, float MenFinal, float CostoMatricula, float PagoTotal) {
        this.CodMatricula = CodMatricula;
        this.Fecha = Fecha;
        this.Mensualidad = Mensualidad;
        this.Descuento = Descuento;
        this.MenFinal = MenFinal;
        this.CostoMatricula = CostoMatricula;
        this.PagoTotal = PagoTotal;
    }

    public String getCodMatricula() {
        return CodMatricula;
    }

    public void setCodMatricula(String CodMatricula) {
        this.CodMatricula = CodMatricula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public float getMensualidad() {
        return Mensualidad;
    }

    public void setMensualidad(float Mensualidad) {
        this.Mensualidad = Mensualidad;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }

    public float getMenFinal() {
        return MenFinal;
    }

    public void setMenFinal(float MenFinal) {
        this.MenFinal = MenFinal;
    }

    public float getCostoMatricula() {
        return CostoMatricula;
    }

    public void setCostoMatricula(float CostoMatricula) {
        this.CostoMatricula = CostoMatricula;
    }

    public float getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(float PagoTotal) {
        this.PagoTotal = PagoTotal;
    } 
}
