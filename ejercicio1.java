import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        int numero;
         numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

         if (numero%10==0){
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
         }
         else{
            JOptionPane.showMessageDialog(null, "El nuemero no es multiplo de 10");
         }
    }
}
