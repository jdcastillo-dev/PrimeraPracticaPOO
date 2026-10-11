import java.time.LocalDate;

public class CuentaDebito extends Cuenta {

    // Metodos
    // Constructor
    public CuentaDebito(double saldo, LocalDate fechaEmision,
                        LocalDate fechaVencimiento, double porcentajeInteres) {

        super(saldo, fechaEmision, fechaVencimiento, porcentajeInteres);

        if (saldo < 0) {
            throw new IllegalArgumentException(
                    "El saldo de la cuenta de débito no puede ser negativo"
            );
        }
    }

    // Setters
    @Override
    public void setSaldo(double saldo) {

        if (saldo < 0) {
            throw new IllegalArgumentException(
                    "El saldo de la cuenta de débito no puede ser negativo"
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

        return true;
    }

    // toString
    @Override
    public String toString() {
        return "CuentaDebito{" +
                super.toString() +
                '}';
    }

    // Pagar
    @Override
    public void pagar(double monto) {
    }

    // Depositar
    public void depositar(double monto) {
    }

    // Generar intereses
    @Override
    public void generarIntereses() {
    }
}
