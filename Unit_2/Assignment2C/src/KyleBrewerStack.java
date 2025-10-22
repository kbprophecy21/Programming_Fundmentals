/**
 * KyleBrewerStack
 * Generic stack using YOUR KyleBrewerArrayList internally (not java.util.ArrayList).
 */
public class KyleBrewerStack<E> {

    private final KyleBrewerArrayList<E> list = new KyleBrewerArrayList<>();

    public int getSize() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }

    public void push(E item) {
        // TODO: list.add(item);
        throw new UnsupportedOperationException("push TODO");
    }

    public E peek() {
        // TODO: return top element without removing (index size-1)
        throw new UnsupportedOperationException("peek TODO");
    }

    public E pop() {
        // TODO: remove and return top element (index size-1)
        throw new UnsupportedOperationException("pop TODO");
    }

    public String KyleBrewerToString() {
        // Reuse list's formatting
        return list.KyleBrewerToString();
    }

    // Assignment-specific pretty output
    public void KyleBrewerOutput() {
        System.out.println("STACK=" + KyleBrewerToString());
    }

    // Optional: expose iterator if you want
    public java.util.Iterator<E> iterator() { return list.iterator(); }
}
