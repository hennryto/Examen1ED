/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import Class.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENRYTO
 */
public class JFramMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFramMenu
     */
    private ListaPedidos listaPedidos;

    public JFramMenu() {
        initComponents();
        String[] columnas = {"ID", "Nombre Producto", "Cantidad", "Precio", "Dirección Envío", "Nombre Cliente"};

// modelo de la tabla con los nombres de las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Asignar el modelo a la tabla
        jTable1.setModel(modelo);

        // Ancho de las columnas
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50); // ID
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150); // Nombre Producto
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(80); // Cantidad
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80); // Precio
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(200); // Dirección Envío
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150); // Nombre Cliente   

// Asignacion modelo a la tabla
        jTable1.setModel(modelo);

        this.listaPedidos = new ListaPedidos();// Creamos una lista de pedidos vacía al iniciar el JFrame
        cargarPedidos();// Cargamos los pedidos en la tabla al iniciar
    }

    private void cargarPedidos() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpiamos la tabla

        Nodo actual = listaPedidos.getPrimerNodo();
        while (actual != null) {
            Pedido pedido = actual.getPedido();
            modelo.addRow(new Object[]{
                pedido.getId(),
                pedido.getProducto().getNombre(),
                pedido.getCantidad(),
                pedido.getProducto().getPrecio(),
                pedido.getDireccionEnvio(),
                pedido.getCliente().getNombre()
            });
            actual = actual.getSiguiente();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 290, -1));

        jlCiudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        jlCiudad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jlCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 0, 270, 600));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 610, 180));

        jPanel2.setBackground(new java.awt.Color(136, 212, 234));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Menú");

        addButton.setBackground(new java.awt.Color(0, 134, 190));
        addButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Agregar");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(0, 134, 190));
        editButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 134, 190));
        deleteButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Eliminar");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(0, 134, 190));
        refreshButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Actualizar");
        refreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // Recargar los pedidos desde la lista y mostrarlos en la tabla
        cargarPedidos();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // Recopilar el ID del pedido a eliminar
        int idPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pedido a eliminar: "));

        // Verificar si el pedido existe antes de intentar eliminarlo
        if (!listaPedidos.existeIdPedido(idPedido)) {
            JOptionPane.showMessageDialog(null, "El pedido con ID " + idPedido + " no existe.");
        } else {
            // Eliminar el pedido de la lista
            listaPedidos.eliminarPedido(idPedido);

            // Recargar la tabla para reflejar los cambios
            cargarPedidos();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // Solicitar al usuario que ingrese el ID del pedido que desea editar
        int idPedidoEditar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del pedido que desea editar: "));

        // Verificar si el pedido con ese ID existe en la lista
        Nodo actual = listaPedidos.getPrimerNodo();
        boolean pedidoEncontrado = false;
        while (actual != null) {
            if (actual.getPedido().getId() == idPedidoEditar) {
                pedidoEncontrado = true;
                break;
            }
            actual = actual.getSiguiente();
        }

        if (!pedidoEncontrado) {
            JOptionPane.showMessageDialog(null, "El pedido con el ID especificado no existe.");
            return;
        }

        // Solicitar al usuario la nueva cantidad y la nueva dirección de envío
        int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad: "));
        String nuevaDireccionEnvio = JOptionPane.showInputDialog("Ingrese la nueva dirección de envío: ");

        // Llamar al método editarPedido() para actualizar el pedido
        listaPedidos.editarPedido(idPedidoEditar, nuevaCantidad, nuevaDireccionEnvio);

        // Recargar la tabla para mostrar los cambios
        cargarPedidos();
    }//GEN-LAST:event_editButtonActionPerformed

public int volverAlMenuPrincipal (){

    return EXIT_ON_CLOSE;

}
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
// Variables para almacenar los datos del pedido
        int idPedido;
        String nombreProducto;
        String descripcionProducto;
        int cantidad;
        double precioProducto;
        String nombreCliente;
        String direccionEnvio;

       
// Bucle para solicitar los datos del pedido
        while (true) {
            // Solicitar y validar el ID del pedido
            String idPedidoStr = JOptionPane.showInputDialog("Ingrese el ID del pedido: ");
            if (idPedidoStr == null) {
                // Si el usuario cancela, volver al menú principal
                volverAlMenuPrincipal();
                return; // Salir del método
            } else if (idPedidoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el ID del pedido.");
                continue; // Volver a solicitar el ID del pedido
            }
            idPedido = Integer.parseInt(idPedidoStr);

            // Solicitar y validar el nombre del producto
            nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            if (nombreProducto == null || nombreProducto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del producto.");
                continue; // Volver a solicitar el nombre del producto
            }

            // Solicitar y validar la descripción del producto
            descripcionProducto = JOptionPane.showInputDialog("Ingrese la descripción del producto: ");
            if (descripcionProducto == null || descripcionProducto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la descripción del producto.");
                continue; // Volver a solicitar la descripción del producto
            }

            // Solicitar y validar la cantidad
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad: ");
            if (cantidadStr == null) {
                // Si el usuario cancela, volver al menú principal
                volverAlMenuPrincipal();
                return; // Salir del método
            } else if (cantidadStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad.");
                continue; // Volver a solicitar la cantidad
            }
            cantidad = Integer.parseInt(cantidadStr);

            // Solicitar y validar el precio del producto
            String precioProductoStr = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
            if (precioProductoStr == null) {
                // Si el usuario cancela, volver al menú principal
                volverAlMenuPrincipal();
                return; // Salir del método
            } else if (precioProductoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el precio del producto.");
                continue; // Volver a solicitar el precio del producto
            }
            precioProducto = Double.parseDouble(precioProductoStr);

            // Solicitar y validar el nombre del cliente
            nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            if (nombreCliente == null || nombreCliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del cliente.");
                continue; // Volver a solicitar el nombre del cliente
            }

            // Solicitar y validar la dirección de envío
            direccionEnvio = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
            if (direccionEnvio == null || direccionEnvio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la dirección del cliente.");
                continue; // Volver a solicitar la dirección de envío
            }

            // Si se llega a este punto, todos los datos se han ingresado correctamente
            break; // Salir del bucle
        }
        // Verificar si el pedido ya existe
        if (listaPedidos.existeIdPedido(idPedido)) {
            JOptionPane.showMessageDialog(null, "El pedido con ID " + idPedido + " ya existe.");
        } else {
            // Crear un nuevo objeto Pedido con la información recopilada
            Producto producto = new Producto(nombreProducto, descripcionProducto, precioProducto);
            Cliente cliente = new Cliente(nombreCliente, direccionEnvio);
            Pedido nuevoPedido = new Pedido(idPedido, producto, cantidad, direccionEnvio, cliente);

            // Agregar el nuevo pedido a la lista de pedidos
            listaPedidos.agregarPedido(nuevoPedido);

            // Recargar la tabla para mostrar el nuevo pedido
            cargarPedidos();
        }

        // Recargar la tabla para mostrar el nuevo pedido
        cargarPedidos();
    }//GEN-LAST:event_addButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables


}
