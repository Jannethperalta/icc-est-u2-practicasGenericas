import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {
    private List<Elemento<T>> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarElemento(Elemento<T> elemento) {
        catalogo.add(elemento);
    }

    public void listarElementos() {
        System.out.println("Catálogo de la biblioteca:");
        for (Elemento<T> elemento : catalogo) {
            System.out.println(elemento);
        }
    }

    public Elemento<T> buscarPorId(T id) {
        for (Elemento<T> elemento : catalogo) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }
}
