package Sesion02;

public class UsoTelevisor2 {
    public static void main(String[] args) {
        Integer brillo;
        
        Televisor2 tv1 = new Televisor2();
        
        tv1.encender();
        brillo = tv1.getBrillo();
        tv1.setCanal(502);
        tv1.avanzar_canal();
        tv1.dirigirse_al_canal(707);
        tv1.actualizar_android(2.58);
        
        System.out.println("El brillo actual es: " + brillo);
        
    }
}
