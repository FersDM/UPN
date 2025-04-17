package Sesion02;

public class Televisor2 {
    //*** atributos ***
    private boolean encendido;
    private int canal;
    private int volumen;
    private int brillo;
    private String modelo;
    private double versionAndroid;
    
    private int tamano;
    private double precioVenta;
    
    //*** metodos get y set ***
    // get para el atributo canal
    public int getCanal() {
        return canal;
    }
    // set para el atributo canal
    public void setCanal(int canal) {
        this.canal = canal;
    }
    // get para el atributo brillo
    public int getBrillo() {
        return brillo;
    }
    // set para el atributo brillo
    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
      
    // *** crear los metodos personalizados ***
    public void encender() {
        this.encendido=true;
        System.out.println("TV encendida");
    }
    
    public void apagar() {
        this.encendido=true;
        System.out.println("TV encendida");
    }    
    
    public void avanzar_canal() {
        canal++;
        System.out.println("El nuevo canal es:" + this.canal);
    }
    
    public void dirigirse_al_canal(int nuevo_canal) {
        this.canal = nuevo_canal;
        System.out.println("El nuevo canal es:" + this.canal);
    }
    
    public void subir_volumen() {
        volumen++;
        System.out.println("El nuevo volumen es:" + this.volumen);
    }
    
    public void actualizar_android(double nueva_version) {
        if(this.versionAndroid>=nueva_version)
            System.out.println("Ya se encuentra actualizado");
        else {
            this.versionAndroid = nueva_version;
            System.out.println("Nueva versión de Android: " + this.versionAndroid);
        }
    }
    
    public void calcularPrecio(int nmodelo) {
        switch(nmodelo) {
            case 1:
                this.precioVenta = 100 * this.tamano;
                break;
            case 2:
                this.precioVenta = 125 * this.tamano;
                break;
            case 3:
                this.precioVenta = 150 * this.tamano;
                break;
            case 4:
                this.precioVenta = 200 * this.tamano;
                break;
            default:
                this.precioVenta = 0;
                break;
        }
        System.out.println("Precio de venta: " + this.precioVenta);
    }
    
    public void calcularIGV () {
        System.out.println("El IGV del producto es: " + this.precioVenta * 0.18);
    }

    public void calcularPrecioTotal () {
        System.out.println("El precio de venta total del producto es: " + (this.precioVenta 
                + (this.precioVenta * 0.18)));
    }    
}
