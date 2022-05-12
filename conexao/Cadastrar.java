package conexao;
import DTO.CadastroDTO;
import TGI.TelaEntrar;
import TGI.TelaCadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Cadastrar {
    
    Connection conn;
    PreparedStatement pstm;
    
    
    public void novoCadastro(CadastroDTO objcadastrodto){
       String sql = "insert into usuarios (Email, Senha) values (?,?)";
       
       conn = new ConexaoBanco().getConnection();     
       
        try {
            
          pstm = conn.prepareStatement(sql);
          pstm.setString(1, objcadastrodto.getEmail_cadastro());
          pstm.setString(2, objcadastrodto.getSenha_cadastro());
          
          pstm.execute();
          JOptionPane.showMessageDialog(null, "Usuario criado com sucesso.");
          pstm.close();
          
          
          TelaEntrar tlentrar = new TelaEntrar();
          tlentrar.setVisible(true);
          
          TelaCadastro tlcadastro = new TelaCadastro();
          tlcadastro.dispose(); 
          
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null," ERRO... Email ja existente");
        }    
       
    }
} 
            

