import java.util.Iterator;

/**
 * KyleBrewerList
 * User-defined List interface (based on textbook MyList from Chapter 24).
 * Add all methods the book specifies + KyleBrewerToString().
 */
public interface KyleBrewerList<E> extends Iterable<E> {

    // Basic queries
    int size();                    // TODO: return number of elements
    boolean isEmpty();             // TODO: return size() == 0
    boolean contains(Object o);    // TODO: linear search equality

    // Positional access
    E get(int index);              // TODO: bounds check then return element
    E set(int index, E element);   // TODO: replace and return old value

    // Modifiers
    void clear();                  // TODO: remove all elements
    boolean add(E e);              // TODO: append to end
    void add(int index, E element);// TODO: insert at index
    boolean remove(Object o);      // TODO: remove first match, shift
    E remove(int index);           // TODO: remove at index, shift and return removed

    // Search
    int indexOf(Object o);         // TODO: first index or -1
    int lastIndexOf(Object o);     // TODO: last index or -1

    // Iteration
    @Override
    Iterator<E> iterator();        // TODO: simple forward iterator

    // Assignment-specific pretty string of elements:
    // "ElementPosition0, ElementPosition1, …, ElementPositionN-1"
    String KyleBrewerToString();
}
