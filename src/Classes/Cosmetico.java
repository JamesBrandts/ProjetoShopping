package Classes;

public class Cosmetico extends Loja {
    double taxaComercializacao;

    Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
            double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, null);
        this.taxaComercializacao = taxaComercializacao;

        
    }

    public double getTaxaComercializacao () {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao (double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString () {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
        + this.quantidadeFuncionarios +
        "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
        "\n Data de fundaçã: " + this.fundacao + "\nTaxa comercialização: " + taxaComercializacao;
    }
}



