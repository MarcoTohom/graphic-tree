public class NodeCaracter {
        NodeCaracter next;
        char data;
    
        public NodeCaracter(){
            this.data = '#';
            this.next = null;
        }
        public NodeCaracter(char data){
            this.data = data;
            this.next = null;
        }
    
        public char getData() {
            return data;
        }
    
        public void setData(char data) {
            this.data = data;
        }
    
        public NodeCaracter getNext() {
            return next;
        }
    
        public void setNext(NodeCaracter next) {
            this.next = next;
        }
    
}
