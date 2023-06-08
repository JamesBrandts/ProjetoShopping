package Classes;

public class Vestuario extends Loja {
    boolean produtosimportados;

    public Vestuario(String nome,
            int quantidadeFuncionarios,
            double salarioBaseFuncionario,
            Endereco endereco,
            Data fundacao,
            boolean produtosimportados,
            int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao, tamanhoEstoque);
        this.produtosimportados = produtosimportados;
    }

    public boolean getProdutosImportados() {
        return produtosimportados;
    }

    public void setProdutosImportados(boolean produtosimportados) {
        this.produtosimportados = produtosimportados;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
                + this.quantidadeFuncionarios +
                "\n Salario base dos funcionários: " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
                "\n Data de fundaçã: " + this.dataFundacao + "\n Vende produtos importados? " + produtosimportados;
    }
}
