package Sesion02;

public class UsoProducto {

    public static void main(String[] args) {
        // Creación del objeto Producto
        Producto producto1 = new Producto();

        // Configuración de los atributos usando los métodos setters
        producto1.setCodigoBarras("123456789");
        producto1.setNombre("Televisor LED");
        producto1.setCostoUnitario(200.0);
        producto1.setPorcentajeUtilidad(25.0);
        producto1.setStock(50);

        // Llamada a los métodos personalizados
        producto1.calcularPrecio(); // Calcula el precio basado en el costo y el porcentaje de utilidad
        producto1.verificarStock(); // Verifica y muestra el stock disponible
        producto1.aplicarDescuento(10); // Aplica un descuento del 10%

        // Obtención del precio final usando el método getter
        System.out.println("El precio final del producto es: " + producto1.getPrecioUnitario());
    }
}
