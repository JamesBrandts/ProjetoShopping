package Classes;

public class Alimentacao extends Loja{
    Data dataAlvara;

    Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
    Data dataAlvara) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, null);
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
        "\n Data de fundaçã: " + this.fundacao + "\n Data Alvará: " + dataAlvara;
    }
}
