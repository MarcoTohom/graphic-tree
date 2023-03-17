public class NodeNodo {
    Nodo data;
    NodeNodo next;

    public NodeNodo(){
        this.data = null;
        this.next = null;
    }
    public NodeNodo(Nodo data){
        this.data = data;
        this.next = null;
    }

    public Nodo getData() {
        return data;
    }

    public void setData(Nodo data) {
        this.data = data;
    }

    public NodeNodo getNext() {
        return next;
    }

    public void setNext(NodeNodo next) {
        this.next = next;
    }

}