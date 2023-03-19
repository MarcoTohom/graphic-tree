import java.util.Stack;

public class Arbol {

    /* Atributos */
    private Nodo root;
    private String expresion;

    /* Contructores */
    public Arbol() {
        root = null;
        expresion = null;
    }

    public Arbol(Nodo root) {
        this.root = root;
    }

    public Arbol(String expresion){
        this.root = null;
        this.expresion = expresion;
        this.createTree(this.expresion);
    }

    /* Setters y Getters */
    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    /* Funciones */
    public Nodo addNodo(char character) {
        Nodo nodo = new Nodo();
        nodo.setDato(character);
        nodo.setDerecha(null);
        nodo.setIzquierda(null);
        return nodo;
    }

    public void createTree(String string) {        
        string = "(" + string;
        string += ")";
        this.expresion = string;
        this.root = createTree();
    }
    
    public Nodo createTree() {
        String string = this.expresion;
        StackNodo stackNodo = new StackNodo();
        StackCaracteres stackCaracter = new StackCaracteres();
        Nodo temp, temp1, temp2;

        int[] p = new int[123];
        p['+'] = p['-'] = 1;
        p['/'] = p['*'] = 2;
        p['^'] = 3;
        p['('] = p[')'] = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stackCaracter.push(string.charAt(i));
            }
            else if (Character.isDigit(string.charAt(i))  || Character.isLetter(string.charAt(i))) {
                temp = new Nodo(string.charAt(i));
                stackNodo.push(temp);
            } else if (p[string.charAt(i)] > 0) {
                while (!stackCaracter.isEmpty() && stackCaracter.peek() != '(' && ((string.charAt(i) != '^' && p[stackCaracter.peek()] >= p[string.charAt(i)]) || (string.charAt(i) == '^' && p[stackCaracter.peek()] > p[string.charAt(i)]))) {
                    temp = new Nodo(stackCaracter.peek());
                    stackCaracter.pop();
                    temp1 = stackNodo.peek();
                    stackNodo.pop();
                    temp2 = stackNodo.peek();
                    stackNodo.pop();
                    temp.setIzquierda(temp2);
                    temp.setDerecha(temp1);
                    stackNodo.push(temp);
                }
            stackCaracter.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                while (!stackCaracter.isEmpty() && stackCaracter.peek() != '(') {
                    temp = new Nodo(stackCaracter.peek());
                    stackCaracter.pop();
                    temp1 = stackNodo.peek();
                    stackNodo.pop();
                    temp2 = stackNodo.peek();
                    stackNodo.pop();
                    temp.setIzquierda(temp2);
                    temp.setDerecha(temp1);
                    stackNodo.push(temp);
                }
                stackCaracter.pop();
            }
        }


        /*RETORNAR VALOR NODO */
        temp = stackNodo.peek();

        return temp;
    }

    public void preorden() {
        System.out.println();
        preorden(this.root);
        System.out.println();
    }

    private void preorden(Nodo root) {
        if (root != null) {
            System.out.print(root.getDato() + " ");
            preorden(root.getIzquierda());
            preorden(root.getDerecha());
        }
    }

    public void inorden() {
        System.out.println();
        inorden(this.root);
        System.out.println();
    }

    private void inorden(Nodo root) {
        if (root != null) {
            inorden(root.getIzquierda());
            System.out.print(root.getDato() + " ");
            inorden(root.getDerecha());
        }
    }

    public void posorden() {
        System.out.println();
        posorden(this.root);
        System.out.println();
    }

    private void posorden(Nodo root) {
        if (root != null) {
            posorden(root.getIzquierda());
            posorden(root.getDerecha());
            System.out.print(root.getDato() + " ");
        }
    }

    public void imprimir() {
        System.out.println();
        imprimir(this.root);
    }

    private void imprimir(Nodo root) {
        imprimirArbol(root, 0);
    }

    private void imprimirArbol(Nodo root, int separador) {
        int espacios = 3;    
        if (root == null) {return;}
        separador += espacios;
        imprimirArbol(root.getDerecha(), separador);
        for (int i = espacios; i < separador; i++) {
            System.out.print(" ");
        }
        System.out.print(root.getDato() + "\n");
        imprimirArbol(root.getIzquierda(), separador);
    }       
    
}
