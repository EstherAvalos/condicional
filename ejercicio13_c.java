import javax.swing.JOptionPane;

public class ejercicio13_c {
    public static void main(String[] args) {
        float masa,kg;
        byte opcion;
        kg=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kg a convertir"));
        opcion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese opcion de la convercion que decea hacer"+
        "\n1. Gramos"+ "\n2. Libra"+ "\n3.Tonelada"+"\n4. Onza"));
       
        switch (opcion) {
            case 1:
                masa=(kg*1000);
                JOptionPane.showMessageDialog(null, "El total es de: "+ masa +" g");
                break;
            case 2:
                masa= (float)(kg/0.45359);
                JOptionPane.showMessageDialog(null, "El total es de: "+ masa +" lb");
                break;
            case 3:
                masa=(kg/1000);
                JOptionPane.showMessageDialog(null, "El total es de: "+ masa +" toneladas");
                break;
            case 4:
                masa=(float)(kg*35.274);
                JOptionPane.showMessageDialog(null, "El total es de: "+ masa +" onzas");
                break;
            default: JOptionPane.showMessageDialog(null, "Opcion incorrecta, intentelo de nuevo");
                break;
        }

    }   
}
