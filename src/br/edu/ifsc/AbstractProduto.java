/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc;

/**
 *
 * @author Aluno
 */
public abstract class AbstractProduto {
    
    protected String codigo;
    protected String descricao;
    protected String autor;
    protected int estoque;
    protected double preco;

    public AbstractProduto() {
    }

    public AbstractProduto(String codigo, String descricao, String autor, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.autor = autor;
        this.estoque = quantidadeEstoque;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   
    
    
}
