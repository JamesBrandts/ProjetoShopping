package Classes;
//import java.util.Scanner;

public class Produto {

    String nomeProduto;
    double preco;
    Data validade;

    public Produto(String nomeProduto, double preco, Data validade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.validade = validade;
    }

    public String getNome() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public Data getValidade() {
        return validade;
    }

    public void setNome(String nome) {
        this.nomeProduto = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public boolean estaVencido(Data validade) {

        if (validade.getAno() > 2023) {
            System.out.println("Produto está vencido");
        } else if (validade.getMes() >= 10) {
            System.out.println("Produto está vencido");
        } else if (validade.getDia() >= 23) {
            System.out.println("Produto está vencido");
        } else {
            System.out.println("Produto dentro da validade.");
        }
        return false;
    }

    public String toString() {
        return "INFORMAÇÕES DO PRODUTO:\n Nome do produto: " + this.nomeProduto + "\n Preço: " + this.preco
                + "Validade: " + this.validade;
    }
}
