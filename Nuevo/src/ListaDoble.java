public class ListaDoble {
    Nodo cabeza;
    Nodo cola;

    // Constructor de la lista doble
    ListaDoble() {
        cabeza = new Nodo();
        cola = new Nodo();
        cabeza.inf = null;
        cola.inf = null;
        cabeza.siguiente = cola;
        cola.anterior = cabeza;
    }

    // Función para insertar un nodo al principio de la lista
    public void insertarPrimero(String inf) {
        Nodo nodo = new Nodo();
        nodo.inf = inf;
        Nodo siguiente = cabeza.siguiente;
        nodo.anterior = cabeza;
        nodo.siguiente = siguiente;
        cabeza.siguiente = nodo;
        siguiente.anterior = nodo;
    }

    // Función para insertar un nodo al final de la lista
    public void insertarUltimo(String inf) {
        Nodo nodo = new Nodo();
        nodo.inf = inf;
        Nodo anterior = cola.anterior;
        nodo.siguiente = cola;
        nodo.anterior = anterior;
        cola.anterior = nodo;
        anterior.siguiente = nodo;
    }

    // Función para mostrar el último nodo de la lista
    public void mostrarUltimo() {
        if (cola.anterior != cabeza) {
            System.out.println("Último elemento: " + cola.anterior.inf);
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    // Función para imprimir toda la lista
    public void mostrarLista() {
        Nodo actual = cabeza.siguiente;
        while (actual != cola) {
            System.out.println(actual.inf);
            actual = actual.siguiente;
        }
    }
}