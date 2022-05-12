package TGI;

import DTO.RegistroDTO;
import DTO.UsuarioDTO;
import conexao.ConexaoBanco;
import conexao.Registros;
import conexao.Verificacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaRegistro extends javax.swing.JFrame {

   
    public TelaRegistro() {
        initComponents();
        listarValores();
        Receita();
        Despesa();
        Total();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Receita = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Despesa = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(126, 123, 123));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\fundo-cinza-03.jpg")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 410, 150, 2);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\fundo-cinza-03.jpg")); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 280, 150, 2);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\fundo-cinza-03.jpg")); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 150, 150, 2);

        jButton2.setBackground(new java.awt.Color(38, 38, 38));
        jButton2.setFont(new java.awt.Font("Heineken", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Sair");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(70, 440, 80, 50);

        jButton3.setBackground(new java.awt.Color(38, 38, 38));
        jButton3.setFont(new java.awt.Font("Heineken", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Novo");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(70, 190, 80, 50);

        jButton4.setBackground(new java.awt.Color(38, 38, 38));
        jButton4.setFont(new java.awt.Font("Heineken", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 51));
        jButton4.setText("Registros");
        jButton4.setBorder(null);
        jPanel2.add(jButton4);
        jButton4.setBounds(70, 320, 80, 50);

        jLabel12.setFont(new java.awt.Font("Heineken", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ECONOMIZE JA");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 60, 180, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 220, 620);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id_Registro", "Nome", "Tipo", "Valor", "Data", "Parcelas", "Despesa/Receita", "Fixo/Mensal", "Descricao"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 600, 240);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Mensal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(320, 380, 80, 30);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setText("Todos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(160, 380, 80, 30);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setText("Despesa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(0, 380, 80, 30);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setText("Receita");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(80, 380, 80, 30);

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setText("Excluir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(520, 380, 80, 30);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Receitas:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(80, 0, 60, 30);

        Receita.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Receita.setForeground(new java.awt.Color(0, 204, 0));
        Receita.setText("jLabel3");
        jPanel4.add(Receita);
        Receita.setBounds(80, 30, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Despesas:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(270, 0, 60, 30);

        Despesa.setBackground(new java.awt.Color(255, 255, 255));
        Despesa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Despesa.setForeground(new java.awt.Color(204, 0, 0));
        Despesa.setText("jLabel3");
        jPanel4.add(Despesa);
        Despesa.setBounds(270, 30, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Total:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(470, 0, 60, 30);

        Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Total.setText("jLabel3");
        jPanel4.add(Total);
        Total.setBounds(470, 30, 100, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 260, 600, 70);

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setText("Fixo");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(240, 380, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\fundo-cinza-02.jpg")); // NOI18N
        jLabel2.setToolTipText("");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 420);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(300, 80, 620, 420);

        jLabel1.setFont(new java.awt.Font("Base 02", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Home\\Documents\\NetBeansProjects\\TGI\\fundo-azul-escuro-1024x701.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 0, 770, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaNovo objnovo = new TelaNovo();
        objnovo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             listarDespesas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
             listarReceitas();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             listarValores();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            listarMensal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            listarFixo();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    
        if(jTable1.getSelectedRow() != -1){
        
        RegistroDTO regdto = new RegistroDTO();
        Registros reg = new Registros();
        
        regdto.setId_Registro((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
         
        reg.Excluir(regdto);
        
        listarValores();
        Receita();
        Despesa();
        Total();
        }
        else{
        JOptionPane.showMessageDialog(null,"Selecione um registro");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaEntrar objentrar = new TelaEntrar();
        objentrar.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Despesa;
    private javax.swing.JLabel Receita;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


    private void listarValores(){
    
    try {
         Registros objregistros = new Registros();
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setNumRows(0);
         
         ArrayList<RegistroDTO> lista = objregistros.PesquisaRegistro();
         
         for(int num = 0; num < lista.size();num ++ ){
         
             model.addRow(new Object[]{
                 lista.get(num).getId_Registro(),
                 lista.get(num).getNome(),
                 lista.get(num).getTipo(),
                 lista.get(num).getValor(),
                 lista.get(num).getData(),
                 lista.get(num).getParcelas(),
                 lista.get(num).getModo(),
                 lista.get(num).getFixo(),
                 lista.get(num).getDescricao()
             });
         }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Listar"+ erro);
        }
    }
    
    private void listarDespesas(){
    
    try {
         Registros objregistros = new Registros();
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setNumRows(0);
         
         ArrayList<RegistroDTO> lista = objregistros.despesa();
         
         for(int num = 0; num < lista.size();num ++ ){
         
             model.addRow(new Object[]{
                 lista.get(num).getId_Registro(),
                 lista.get(num).getNome(),
                 lista.get(num).getTipo(),
                 lista.get(num).getValor(),
                 lista.get(num).getData(),
                 lista.get(num).getParcelas(),
                 lista.get(num).getModo(),
                 lista.get(num).getFixo(),
                 lista.get(num).getDescricao()
             });
         }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Listar"+ erro);
        }
    }
    
    private void listarReceitas(){
    
    try {
         Registros objregistros = new Registros();
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setNumRows(0);
         
         ArrayList<RegistroDTO> lista = objregistros.receita();
         
         for(int num = 0; num < lista.size();num ++ ){
         
             model.addRow(new Object[]{
                 lista.get(num).getId_Registro(),
                 lista.get(num).getNome(),
                 lista.get(num).getTipo(),
                 lista.get(num).getValor(),
                 lista.get(num).getData(),
                 lista.get(num).getParcelas(),
                 lista.get(num).getModo(),
                 lista.get(num).getFixo(),
                 lista.get(num).getDescricao()
             });
         }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Listar"+ erro);
        }
    }
    
    private void listarFixo(){
    
    try {
         Registros objregistros = new Registros();
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setNumRows(0);
         
         ArrayList<RegistroDTO> lista = objregistros.fixo();
         
         for(int num = 0; num < lista.size();num ++ ){
         
             model.addRow(new Object[]{
                 lista.get(num).getId_Registro(),
                 lista.get(num).getNome(),
                 lista.get(num).getTipo(),
                 lista.get(num).getValor(),
                 lista.get(num).getData(),
                 lista.get(num).getParcelas(),
                 lista.get(num).getModo(),
                 lista.get(num).getFixo(),
                 lista.get(num).getDescricao()
             });
         }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Listar"+ erro);
        }
    }
    
    private void listarMensal(){
    
    try {
         Registros objregistros = new Registros();
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         model.setNumRows(0);
         
         ArrayList<RegistroDTO> lista = objregistros.mensal();
         
         for(int num = 0; num < lista.size();num ++ ){
         
             model.addRow(new Object[]{
                 lista.get(num).getId_Registro(),
                 lista.get(num).getNome(),
                 lista.get(num).getTipo(),
                 lista.get(num).getValor(),
                 lista.get(num).getData(),
                 lista.get(num).getParcelas(),
                 lista.get(num).getModo(),
                 lista.get(num).getFixo(),
                 lista.get(num).getDescricao()
             });
         }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Listar"+ erro);
        }
    }
    
    public void Despesa (){     
   
        Connection conn;
        PreparedStatement pstm; 
        ResultSet rs; 
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        
        DecimalFormat dec = new DecimalFormat("00.00");
        float total;
  
        try {
            
             
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select sum(Valor) from registros where IdUsuario = ? and DespesaReceita = 'Despesa'";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
            
            total = rs.getFloat(1);
                
            Despesa.setText(dec.format(total));
            }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
        
    }
    
    public void Receita (){     
   
        Connection conn;
        PreparedStatement pstm; 
        ResultSet rs; 
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        
        DecimalFormat dec = new DecimalFormat("00.00");
        float total;
  
        try {
            
             
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select sum(Valor) from registros where IdUsuario = ? and DespesaReceita = 'Receita'";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
            
            total = rs.getFloat(1);
                
            Receita.setText(dec.format(total));
            }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
        
    }
public void Total (){ 
        
        DecimalFormat dec = new DecimalFormat("00.00");
        float desp, rec, total;
            
        desp = Float.parseFloat(Despesa.getText().replaceAll(",","."));
        
        rec = Float.parseFloat(Receita.getText().replaceAll(",",".")); 
        
        total = (rec-desp);

        Total.setText(dec.format(total));

    }
} 


