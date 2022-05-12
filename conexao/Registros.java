package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import DTO.RegistroDTO;
import DTO.UsuarioDTO;
import TGI.TelaRegistro;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Registros {
   
   Connection conn;
   PreparedStatement pstm; 
   ResultSet rs;
   ArrayList<RegistroDTO> lista = new ArrayList<>();
    
   UsuarioDTO objUsuarioDTO = new UsuarioDTO();
   
   
    public ArrayList <RegistroDTO > PesquisaRegistro(){     
   
        try {
            
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select * from registros where IdUsuario = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                RegistroDTO objregistrodto = new RegistroDTO();
                objregistrodto.setId_Registro(rs.getInt("Id_Registro"));
                objregistrodto.setNome(rs.getString("Nome"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setValor(rs.getFloat("Valor"));
                objregistrodto.setData(rs.getString("Data"));
                objregistrodto.setParcelas(rs.getInt("Parcelas"));
                objregistrodto.setModo(rs.getString("DespesaReceita"));
                objregistrodto.setFixo(rs.getString("FixoMensal"));
                objregistrodto.setDescricao(rs.getString("Descricao"));
                
                lista.add(objregistrodto);
                
            }
                
          
          
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
    
            return lista;
    
    }
    
    public void novoRegistro(RegistroDTO objregistrosdto){
       String sql = "insert into registros (Nome, Tipo, Valor, Data, Parcelas, DespesaReceita, FixoMensal , Descricao,  IdUsuario ) values (?,?,?,?,?,?,?,?,?)";
       
       conn = new ConexaoBanco().getConnection();     
       
        try {
          
          Verificacao vr = new Verificacao();
          
          pstm = conn.prepareStatement(sql);
          pstm.setString(1, objregistrosdto.getNome());
          pstm.setString(2, objregistrosdto.getTipo());
          pstm.setFloat(3, objregistrosdto.getValor());
          pstm.setString(4, objregistrosdto.getData());
          pstm.setInt(5, objregistrosdto.getParcelas());
          pstm.setString(6, objregistrosdto.getModo());
          pstm.setString(7,objregistrosdto.getFixo());
          pstm.setString(8, objregistrosdto.getDescricao());
          pstm.setInt(9, vr.id_usuario(objUsuarioDTO));
          
          pstm.execute();
          JOptionPane.showMessageDialog(null, "Registro criado com sucesso.");
          pstm.close();
          
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Cadastrar Registros"+ erro);
        }    
       
    }
    
        public ArrayList <RegistroDTO > fixo(){     
   
        try {
            
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select * from registros where IdUsuario = ? and FixoMensal = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            pstm.setString(2, "Fixo" );
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                RegistroDTO objregistrodto = new RegistroDTO();
                objregistrodto.setId_Registro(rs.getInt("Id_Registro"));
                objregistrodto.setNome(rs.getString("Nome"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setValor(rs.getFloat("Valor"));
                objregistrodto.setData(rs.getString("Data"));
                objregistrodto.setParcelas(rs.getInt("Parcelas"));
                objregistrodto.setModo(rs.getString("DespesaReceita"));
                objregistrodto.setFixo(rs.getString("FixoMensal"));
                objregistrodto.setDescricao(rs.getString("Descricao"));
                
                lista.add(objregistrodto);
                
            }
                
          
          
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
    
            return lista;
    
    }
    public ArrayList <RegistroDTO > mensal(){     
   
        try {
            
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select * from registros where IdUsuario = ? and FixoMensal = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            pstm.setString(2, "Mensal" );
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                RegistroDTO objregistrodto = new RegistroDTO();
                objregistrodto.setId_Registro(rs.getInt("Id_Registro"));
                objregistrodto.setNome(rs.getString("Nome"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setValor(rs.getFloat("Valor"));
                objregistrodto.setData(rs.getString("Data"));
                objregistrodto.setParcelas(rs.getInt("Parcelas"));
                objregistrodto.setModo(rs.getString("DespesaReceita"));
                objregistrodto.setFixo(rs.getString("FixoMensal"));
                objregistrodto.setDescricao(rs.getString("Descricao"));
                
                lista.add(objregistrodto);
                
            }
                
          
          
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
    
            return lista;
    
    }
    
        public ArrayList <RegistroDTO > despesa(){     
   
        try { 
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select * from registros where IdUsuario = ? and DespesaReceita = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            pstm.setString(2, "Despesa" );
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                RegistroDTO objregistrodto = new RegistroDTO();
                objregistrodto.setId_Registro(rs.getInt("Id_Registro"));
                objregistrodto.setNome(rs.getString("Nome"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setValor(rs.getFloat("Valor"));
                objregistrodto.setData(rs.getString("Data"));
                objregistrodto.setParcelas(rs.getInt("Parcelas"));
                objregistrodto.setModo(rs.getString("DespesaReceita"));
                objregistrodto.setFixo(rs.getString("FixoMensal"));
                objregistrodto.setDescricao(rs.getString("Descricao"));
                
                lista.add(objregistrodto);
                
            }
                
          
          
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
    
            return lista;
    
    }
            public ArrayList <RegistroDTO > receita(){     
   
        try {
            
            Verificacao vr = new Verificacao();
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "select * from registros where IdUsuario = ? and DespesaReceita = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vr.id_usuario(objUsuarioDTO));
            pstm.setString(2, "Receita" );
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                RegistroDTO objregistrodto = new RegistroDTO();
                objregistrodto.setId_Registro(rs.getInt("Id_Registro"));
                objregistrodto.setNome(rs.getString("Nome"));
                objregistrodto.setTipo(rs.getString("Tipo"));
                objregistrodto.setValor(rs.getFloat("Valor"));
                objregistrodto.setData(rs.getString("Data"));
                objregistrodto.setParcelas(rs.getInt("Parcelas"));
                objregistrodto.setModo(rs.getString("DespesaReceita"));
                objregistrodto.setFixo(rs.getString("FixoMensal"));
                objregistrodto.setDescricao(rs.getString("Descricao"));
                
                lista.add(objregistrodto);
                
            }
                
          
          
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Registro"+ erro);
            }
    
            return lista;
    
    }
    public void Excluir (RegistroDTO reg){ 
        try {
            
            conn = new ConexaoBanco().getConnection();
            
            String sql = "delete from registros where Id_Registro = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,reg.getId_Registro());
            
            
            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null,"Excluido com Sucesso");
            
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Excluir"+ erro);
            }

    }
}                
        