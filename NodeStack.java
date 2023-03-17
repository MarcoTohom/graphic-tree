public class NodeStack {
    char data;
    NodeStack next;

    public NodeStack(Character data){
        this.data = data;
        this.next = null;
    }

    public char getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public NodeStack getNext() {
        return next;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }

}