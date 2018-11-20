/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind72.Presentacio;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author albert
 */
public class VistaMenuGuardar extends javax.swing.JFrame {
    ControladorPresentacio cPresentacio;
    /**
     * Creates new form VistaMenuGuardar
     * @param cp
     */
    public VistaMenuGuardar(ControladorPresentacio cp) {
        initComponents();
        cPresentacio = cp;
        setLocationRelativeTo(null);
        setDefaultCloseOP();
    }
    public void ferVisible(){
        pack();
        setVisible(true);
    }
    public void ferInvisible(){
        setVisible(false);
    }
    public void activar(){
        setEnabled(true);
    }
    public void desactivar(){
        setEnabled(false);
    }
    private void setDefaultCloseOP(){
        this.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    cPresentacio.sincroMenuGuardar_a_Partida();
                }
            });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titol = new javax.swing.JLabel();
        advertencia = new javax.swing.JLabel();
        butCancel = new javax.swing.JButton();
        butSI = new javax.swing.JButton();
        butNO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Guardar abans de sortir?");
        setMinimumSize(new java.awt.Dimension(500, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 200));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titol.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        titol.setText("Vols guardar la partida abans de sortir?");
        getContentPane().add(titol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        advertencia.setFont(new java.awt.Font("Century Schoolbook L", 1, 16)); // NOI18N
        advertencia.setForeground(new java.awt.Color(204, 0, 0));
        advertencia.setText("Si no la guardes no podràs continuar-la en un futur");
        getContentPane().add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, -1, 30));

        butCancel.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        butCancel.setText("CANCEL");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });
        getContentPane().add(butCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 40));

        butSI.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        butSI.setText("SI");
        butSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSIActionPerformed(evt);
            }
        });
        getContentPane().add(butSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, 40));

        butNO.setFont(new java.awt.Font("Century Schoolbook L", 0, 18)); // NOI18N
        butNO.setText("NO");
        butNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNOActionPerformed(evt);
            }
        });
        getContentPane().add(butNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 110, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        cPresentacio.sincroMenuGuardar_a_Partida();
    }//GEN-LAST:event_butCancelActionPerformed

    private void butSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSIActionPerformed
        cPresentacio.sincroMenuGuardar_a_IntroGuardar();
    }//GEN-LAST:event_butSIActionPerformed

    private void butNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNOActionPerformed
        cPresentacio.sincroMenuGuardar_a_MenuPrincipal();
    }//GEN-LAST:event_butNOActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencia;
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butNO;
    private javax.swing.JButton butSI;
    private javax.swing.JLabel titol;
    // End of variables declaration//GEN-END:variables
}
