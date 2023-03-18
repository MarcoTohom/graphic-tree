import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
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
        Lienzo lienzo = new Lienzo();

        lienzo.setObjArbol(arbol);
        
    }
}
