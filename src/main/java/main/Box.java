package main;

public interface Box<E> {
    public int size();
    public boolean add(E e);
    public boolean add(int index, E element);
}
