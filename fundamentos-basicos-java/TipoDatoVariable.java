public class TipoDatoVariable {
    public static void main (String[] args){

        //Informacion cliente

        String nombre = "Natalia";
        int edad =22;
        String producto = "Vodka";
        int cantidad = 10;
        double precio =53500;
        boolean mayorDeEdad =true;

        System.out.println("La informacion del cliente que mas ha comprado en la tienda Fiesta Licores es:" +nombre);
        System.out.println ("Su edad ed "+edad);
        System.out.println ("usualmente compra " +producto);
        System.out.println ("por lo que ha comprado en los ultimos 6 meses " +cantidad+ " botellas a un precio de " + precio+ " mil por botella");
        System.out.println ("para obtener el premio por cliente constante debe ser mayor de edad, ¿es ella mayor de edad?" + mayorDeEdad);

    }
}
