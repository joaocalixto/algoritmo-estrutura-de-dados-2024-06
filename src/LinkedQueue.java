import java.util.Queue;

public class LinkedQueue<E> {
    private class Node {
        E item;
        Node next;
    }

    private Node first;
    private Node last;

    // Método para adicionar um elemento à fila
    public void enqueue(E item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    // Método para remover um elemento da fila
    public E dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue underflow");
        E item = first.item;
        first = first.next;
        if (isEmpty()) last = null; // para evitar loitering
        return item;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return first == null;
    }

    // Método para contar as ocorrências de um elemento na fila
    public int countOccurrences(E element) {
        int count = 0;
        Node current = first;
        while (current != null) {
            if (current.item.equals(element)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("apple");
        queue.enqueue("banana");
        queue.enqueue("apple");
        queue.enqueue("orange");
        queue.enqueue("apple");

        System.out.println("Occurrences of 'apple': " + queue.countOccurrences("apple"));
    }
}
