package collection;

public class LinkedNode<T extends Comparable<T>> {
    private LinkedNode<T> next;
    private T info;

    public LinkedNode(T element) {
        info = element;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T elem){
       info = elem;
    }

    public LinkedNode<T> getNext(){
        return next;
    }

    public void setNext(LinkedNode<T> newNext){
        next = newNext;
    }
}
