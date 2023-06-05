package Classes;

public class Informatica extends Loja{
    double seguroEletronicos;

    Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao,
    double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, null);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos () {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos (double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString () {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
        + this.quantidadeFuncionarios +
        "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
        "\n Data de fundaçã: " + this.fundacao + "\n Seguro dos eletronicos: " + seguroEletronicos;
    }

}
