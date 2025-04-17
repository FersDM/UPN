package Sesion02;

import java.util.Scanner;

public class RegistroVenta {

    public static void main(String[] args) {
        int opcion, tamano;
        Televisor02 TVcomprada = new Televisor02();

        String cabecera = "\nESCOGER UN MODELO DE TELEVISOR\n";

        //cabecera = cabecera + "XXXX";
        cabecera += "\n\tCodigo\tModelo\n";
        cabecera += "\t-------\t------\n";

        String menu = "\t 1\tLED TV\n";
        menu += "\t 2\tAndroid TV\n";
        menu += "\t 3\tOLED TV\n";
        menu += "\t 4\tQLED TV\n";
        menu += "\t 5\tSalir\n";

        System.out.println(cabecera + menu);
        System.out.println("Escoger una de las opciones  ");

        Scanner opc = new Scanner(System.in);
        opcion = opc.nextInt();
        do {
            if (opcion == 5) {
                System.exit(0);
            } else if ((opcion > 5) || (opcion < 1)) {
                System.out.println("Opcion no valida");
                System.out.println("Escoge una de las opciones correctas:");
                opcion = opc.nextInt();
            }
        } while (opcion > 4);

        System.out.println("Indicar el tamano de la TV:");
        tamano = opc.nextInt();

        TVcomprada.setTamano(tamano);
        TVcomprada.calcularPrecio(opcion);

    }
    
}
