package Testes;

import Classes.Alimentacao;
import Classes.Cosmetico;
import Classes.Data;
import Classes.Endereco;
import Classes.Loja;
import Classes.Shopping;

public class TesteShopping {
    public static void main(String args[]){
        Loja lojaCosmetico = new Cosmetico("Loja de Cosméticos do João", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        Loja lojaCosmetico2 = new Cosmetico("Loja de Cosméticos da Maria", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        Loja lojaCosmetico3 = new Cosmetico("Loja de Cosméticos do José", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        Loja lojaCosmetico4 = new Cosmetico("Loja de Cosméticos da Ana", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        Loja lojaCosmetico5 = new Cosmetico("Loja de Cosméticos do Pedro", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        Loja lojaAlimentacao = new Alimentacao ("Loja de Alimentação do João", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), new Data(10, 10, 2023));
        Loja lojaAlimentacao2 = new Alimentacao ("Loja de Alimentação da Maria", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), new Data(10, 10, 2023));
        Loja lojaAlimentacao3 = new Alimentacao ("Loja de Alimentação do José", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), new Data(10, 10, 2023));
        Shopping shopping = new Shopping("Shopping do João", new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), 10);
        shopping.insereLoja(lojaCosmetico);
        shopping.insereLoja(lojaCosmetico2);
        shopping.insereLoja(lojaCosmetico3);
        shopping.insereLoja(lojaCosmetico4);
        shopping.insereLoja(lojaCosmetico5);
        shopping.insereLoja(lojaAlimentacao);
        shopping.insereLoja(lojaAlimentacao2);
        shopping.insereLoja(lojaAlimentacao3);
        System.out.println(shopping);
        System.out.println("Cosmetico: " + shopping.quantidadeLojasPorTipo("Cosmetico"));
        System.out.println("Alimentacao: " + shopping.quantidadeLojasPorTipo("Alimentacao"));

    }
}
