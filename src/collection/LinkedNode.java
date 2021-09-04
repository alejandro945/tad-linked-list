package collection;

public class LinkedNode<T> {
    private LinkedNode<T> next;
    private T info;

    public LinkedNode(T element) {
        info = element;
    }

    public T getInfo(){
        return info;
    }

    public LinkedNode<T> getNext(){
        return next;
    }
}
