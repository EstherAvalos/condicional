import javax.swing.JOptionPane;

public class ejercicio7_c {
    public static void main(String[] args) {
        int num;
        num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre el 0 y 99,999"));
        if (num<10){
            JOptionPane.showMessageDialog(null, "la cantidad tiene 1 cifra");
        } else if (num<100) {
            JOptionPane.showMessageDialog(null, "la cantidad tiene 2 cifra");
        } else if (num<1000) {
            JOptionPane.showMessageDialog(null, "la cantidad tiene 3 cifra");
        } else if (num<10000) {
            JOptionPane.showMessageDialog(null, "la cantidad tiene 4 cifra");
        } else if (num<100000) {
            JOptionPane.showMessageDialog(null, "la cantidad tiene 5 cifra");
        }
    }
}
