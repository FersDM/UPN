package Sesion02;

public class Producto_02 {

    // Atributos
    private String codigoBarras;
    private String nombre;
    private double costoUnitario;
    private double porcentajeUtilidad;
    private double precioUnitario;
    private int stock;
    private int tamano;
    private double precioVenta;

    // Métodos Getters y Setters
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getPorcentajeUtilidad() {
        return porcentajeUtilidad;
    }

    public void setPorcentajeUtilidad(double porcentajeUtilidad) {
        this.porcentajeUtilidad = porcentajeUtilidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    // Métodos personalizados
    // Método para calcular precio
    public void calcularPrecio(int opcion, int cantidad) {
        switch (opcion) {
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
        this.precioVenta *= cantidad;  // Se ajusta según la cantidad
    }

    // Método para calcular el IGV
    public double calcularIGV() {
        return this.precioVenta * 0.18;
    }

    // Método para calcular el precio total con IGV
    public double calcularPrecioTotal() {
        return this.precioVenta + calcularIGV();
    }

    // Método para verificar el stock y realizar la venta
    public boolean registrarVenta(int cantidad) {
        if (cantidad > this.stock) {
            System.out.println("No hay suficiente stock. Stock disponible: " + this.stock);
            return false;
        }
        this.stock -= cantidad;  // Actualiza el stock
        System.out.println("Venta registrada. Stock restante: " + this.stock);
        return true;
    }

    // Método para calcular el costo de envío (Domicilio o Recojo)
    public double calcularCostoEnvio(String tipoEnvio) {
        double costoEnvio = 0;
        if ("domicilio".equalsIgnoreCase(tipoEnvio)) {
            costoEnvio = 15.00;  // Ejemplo de costo adicional por domicilio
        }
        return costoEnvio;
    }

    // Método para mostrar detalles de la venta
    public void mostrarDetallesVenta(int cantidad, String tipoEnvio) {
        System.out.println("Cantidad de TVs: " + cantidad);
        System.out.println("Tipo de envío: " + tipoEnvio);
        System.out.println("Precio unitario: " + this.precioVenta / cantidad);
        System.out.println("Precio total: " + this.precioVenta);
    }
}
