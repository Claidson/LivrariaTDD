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
public class Livro extends AbstractProduto{

    private String isbn;

    public Livro() {
    }

    public Livro(String codigo, String descricao, String autor, int quantidadeEstoque, double preco) {
        super(codigo, descricao, autor, quantidadeEstoque, preco);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}
