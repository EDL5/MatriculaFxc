package ClasesObjeto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "pagos")
public class Pago{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fechaDePago;
    private BigDecimal montoDePago;
    private String tipoDePago;
    private String mes;
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    public String getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(String fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public BigDecimal getMontoDePago() {
        return montoDePago;
    }

    public void setMontoDePago(BigDecimal montoDePago) {
        this.montoDePago = montoDePago;
    }

    public String getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
