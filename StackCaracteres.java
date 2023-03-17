public class StackCaracteres {
    NodeCaracter root = null;
    char cima;


    public boolean isEmpty(){
        return root == null ? true:false;
    }

    public void push(char datoExpresion){
        NodeCaracter newChar = new NodeCaracter(datoExpresion);
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
