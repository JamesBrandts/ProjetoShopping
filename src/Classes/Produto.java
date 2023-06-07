package Classes;
//import java.util.Scanner;

public class Produto {

    String nomeProduto;
    double preco;
    Data dataValidade;

    public Produto(String nomeProduto, double preco, Data dataValidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nomeProduto = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data producaoProduto) {
        if (dataValidade != null) {
            if (producaoProduto.getAno() > dataValidade.getAno()) {
                return true;
            } else if (producaoProduto.getAno() == dataValidade.getAno() && producaoProduto.getMes() > dataValidade.getMes()) {
                return true;
            } else if (producaoProduto.getMes() == producaoProduto.getMes() && producaoProduto.getDia() > dataValidade.getDia()) {
                return true;
            }
        }
        return false;
        
    }

    public String toString() {
        return "INFORMAÇÕES DO PRODUTO:\n Nome do produto: " + this.nomeProduto + "\n Preço: " + this.preco
                + "Validade: " + this.dataValidade;
    }
}
