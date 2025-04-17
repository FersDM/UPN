package Sesion03;

class Operaciones {
    //atributo estatico
    static int valor = 5;
    static int valor2 = 5;
    //metodo estatico
    static int potencia() {
        return valor * valor;
    }
    static int suma(int v1, int v2) {
        return v1 + v2;
    }    
}

public class Ejemplo01 {
    public static void main(String[] args) {
        Operaciones operacion1 = new Operaciones();
        System.out.println("El valor de la variable es: " + Operaciones.valor);
        System.out.println("El resultado es: " + Operaciones.potencia());
        
        Operaciones.valor=10;
        System.out.println("El valor de la variable es: " + Operaciones.valor);
        System.out.println("El resultado es: " + Operaciones.potencia());
        
        System.out.println("El resultado es: " + Operaciones.suma(5, 7));
    }
}
