import javax.swing.JOptionPane;

public class ejercicio8 {
    public static void main(String[] args) {
        int dia, mes, año;
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el día:"));
        mes =Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
        año=Integer.parseInt(JOptionPane.showInputDialog("Digite el año:"));
        if ((dia>=1) && (dia<=30)){
            if((mes>=1) && (mes<=12)){
                if (año !=0){

                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto  ");
        }
    }
}


