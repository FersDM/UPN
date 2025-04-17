package Sesion03;

public class UsoTelevisor {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        tv1.mostrar_estado();
        
        Televisor.TelevisoresCreados();
        System.out.println("----------");
        
        Televisor tv2 = new Televisor(502);
        tv2.mostrar_estado();
        Televisor.TelevisoresCreados();
        System.out.println("----------");
        
        Televisor tv3 = new Televisor(502, 25);
        tv3.mostrar_estado();
        Televisor.TelevisoresCreados();
        System.out.println("----------");
        
        Televisor tv4 = new Televisor(false, 502, 25);
        tv4.mostrar_estado();
        
        Televisor.TelevisoresCreados();
        
    }
}
