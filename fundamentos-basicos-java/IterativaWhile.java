import javax.swing.*;
//No se ejecuta si la condicion no se cumple

public class IterativaWhile {
    public static void main (String[] args){
        int botellas = 10;

        while (botellas >0){
            System.out.println("Botellas disponibles:" +botellas) ;
            botellas--;
        }
        JOptionPane.showMessageDialog(null,"producto agotado");
    }
}
