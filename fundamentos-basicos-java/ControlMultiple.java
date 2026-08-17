public class ControlMultiple {
    public static void main (String[] args){
        double total = 210000;

        if (total>= 300000) {
            System.out.println ("descuento del 20%");
        } else if (total >=200000){
            System.out.println ("descuento del 10%");
        } else {
            System.out.println ("sin descuento");
        }
    }
}
