import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Crear administrador
        Administrador administrador = new Administrador(
                "Jose Daniel Castillo",
                "117660396",
                "admin@banco.com",
                "Admin123!"
        );

        // Crear cliente
        Cliente cliente1 = new Cliente(
                "Carlos Ramirez",
                "987654321",
                "carlos@gmail.com",
                "Cliente123!",
                "Masculino",
                "Ingeniero",
                "San Jose"
        );

        // Registrar cliente
        administrador.agregarCliente(cliente1);

        // Mostrar información
        System.out.println("=== ADMINISTRADOR ===");
        System.out.println(administrador);

        System.out.println("\n=== CLIENTE ===");
        System.out.println(cliente1);

        System.out.println("\nClientes registrados: "
                + administrador.getClientes().size());

        // Crear cuentas bancarias
        CuentaAhorro ahorro = new CuentaAhorro(
                500,
                LocalDate.of(2026, 10, 11),
                LocalDate.of(2028, 10, 11),
                2.5
        );

        CuentaDebito debito = new CuentaDebito(
                300,
                LocalDate.of(2026, 10, 11),
                LocalDate.of(2028, 10, 11),
                1.5
        );

        CuentaCredito credito = new CuentaCredito(
                LocalDate.of(2026, 10, 11),
                LocalDate.of(2028, 10, 11),
                3.5,
                2000,
                "Cashback"
        );

        // Relacionar cuentas con el cliente
        cliente1.agregarCuentaAhorro(ahorro);
        cliente1.agregarCuentaDebito(debito);
        cliente1.agregarCuentaCredito(credito);

        // Mostrar cuentas
        System.out.println("\n=== CUENTAS BANCARIAS ===");
        System.out.println(ahorro);
        System.out.println(debito);
        System.out.println(credito);

        // Prueba de getters y setters
        System.out.println("\n=== GETTERS Y SETTERS ===");

        System.out.println("Nombre del cliente: " + cliente1.getNombreCompleto());

        cliente1.setProfesion("Desarrollador de Software");

        System.out.println("Nueva profesion: " + cliente1.getProfesion());

        // Prueba de equals
        System.out.println("\n=== EQUALS ===");

        Cliente cliente2 = new Cliente(
                "Carlos Ramirez",
                "987654321",
                "carlos@gmail.com",
                "Cliente123!",
                "Masculino",
                "Desarrollador de Software",
                "San Jose"
        );

        System.out.println("¿Los clientes son iguales? "
                + cliente1.equals(cliente2));

        // Prueba de validacion de cuenta de ahorro
        System.out.println("\n=== VALIDACION CUENTA AHORRO ===");

        try {
            ahorro.setSaldo(50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo actual: " + ahorro.getSaldo());

        // Prueba de validacion de cuenta de debito
        System.out.println("\n=== VALIDACION CUENTA DEBITO ===");

        try {
            debito.setSaldo(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo actual: " + debito.getSaldo());

        // Prueba de validacion de cuenta de credito
        System.out.println("\n=== VALIDACION CUENTA CREDITO ===");

        try {
            credito.setSaldo(2500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo actual: " + credito.getSaldo());
        System.out.println("Limite de credito: " + credito.getLimiteCredito());

        // Prueba de la clase Usuario
        System.out.println("\n=== USUARIO ===");

        Usuario usuario = new Usuario(
                "Maria Lopez",
                "123456789",
                "maria@gmail.com",
                "Usuario123!"
        );

        System.out.println(usuario);
        System.out.println("Nombre: " + usuario.getNombreCompleto());

        // Prueba de la clase Cuenta
        System.out.println("\n=== CUENTA ===");

        Cuenta cuenta = new Cuenta(
                1000,
                LocalDate.of(2026, 10, 11),
                LocalDate.of(2028, 10, 11),
                2.0
        );

        System.out.println(cuenta);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
