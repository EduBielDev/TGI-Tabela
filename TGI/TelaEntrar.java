package TGI;

import DTO.UsuarioDTO;
import conexao.Verificacao;
import java.sql.ResultSet;



public class TelaEntrar extends javax.swing.JFrame {

   
    public TelaEntrar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 430));
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Email");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(70, 160, 190, 20);

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("123456789");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(70, 210, 180, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\índice.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 230, 190, 2);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\índice.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 180, 190, 2);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\icon_senha.png")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 210, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\email_blue_23344.png")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 160, 30, 30);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 273, 100, 30);

        jButton2.setText("Cadastre-se");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 273, 100, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\feltros-lisos-santa-fe-feltro-azul-royal-031--p-1538074880355.jpg")); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 110, 80, 10);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("ECONOMIZE JA");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 40, 230, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(140, 30, 300, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\dicas-de-economia-para-ter-mais-dinheiro-no-fim-do-mes.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-40, 0, 1081, 393);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            
            String email_usuario, senha_usuario;
        
            email_usuario = jTextField1.getText();
            senha_usuario = jPasswordField1.getText();
        
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setEmail_usuario(email_usuario);
            objusuariodto.setSenha_usuario(senha_usuario);
            
            Verificacao vr = new Verificacao();
            ResultSet rsverifica = vr.autenticacaoUsuario(objusuariodto);
           
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        TelaCadastro objcadastrar = new TelaCadastro();
        objcadastrar.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void setDefautCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
