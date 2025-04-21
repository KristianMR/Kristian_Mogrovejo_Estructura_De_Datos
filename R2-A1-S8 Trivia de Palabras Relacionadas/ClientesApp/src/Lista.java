public class Lista {
    private Nodo cabeza;

    // Inserta un cliente ordenadamente por cédula
    public void insertarOrdenado(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (cabeza == null || cliente.getCedula().compareTo(cabeza.cliente.getCedula()) < 0) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null && cliente.getCedula().compareTo(actual.siguiente.cliente.getCedula()) > 0) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }

    // Imprime la lista de clientes de izquierda a derecha
    public void listarClientes() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.cliente);
            actual = actual.siguiente;
        }
    }
}
