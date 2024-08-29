package Exercises;

public class Padre {
    String apellido;

    // Constructor que inicializa el apellido
    public Padre(String apellido) {
        this.apellido = apellido;
    }

    // Método que realiza la prueba de paternidad
    public Boolean test() {
        // Crear una instancia de Hijo con el apellido del padre y nombre "Juan"
        Hijo hijo = new Hijo("Juan", this.apellido);
        
        // Crear una instancia de EspirituSanto con el nombre del hijo, el apellido del padre y el apellido real "Lopez"
        EspirituSanto es = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        
        // Retornar el resultado de la prueba de paternidad
        return es.pruebaParternidad();
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        // Crear una instancia de Padre con el apellido "Perez"
        Padre padre = new Padre("Perez");
        
        // Ejecutar la prueba de paternidad
        Boolean resultado = padre.test();
        
        // Imprimir el resultado
        System.out.println("El resultado de la prueba de paternidad es: " + resultado);
    }
}
