package BussinnessLogic;

import java.io.*;
import javax.swing.table.DefaultTableModel;
import data.*;
import java.util.*;

public class PantallaTienda extends javax.swing.JFrame {

    DefaultTableModel dtmClientes = new DefaultTableModel();
    DefaultTableModel dtmInventario = new DefaultTableModel();
    Cliente cliente = null;
    ArrayList<Cliente> pedidos = new ArrayList<>();
    Celular celular = null;
    ArrayList<Celular> inventario = new ArrayList<>();

    public PantallaTienda() {

        initComponents();
        setModel();
        File archivo = new File("ClientesArray.txt");
        File archivo1 = new File("InventarioArray.txt");
        FileOutputStream salida = null;
        FileInputStream entrada = null;
        FileOutputStream salida1 = null;
        FileInputStream entrada1 = null;
        ObjectOutputStream writer = null;
        ObjectOutputStream writer1 = null;
        ObjectInputStream reader = null;
        ObjectInputStream reader1 = null;

        try {
            System.out.println("Leyendo archivo");
            entrada = new FileInputStream(archivo);
            entrada1 = new FileInputStream(archivo1);
            reader = new ObjectInputStream(entrada);
            reader1 = new ObjectInputStream(entrada1);
            pedidos = (ArrayList<Cliente>) reader.readObject();
            inventario = (ArrayList<Celular>) reader1.readObject();

            //pedidos.clear();
            //inventario.clear();
            setDatosListaClientes(pedidos);
            for (Cliente variable : pedidos) {
                System.out.println(variable.toString());
            }
            setDatosListaInventario(inventario);
            for (Celular variable : inventario) {
                System.out.println(variable.toString());
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException ex) {
                    //Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("no se pudo");
                }
            }
        }
        //--------------Escritura de archivo--------------------
        try {
            System.out.println("Escribiendo en archivo");
            archivo.createNewFile();
            salida = new FileOutputStream(archivo);
            writer = new ObjectOutputStream(salida);

            archivo1.createNewFile();
            salida1 = new FileOutputStream(archivo1);
            writer1 = new ObjectOutputStream(salida1);
            //cliente = new Cliente(1019283567, "Johan", "Daza", "efectivo", 300000, "h2grhdbs");
            // pedidos.add(cliente);
            //System.out.println(pedidos.element().toString());
            writer.writeObject(pedidos);
            writer1.writeObject(inventario);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCliente = new javax.swing.JInternalFrame();
        jInternalFrame2Admin = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jbtnIngresarCecular = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jlClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTInventario = new javax.swing.JTable();
        jlInventario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameCliente.setVisible(true);

        javax.swing.GroupLayout jInternalFrameClienteLayout = new javax.swing.GroupLayout(jInternalFrameCliente.getContentPane());
        jInternalFrameCliente.getContentPane().setLayout(jInternalFrameClienteLayout);
        jInternalFrameClienteLayout.setHorizontalGroup(
            jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        jInternalFrameClienteLayout.setVerticalGroup(
            jInternalFrameClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jInternalFrame2Admin.setVisible(true);

        jbtnIngresarCecular.setText("Ingresar Equipo");
        jbtnIngresarCecular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarCecularActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar Sistema");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnIngresarCecular, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnIngresarCecular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReiniciar)
                .addContainerGap())
        );

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTClientes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        jlClientes.setText("CLIENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jlClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jlClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTInventario);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );

        jlInventario.setText("INVENTARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlInventario)
                .addGap(212, 212, 212))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame2AdminLayout = new javax.swing.GroupLayout(jInternalFrame2Admin.getContentPane());
        jInternalFrame2Admin.getContentPane().setLayout(jInternalFrame2AdminLayout);
        jInternalFrame2AdminLayout.setHorizontalGroup(
            jInternalFrame2AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame2AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame2AdminLayout.setVerticalGroup(
            jInternalFrame2AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2AdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame2AdminLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame2Admin))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameCliente)
            .addComponent(jInternalFrame2Admin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIngresarCecularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarCecularActionPerformed
        new IngresarCelular().setVisible(true);
    }//GEN-LAST:event_jbtnIngresarCecularActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciarSistema(inventario, pedidos);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    public void reiniciarSistema(ArrayList<Celular> inventario, ArrayList<Cliente> pedidos) {
        inventario.clear();
        pedidos.clear();
    }

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
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaTienda().setVisible(true);
            }
        });

    }

    private void setDatosListaClientes(ArrayList<Cliente> clientes) {
        String[] datos = new String[3];

        for (int i = 0; i < clientes.size(); i++) {

            datos[0] = Integer.toString(clientes.get(i).getIdCliente());
            datos[1] = clientes.get(i).getnSerieCelular();
            datos[2] = Integer.toString(clientes.get(i).getPrecioPago());
            dtmClientes.addRow(datos);

            //System.out.println(datos[0] + datos[1] + datos[2]);
        }

        jTClientes.setModel(dtmClientes);
    }

    private void setDatosListaInventario(ArrayList<Celular> inventario) {
        String[] datos = new String[4];

        for (int i = 0; i < inventario.size(); i++) {

            datos[0] = Integer.toString(inventario.get(i).getnSerie());
            datos[1] = inventario.get(i).getMarca();
            datos[2] = Integer.toString(inventario.get(i).getPrecio());
            datos[3] = Integer.toString(inventario.get(i).getImei());
            dtmInventario.addRow(datos);

            //System.out.println(datos[0] + datos[1] + datos[2]);
        }

        jTInventario.setModel(dtmInventario);
    }

    private void setModel() {
        String[] cabeceraClientes = {"Identificacion", "Num Serie", "Precio"};
        String[] cabeceraInventario = {"nSerie", "Marca", "Precio", "IMEI"};
        dtmClientes.setColumnIdentifiers(cabeceraClientes);
        dtmInventario.setColumnIdentifiers(cabeceraInventario);
        jTClientes.setModel(dtmClientes);
        jTInventario.setModel(dtmInventario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JInternalFrame jInternalFrame2Admin;
    private javax.swing.JInternalFrame jInternalFrameCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTable jTInventario;
    private javax.swing.JButton jbtnIngresarCecular;
    private javax.swing.JLabel jlClientes;
    private javax.swing.JLabel jlInventario;
    // End of variables declaration//GEN-END:variables
}
