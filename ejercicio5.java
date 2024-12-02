import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main(String[] args) {
        int horast;
        float salario;
        horast=Integer.parseInt(JOptionPane.showInputDialog("Diguite las horas trabajadas"));
        if(horast<=40){
            salario=horast*16;
            JOptionPane.showMessageDialog(null, "El salario total es: "+ salario);
        }
        else{
            salario=(40*16)+ ((horast-40)*20);
            JOptionPane.showMessageDialog(null, "El salario total es: "+salario);
        }

    }
}
