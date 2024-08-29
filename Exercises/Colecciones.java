public HashMap<Integer, String> obtenerHash() {
    // Crear un Set para almacenar los elementos sin duplicados
    Set<String> elementosUnicos = new HashSet<>();

    // Agregar elementos de la lista cars, eliminando duplicados y elementos vacíos o nulos
    for (String car : cars) {
        if (car != null && !car.isEmpty()) {
            elementosUnicos.add(car);
        }
    }

    // Agregar elementos del arreglo bikes, eliminando duplicados y elementos vacíos o nulos
    for (String bike : bikes) {
        if (bike != null && !bike.isEmpty()) {
            elementosUnicos.add(bike);
        }
    }

    // Agregar elementos del set bicicles, eliminando duplicados y elementos vacíos o nulos
    for (String bicicle : bicicles) {
        if (bicicle != null && !bicicle.isEmpty()) {
            elementosUnicos.add(bicicle);
        }
    }

    // Crear un nuevo HashMap para almacenar los elementos sin duplicados con índices incrementales
    HashMap<Integer, String> resultado = new HashMap<>();
    int count = 1;
    
    // Agregar cada elemento del Set al HashMap con una clave incremental
    for (String elemento : elementosUnicos) {
        resultado.put(count++, elemento);
    }

    // Imprimir el HashMap
    resultado.forEach((key, value) -> System.out.println(key + " " + value));

    return resultado;
}
