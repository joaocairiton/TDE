/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author joaoc
 */
public class ClienteModel {

    private int cod_end;
    private int cod_cli;
    private String nome;
    private String cpf;
    private String rg;
    private String orgao;
    private String data_nascimento;
    private String pesquisa;


    /**
     * @return the cod_end
     */
    public int getCod_end() {
        return cod_end;
    }

    /**
     * @param cod_end the cod_end to set
     */
    public void setCod_end(int cod_end) {
        this.cod_end = cod_end;
    }

    /**
     * @return the cod_cli
     */
    public int getCod_cli() {
        return cod_cli;
    }

    /**
     * @param cod_cli the cod_cli to set
     */
    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the orgao
     */
    public String getOrgao() {
        return orgao;
    }

    /**
     * @param orgao the orgao to set
     */
    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    /**
     * @return the data_nascimento
     */
    public String getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
   
}
