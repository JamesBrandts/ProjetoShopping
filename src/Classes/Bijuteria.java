package Classes;

public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
    double metaVendas, int tamanhoEstoque) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas () {
        return metaVendas;
    }

    public void setMetaVendas (double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString () {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
        + this.quantidadeFuncionarios +
        "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
        "\n Data de fundaçã: " + this.dataFundacao + "\n Meta de vendas: " + metaVendas;
    }
}
