import javax.swing.JOptionPane;

public class ejercicio9_c {
    public static void main(String[] args) {
        int dia, año, mes;

        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes"));
        año= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        if ((dia>=1) && (dia<=28) && (dia<=31)){
            if ((mes>=1)&& (mes<=12)){
                if(año !=0){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El año ingresado es erronio");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "El mes ingresado es erronio");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El día ingresado es erronio");
        }
    }
}
