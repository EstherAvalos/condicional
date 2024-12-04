import javax.swing.JOptionPane;

public class ejercico10 {
    public static void main(String[] args) {
        int numero1, numero2, sum, res,mult, divi;
        char operacion;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        operacion=JOptionPane.showInputDialog("Digite la operacion que desea realizar").charAt(0);

        switch(operacion){
            case 's':
            case 'S': sum=numero1+numero2;
            JOptionPane.showMessageDialog(null, "La suma es: "+sum);
            break;
            case 'r':
            case 'R': res=numero1-numero2;
            JOptionPane.showMessageDialog(null, "La resta es: "+res);
            break;
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult=numero1*numero2;
            JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mult);
            break;
            case 'd':
            case 'D': divi=numero1/numero2;
            JOptionPane.showMessageDialog(null, "La divicion es: "+ divi);
            break;
            default: JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion");
        }
    }
}
