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

    public ListaPedidos() {
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
    private Nodo obtenerUltimoNodo() {
        Nodo actual = primerNodo;
        while (actual.getSiguiente() != null) {
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

    // Método para agregar un nuevo pedido a la lista
    public void agregarPedido(Pedido pedido) {
        Nodo nuevoNodo = new Nodo(pedido, null);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo ultimoNodo = obtenerUltimoNodo();
            ultimoNodo.setSiguiente(nuevoNodo);
        }
    }

    // Método para editar un pedido existente en la lista
    public void editarPedido(int idPedido, int nuevaCantidad, String nuevaDireccionEnvio) {
        Nodo actual = primerNodo;
        while (actual != null) {
            if (actual.getPedido().getId() == idPedido) {
                actual.getPedido().setCantidad(nuevaCantidad);
                actual.getPedido().setDireccionEnvio(nuevaDireccionEnvio);
                break;
            }
            actual = actual.getSiguiente();
        }
    }
}
