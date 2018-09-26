/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Marcelo
 */
public class FornecedorBean {
      private int id;
      private String nome;
      private String endereco;
      private String cnpj;
      private String inscricao;
      private String telefone;
      private String email;
      private String nome_fanta;
      
      public FornecedorBean(String nome, String endereco, String cnpj, String inscricao, String telefone, String email, String nome_fanta){
          this.nome = nome;
          this.endereco = endereco;
          this.cnpj = cnpj;
          this.inscricao = inscricao;
          this.telefone = telefone;
          this.email = email;
          this.nome_fanta = nome_fanta;
      
      }
        
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscricao
     */
    public String getInscricao() {
        return inscricao;
    }

    /**
     * @param inscricao the inscricao to set
     */
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nome_fanta
     */
    public String getNome_fanta() {
        return nome_fanta;
    }

    /**
     * @param nome_fanta the nome_fanta to set
     */
    public void setNome_fanta(String nome_fanta) {
        this.nome_fanta = nome_fanta;
    }
     
}
