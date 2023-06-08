package Classes;

public class Alimentacao extends Loja{
    Data dataAlvara;

    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
    Data dataAlvara, int tamanhoEstoque) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara () {
        return dataAlvara;
    }

    public void setDataAlvara (Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString () {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
        + this.quantidadeFuncionarios +
        "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
        "\n Data de fundaçã: " + this.dataFundacao + "\n Data Alvará: " + dataAlvara;
    }
}
