package com.company.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private double preco;
    private static double desconto = 0.25;
    private boolean disponibilidade;

    public Produto(String nome, double preco) {
        System.out.println("Produto: " + nome + "\n" + "Preço: " + preco);
    }

    public double descontoAplicado(double preco) {
        System.out.println("Aplicando desconto ... ");
        preco = preco - (desconto * 1);
        return  preco;
    }

    public void disponibilidadeString(String nome) {

        disponibilidade = false;
        if (nome =="Sabonete" || nome =="Detergente")
        {
            disponibilidade = true;
            System.out.println("Seu produto está disponível");
        }
        else {
            System.out.print("Seu produto não está disponível");
        }
    }

    static double precoComDesconto(double preco) {
        return preco = preco - (desconto * 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
