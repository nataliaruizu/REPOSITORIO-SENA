import javax.swing.JOptionPane;
import java.util.Scanner;

public class CodigoCompleto {
    public static void main(String[] args) {

        //Informacion de la empresa

        String empresa = "FiestaLicores";
        String nombre = "Natalia";
        String telefono = "3202535747";
        String Ciudad = "Armenia";
        String Ubicacion = "Centro de Armenia, cra 15";
        int sedes = 3;
        String Productos = "Licores";
        final int EDAD_MINIMA = 18;
        final int DOMICILIO = 6000;

        //Productos y precios

        int precio;
        double valorTotal;
        String producto3 = "Aguardiente";
        String producto1 = "Vodka";
        String producto2 = "Ron";
        int aguardiente = 50000;
        int vodka = 60000;
        int ron = 55000;
        int valorCompra;
        double valorDescu1;
        double valorDescu2;
        double DESCUENTO1 = 0.20;
        double DESCUENTO2 = 0.10;
        double valorTotalDescu1;
        double valorTotalDescu2;

        //Informacion del cliente

        String nombreCliente;
        int edadCliente;
        String ciudadCliente;
        String identificacion;
        char inicial;

        System.out.println("Bienvenido a la Pagina Web de FiestaLicores");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Porfavor, ingrese su nombre");
        nombreCliente = keyboard.nextLine();

        System.out.println("Porfavor, ingrese su edad");
        edadCliente = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Porfavor, ingrese su ciudad de residencia");
        ciudadCliente = keyboard.nextLine();

        System.out.println("Porfavor, ingrese su numero de identificacion");
        identificacion = keyboard.nextLine();

        //verificacion de chart con IA

        System.out.println("Porfavor ingrese la inicial de su nombre");
        inicial = keyboard.nextLine().charAt(0);

        //Pantalla 2

        System.out.println("Gracias por tu informacion, recuerda que solo las personas mayores de " + EDAD_MINIMA + " pueden comprar en nuestra tienda");

        System.out.println("Estos son nuestros productos");

        System.out.println("Producto 1\n" + producto1 + "\nPrecio: " + vodka);
        System.out.println("Producto 2\n " + producto2 + "\nPrecio: " + ron);
        System.out.println("Producto 3\n " + producto3 + "\n Precio: " + aguardiente);

        System.out.println("Mientras eliges el producto que deseas, revisaremos que seas mayor de edad \n a continuacion te indicaremos si tu compra es permitida");

        if (edadCliente >= 18) {
            JOptionPane.showMessageDialog(null, "Compra permitida");
        } else {
            JOptionPane.showMessageDialog(null, "Compra no permitida");
        }

        //El boton se esta ejecutando atras de IntelliJ

        System.out.println("si deseas pedir domicilio, el valor de " + DOMICILIO + " es fijo para toda la ciudad");
        System.out.println("Porfavor elija el o los productos que comprara");

        System.out.println("si desea saber el costo total con el domicilio porfavor ingrese el total de su compra y nosotros lo calcularemos");
        valorCompra = keyboard.nextInt();

        keyboard.nextLine();

        valorTotal = (valorCompra + DOMICILIO);

        System.out.println("El costo total de su compra con domicilio es " + valorTotal);

        if (valorTotal >= 300000) {
            JOptionPane.showMessageDialog(null, "Tienes un descuento del 20%");
        } else if (valorTotal >= 200000) {
            JOptionPane.showMessageDialog(null, "Tienes un descuento del 10%");
        } else {
            JOptionPane.showMessageDialog(null, "Sin descuento");
        }

        if (valorTotal >= 300000) {
            valorDescu1 = (valorTotal*DESCUENTO1);
            valorTotalDescu1 = (valorTotal-valorDescu1);
            JOptionPane.showMessageDialog(null, "Su nuevo total es: " + valorTotalDescu1);
        } else if (valorTotal >= 200000) {
            valorDescu2 = (valorTotal*DESCUENTO2);
            valorTotalDescu2 = (valorTotal-valorDescu2);
            JOptionPane.showMessageDialog(null, "Su nuevo total es: " + valorTotalDescu2);
        } else {
            JOptionPane.showMessageDialog(null, "Sin descuento");
        }
    }
}
