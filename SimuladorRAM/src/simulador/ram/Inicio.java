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
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ser
 */
public class Inicio extends javax.swing.JFrame {
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos asm", "txt");
    private archivo nuevo = new archivo();
    DefaultTableModel memory;
    String [][] data={};
    String titulos[] = {"Posicion","Operador","Registro","Numero"};
    int Contador= 0;
    int Resultado= 0;
    int AC=0;
    int AX=0;
    int BX=0;
    int CX= 0;
    int DX=0;
    ArrayList<Funcionalidad> ListaResultado = new ArrayList();
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        memory=new DefaultTableModel(data,titulos);
        tlbMemory.setModel(memory);
       
      
        
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
        tlbMemory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblAX = new javax.swing.JLabel();
        lblBX = new javax.swing.JLabel();
        lblCX = new javax.swing.JLabel();
        lblDX = new javax.swing.JLabel();
        AXlabel = new javax.swing.JLabel();
        BXlabel = new javax.swing.JLabel();
        CXlabel = new javax.swing.JLabel();
        DXlabel = new javax.swing.JLabel();
        PrimerJlabel = new javax.swing.JLabel();
        Segundojlabel = new javax.swing.JLabel();
        Tercerjlabel = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCarga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCarga.setText("Cargar");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("CP Registers");

        lblPC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPC.setText("PC");

        lblAC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAC.setText("AC");

        lblIR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIR.setText("IR");

        tlbMemory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tlbMemory);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Memory");

        lblAX.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAX.setText("AX");

        lblBX.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblBX.setText("BX");

        lblCX.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCX.setText("CX");

        lblDX.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDX.setText("DX");

        AXlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AXlabel.setText("0");

        BXlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        BXlabel.setText("0");

        CXlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CXlabel.setText("0");

        DXlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DXlabel.setText("0");

        PrimerJlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PrimerJlabel.setText("00000000");

        Segundojlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Segundojlabel.setText("00000000");

        Tercerjlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tercerjlabel.setText("00000000");

        btnSiguiente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PrimerJlabel)
                                .addComponent(Segundojlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Tercerjlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAX)
                            .addComponent(lblBX)
                            .addComponent(lblCX)
                            .addComponent(lblDX))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BXlabel)
                                    .addComponent(AXlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CXlabel)
                                    .addComponent(DXlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPC)
                    .addComponent(lblAC)
                    .addComponent(lblIR)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnSiguiente)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAX)
                            .addComponent(AXlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBX)
                            .addComponent(BXlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCX)
                            .addComponent(CXlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDX)
                            .addComponent(DXlabel))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrimerJlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAC)
                            .addComponent(Segundojlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tercerjlabel)
                            .addComponent(lblIR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileFilter(filter);
        int opcion=filechooser.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            //obtener ruta url del archivo
            String urlArchivo = filechooser.getSelectedFile().getPath();
            cargarDatos(urlArchivo);
        }
    }//GEN-LAST:event_btnCargaActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(Contador==ListaResultado.size()){
          return;
          }
        PrimerJlabel.setText(Integer.toString(ListaResultado.get(Contador).getPosicion()));
        
        if(ListaResultado.get(Contador).getComando().equals("LOAD")){
          if(ListaResultado.get(Contador).getRegistro().equals("AX")){
             AC=AX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("BX")){
             AC=BX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("CX")){
             AC=CX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("DX")){
             AC=DX;
             Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(Contador).getComando().equals("ADD")){
        
          if(ListaResultado.get(Contador).getRegistro().equals("AX")){
           AC=AC+AX;
           Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("BX")){
          AC=AC+BX;
          Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("CX")){
          AC=AC+CX;
          Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("DX")){
          AC=AC+DX;
          Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(Contador).getComando().equals("SUB")){
          if(ListaResultado.get(Contador).getRegistro().equals("AX")){
           AC=AC-AX;
           Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("BX")){
            AC=AC-BX;
            Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("CX")){
            AC=AC-CX;
            Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("DX")){
            AC=AC-DX;
            Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(Contador).getComando().equals("MOVE")){
          if(ListaResultado.get(Contador).getRegistro().equals("AX")){
           if(Integer.parseInt(ListaResultado.get(Contador).getOperando())>0){
           AX=Integer.parseInt(ListaResultado.get(Contador).getOperando());
           AXlabel.setText(Integer.toString(AX));
           }
          }
          if(ListaResultado.get(Contador).getRegistro().equals("BX")){
           if(Integer.parseInt(ListaResultado.get(Contador).getOperando())>0){
           BX=Integer.parseInt(ListaResultado.get(Contador).getOperando());
           BXlabel.setText(Integer.toString(BX));
           }
          }
          if(ListaResultado.get(Contador).getRegistro().equals("CX")){
           if(Integer.parseInt(ListaResultado.get(Contador).getOperando())>0){
           CX=Integer.parseInt(ListaResultado.get(Contador).getOperando());
           CXlabel.setText(Integer.toString(CX));
           }
          }
          if(ListaResultado.get(Contador).getRegistro().equals("DX")){
           if(Integer.parseInt(ListaResultado.get(Contador).getOperando())>0){
           DX=Integer.parseInt(ListaResultado.get(Contador).getOperando());
           DXlabel.setText(Integer.toString(DX));
           }
          }
         
         
      }
      
      if(ListaResultado.get(Contador).getComando().equals("STORE")){
          if(ListaResultado.get(Contador).getRegistro().equals("AX")){
          AX=AC;
          AXlabel.setText(Integer.toString(AX));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("BX")){
          BX=AC;
          BXlabel.setText(Integer.toString(BX));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("CX")){
          CX=AC;
          CXlabel.setText(Integer.toString(CX));
          }
          if(ListaResultado.get(Contador).getRegistro().equals("DX")){
          DX=AC;
          DXlabel.setText(Integer.toString(DX));
          }
      
      }
       Tercerjlabel.setText(ListaResultado.get(Contador).getBinario());
       if(Contador<ListaResultado.size()){
          Contador=Contador+1;
          }
       
      
    }//GEN-LAST:event_btnSiguienteActionPerformed
    private void cargarDatos(String urlArchivo){
        ArrayList<String> resultado = nuevo.leerTxt(urlArchivo);
        nuevo.crearObjestos(resultado);
        ArrayList<Comando> arregloComandos = nuevo.getArregloComandos();
        Contador= 0;
        Resultado= 0;
        AX=0;
        BX=0;
        CX= 0;
        DX=0;
        int NumeroRandom=(int) (Math.random() * ( 75 - 0 ));
        for(int z=0;z<arregloComandos.size();z++){
           Funcionalidad Objeto = new Funcionalidad(NumeroRandom,arregloComandos.get(z).tipoComando,arregloComandos.get(z).registro,
                   arregloComandos.get(z).operando2,arregloComandos.get(z).tipoComandoBinario+arregloComandos.get(z).operando1Binario+arregloComandos.get(z).operando2Binario);
            ListaResultado.add(Objeto);
            
            String datos[]={Integer.toString(NumeroRandom),arregloComandos.get(z).tipoComandoBinario,arregloComandos.get(z).operando1Binario,arregloComandos.get(z).operando2Binario};
            memory.addRow(datos);
            NumeroRandom++;
        }
        
      
        
       PrimerJlabel.setText(Integer.toString(ListaResultado.get(0).getPosicion()));
       Contador=Contador+1;
       
      if(ListaResultado.get(0).getComando().equals("LOAD")){
          if(ListaResultado.get(0).getRegistro().equals("AX")){
             AC=AX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("BX")){
             AC=BX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("CX")){
             AC=CX;
             Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("DX")){
             AC=DX;
             Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(0).getComando().equals("ADD")){
        
          if(ListaResultado.get(0).getRegistro().equals("AX")){
           AC=AC+AX;
           Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("BX")){
          AC=AC+BX;
          Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("CX")){
          AC=AC+CX;
          Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("DX")){
          AC=AC+DX;
          Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(0).getComando().equals("SUB")){
          if(ListaResultado.get(0).getRegistro().equals("AX")){
           AC=AC-AX;
           Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("BX")){
            AC=AC-BX;
            Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("CX")){
            AC=AC-CX;
            Segundojlabel.setText(Integer.toString(AC));
          }
          if(ListaResultado.get(0).getRegistro().equals("DX")){
            AC=AC-DX;
            Segundojlabel.setText(Integer.toString(AC));
          }
      }
      
      if(ListaResultado.get(0).getComando().equals("MOVE")){
          if(ListaResultado.get(0).getRegistro().equals("AX")){
           if(Integer.parseInt(ListaResultado.get(0).getOperando())>0){
           AX=Integer.parseInt(ListaResultado.get(0).getOperando());
           AXlabel.setText(Integer.toString(AX));
           }
          }
          if(ListaResultado.get(0).getRegistro().equals("BX")){
           if(Integer.parseInt(ListaResultado.get(0).getOperando())>0){
           BX=Integer.parseInt(ListaResultado.get(0).getOperando());
           BXlabel.setText(Integer.toString(BX));
           }
          }
          if(ListaResultado.get(0).getRegistro().equals("CX")){
           if(Integer.parseInt(ListaResultado.get(0).getOperando())>0){
           CX=Integer.parseInt(ListaResultado.get(0).getOperando());
           CXlabel.setText(Integer.toString(CX));
           }
          }
          if(ListaResultado.get(0).getRegistro().equals("DX")){
           if(Integer.parseInt(ListaResultado.get(0).getOperando())>0){
           DX=Integer.parseInt(ListaResultado.get(0).getOperando());
           DXlabel.setText(Integer.toString(DX));
           }
          }
      }
      
      if(ListaResultado.get(0).getComando().equals("STORE")){
          if(ListaResultado.get(0).getRegistro().equals("AX")){
          AX=AC;
          AXlabel.setText(Integer.toString(AX));
          }
          if(ListaResultado.get(0).getRegistro().equals("BX")){
          BX=AC;
          BXlabel.setText(Integer.toString(BX));
          }
          if(ListaResultado.get(0).getRegistro().equals("CX")){
          CX=AC;
          CXlabel.setText(Integer.toString(CX));
          }
          if(ListaResultado.get(0).getRegistro().equals("DX")){
          DX=AC;
          DXlabel.setText(Integer.toString(DX));
          }
      
      }
       
    Tercerjlabel.setText(ListaResultado.get(0).getBinario());
     //Contador=Contador+1;
    }
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
    private javax.swing.JLabel AXlabel;
    private javax.swing.JLabel BXlabel;
    private javax.swing.JLabel CXlabel;
    private javax.swing.JLabel DXlabel;
    private javax.swing.JLabel PrimerJlabel;
    private javax.swing.JLabel Segundojlabel;
    private javax.swing.JLabel Tercerjlabel;
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
    private javax.swing.JTable tlbMemory;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
