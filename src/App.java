public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca<Integer> biblioteca = new Biblioteca<>();

        // Agregar libros
        biblioteca.agregarElemento(new Elemento<>(1, "Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarElemento(new Elemento<>(2, "Don Quijote de la Mancha", "Miguel de Cervantes"));
        biblioteca.agregarElemento(new Elemento<>(3, "El Principito", "Antoine de Saint-Exupéry"));

        // Listar elementos
        biblioteca.listarElementos();

        // Buscar elemento por ID
        Elemento<Integer> encontrado = biblioteca.buscarPorId(2);
        if (encontrado != null) {
            System.out.println("Elemento encontrado: " + encontrado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
