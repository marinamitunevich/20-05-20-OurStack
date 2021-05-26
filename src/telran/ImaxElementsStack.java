package telran;

/**
 *
 * @param <E>
 */

public interface ImaxElementsStack<E> {
    void addLast(E elt);
    E getLast();
    E removeLast();
    E getMax();
    int size();
}
