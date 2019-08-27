/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.ram;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author ser
 */
public class Inicio extends javax.swing.JFrame {
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        archivo nuevo = new archivo();
        ArrayList<String> resultado = nuevo.leerTxt("C:\\Users\\ser\\Desktop\\prueba.txt");
        nuevo.crearObjestos(resultado);
        ArrayList<Comando> arregloComandos = nuevo.getArregloComandos();
     
        new Funcionalidad(arregloComandos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUrl = new javax.swing.JTextField();
        btnCarga = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblPC = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblIR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbMempry = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblAX = new javax.swing.JLabel();
        lblBX = new javax.swing.JLabel();
        lblCX = new javax.swing.JLabel();
        lblDX = new javax.swing.JLabel();
        lblResultAx = new javax.swing.JLabel();
        lblResultBx = new javax.swing.JLabel();
        lblResultCx = new javax.swing.JLabel();
        lblResultDx = new javax.swing.JLabel();
        lblResultPc = new javax.swing.JLabel();
        lblResultAc = new javax.swing.JLabel();
        lblResultIr = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCarga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCarga.setText("Cargar");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("CP Registers");

        lblPC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPC.setText("PC");

        lblAC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAC.setText("AC");

        lblIR.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIR.setText("IR");

        tlbMempry.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tlbMempry);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Memory");

        lblAX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAX.setText("AX");

        lblBX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBX.setText("BX");

        lblCX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCX.setText("CX");

        lblDX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDX.setText("DX");

        lblResultAx.setText("0");

        lblResultBx.setText("0");

        lblResultCx.setText("0");

        lblResultDx.setText("0");

        lblResultPc.setText("00000000");

        lblResultAc.setText("00000000");

        lblResultIr.setText("00000000");

        btnSiguiente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultPc)
                                    .addComponent(jLabel6)
                                    .addComponent(lblResultAc)
                                    .addComponent(lblResultIr)))
                            .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAC, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPC)
                                .addComponent(lblIR))
                            .addComponent(btnCarga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAX)
                            .addComponent(lblBX)
                            .addComponent(lblCX)
                            .addComponent(lblDX))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResultDx)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblResultCx)
                                    .addComponent(lblResultBx)
                                    .addComponent(lblResultAx))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultPc)
                            .addComponent(lblPC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultAc)
                            .addComponent(lblAC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultIr)
                            .addComponent(lblIR))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAX)
                            .addComponent(lblResultAx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBX)
                            .addComponent(lblResultBx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCX)
                            .addComponent(lblResultCx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDX)
                            .addComponent(lblResultDx))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCargaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblAX;
    private javax.swing.JLabel lblBX;
    private javax.swing.JLabel lblCX;
    private javax.swing.JLabel lblDX;
    private javax.swing.JLabel lblIR;
    private javax.swing.JLabel lblPC;
    private javax.swing.JLabel lblResultAc;
    private javax.swing.JLabel lblResultAx;
    private javax.swing.JLabel lblResultBx;
    private javax.swing.JLabel lblResultCx;
    private javax.swing.JLabel lblResultDx;
    private javax.swing.JLabel lblResultIr;
    private javax.swing.JLabel lblResultPc;
    private javax.swing.JTable tlbMempry;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
