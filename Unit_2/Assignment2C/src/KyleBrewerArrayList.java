import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * KyleBrewerArrayList
 * Array-backed implementation of KyleBrewerList (no java.util.ArrayList).
 */
public class KyleBrewerArrayList<E> implements KyleBrewerList<E> {

    // ===== Fields =====
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;     // backing array
    private int size;     // number of valid elements

    // ===== Constructors =====
    @SuppressWarnings("unchecked")
    public KyleBrewerArrayList() {
        // Initialize with default capacity
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // ===== Internal helpers =====
    private void ensureCapacity(int minCapacity) {
        // TODO: if minCapacity > data.length, grow (e.g., newLength = data.length * 2)
        throw new UnsupportedOperationException("ensureCapacity TODO");
    }

    private void checkIndexExclusive(int index) {
        // for add(index, e): valid in [0, size]
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    private void checkIndexInclusive(int index) {
        // for get/set/remove: valid in [0, size-1]
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
        }
    }

    // ===== KyleBrewerList<E> implementation =====
    @Override
    public int size() { return size; } // TODO finalize if needed

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public boolean contains(Object o) {
        // TODO: return indexOf(o) >= 0
        throw new UnsupportedOperationException("contains TODO");
    }

    @Override
    public E get(int index) {
        checkIndexInclusive(index);
        // TODO: return data[index]
        throw new UnsupportedOperationException("get TODO");
    }

    @Override
    public E set(int index, E element) {
        checkIndexInclusive(index);
        // TODO: store old, assign new, return old
        throw new UnsupportedOperationException("set TODO");
    }

    @Override
    public void clear() {
        // TODO: null out elements and set size = 0
        throw new UnsupportedOperationException("clear TODO");
    }

    @Override
    public boolean add(E e) {
        // TODO: ensureCapacity(size+1), data[size++] = e; return true;
        throw new UnsupportedOperationException("add(e) TODO");
    }

    @Override
    public void add(int index, E element) {
        checkIndexExclusive(index);
        // TODO: shift right from index..size-1, insert, ++size
        throw new UnsupportedOperationException("add(index,e) TODO");
    }

    @Override
    public boolean remove(Object o) {
        // TODO: find index; if found remove(index) and return true; else false
        throw new UnsupportedOperationException("remove(Object) TODO");
    }

    @Override
    public E remove(int index) {
        checkIndexInclusive(index);
        // TODO: save data[index], shift left from index+1..size-1, null tail, --size, return saved
        throw new UnsupportedOperationException("remove(index) TODO");
    }

    @Override
    public int indexOf(Object o) {
        // TODO: linear scan; handle null safely
        throw new UnsupportedOperationException("indexOf TODO");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO: reverse linear scan; handle null safely
        throw new UnsupportedOperationException("lastIndexOf TODO");
    }

    @Override
    public Iterator<E> iterator() {
        // Simple forward iterator over [0..size-1]
        return new Iterator<E>() {
            private int cursor = 0;
            @Override public boolean hasNext() { return cursor < size; }
            @Override public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                return data[cursor++];
            }
        };
    }

    @Override
    public String KyleBrewerToString() {
        // TODO: build "e0, e1, ..., eN-1"
        throw new UnsupportedOperationException("KyleBrewerToString TODO");
    }

    // ===== Assignment-specific pretty output =====
    public void KyleBrewerOutput() {
        // Format: ARRAYLIST=ElementPosition0, ElementPosition1, …, ElementPositionN-1
        System.out.println("ARRAYLIST=" + KyleBrewerToString());
    }
}
