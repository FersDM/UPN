package Sesion03;

public class Televisor {
    //atributos
    private String codigo;
    private boolean encendido;
    private int canal;
    private int volumen;
    private static int nro_televisores;
    
    //constructor
    public Televisor() {
        nro_televisores = nro_televisores + 1;
        this.codigo = String.format("%03d", nro_televisores);
        this.encendido = true;
    }
    
    //sobrecarga del constructor
    public Televisor(int pcanal) {
        nro_televisores = nro_televisores + 1;
        this.codigo = String.format("%03d", nro_televisores);
        this.encendido = true;
        this.canal = pcanal;
    }
    
    public Televisor(int pcanal, int pvolum) {
        nro_televisores = nro_televisores + 1;
        this.codigo = String.format("%03d", nro_televisores);
        this.encendido = true;
        this.canal = pcanal;
        this.volumen = pvolum;
    }
    
    public Televisor(boolean penc, int pcanal, int pvolum) {
        nro_televisores = nro_televisores + 1;
        this.codigo = String.format("%03d", nro_televisores);
        this.encendido = penc;
        this.canal = pcanal;
        this.volumen = pvolum;
    }
    
    //metodos personalizados
    public void mostrar_estado() {
        System.out.println("Codigo del televisor: " + this.codigo);
        System.out.println("Encendido: " + this.encendido);
        System.out.println("Canal: " + this.canal);
        System.out.println("Volumen: " + this.volumen);
    }
    
    //metodo estatico
    public static void TelevisoresCreados() {
        System.out.println("Televisores creados: " + nro_televisores);
    }
}
