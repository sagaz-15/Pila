public class ListaDoble {
    Nodo cabeza;
    Nodo cola;

    // Constructor
    ListaDoble() {
        cabeza = new Nodo();
        cola = new Nodo();
        cabeza.inf = null;
        cola.inf = null;
        cabeza.siguiente = cola;
        cola.anterior = cabeza;
    }

    // Método para insertar un nodo al principio de la lista
    public void insertarPrimero(String inf) {
        Nodo nodo = new Nodo();
        nodo.inf = inf;
        Nodo siguiente = cabeza.siguiente;
        nodo.anterior = cabeza;
        nodo.siguiente = siguiente;
        cabeza.siguiente = nodo;
        siguiente.anterior = nodo;
    }

    // Método para insertar un nodo al final de la lista
    public void insertarUltimo(String inf) {
        Nodo nodo = new Nodo();
        nodo.inf = inf;
        Nodo anterior = cola.anterior;
        nodo.siguiente = cola;
        nodo.anterior = anterior;
        cola.anterior = nodo;
        anterior.siguiente = nodo;
    }

    // Método para mostrar el último nodo
    public void mostrarUltimo() {
        if (cola.anterior != cabeza) {
            System.out.println("Último elemento: " + cola.anterior.inf);
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    // Método para mostrar la lista completa
    public void mostrarLista() {
        Nodo actual = cabeza.siguiente;
        while (actual != cola) {
            System.out.println(actual.inf);
            actual = actual.siguiente;
        }
    }

    // Método para eliminar el último nodo
    public void eliminarUltimo() {
        if (cola.anterior != cabeza) { // Verificamos si la lista no está vacía
            Nodo actual = cola.anterior;
            Nodo anterior = actual.anterior;
            Nodo siguiente = cola;
            anterior.siguiente = siguiente;
            siguiente.anterior = anterior;
            actual.anterior = null;
            actual.siguiente = null;
        }
    }
}




