import java.util.ArrayList;

public class Administrador extends Usuario {

    // Atributos
    private ArrayList<Cliente> clientes;

    // Metodos
    // Constructor
    public Administrador(String nombreCompleto, String cedula,
                         String correoElectronico, String contrasenia) {

        super(nombreCompleto, cedula, correoElectronico, contrasenia);
        this.clientes = new ArrayList<>();
    }

    // Agregar clientes
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Getters
    public ArrayList<Cliente> getClientes() {
        return clientes;
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
        return "Administrador{" +
                super.toString() +
                ", cantidadClientes=" + clientes.size() +
                '}';
    }
}
