/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author HENRYTO
 */
public class Pedido {
    // Atributos
    private int id;
    private Producto producto;
    private int cantidad;
    private String direccionEnvio;
    private Cliente cliente;
    
    // Constructor

    public Pedido(int id, Producto producto, int cantidad, String direccionEnvio, Cliente cliente) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.direccionEnvio = direccionEnvio;
        this.cliente = cliente;
    }
    //Metedos getter y setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", direccionEnvio=" + direccionEnvio + ", cliente=" + cliente + '}';
    }
    
    
    
}
