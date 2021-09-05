package collection;

public interface ILinkedList <T> {
   public String addNode(T node);
   public String removeNode(int pos);
   public String editNode(int pos,T node);
   public T searchNode(int pos);
   public boolean isEmpty();
   public int size();
}
