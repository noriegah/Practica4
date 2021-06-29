/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

/**
 *
 * @author dell
 */
public class DatosJugar extends javax.swing.JFrame {

    /**
     * Creates new form DatosJugar
     */
    private List <JButton>botones;
    private int indice;
    public DatosJugar() {
        initComponents();
        botones=new ArrayList<>();
        indice=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Columnas = new javax.swing.JTextField();
        Filas = new javax.swing.JTextField();
        btntablero = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        panelTablero = new javax.swing.JPanel();
        dado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Columnas:");

        jLabel2.setText("Filas");

        Columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColumnasActionPerformed(evt);
            }
        });

        Filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilasActionPerformed(evt);
            }
        });

        btntablero.setText("GENERAR TABLERO");
        btntablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntableroActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        panelTablero.setLayout(new java.awt.GridLayout(0, 8));

        dado.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dado.setText("DADO");
        dado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btntablero)
                .addGap(68, 546, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntablero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addComponent(panelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilasActionPerformed

    private void btntableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntableroActionPerformed

        for(int i=1; i<=64;i++){
        JButton boton =new JButton(""+ indice);
        boton.setBackground(Color.orange);
        if (indice<=7){
            if(indice%2==0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=15){
            if(indice%2!=0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=23){
            if(indice%2==0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=31){
            if(indice%2!=0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=39){
            if(indice%2==0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=47){
            if(indice%2!=0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=55){
            if(indice%2==0){
                boton.setBackground(Color.green);
            }
        }else if (indice<=63){
            if(indice%2!=0){
                boton.setBackground(Color.green);
            }
        }
        boton.setPreferredSize(new Dimension(100,100));
        panelTablero.add(boton);
        botones.add(boton);
        indice++;
        panelTablero.updateUI();
        }
    }//GEN-LAST:event_btntableroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal principal =new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void ColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColumnasActionPerformed

    private void dadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoActionPerformed
        int movimientos=((int)(Math.random()*6+1));
        System.out.println(movimientos);
    }//GEN-LAST:event_dadoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosJugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosJugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Columnas;
    private javax.swing.JTextField Filas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btntablero;
    private javax.swing.JButton dado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelTablero;
    // End of variables declaration//GEN-END:variables

    public int getIndice() {
        return indice;
    }

    private void GridLayout(int columnas, int filas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
