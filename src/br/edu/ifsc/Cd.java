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
public class Cd extends AbstractProduto {

    private int faixas;

    public Cd() {
    }

    public Cd(String codigo, String descricao, String autor, int quantidadeEstoque, double preco) {
        super(codigo, descricao, autor, quantidadeEstoque, preco);
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

 

   
  


}
