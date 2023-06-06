package Classes;

public class Loja {
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionario;
    public Endereco endereco;
    public Data fundacao;
    public Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,
            Data fundacao, int quantidateEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.fundacao = fundacao;
        this.estoqueProdutos = new Produto[quantidateEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data fundacao, int quantidateEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.fundacao = fundacao;
        this.estoqueProdutos = new Produto[quantidateEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data fundacao, Produto[] estoqueProdutos, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.fundacao = fundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];

    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data fundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.fundacao = fundacao;
    }

    public void TamanhoEstoque(int tamanho) {
        this.estoqueProdutos = new Produto[tamanho];
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return fundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data fundacao) {
        this.fundacao = fundacao;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return salarioBaseFuncionario;
        } else {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    public char tamanhoDaLoja() {
        char p = 'P';
        char m = 'M';
        char g = 'G';

        if (quantidadeFuncionarios <= 10) {
            return p;
        } else if (quantidadeFuncionarios > 10 && quantidadeFuncionarios <= 31) {
            return m;
        } else {
            return g;
        }
    }

    public Produto[] imprimeProdutos() {
        return estoqueProdutos;
    }

    public boolean insereProduto(Produto estoqueProdutos) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = estoqueProdutos;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i].getNome() == nomeProduto) {
                this.estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
                + this.quantidadeFuncionarios +
                "\n Salario base dos funcionários: R$ " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco
                +
                "\n Data de fundaçã: " + this.fundacao + "\n Produtos em estoque: " + this.estoqueProdutos;
    }
}
