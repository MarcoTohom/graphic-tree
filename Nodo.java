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

    public int nodosCompletos(Nodo n) {
        if (n == null)
            return 0;
        else {
            if (n.izquierda != null && n.derecha != null)
                return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha) + 1;
            return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha);
        }
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
