/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ClienteModel;

/**
 *
 * @author joaoc
 */
public class ControleCliente {
    
    ConexaoBd conc = new ConexaoBd();
    ConexaoBd conexao = new ConexaoBd();
    ConexaoBd conx = new ConexaoBd();
    
     public void inserirCliente(ClienteModel cl) {
        conc.conectar();
       

        try {
            PreparedStatement pst = conc.conn.prepareStatement("insert into cliente( nome, cpf, rg, orgao, data_nascimento, end_id)values(?,?,?,?,?,?)");

            pst.setString(1, cl.getNome());
            pst.setString(2, cl.getCpf());
            pst.setString(3, cl.getRg());
           
            pst.setString(4, cl.getOrgao());
            pst.setString(5, cl.getData_nascimento());
            pst.setInt(6, cl.getCod_end());
         
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Cliente \n Erro" + ex);
        }

        conc.desconectar();

    }
      public void ExcluirCliente(ClienteModel cl) {

          conc.conectar();

        try {
            PreparedStatement pst = conc.conn.prepareStatement("delete from cliente where cli_id=?");
            pst.setInt(1, cl.getCod_cli());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o Cliente \n erro" + ex);
        }
        conc.desconectar();

    }
      
      public void EditarCliente(ClienteModel cl) {

        conc.conectar();

        try {
            PreparedStatement pst = conc.conn.prepareStatement("update cliente set nome=?,  cpf=?,  rg=?,  orgao=?,  data_nascimento=?, end_id=? where  cli_id=?");

            pst.setString(1, cl.getNome());
            pst.setString(2, cl.getCpf());
            pst.setString(3, cl.getRg());
           
            pst.setString(4, cl.getOrgao());
            pst.setString(5, cl.getData_nascimento());
          
              pst.setInt(6, cl.getCod_end());
              pst.setInt(7, cl.getCod_cli());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Endereço editado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o endereço \n erro" + ex);
        }
        
        conc.desconectar();

    }
      
    
    
     

    
}
