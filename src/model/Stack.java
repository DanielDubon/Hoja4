package model;

public interface Stack<T> {

    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();

    T top();
}
