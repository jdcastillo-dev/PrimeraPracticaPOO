import java.time.LocalDate;

public class CuentaCredito extends Cuenta {

    // Atributos
    private double limiteCredito;
    private String tipo;

    // Metodos
    // Constructor
    public CuentaCredito(LocalDate fechaEmision,
                         LocalDate fechaVencimiento,
                         double porcentajeInteres,
                         double limiteCredito,
                         String tipo) {

        super(0, fechaEmision, fechaVencimiento, porcentajeInteres);

        if (limiteCredito <= 0) {
            throw new IllegalArgumentException(
                    "El límite de crédito debe ser mayor que cero"
            );
        }

        this.limiteCredito = limiteCredito;
        this.tipo = tipo;
    }

    // Getters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setLimiteCredito(double limiteCredito) {

        if (limiteCredito <= 0) {
            throw new IllegalArgumentException(
                    "El límite de crédito debe ser mayor que cero"
            );
        }

        if (limiteCredito < getSaldo()) {
            throw new IllegalArgumentException(
                    "El límite de crédito no puede ser menor que el saldo actual"
            );
        }

        this.limiteCredito = limiteCredito;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Validar saldo de la cuenta de crédito
    @Override
    public void setSaldo(double saldo) {

        if (saldo < 0 || saldo > limiteCredito) {
            throw new IllegalArgumentException(
                    "El saldo debe estar entre $0 y el límite de crédito"
            );
        }

        super.setSaldo(saldo);
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        CuentaCredito cuenta = (CuentaCredito) obj;

        return Double.compare(limiteCredito, cuenta.limiteCredito) == 0
                && java.util.Objects.equals(tipo, cuenta.tipo);
    }

    // toString
    @Override
    public String toString() {
        return "CuentaCredito{" +
                super.toString() +
                ", limiteCredito=" + limiteCredito +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    // Pagar
    @Override
    public void pagar(double monto) {
    }

    // Abonar
    public void abonar(double monto) {
    }

    // Generar Intereses
    @Override
    public void generarIntereses() {
    }
}
