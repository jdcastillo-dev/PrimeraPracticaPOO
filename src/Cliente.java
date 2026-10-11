import java.util.ArrayList;

public class Cliente extends Usuario {

    // Atributos
    private String sexo;
    private String profesion;
    private String direccion;

    private ArrayList<CuentaAhorro> cuentasAhorro;
    private ArrayList<CuentaDebito> cuentasDebito;
    private ArrayList<CuentaCredito> cuentasCredito;

    // Metodos
    // Constructor
    public Cliente(String nombreCompleto, String cedula,
                   String correoElectronico, String contrasenia,
                   String sexo, String profesion, String direccion) {

        super(nombreCompleto, cedula, correoElectronico, contrasenia);

        this.sexo = sexo;
        this.profesion = profesion;
        this.direccion = direccion;

        this.cuentasAhorro = new ArrayList<>();
        this.cuentasDebito = new ArrayList<>();
        this.cuentasCredito = new ArrayList<>();
    }

    // Getters
    public String getSexo() {
        return sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<CuentaAhorro> getCuentasAhorro() {
        return cuentasAhorro;
    }

    public ArrayList<CuentaDebito> getCuentasDebito() {
        return cuentasDebito;
    }

    public ArrayList<CuentaCredito> getCuentasCredito() {
        return cuentasCredito;
    }

    // Setters
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Metodos para agregar cuentas
    public void agregarCuentaAhorro(CuentaAhorro cuenta) {
        cuentasAhorro.add(cuenta);
    }

    public void agregarCuentaDebito(CuentaDebito cuenta) {
        cuentasDebito.add(cuenta);
    }

    public void agregarCuentaCredito(CuentaCredito cuenta) {
        cuentasCredito.add(cuenta);
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

        Cliente cliente = (Cliente) obj;

        return sexo.equals(cliente.sexo) &&
                profesion.equals(cliente.profesion) &&
                direccion.equals(cliente.direccion);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", sexo='" + sexo + '\'' +
                ", profesion='" + profesion + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
