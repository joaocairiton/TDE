/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joaoc
 */
public class ConexaoBd {

    public Statement stm;//consulta
    public ResultSet rs; //armazena
    private String driver = "org.postgresql.Driver";//identfica
    private String caminho = "jdbc:postgresql://localhost:5432/TDE2";
    private String usuario = "postgres";
    private String senha = "123456";
    public Connection conn;

    public void conectar() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco" + ex.getMessage());
        }
    }

    public void executaSQL(String sql) {

        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectar o SQL" + ex.getMessage());
        }

    }

    public void desconectar() {

        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o Banco" + ex.getMessage());
        }

    }
}
