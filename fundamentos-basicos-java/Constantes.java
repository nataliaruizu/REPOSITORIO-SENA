import java.util.Scanner;

public class Constantes {
    public static void main(String[] args){

        final int EDAD_MINIMA = 18;
        final int DOMICILIO = 5000;
        int precio;
        double valorTotal;

        System.out.println ("la edad minima para comprar en Fiesta licores es " +EDAD_MINIMA+ " años ");

        System.out.println ("y si deseas pedir domicilio, el valor de " +DOMICILIO+ " es fijo para toda la ciudad");

        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Ingrese el precio del producto que comprara");
        precio = keyboard.nextInt ();

        valorTotal = precio+DOMICILIO;

        System.out.println ("El valor total a pagar, incluyendo el domicilio es: " +valorTotal );

    }
}
