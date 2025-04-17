package Sesion02;

public class UsoProducto {

    public static void main(String[] args) {
        // Creaci�n del objeto Producto
        Producto producto1 = new Producto();

        // Configuraci�n de los atributos usando los m�todos setters
        producto1.setCodigoBarras("123456789");
        producto1.setNombre("Televisor LED");
        producto1.setCostoUnitario(200.0);
        producto1.setPorcentajeUtilidad(25.0);
        producto1.setStock(50);

        // Llamada a los m�todos personalizados
        producto1.calcularPrecio(); // Calcula el precio basado en el costo y el porcentaje de utilidad
        producto1.verificarStock(); // Verifica y muestra el stock disponible
        producto1.aplicarDescuento(10); // Aplica un descuento del 10%

        // Obtenci�n del precio final usando el m�todo getter
        System.out.println("El precio final del producto es: " + producto1.getPrecioUnitario());
    }
}
