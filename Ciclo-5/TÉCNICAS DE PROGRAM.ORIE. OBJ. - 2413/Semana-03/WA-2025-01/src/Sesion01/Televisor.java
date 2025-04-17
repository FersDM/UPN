package Sesion01;

public class Televisor {
    //atributos
    public int canal;
    public int volumen;
    public int brillo;
    public String modelo;
    public boolean encendido;
    
    //metodos
    public void encender() {
        this.encendido = true;
        System.out.println("Televisor encendido");
    }
    
    public void apagar() {
        this.encendido = false;
        System.out.println("Televisor apagado");
    }
    
    public void avanzar_canal() {
        //canal = canal + 1;
        this.canal++;
        System.out.println("Nuevo canal es: " + this.canal);
    }
    
    public void retroceder_canal() {
        this.canal--;
        System.out.println("Nuevo canal es: " + this.canal);
    }
    
    public void visualizar_propiedades() {
        System.out.println("La TV esta encendida: " + this.encendido);
        System.out.println("El volumen es: " + this.volumen);
        System.out.println("El brillo es: " + this.brillo);
        System.out.println("El modelo es: " + this.modelo);
        System.out.println("El canal es: " + this.canal);
    }
}
