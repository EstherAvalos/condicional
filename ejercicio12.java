import javax.swing.JOptionPane;

public class ejercicio12 {
    public static void main(String[] args) {
        final int saldoin=1000;
        int opcion;
        float ingreso, saldoa, retiro;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al cajero automatico" +
        "\n1. Ingresar dinero a la cuenta"+
        "\n2. Retirar dinero de la cuenta"+
        "\n3. Salir"));

        switch (opcion) {
            case 1:
                ingreso=Float.parseFloat(JOptionPane.showInputDialog("Diguite la cantidad que decea ingresar a la cueta"));
                saldoa= saldoin+ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoa);
                break;
        
                case 2: 
                    retiro=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que decea retirar:"));
                    if( retiro>saldoin){
                        JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para hacer el retiro");
                    }
                    else{
                        saldoa=saldoin-retiro;
                        JOptionPane.showMessageDialog(null, "Dinero en cuenta:"+ saldoa);
                    }
                    break;
                case 3: break;
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion de menu");
                break;
        }
    }
}
