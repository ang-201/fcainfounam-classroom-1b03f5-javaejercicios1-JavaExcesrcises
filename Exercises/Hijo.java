package Exercises;

public class Hijo extends Padre {
    String nombre;

    // Constructor que inicializa el nombre y llama al constructor de Padre para inicializar el apellido
    public Hijo(String nombre, String apellido) {
        super(apellido);
        this.nombre = nombre;
    }
}
