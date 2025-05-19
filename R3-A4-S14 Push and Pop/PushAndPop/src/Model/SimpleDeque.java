package Model;

/**
 * Bicola basada en lista enlazada simple.
 * Permite inserción y eliminación por ambos extremos.
 */
public class SimpleDeque<E> {

    /** Nodo interno */
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E d) { data = d; }
    }

    private Node<E> head; // izquierda
    private Node<E> tail; // derecha
    private int size = 0;

    /** Inserta por la derecha */
    public void addRight(E e) {
        Node<E> n = new Node<>(e);
        if (isEmpty()) head = tail = n;
        else           { tail.next = n; tail = n; }
        size++;
    }

    /** Inserta por la izquierda */
    public void addLeft(E e) {
        Node<E> n = new Node<>(e);
        n.next = head;
        head = n;
        if (tail == null) tail = n;
        size++;
    }

    /** Atiende (elimina y devuelve) por la derecha */
    public E pollRight() {
        if (isEmpty()) return null;
        if (head == tail) {           // un solo nodo
            E val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // recorrer hasta penúltimo
        Node<E> cur = head;
        while (cur.next != tail) cur = cur.next;
        E val = tail.data;
        tail = cur;
        tail.next = null;
        size--;
        return val;
    }

    /** Atiende por la izquierda */
    public E pollLeft() {
        if (isEmpty()) return null;
        E val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public boolean isEmpty() { return size == 0; }
    public int size() { return size; }

    /** Devuelve la representación de la lista de izq → der */
    @Override public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> cur = head;
        while (cur != null) {
            sb.append(cur.data);
            if (cur.next != null) sb.append(", ");
            cur = cur.next;
        }
        return sb.append("]").toString();
    }
}
