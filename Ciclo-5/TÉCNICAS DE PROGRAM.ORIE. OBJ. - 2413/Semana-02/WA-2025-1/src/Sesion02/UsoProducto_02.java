package Sesion02;

import java.util.Scanner;

public class UsoProducto_02 {

    public static void main(String[] args) {
        int opcion, tamano, cantidad;
        String tipoEnvio;
        Producto_02 TVcomprada = new Producto_02();
        int stock = 100;  // Stock inicial de 100 unidades 
        TVcomprada.setStock(stock);
        Scanner opc = new Scanner(System.in);

        do {
            // Men� para escoger el modelo de TV
            System.out.println("\nESCOGER UN MODELO DE TELEVISOR");
            System.out.println("\t 1\tLED TV\n\t 2\tAndroid TV\n\t 3\tOLED TV\n\t 4\tQLED TV\n\t 5\tSalir");
            System.out.println("Escoge una de las opciones: ");
            opcion = opc.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo del sistema...");
                break;
            } else if (opcion < 1 || opcion > 4) {
                System.out.println("Opci�n no v�lida. Escoge una opci�n entre 1 y 4.");
                continue;
            }

            // Tama?o de la TV
            System.out.println("Indica el tamano de la TV:");
            tamano = opc.nextInt();
            TVcomprada.setTamano(tamano);

            // Cantidad de TVs a comprar
            System.out.println("? Cu�ntas unidades deseas comprar ?");
            cantidad = opc.nextInt();

            // Verificaci�n de stock
            if (cantidad > stock) {
                System.out.println("No hay suficientes unidades en stock. Stock disponible: " + stock);
                continue;
            }

            // Calcular precio
            TVcomprada.calcularPrecio(opcion, cantidad);

            // Elegir tipo de env�o
            System.out.println("Selecciona el tipo de env�o:\n1. Domicilio\n2. Recojo en tienda");
            int envio = opc.nextInt();
            tipoEnvio = (envio == 1) ? "domicilio" : "recojo en tienda";

            // Calcular costo de env�o
            double costoEnvio = TVcomprada.calcularCostoEnvio(tipoEnvio);
            double precioTotal = TVcomprada.calcularPrecioTotal() + costoEnvio;

            // Registrar venta
            if (TVcomprada.registrarVenta(cantidad)) {
                TVcomprada.mostrarDetallesVenta(cantidad, tipoEnvio);
                System.out.println("Costo de env�o: " + costoEnvio);
                System.out.println("Precio total con env�o: " + precioTotal);
            }

            // Preguntar si desea continuar
            System.out.println("\n?Deseas hacer otra compra? (1: S�, 2: No)");
            int respuesta = opc.nextInt();
            if (respuesta != 1) {
                System.out.println(" Saliendo del sistema...");
                break;  // Salir del ciclo si el usuario elige no continuar
            }
        } while (true);

        opc.close(); 
    }
}
