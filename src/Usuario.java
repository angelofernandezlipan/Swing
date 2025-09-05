public class Usuario {
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getSaludo() {
        return "¡Hola, " + this.nombre + "!";
    }
}