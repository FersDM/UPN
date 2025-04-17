package Sesion02;

public class Producto {

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

    // Método personalizado para calcular el precio de venta
    public void calcularPrecio() {
        if (costoUnitario != 0 && porcentajeUtilidad != 0) {
            precioUnitario = costoUnitario * (1 + (porcentajeUtilidad / 100));
        }
    }

    // Método personalizado para verificar el stock disponible
    public void verificarStock() {
        if (stock > 0) {
            System.out.println("El producto " + nombre + " tiene " + stock + " unidades en stock.");
        } else {
            System.out.println("El producto " + nombre + " está agotado.");
        }
    }

    // Método personalizado para aplicar un descuento al precio de venta
    public void aplicarDescuento(double porcentajeDescuento) {
        if (porcentajeDescuento > 0 && porcentajeDescuento < 100) {
            precioUnitario = precioUnitario * (1 - (porcentajeDescuento / 100));
            System.out.println("Nuevo precio con descuento: " + precioUnitario);
        } else {
            System.out.println("Descuento no válido.");
        }
    }

    public void calcularPrecio(int nmodelo) {
        switch (nmodelo) {
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

    public void calcularIGV() {
        System.out.println("El IGV del producto es: " + this.precioVenta * 0.18);
    }

    public void calcularPrecioTotal() {
        System.out.println("El precio de venta total del producto es: " + (this.precioVenta + (this.precioVenta * 0.18)));
    }

}
