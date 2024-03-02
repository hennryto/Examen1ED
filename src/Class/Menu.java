/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HENRYTO
 */
public class Menu {

    public static void main(String[] args) {
        ListaPedidos listaPedidos = new ListaPedidos();

        int opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Agregar un nuevo pedido");
                    // Lógica para agregar un nuevo pedido
                    agregarNuevoPedido(listaPedidos);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Eliminar un pedido existente");
                    // Lógica para eliminar un pedido existente
                    eliminarPedidoExistente(listaPedidos);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Mostrar todos los pedidos");
                    // Lógica para mostrar todos los pedidos
                    mostrarTodosLosPedidos(listaPedidos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Editar un pedido");
                    // Lógica para editar un pedido
                    editarPedido(listaPedidos);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
            }
        } while (opcion != 5);
    }

    public static int mostrarMenu() {
        String[] opciones = {"Agregar un nuevo pedido", "Eliminar un pedido existente", "Mostrar todos los pedidos", "Editar un pedido", "Salir"};

        return JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú de Pedidos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
    }

    public static void agregarNuevoPedido(ListaPedidos listaPedidos) {
        // Solicitar al usuario que ingrese los detalles del nuevo pedido
        int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pedido: "));
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        String descripcionProducto = JOptionPane.showInputDialog("Ingrese la descripción del producto: ");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
        double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));        
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        String direccionEnvio = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");

        // Crear un nuevo objeto Producto y Cliente
        Producto producto = new Producto(nombreProducto, descripcionProducto, precioProducto);
        Cliente cliente = new Cliente(nombreCliente, direccionEnvio);

        // Crear un nuevo objeto Pedido
        Pedido nuevoPedido = new Pedido(idPedido, producto, cantidad,direccionEnvio, cliente);

        // Agregar el nuevo pedido a la lista de pedidos
        listaPedidos.agregarPedido(nuevoPedido);
    }

    public static void editarPedido(ListaPedidos listaPedidos) {
        // Mostrar la lista de pedidos para que el usuario seleccione uno
        listaPedidos.mostrarPedidos();

        // Solicitar al usuario que seleccione un pedido por su ID
        int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pedido que desea editar: "));

        // Solicitar al usuario que ingrese los nuevos detalles del pedido
        int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad: "));
        String nuevaDireccionEnvio = JOptionPane.showInputDialog("Ingrese la nueva dirección de envío: ");

        // Actualizar el pedido en la lista
        listaPedidos.editarPedido(idPedido, nuevaCantidad, nuevaDireccionEnvio);
    }

    public static void eliminarPedidoExistente(ListaPedidos listaPedidos) {
        // Mostrar la lista de pedidos para que el usuario seleccione uno
        listaPedidos.mostrarPedidos();

        // Solicitar al usuario que seleccione un pedido por su ID
        int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pedido que desea eliminar: "));

        // Eliminar el pedido seleccionado de la lista
        listaPedidos.eliminarPedido(idPedido);
    }

    public static void mostrarTodosLosPedidos(ListaPedidos listaPedidos) {
        // Mostrar todos los pedidos almacenados en la lista
        listaPedidos.mostrarPedidos();
    }

}
