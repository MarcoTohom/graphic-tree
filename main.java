import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
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
        Lienzo lienzo = new Lienzo();
        Controlador objControlador = new Controlador(lienzo, arbol);

        objControlador.iniciar();
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(lienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);

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
