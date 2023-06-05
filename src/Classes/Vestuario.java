package Classes;

public class Vestuario extends Loja {
    boolean produtosimportados;

    Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
    boolean produtosimportados) {
        super(quantidadeFuncionarios, nome, salarioBaseFuncionario, endereco, fundacao);
        this.produtosimportados = produtosimportados;
    }

    public boolean getProdutosImportados () {
        return produtosimportados;
    }

    public void setProdutosImportados (boolean produtosimportados) {
        this.produtosimportados = produtosimportados;
    }

    public String toString () {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
        + this.quantidadeFuncionarios +
        "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
        "\n Data de fundaçã: " + this.fundacao + "\n Vende produtos importados? " + produtosimportados;
    }
}
