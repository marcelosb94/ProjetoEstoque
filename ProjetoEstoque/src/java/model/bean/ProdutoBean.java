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
public class ProdutoBean {

    private int id;
    private String nome_produto;
    private String categoria_produto;
    private String preco_produto;
    private String qtd_produto;
    private String ponto_critico;
    
    
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
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the categoria_produto
     */
    public String getCategoria_produto() {
        return categoria_produto;
    }

    /**
     * @param categoria_produto the categoria_produto to set
     */
    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    /**
     * @return the preco_produto
     */
    public String getPreco_produto() {
        return preco_produto;
    }

    /**
     * @param preco_produto the preco_produto to set
     */
    public void setPreco_produto(String preco_produto) {
        this.preco_produto = preco_produto;
    }

    /**
     * @return the qtd_produto
     */
    public String getQtd_produto() {
        return qtd_produto;
    }

    /**
     * @param qtd_produto the qtd_produto to set
     */
    public void setQtd_produto(String qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    /**
     * @return the ponto_critico
     */
    public String getPonto_critico() {
        return ponto_critico;
    }

    /**
     * @param ponto_critico the ponto_critico to set
     */
    public void setPonto_critico(String ponto_critico) {
        this.ponto_critico = ponto_critico;
    }

    
}
