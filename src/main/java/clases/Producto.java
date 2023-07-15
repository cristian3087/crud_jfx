package clases;

public class Producto {
    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    //int id;
    private String nombre;
    private String cantidad;
    private String precio;

    public Producto(String nombre, String cantidad, String precio) {
        this.nombre= nombre;
        this.cantidad=cantidad;
        this.precio = precio;
    }

}
