package Exercises;

public class Sobrecarga {

    String nombre;
    String materia;
    int calificacion;

    // Constructor principal de la clase Sobrecarga
    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Método reprobar original de la clase Sobrecarga
    public String reprobar() {
        if (this.calificacion > 5) {
            return "true";
        } else {
            return "false";
        }
    }

    /**
     * Profesor
     */
    class Profesor extends Sobrecarga {
        // Constructor de la clase Profesor
        public Profesor(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        // Método reprobar personalizado para el Profesor
        @Override
        public String reprobar() {
            if (this.calificacion > 5)
                return ">:) Sacaste " + this.calificacion + " en " + this.materia;
            else
                return ":(";
        }
    }

    /**
     * Alumno
     */
    class Alumno extends Sobrecarga {
        // Constructor de la clase Alumno
        public Alumno(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        // Método reprobar personalizado para el Alumno
        @Override
        public String reprobar() {
            if (this.calificacion < 6) {
                return ":(";
            } else {
                return ":)";
            }
        }
    }
}
