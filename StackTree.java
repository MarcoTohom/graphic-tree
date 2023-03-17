public class StackTree {
    NodeStack root = null;
    char cima;


    public boolean isEmpty(){
        return root == null ? true:false;
    }

    public void push(char datoExpresion){
        NodeStack newChar = new NodeStack(datoExpresion);
        if(isEmpty()){
            root = newChar;
        }else{
            newChar.next = root;
            root = newChar;
        }
    }

    public void pop(){
        if (!isEmpty()) {
            root = root.next;
        }
    }

    public char peek(){
            return !isEmpty() ?  root.getData():'#';
    }
}
