package telkomuniversity.ac.id.adieb;

public class stackTP4<T> implements interfaceStack<T> {
    private Node top;
    private int size;

    public stackTP4(){
        this.top = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (top == null){
            return true;
        }
        return false;
    }

    public void push(T elemen) {
        Node nd = new Node(elemen);
        if (isEmpty()){
            top = nd;
        }else {
            nd.setNext(top);
            top = nd;
        }
        size++;
    }

    public T pop() {
        Node sementara = null;
        if (!isEmpty()){
            sementara = top;
            top = top.getNext();
            sementara.setNext(null);
            size--;
        }
        return (T) sementara.getData();
    }

    public T top() {
        if (!isEmpty()){
            return (T) top.getData();
        }
        return (T) "Data Kosong";
    }

    private class Node{
        private T data;
        private Node next;

        public Node(T datax){
            this(datax,null);
        }
        public Node (T data, Node next){
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
