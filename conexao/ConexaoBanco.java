package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {
    
    public Connection getConnection(){
        try {
            // Conexao sucedida
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/tgi?useTimezone=true&serverTimezone=UTC",
            "admin",
            "123"
            );
          
            return conn; 
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
    }
    
}
