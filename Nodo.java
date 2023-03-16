public class Nodo {
/* Declaraciones de variables */
    private char dato;
    private Nodo izquierda, derecha, padre;
     
    /* Constructores */
    public Nodo(char character) {
        this.dato = character;
        this.izquierda = null;
        this.derecha = null;
    }
        
    public Nodo() {        
        this.izquierda = null;
        this.derecha = null;
    } 
    /* Setters y Getters */
    public void setDato(char valor) {
        this.dato = valor;
    }
 
    public char getDato() {
        return dato;
    }
 
    public Nodo getIzquierda() {
        return izquierda;
    }
 
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
 
    public Nodo getDerecha() {
        return derecha;
    }
 
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }   

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    
}
