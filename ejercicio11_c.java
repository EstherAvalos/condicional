import javax.swing.JOptionPane;

public class ejercicio11_c {
    public static void main(String[] args) {
        short cali;
        cali=Short.parseShort(JOptionPane.showInputDialog("Ingrese la calificacion de 0 a 10"));
        if ((cali>=9) || (cali==10)){
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
        else if ((cali>=7) || (cali==8)) {
            JOptionPane.showMessageDialog(null, "Notable");
        }
        else if ((cali>=5) || (cali==6)) {
            JOptionPane.showMessageDialog(null, "Bien");
        }
        else if ((cali>=3) || (cali==4)) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        else if ((cali>=1) || (cali==2)) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
    }
}
