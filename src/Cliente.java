public class Cliente {
    private int idCliente;
    private String nombre;
    private String primerAplellido;
    private String segundoApellido;

    public Cliente(int idCliente, String nombre, String primerAplellido, String segundoApellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerAplellido = primerAplellido;
        this.segundoApellido = segundoApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAplellido() {
        return primerAplellido;
    }

    public void setPrimerAplellido(String primerAplellido) {
        this.primerAplellido = primerAplellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
