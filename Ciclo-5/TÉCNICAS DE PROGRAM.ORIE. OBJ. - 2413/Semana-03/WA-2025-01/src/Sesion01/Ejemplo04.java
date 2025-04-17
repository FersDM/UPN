package Sesion01;
import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        //capturar informacion desde el teclado
        Scanner equipo = new Scanner(System.in);
        System.out.println("Ingresu tu equipo favorito: ");
        
        //capturo la informacion ingresado por teclado
        String hincha = equipo.nextLine().toUpperCase();
        
        if (hincha.equals("ALIANZA LIMA"))
            System.out.println(hincha + " NUNCA SERA CAMPEON !!!!");
        else
            System.out.println(hincha + " CAMPEON 2026 !!!!");
    }
}
