package com.company.Exercicios;

public class ProdutoTest {

    public static void main(String[] args) {


        Produto p1 = new Produto("Suco", 3.50);
        System.out.println("Disponibilidade: " + p1.isDisponibilidade() );
        System.out.println("Preço com desconto: " + p1.descontoAplicado(3.50));

        double var = Produto.precoComDesconto(5);
        System.out.println("\nNovo preço: " + var);
    }
}
