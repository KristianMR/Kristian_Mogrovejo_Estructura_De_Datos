/*public class ListaDoble {
    private Nodo cabeza;

    //ordenado por cedula
    public void InsertarOrdenado(Cliente cliente){
        Nodo nuevo = new Nodo(cliente);

        if(cabeza == null) {
            cabeza = nuevo;
        } else if(cliente.getCedula()<cabeza.cliente.getCedula()) {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        } else{
            Nodo actual = cabeza;
            while(actual.siguiente != null && cliente.getCedula() > actual.siguiente.cliente.getCedula()) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = actual.siguiente;
            if(actual.siguiente != null) {
                actual.siguiente.anterior = nuevo;
            }
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
    }

    //listar de izquierda a derecha
    public void ListarIzquierdaDerecha() {
        Nodo actual = cabeza;
        while(actual != null) {
            System.out.println(actual.cliente);
            actual = actual.siguiente;
        }
    }
    //listar de derecha a izquierda
    public void ListarDerechaIzquierda() {
        Nodo actual = cabeza;
        if(actual == null) return;
        while(actual.siguiente != null) {
            actual = actual.siguiente;
        }
        while(actual != null) {
            System.out.println(actual.cliente);
            actual = actual.anterior;
        }
    }
}*/
