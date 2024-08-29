package Exercises;

public class EspirituSanto extends Hijo {
    String apellidoReal;

    // Constructor que inicializa el nombre, el apellido (de Hijo) y el apellido real
    public EspirituSanto(String nombre, String apellido, String apellidoReal) {
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }

    // Método que verifica si el apellido del padre coincide con el apellido real
    public Boolean pruebaParternidad() {
        return this.apellido.equals(this.apellidoReal); // Usamos equals() para comparar cadenas
    }
}
