package Sesion01;

public class UsoTelevisor {

    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();

        televisor1.encendido = true;
        televisor1.brillo = 50;
        televisor1.canal = 704;
        televisor1.volumen = 20;
        televisor1.modelo = "LX-850";

        televisor1.visualizar_propiedades();

        televisor1.apagar();
        televisor1.avanzar_canal();
        televisor1.retroceder_canal();
    }
}
