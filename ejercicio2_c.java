import javax.swing.JOptionPane;

public class ejercicio2_c {
    public static void main(String[] args) {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primier número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segubdo número"));
        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El numero "+ num1+ " es el mayor");
        } else if (num2>num1) {
            JOptionPane.showMessageDialog(null, "El número "+num2+ " es el mayor");
        }else if (num1==num2) {
            JOptionPane.showMessageDialog(null, "Los dos números son iguales");
        }

        }
    }

