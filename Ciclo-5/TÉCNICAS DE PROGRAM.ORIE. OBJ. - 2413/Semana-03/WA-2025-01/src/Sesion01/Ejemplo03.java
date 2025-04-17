package Sesion01;

public class Ejemplo03 {
    public static void main(String[] args) {
        // declaracion de variables
        int num1 = 25;
        int num2 = 15;
        
        //comparaciones
        if (num1==num2) {
            System.out.println("Los numeros "+num1+" y "+num2+" son iguales ");
        }
        else {
            if (num1>num2)
                System.out.println("El numero "+num1+" es mayor que "+num2);
            else
                System.out.println("El numero "+num2+" es mayor que "+num1);
        }
    }
}
