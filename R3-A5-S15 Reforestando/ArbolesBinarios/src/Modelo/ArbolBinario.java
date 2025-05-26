package Modelo;

public class ArbolBinario {
    private nodo raiz; // Raíz del árbol binario

    // Constructor para inicializar el árbol binario
    public ArbolBinario() {
        this.raiz = null; // Inicializa el árbol vacío
    }

    // Método para insertar un nuevo nodo en el árbol binario
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato); // Llama al método recursivo para insertar el dato
    }

    // Método recursivo para insertar un nuevo nodo en el árbol binario
    private nodo insertarRecursivo(nodo nodo, int dato) {
        if(nodo == null) {
            nodo = new nodo(dato); // Crea un nuevo nodo si el nodo actual es nulo
        }else if(dato < nodo.dato) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, dato); // Inserta en el subárbol izquierdo si el dato es menor que el nodo actual
        }else if(dato > nodo.dato) {
            nodo.derecho = insertarRecursivo(nodo.derecho, dato); // Inserta en el subárbol derecho si el dato es mayor que el nodo actual
        }
        return nodo; // Devuelve el nodo actualizado   
    }

    // Método para recorrer el árbol en orden (in-order traversal)
    public void inOrden() {
        inOrdenRecursivo(raiz); // Llama al método recursivo para recorrer el árbol en orden
        System.out.println(); // Imprime una nueva línea al final del recorrido
    }
    private void inOrdenRecursivo(nodo nodo) {
        if(nodo != null) {
            inOrdenRecursivo(nodo.izquierdo); // Recorre el subárbol izquierdo
            System.out.print(nodo.dato + " "); // Imprime el dato del nodo actual
            inOrdenRecursivo(nodo.derecho); // Recorre el subárbol derecho
        }
    }

    // Método para recorrer el árbol en preorden (pre-order traversal)
    public void preOrden() {
        preOrdenRecursivo(raiz); // Llama al método recursivo para recorrer el árbol en preorden
        System.out.println(); // Imprime una nueva línea al final del recorrido
    }
    private void preOrdenRecursivo(nodo nodo) {
        if(nodo != null) {
            System.out.print(nodo.dato + " "); // Imprime el dato del nodo actual
            preOrdenRecursivo(nodo.izquierdo); // Recorre el subárbol izquierdo
            preOrdenRecursivo(nodo.derecho); // Recorre el subárbol derecho
        }
    }

    // Método para recorrer el árbol en postorden (post-order traversal)
    public void postOrden() {
        postOrdenRecursivo(raiz); // Llama al método recursivo para recorrer el árbol en postorden
        System.out.println(); // Imprime una nueva línea al final del recorrido
    }
    private void postOrdenRecursivo(nodo nodo) {
        if(nodo != null) {
            postOrdenRecursivo(nodo.izquierdo); // Recorre el subárbol izquierdo
            postOrdenRecursivo(nodo.derecho); // Recorre el subárbol derecho
            System.out.print(nodo.dato + " "); // Imprime el dato del nodo actual
        }
    }
}
