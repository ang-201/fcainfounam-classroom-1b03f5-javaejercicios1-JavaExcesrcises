public class DataTypes {
    // Atributos de la clase
    String cadena;
    int entero;
    float flotante;
    char caracter;
    boolean boleano;

    // Constructor que inicializa los atributos con los valores especificados
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.entero = 10;
        this.flotante = 5.9f; // Usamos el sufijo 'f' para indicar que es un float literal
        this.caracter = 'A';
        this.boleano = true;
    }

    // Método para mostrar los valores de los atributos
    public void mostrarValores() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Caracter: " + caracter);
        System.out.println("Boleano: " + boleano);
    }

    /*Método principal para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la clase DataTypes
        DataTypes datos = new DataTypes();
        
        // Mostrar los valores de los atributos
        datos.mostrarValores();
    }*/
}
