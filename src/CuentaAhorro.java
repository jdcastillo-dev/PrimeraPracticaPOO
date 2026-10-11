import java.time.LocalDate;

public class CuentaAhorro extends Cuenta {

    // Metodos
    // Constructor
    public CuentaAhorro(double saldo, LocalDate fechaEmision,
                        LocalDate fechaVencimiento, double porcentajeInteres) {

        super(saldo, fechaEmision, fechaVencimiento, porcentajeInteres);

        if (saldo < 100) {
            throw new IllegalArgumentException(
                    "El saldo inicial debe ser de al menos $100"
            );
        }
    }

    // Setters
    @Override
    public void setSaldo(double saldo) {

        if (saldo < 100) {
            throw new IllegalArgumentException(
                    "El saldo de la cuenta de ahorro no puede ser menor a $100"
            );
        }

        super.setSaldo(saldo);
    }

    // Pagar
    @Override
    public void pagar(double monto) {
    }

    // Depositar
    public void depositar(double monto) {
    }

    // Generar Intereses
    @Override
    public void generarIntereses() {
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // toString
    @Override
    public String toString() {
        return "CuentaAhorro{" +
                super.toString() +
                '}';
    }
}
