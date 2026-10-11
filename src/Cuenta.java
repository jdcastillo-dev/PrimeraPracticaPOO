import java.time.LocalDate;

public class Cuenta {

    // Atributos
    private double saldo;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;

    // Metodos
    // Constructor
    public Cuenta(double saldo, LocalDate fechaEmision,
                  LocalDate fechaVencimiento, double porcentajeInteres) {

        this.saldo = saldo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeInteres = porcentajeInteres;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cuenta cuenta = (Cuenta) obj;

        return saldo == cuenta.saldo &&
                porcentajeInteres == cuenta.porcentajeInteres &&
                fechaEmision.equals(cuenta.fechaEmision) &&
                fechaVencimiento.equals(cuenta.fechaVencimiento);
    }

    // toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", fechaEmision=" + fechaEmision +
                ", fechaVencimiento=" + fechaVencimiento +
                ", porcentajeInteres=" + porcentajeInteres +
                '}';
    }

    // Pagar
    public void pagar(double monto) {
    }

    // Generar Intereses
    public void generarIntereses() {
    }
}
