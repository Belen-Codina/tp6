/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author belen
 */
public class Menu extends javax.swing.JFrame {
private static Directorio dir1= new Directorio();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMSalir = new javax.swing.JMenu();
        jMiSalir = new javax.swing.JMenuItem();
        jMDirectorio = new javax.swing.JMenu();
        jMiAgregarCliente = new javax.swing.JMenuItem();
        jMiBorrarCliente = new javax.swing.JMenuItem();
        jMiBusquedaDeClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMSalir.setForeground(new java.awt.Color(102, 102, 102));
        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });

        jMiSalir.setText("Salir");
        jMiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiSalirActionPerformed(evt);
            }
        });
        jMSalir.add(jMiSalir);

        jMenuBar1.add(jMSalir);

        jMDirectorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMDirectorio.setForeground(new java.awt.Color(102, 102, 102));
        jMDirectorio.setText("Directorio");

        jMiAgregarCliente.setText("AgregarCliente");
        jMiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiAgregarClienteActionPerformed(evt);
            }
        });
        jMDirectorio.add(jMiAgregarCliente);

        jMiBorrarCliente.setText("BorrarCliente");
        jMiBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiBorrarClienteActionPerformed(evt);
            }
        });
        jMDirectorio.add(jMiBorrarCliente);

        jMiBusquedaDeClientes.setText("BusquedaDeClientes");
        jMiBusquedaDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiBusquedaDeClientesActionPerformed(evt);
            }
        });
        jMDirectorio.add(jMiBusquedaDeClientes);

        jMenuBar1.add(jMDirectorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMiBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiBorrarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaBorrarClientes vbc= new VistaBorrarClientes();
        vbc.setVisible(true);
        escritorio.add(vbc);
    }//GEN-LAST:event_jMiBorrarClienteActionPerformed

    private void jMiBusquedaDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiBusquedaDeClientesActionPerformed
        // TODO add your handling code here:
          escritorio.removeAll();
        escritorio.repaint();
        VistaBusquedaDeClientes vbdac= new VistaBusquedaDeClientes();
        vbdac.setVisible(true);
        escritorio.add(vbdac);
    }//GEN-LAST:event_jMiBusquedaDeClientesActionPerformed

    private void jMiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiAgregarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAgregarCliente vac= new VistaAgregarCliente();
        vac.setVisible(true);
        escritorio.add(vac);
       
       
        
    }//GEN-LAST:event_jMiAgregarClienteActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    } 
    public static Directorio getDirectorio(){
        return dir1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMDirectorio;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMiAgregarCliente;
    private javax.swing.JMenuItem jMiBorrarCliente;
    private javax.swing.JMenuItem jMiBusquedaDeClientes;
    private javax.swing.JMenuItem jMiSalir;
    // End of variables declaration//GEN-END:variables
}
