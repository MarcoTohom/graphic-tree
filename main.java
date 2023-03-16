import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
    public static void main(String[] args) {
        String expresion = null;                
        System.out.print("Ingrese la expresion aritmetica: ");
        try{
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            expresion = d.readLine();
        }catch (IOException e){            
            e.printStackTrace();
        }
        Arbol arbol = new Arbol(expresion);        
        System.out.print("Imprimir datos en preorden: ");
        arbol.preorden();
        System.out.print("Imprimir datos en inorden: ");
        arbol.inorden();
        System.out.print("Imprimir datos en postorden: ");
        arbol.posorden();

        System.out.print("Arbol de Expresion Aritmetica");
        arbol.imprimir();
    }   
}
