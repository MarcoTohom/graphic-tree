public class StackNodo {
    NodeNodo root = null;
    Nodo cima;


    public boolean isEmpty(){
        return root == null ? true:false;
    }

    public void push(Nodo datoExpresion){
        NodeNodo newChar = new NodeNodo(datoExpresion);
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

    public Nodo peek(){
            return !isEmpty() ?  root.getData():null;
    }
}
