/**
 * KyleBrewerQueue
 * Generic queue using YOUR KyleBrewerLinkedList internally (not java.util.LinkedList).
 */
public class KyleBrewerQueue<E> {

    private final KyleBrewerLinkedList<E> list = new KyleBrewerLinkedList<>();

    public int getSize() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }

    public void enqueue(E item) {
        // TODO: list.add(item); // append at tail
        throw new UnsupportedOperationException("enqueue TODO");
    }

    public E dequeue() {
        // TODO: remove head (index 0) and return
        throw new UnsupportedOperationException("dequeue TODO");
    }

    public E peek() {
        // TODO: return head (index 0) without removing
        throw new UnsupportedOperationException("peek TODO");
    }

    public String KyleBrewerToString() {
        return list.KyleBrewerToString();
    }

    // Assignment-specific pretty output
    public void KyleBrewerOutput() {
        System.out.println("QUEUE=" + KyleBrewerToString());
    }

    // Optional: expose iterator
    public java.util.Iterator<E> iterator() { return list.iterator(); }
}
