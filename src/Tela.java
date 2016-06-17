
/**
 *
 * @author Felipe Rodrigues Gil 248543
 * Televisão com controle de estado,canal e volume.
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        
        aumentarCanal.setEnabled(false);
        diminuirCanal.setEnabled(false);
        aumentarVolume.setEnabled(false);
        abaixarVolume.setEnabled(false);
        
    }

    Televisor tv = new Televisor();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        diminuirCanal = new javax.swing.JButton();
        aumentarCanal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        volume = new javax.swing.JTextField();
        abaixarVolume = new javax.swing.JButton();
        aumentarVolume = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        desligar = new javax.swing.JButton();
        ligar = new javax.swing.JButton();
        canal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Canal");

        diminuirCanal.setText("-");
        diminuirCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirCanalActionPerformed(evt);
            }
        });

        aumentarCanal.setText("+");
        aumentarCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarCanalActionPerformed(evt);
            }
        });

        jLabel2.setText("Volume");

        abaixarVolume.setText("-");
        abaixarVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaixarVolumeActionPerformed(evt);
            }
        });

        aumentarVolume.setText("+");
        aumentarVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarVolumeActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado");

        desligar.setText("Off");
        desligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desligarActionPerformed(evt);
            }
        });

        ligar.setText("On");
        ligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(131, 131, 131))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(abaixarVolume)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ligar)
                                    .addGap(23, 23, 23)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(desligar)
                                .addComponent(aumentarVolume)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(21, 21, 21)
                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(diminuirCanal)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(aumentarCanal))
                                .addComponent(canal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(canal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diminuirCanal)
                    .addComponent(aumentarCanal))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abaixarVolume)
                    .addComponent(aumentarVolume))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ligar)
                    .addComponent(desligar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aumentarCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarCanalActionPerformed
        
        
        if (tv.canal < 16) {
            tv.canal++;
            canal.setText(String.valueOf(tv.canal));
        }
    }//GEN-LAST:event_aumentarCanalActionPerformed

    private void diminuirCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirCanalActionPerformed
        if (tv.canal > 1) {
            tv.canal--;
            canal.setText(String.valueOf(tv.canal));
        }
    }//GEN-LAST:event_diminuirCanalActionPerformed

    private void aumentarVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarVolumeActionPerformed
        if (tv.volume < 10) {
            tv.volume++;
            volume.setText(String.valueOf(tv.volume));
        }
    }//GEN-LAST:event_aumentarVolumeActionPerformed

    private void abaixarVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaixarVolumeActionPerformed
        if (tv.volume > 0) {
            tv.volume--;
            volume.setText(String.valueOf(tv.volume));
        }
    }//GEN-LAST:event_abaixarVolumeActionPerformed

    private void ligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligarActionPerformed
        tv.estado = true;
        estado.setText("Ligado");
        aumentarCanal.setEnabled(true);
        diminuirCanal.setEnabled(true);
        aumentarVolume.setEnabled(true);
        abaixarVolume.setEnabled(true);
    }//GEN-LAST:event_ligarActionPerformed

    private void desligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desligarActionPerformed
        tv.estado = false;
        estado.setText("Desligado");
        aumentarCanal.setEnabled(false);
        diminuirCanal.setEnabled(false);
        aumentarVolume.setEnabled(false);
        abaixarVolume.setEnabled(false);
    }//GEN-LAST:event_desligarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abaixarVolume;
    private javax.swing.JButton aumentarCanal;
    private javax.swing.JButton aumentarVolume;
    private javax.swing.JTextField canal;
    private javax.swing.JButton desligar;
    private javax.swing.JButton diminuirCanal;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ligar;
    private javax.swing.JTextField volume;
    // End of variables declaration//GEN-END:variables
}
