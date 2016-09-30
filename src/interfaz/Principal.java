/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUCYLEONOR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperaciones};
        Helper.deshabilitarBotones(botonesD);
        Helper.habilitarBotones(botonesH);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizResultante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Operaciones con Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        tblMatrizResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizResultante.setEnabled(false);
        jScrollPane1.setViewportView(tblMatrizResultante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 380, 360));

        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 380, 350));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "Matriz Traspuesta", "Letra Z", "Letra T", "Letra E", "Letra F", "Letra I", "Letra N", "Letra X", "Letra P", "Letra Y", "Letra A", "Letra V" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 140, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Núm. Filas");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, -1));

        jLabel5.setText("Núm. Columnas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 380, 70));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel5.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, -1));

        cmdLlenadoManual.setText("Llenado Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel5.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, -1));

        cmdLlenadoAutomatico.setText("Llenado Automatico");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel5.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 70, -1));

        cmdOperaciones.setText("Efectuar");
        cmdOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionesActionPerformed(evt);
            }
        });
        jPanel5.add(cmdOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 540, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        try {
            if (Integer.parseInt(txtNumeroColumnas.getText()) > 15) {
                Helper.mensaje(this, "El numero de columnas no puede ser mayor que 15", "Error", 2);
                txtNumeroColumnas.requestFocusInWindow();
            } else if (Integer.parseInt(txtNumeroFilas.getText()) > 15) {
                Helper.mensaje(this, "El numero de filas no puede ser mayor que 15", "Error", 2);
                txtNumeroFilas.requestFocusInWindow();
            } else if (Integer.parseInt(txtNumeroColumnas.getText()) < 5) {
                Helper.mensaje(this, "El numero de columnas no puede ser menor que 5", "Error", 2);
                txtNumeroColumnas.requestFocusInWindow();
            } else if (Integer.parseInt(txtNumeroFilas.getText()) < 5) {
                Helper.mensaje(this, "El numero de filas no puede ser menor que 5", "Error", 2);
                txtNumeroFilas.requestFocusInWindow();
            } else {

                DefaultTableModel tm, tm2;
                int nf, nc;
                tm = (DefaultTableModel) tblMatrizInicial.getModel();
                tm2 = (DefaultTableModel) tblMatrizResultante.getModel();

                nf = Integer.parseInt(txtNumeroFilas.getText());
                nc = Integer.parseInt(txtNumeroColumnas.getText());

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);
                JButton botonesH[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar};
                JButton botonesD[] = {cmdOperaciones, cmdCrear};
                txtNumeroColumnas.setEditable(false);
                txtNumeroFilas.setEditable(false);
                Helper.deshabilitarBotones(botonesD);
                Helper.habilitarBotones(botonesH);
            }
        } catch (Exception e) {
            Helper.mensaje(this, "Revise la informacion e ingrese los datos correctamente", "Error", 2);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed

        int nf, nc;
        int n;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdCrear};
        Helper.deshabilitarBotones(botonesD);
        Helper.habilitarBotones(botonesH);
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        int nf, nc;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tblMatrizInicial.setValueAt("", i, j);
                tblMatrizResultante.setValueAt("", i, j);
            }

        }

        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperaciones};
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.setEditable(true);
        Helper.deshabilitarBotones(botonesD);
        Helper.habilitarBotones(botonesH);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionesActionPerformed

        int op, nf, nc, cont, aux, aux1, aux2;

        op = cmbOperaciones.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        cont = 0;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tblMatrizResultante.setValueAt("", i, j);
            }

        }

        switch (op) {
            case 0:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.diagonalSecundaria(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 1:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.triangularSuperior(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 2:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.triangularInferior(tblMatrizInicial, tblMatrizResultante);
                }
                break;

            case 3:
                if (nc != nf) {
                    Helper.mensaje(this, "Para hacer la matriz transpuesta su numero de columnas y filas debe ser igual", "Error", 2);
                } else {
                    Helper.matrizTranspuesta(tblMatrizInicial, tblMatrizResultante);
                }
                break;

            case 4:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.letraZ(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 5:
                if (nc % 2 == 0) {
                    Helper.mensaje(this, "El numero columnas debe ser impar", "Error", 2);
                } else {
                    Helper.letraT(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 6:
                Helper.letraE(tblMatrizInicial, tblMatrizResultante);
                break;
            case 7:
                Helper.letraF(tblMatrizInicial, tblMatrizResultante);
                break;

            case 8:
                if (nc % 2 == 0) {
                    Helper.mensaje(this, "El numero columnas debe ser impar", "Error", 2);
                } else {
                    Helper.letraI(tblMatrizInicial, tblMatrizResultante);
                }
                break;

            case 9:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.letraN(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 10:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.letraX(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 11:

                Helper.letraP(tblMatrizInicial, tblMatrizResultante);

                break;
            case 12:
                if (nf != nc) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.letraY(tblMatrizInicial, tblMatrizResultante);
                }
                break;
            case 13:
                if (nc % 2 == 0) {
                    Helper.mensaje(this, "El numero columnas debe ser impar", "Error", 2);
                } else if (nc < 9 && nf < 9) {
                    Helper.mensaje(this, "El numero de columnas y filas no puede ser menor que 9", "Error", 2);
                } else if (nc < 9 || nf < 9) {
                    Helper.mensaje(this, "El numero de columnas y filas no puede ser menor que 9", "Error", 2);
                } else if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else {
                    Helper.letraA(tblMatrizInicial, tblMatrizResultante);
                }
                break;

            case 14:
                if (nc != nf) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser iguales", "Error", 2);
                } else if (nf < 12 || nc < 12) {
                    Helper.mensaje(this, "El numero de filas y columnas debe ser mayor que 12", "Error", 2);
                } else {
                    Helper.letraV(tblMatrizInicial, tblMatrizResultante);
                }
                break;

        }

        JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdCrear};
        Helper.deshabilitarBotones(botonesD);
        Helper.habilitarBotones(botonesH);
    }//GEN-LAST:event_cmdOperacionesActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed

        double n;
        int aux, nc, nf, res;
        boolean sw = true;
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.recibirDatos(this, "Digite el elemento en la posición: " + " (" + i + "," + j + ")"));
                        tblMatrizInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite la información correctamente", "Error", 2);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = Helper.mensaje(this, "¿Desea Salir?", "Salir", 3);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            JButton botonesH[] = {cmdLlenadoAutomatico, cmdLimpiar, cmdLlenadoManual};
                            JButton botonesD[] = {cmdOperaciones, cmdCrear};
                            Helper.deshabilitarBotones(botonesD);
                            Helper.habilitarBotones(botonesH);
                        } else {
                            aux = 0;
                            JButton botonesH[] = {cmdOperaciones, cmdLimpiar};
                            JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdCrear};
                            Helper.deshabilitarBotones(botonesD);
                            Helper.habilitarBotones(botonesH);
                        }

                    }
                } while (aux == 0);
            }
        }


    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTable tblMatrizResultante;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
