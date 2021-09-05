package collection;

public class LinkedList<T extends Comparable<T>> implements ILinkedList<T> {
    private LinkedNode<T> root;

    @Override
    public String addNode(T newNode) {
        LinkedNode<T> node = new LinkedNode<T>(newNode);
        if (root == null) {
            root = node;
        } else {
            if (newNode.compareTo(root.getInfo()) < 0) {
                node.setNext(root);
                root = node;
            } else {
                LinkedNode<T> reco = root;
                LinkedNode<T> back = root;
                while (newNode.compareTo(reco.getInfo()) >= 0 && reco.getNext() != null) {
                    back = reco;
                    reco = reco.getNext();
                }
                if (newNode.compareTo(reco.getInfo()) >= 0) {
                    reco.setNext(node);
                } else {
                    node.setNext(reco);
                    back.setNext(node);
                }
            }
        }
        return "The element " + newNode + " has been inserted";
    }

    @Override
    public String removeNode(int pos) {
        String msg = "The element in the position " + pos + " has been deleted it";
        if (root != null) {
            if (pos == 0) {
                root = root.getNext();
            } else if (pos < size()) {
                LinkedNode<T> previous = root;
                int i = 0;
                while (i < pos - 1) {
                    previous = previous.getNext();
                    i++;
                }
                LinkedNode<T> temp = previous.getNext();
                previous.setNext(temp.getNext());
                temp.setNext(null);
            } else {
                msg = "Sorry out of bounds";
            }
        }
        return msg;
    }

    @Override
    public String editNode(int pos, T node) {
        removeNode(pos);
        addNode(node);
        return "The element in pos " + pos + " has been edited";
    }

    @Override
    public T searchNode(int pos) {
        if (root == null) {
            return null;
        } else {
            LinkedNode<T> temp = root;
            int i = 0;
            while (i < pos && temp.getNext() != null) {
                i++;
                temp = temp.getNext();
            }
            if (i == pos) {
                return temp.getInfo();
            } else {
                return null;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        int size = 0;
        LinkedNode<T> temp = root;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }
        return size;
    }

    @Override
    public String toString() {
        LinkedNode<T> temp = root;
        String msg = "";
        while (temp != null) {
            msg += temp.getInfo() + "-";
            temp = temp.getNext();
        }
        return msg.substring(0, msg.length() - 1);
    }
}
