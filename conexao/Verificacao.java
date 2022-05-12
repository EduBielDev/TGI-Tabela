package conexao;


import DTO.UsuarioDTO;
import TGI.TelaEntrar;
import TGI.TelaHome;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class Verificacao {
    
    Connection conn; 
    ResultSet rs;
    public static int id ;
    
    
    public ResultSet autenticacaoUsuario (UsuarioDTO objUsuarioDTO){    
    conn = new ConexaoBanco().getConnection(); 
    
     
    
        try {
            
            String sql = "select * from usuarios where Email = ? and Senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getEmail_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                 
                
                objUsuarioDTO.setId_usuario(rs.getInt("Id"));
                id = objUsuarioDTO.getId_usuario();
                
                
                
                //chamar tela
                TelaHome objhome = new TelaHome();
                objhome.setVisible(true);
                
                TelaEntrar tlentrar = new TelaEntrar();
                tlentrar.dispose();
                objhome.setLocationRelativeTo(null);
                
               
                
            } else {
                JOptionPane.showMessageDialog(null,"Usuario ou senha invalida.");
            }
                    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Usuarioview"+ erro);
            
        }
         
           return rs;
            
      
    
    }
    public int id_usuario(UsuarioDTO objUsuarioDTO) {
       return id;
    }
   
}
