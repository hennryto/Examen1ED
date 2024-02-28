/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import javax.swing.JOptionPane;

/**
 *
 * @author HENRYTO
 */
public class ListaPedidos {
    //Referencia al primer nodo de la lista
    
    Nodo primerNodo;

    public ListaPedidos(Nodo primerNodo) {
        this.primerNodo = null;
    }
    
    //Validar que la lista esté vacia
    public boolean estaVacia() {
        return primerNodo == null;
    }
   
    //Metodo Elimiar pedido de la lista por su identificador
    public void eliminarPedido(int idPedido) {
        if (!estaVacia()) {
            if (primerNodo.getPedido().getId() == idPedido) {
                primerNodo = primerNodo.getSiguiente();
            } else {
                Nodo actual = primerNodo;
                while (actual.getSiguiente() != null && actual.getSiguiente().getPedido().getId() != idPedido) {
                    actual = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                }
            }
        }
    }
    //Metodo para saber el ultimo nodo
    private Nodo obtenerUltimoNodo (){
     Nodo actual = primerNodo;
    while(actual.getSiguiente() !=null){
    actual = actual.getSiguiente();
    }
   return actual;
    }
   
    //Mostrar lista de Pedidos
    public void mostrarPedidos() {
        JOptionPane.showMessageDialog(null, "=== Lista Pedidos === \n");
        Nodo actual = primerNodo;
        while (actual != null) {
            JOptionPane.showMessageDialog(null, actual.getPedido());
            actual = actual.getSiguiente();
        }
    }
}
