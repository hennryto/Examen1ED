/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author HENRYTO
 */
public class Nodo {

    //Atributos 
    private Pedido pedido;
    private Nodo siguiente;

    //Constructor
    public Nodo(Pedido pedido, Nodo siguiente) {
        this.pedido = pedido;
        this.siguiente = null;

    }
    //Metodos getter y setter

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


}
