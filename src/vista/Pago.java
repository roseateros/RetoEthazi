
package vista;

import controlador.GenerarResguardo;
import controlador.GestionarPago;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.DatosPago;

/**
 *
 * @author acebin
 */
public class Pago extends javax.swing.JFrame {
    
    GestionarPago miPago = new GestionarPago();
    
    GenerarResguardo resguardo = new GenerarResguardo();
    
    /**
     * Creates new form Pago
     */
    public Pago() {
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

        jButtonPagar = new javax.swing.JButton();
        boton200 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boton100 = new javax.swing.JButton();
        boton50 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton05 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton001 = new javax.swing.JButton();
        boton005 = new javax.swing.JButton();
        boton002 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        actualizaPago = new javax.swing.JLabel();
        totalAPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 418));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 360, 90, -1));

        boton200.setText("200");
        boton200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton200ActionPerformed(evt);
            }
        });
        getContentPane().add(boton200, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButton2.setText("Reiniciar Pago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        boton100.setText("100");
        boton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton100ActionPerformed(evt);
            }
        });
        getContentPane().add(boton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        boton50.setText("50");
        boton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton50ActionPerformed(evt);
            }
        });
        getContentPane().add(boton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        boton20.setText("20");
        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });
        getContentPane().add(boton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        boton05.setText("05");
        boton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton05ActionPerformed(evt);
            }
        });
        getContentPane().add(boton05, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        boton10.setText("10");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        getContentPane().add(boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        boton02.setText("02");
        boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton02ActionPerformed(evt);
            }
        });
        getContentPane().add(boton02, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        boton01.setText("01");
        boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton01ActionPerformed(evt);
            }
        });
        getContentPane().add(boton01, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        boton001.setText("001");
        boton001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton001ActionPerformed(evt);
            }
        });
        getContentPane().add(boton001, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        boton005.setText("005");
        boton005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton005ActionPerformed(evt);
            }
        });
        getContentPane().add(boton005, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        boton002.setText("002");
        boton002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton002ActionPerformed(evt);
            }
        });
        getContentPane().add(boton002, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jButton16.setText("Cancelar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TOTAL A PAGAR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione el dinero a ingresar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PAGADO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        actualizaPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(actualizaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 150, 30));

        totalAPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalAPagar.setText("50");
        getContentPane().add(totalAPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 360, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        // TODO add your handling code here:
        
        /*
        Comprobamos el pago y, generamos el resguardo(txt)
        */
        
        
                try{
                   resguardo.generarResguardo(miPago.verificarPago(this.totalAPagar, this.actualizaPago));
                }catch(IOException e){
                    e.getMessage();
                }catch(NumberFormatException e){
                    e.getMessage();
                }
        
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void boton200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton200ActionPerformed
        // TODO add your handling code here:
        miPago.calcularTotal(200, this.actualizaPago);
    }//GEN-LAST:event_boton200ActionPerformed

    private void boton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton100ActionPerformed
        // TODO add your handling code here:
       miPago.calcularTotal(100, this.actualizaPago);
    }//GEN-LAST:event_boton100ActionPerformed

    private void boton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton50ActionPerformed
        // TODO add your handling code here:

       miPago.calcularTotal(50, this.actualizaPago);
    }//GEN-LAST:event_boton50ActionPerformed

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        // TODO add your handling code here:

        miPago.calcularTotal(20, this.actualizaPago);
    }//GEN-LAST:event_boton20ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        // TODO add your handling code here:
        miPago.calcularTotal(10, this.actualizaPago);
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
        
        miPago.calcularTotal(5, this.actualizaPago);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
       
       miPago.calcularTotal(2, this.actualizaPago);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
       
        miPago.calcularTotal(1, this.actualizaPago);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton05ActionPerformed
        // TODO add your handling code here:
        
       miPago.calcularTotal((float)(Math.round(0.5f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton05ActionPerformed

    private void boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton02ActionPerformed
        // TODO add your handling code here:
        
        miPago.calcularTotal((float)(Math.round(0.2f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton02ActionPerformed

    private void boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton01ActionPerformed
        // TODO add your handling code here:
     
        miPago.calcularTotal((float)(Math.round(0.1f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton01ActionPerformed

    private void boton005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton005ActionPerformed
        // TODO add your handling code here:
        
        miPago.calcularTotal((float)(Math.round(0.05f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton005ActionPerformed

    private void boton002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton002ActionPerformed
        // TODO add your handling code here:
        
        miPago.calcularTotal((float)(Math.round(0.02f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton002ActionPerformed

    private void boton001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton001ActionPerformed
        // TODO add your handling code here:
        
        miPago.calcularTotal((float)(Math.round(0.01f*100f)/100f), this.actualizaPago);
    }//GEN-LAST:event_boton001ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /*
        Aqui reiniciamos el pago
        */
        this.actualizaPago.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        Buscador miObj = new Buscador();
        miObj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualizaPago;
    private javax.swing.JButton boton001;
    private javax.swing.JButton boton002;
    private javax.swing.JButton boton005;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton05;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton100;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton200;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton50;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel totalAPagar;
    // End of variables declaration//GEN-END:variables
}
