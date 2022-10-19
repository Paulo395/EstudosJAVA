/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import java.awt.Font;

/**
 *
 * @author pauli
 */
public class TelaPensamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaPensamento
     */
    public TelaPensamento() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um número de 1 a 5, tente advinhar!<html>");
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
        lblFrase = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        btnClick = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advinhe");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genie_1f9de.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 76, 180, 120));

        txtNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 123, -1));

        btnClick.setText("Advinhar");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        getContentPane().add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 123, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/verde.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(txtNum.getValue().toString());
        /*
            Spinner é objeto, logo precisa converter a informação para String e 
            logo após converter para valor.
        */
        double b = Math.random();
        int n = (int) (6 + b * ((-1)-5));
        /*
            Formula para gerar numeros aleatorios interios, fazendo a converção
            na variavel que irá receber o valor(pessoalmente não entendo o calculo)
            6 porque quero de 5 para baixo e -1 - 5 pois quero numeros de 0 a 5
        */
        /*
            No video Guanabara usou double n = 1 + Math.radom() * (6 - 1);
            e int valor = (int) n;
        
            String f1 = "Acertou";
            String f2 = "Errou, eu pensei em " + a;
        */
        
        String r = (a==n)?"<html>Você Acertou!<html>":"<html>Você errou, eu pensava em " + n + "<html>";
        System.out.println(n);
        
        //lblFrase.setFont(new Font("Arial Black", Font.PLAIN), 12);
        
        lblFrase.setText(r);
    }//GEN-LAST:event_btnClickActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPensamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPensamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
