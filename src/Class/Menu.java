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
public class Menu {
    public static void main(String[] args) {
        int opcion;
        
        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Agregar un nuevo pedido");
                    // Lógica para agregar un nuevo pedido
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Eliminar un pedido existente");
                    // Lógica para eliminar un pedido existente
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Mostrar todos los pedidos");
                    // Lógica para mostrar todos los pedidos
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Opción seleccionada: Editar un pedido");
                    // Lógica para editar un pedido
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción válida.");
            }
        } while (opcion != 5);
    }

    public static int mostrarMenu() {
        String[] opciones = {"Agregar un nuevo pedido", "Eliminar un pedido existente", "Mostrar todos los pedidos", "Editar un pedido", "Salir"};

        return JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú de Pedidos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
    }

}
