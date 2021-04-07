package LinkedList;

public interface StackADT<E> {
    void push(E data);
    void pop();
    E peek();
    boolean isEmpty();
    void traverse();
}
