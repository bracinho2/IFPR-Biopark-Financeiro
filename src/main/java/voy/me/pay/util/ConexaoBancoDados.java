package voy.me.pay.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BrAcInhO
 */
public class ConexaoBancoDados {
    
    private static Connection conexao;
    private static final String URL_CONEXAO = "jdbc:mysql://localhost:3306/mevoypay?useSSL=true&useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "mysql";

    public static Connection getConexao() {
        
        if(conexao == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexao = (Connection) DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
            } catch (ClassNotFoundException | SQLException ex){
                Logger.getLogger(ConexaoBancoDados.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("chegou aqui!");
            } 
        }
        return conexao;
    }
    
    public static void fecharConexao(){
        if(conexao != null){
            try {
                conexao.close();
                conexao = null;
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBancoDados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
