import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * KyleBrewerLinkedList
 * Singly (or doubly) linked list implementation of KyleBrewerList.
 */
public class KyleBrewerLinkedList<E> implements KyleBrewerList<E> {

    // ===== Node =====
    private static class Node<T> {
        T value;
        Node<T> next;
        Node(T v, Node<T> n) { value = v; next = n; }
    }

    // ===== Fields =====
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // ===== Constructors =====
    public KyleBrewerLinkedList() {
        head = tail = null;
        size = 0;
    }

    // ===== Helpers =====
    private void checkIndexInclusive(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }
    private void checkIndexExclusive(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    private Node<E> nodeAt(int index) {
        // TODO: walk from head index times
        throw new UnsupportedOperationException("nodeAt TODO");
    }

    // ===== KyleBrewerList<E> implementation =====
    @Override public int size() { return size; }
    @Override public boolean isEmpty() { return size == 0; }

    @Override
    public boolean contains(Object o) {
        // TODO: linear scan, handle null
        throw new UnsupportedOperationException("contains TODO");
    }

    @Override
    public E get(int index) {
        checkIndexInclusive(index);
        // TODO: return nodeAt(index).value;
        throw new UnsupportedOperationException("get TODO");
    }

    @Override
    public E set(int index, E element) {
        checkIndexInclusive(index);
        // TODO: replace value at nodeAt(index) and return old
        throw new UnsupportedOperationException("set TODO");
    }

    @Override
    public void clear() {
        // TODO: unlink all nodes; head=tail=null; size=0
        throw new UnsupportedOperationException("clear TODO");
    }

    @Override
    public boolean add(E e) {
        // TODO: append to tail efficiently
        throw new UnsupportedOperationException("add(e) TODO");
    }

    @Override
    public void add(int index, E element) {
        checkIndexExclusive(index);
        // TODO: handle index==0 (prepend), index==size (append), middle insert
        throw new UnsupportedOperationException("add(index,e) TODO");
    }

    @Override
    public boolean remove(Object o) {
        // TODO: search, keep prev pointer, unlink first match
        throw new UnsupportedOperationException("remove(Object) TODO");
    }

    @Override
    public E remove(int index) {
        checkIndexInclusive(index);
        // TODO: unlink at index, fix head/tail, return removed value
        throw new UnsupportedOperationException("remove(index) TODO");
    }

    @Override
    public int indexOf(Object o) {
        // TODO: forward scan
        throw new UnsupportedOperationException("indexOf TODO");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO: forward scan tracking last seen index
        throw new UnsupportedOperationException("lastIndexOf TODO");
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> cur = head;
            @Override public boolean hasNext() { return cur != null; }
            @Override public E next() {
                if (cur == null) throw new NoSuchElementException();
                E v = cur.value;
                cur = cur.next;
                return v;
            }
        };
    }

    @Override
    public String KyleBrewerToString() {
        // TODO: build "e0, e1, ..., eN-1" by iterating nodes
        throw new UnsupportedOperationException("KyleBrewerToString TODO");
    }

    // ===== Assignment-specific pretty output =====
    public void KyleBrewerOutput() {
        System.out.println("LINKEDLIST=" + KyleBrewerToString());
    }
}
