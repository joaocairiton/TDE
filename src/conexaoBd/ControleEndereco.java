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
import jdk.nashorn.internal.scripts.JO;
import model.EnderecoModel;

/**
 *
 * @author joaoc
 */
public class ControleEndereco {

    ConexaoBd conend = new ConexaoBd();
    ConexaoBd conexao = new ConexaoBd();

    public void inseriEndereco(EnderecoModel end) {
        conend.conectar();

        try {
            PreparedStatement pst = conend.conn.prepareStatement("insert into endereco( logradouro, complemento, bairro, numero, cep,cidade,estado,cli_id)values(?,?,?,?,?,?,?,?)");

            pst.setString(1, end.getLogradouro());
            pst.setString(2, end.getComplemento());
            pst.setString(3, end.getBairro());
            pst.setString(4, end.getNumero());
            pst.setString(5, end.getCep());
            pst.setString(6, end.getCidade());
            pst.setString(7, end.getEstado());
           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Endereço inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o endereço \n erro" + ex);
        }

        conend.desconectar();

    }

    public void ExcluirEndereco(EnderecoModel end) {

        conend.conectar();

        try {
            PreparedStatement pst = conend.conn.prepareStatement("delete from endereco where end_id=?");
           // pst.setInt(1, end.getCod_end());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Endereço excluido com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o endereço \n erro" + ex);
        }
        conend.desconectar();

    }

    public void EditarEndereco(EnderecoModel end) {

        conend.conectar();

        try {
            PreparedStatement pst = conend.conn.prepareStatement("update endereco set logradouro=?,  complemento=?,  bairro=?,  numero=?,  cep=?,  cidade=?,  estado=?, cli_id=? where  end_id=?");

            pst.setString(1, end.getLogradouro());
            pst.setString(2, end.getComplemento());
            pst.setString(3, end.getBairro());
            pst.setString(4, end.getNumero());
            pst.setString(5, end.getCep());
            pst.setString(6, end.getCidade());
            pst.setString(7, end.getEstado());
           // pst.setInt(8, end.getCod_cli());
           // pst.setInt(9, end.getCod_end());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Endereço editado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o endereço \n erro" + ex);
        }

    }

    public void AtualizarTabela() {
        conend.conectar();

        try {
            PreparedStatement pst = conend.conn.prepareStatement("select * from cliente order by end_id");
        } catch (SQLException ex) {
            Logger.getLogger(ControleEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //public EnderecoModel buscarEndereco(EnderecoModel modelo) {
        
       // conexao.conectar();
        
        

    //}

}
