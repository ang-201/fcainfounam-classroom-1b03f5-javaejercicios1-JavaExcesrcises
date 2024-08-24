public class DataTypes {
    // Atributos de la clase
    private String cadena;
    private int entero;
    private float flotante;
    private char caracter;
    private boolean boleano;

    // Constructor que inicializa los atributos
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.entero = 10;
        this.flotante = 5.9f; // 'f' indica que es un float
        this.caracter = 'A';
        this.boleano = true;
    }

    // Métodos para mostrar los valores (opcional)
    public void mostrarValores() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Caracter: " + caracter);
        System.out.println("Boleano: " + boleano);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        DataTypes datos = new DataTypes();
        datos.mostrarValores();
    }
}
