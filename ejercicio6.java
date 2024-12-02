import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog("Diguite el primer número"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número"));
        
        if ((a>b) && (b>c)) {
            JOptionPane.showMessageDialog(null, "Orden: "+a+" - "+b+" - "+c);
        }
        else if ((a>c) && (c>b)) {
            JOptionPane.showMessageDialog(null, "Orden: "+a+" - "+c+" - "+b);
        }
        else if ((b>a) && (a>b)) {
            JOptionPane.showMessageDialog(null, "Orden: "+b+" - "+a+" - "+c);
        }
        else if ((b>c) && (c>a)) {
            JOptionPane.showMessageDialog(null, "Orden: "+b+" - "+c+" - "+a);
        }
        else if ((c>a) && (a>b)) {
            JOptionPane.showMessageDialog(null, "Orden: "+c+" - "+a+" - "+b);
        }
        else {
            JOptionPane.showMessageDialog(null, "Orden: "+c+" - "+b+" - "+a );
        }
    }
}
