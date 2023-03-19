
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
    private Arbol objArbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(Arbol objArbol) {
        this.objArbol = objArbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth() / 2, 20, objArbol.getRoot());
    }

    private void pintar(Graphics g, int x, int y, Nodo nodo) {
        if (nodo == null) {
        } else {
            int EXTRA = nodo.nodosCompletos(nodo) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            //public abstract void drawLine(int x1, int y1, int x2, int y2);
            g.drawString(String.valueOf(nodo.getDato()), x + 12, y + 18);
            if (nodo.getIzquierda() != null)
                g.drawLine(x + RADIO , y + RADIO , x - ANCHO - EXTRA + RADIO , y + ANCHO + RADIO );
            if (nodo.getDerecha() != null)
                g.drawLine(x + RADIO , y + RADIO , x + ANCHO + EXTRA + RADIO , y + ANCHO + RADIO );
            pintar(g, x - ANCHO - EXTRA, y + ANCHO, nodo.getIzquierda());
            pintar(g, x + ANCHO + EXTRA, y + ANCHO, nodo.getDerecha());
        }
    }


}

