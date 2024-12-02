import javax.swing.JOptionPane;

public class ejercico4_c {
    public static void main(String[] args) {
        float compra, descuento, tp;
        compra=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de su compra"));
        if(compra>300){
            descuento=(float)(compra*0.20);
            tp=compra-descuento;
            JOptionPane.showMessageDialog(null, "Su total a pagar con descuento es: "+ tp);
        }
        else{
            JOptionPane.showMessageDialog(null, "Su compra no al canza el mimino para el descuento");
        }
    }
} 
