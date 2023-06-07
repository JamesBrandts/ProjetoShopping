package Classes;

public class Loja {
    public String nome;
    public int quantidadeFuncionarios;
    public double salarioBaseFuncionario;
    public Endereco endereco;
    public Data dataFundacao;
    public Produto[] estoqueProdutos;
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto [tamanhoEstoque];
        
    }
    
    public Loja( String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
    Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }
    
    public void TamanhoEstoque (int tamanho) {
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
        return dataFundacao;
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

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
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

    public boolean removeProduto (String nomeProduto) {
       for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[0].getNome() == nomeProduto) {
                this.estoqueProdutos[i] = null;
                return true;
            }      
       }
       return false;
    }

    public String toString() {
        return "INFORMAÇÕES DA LOJA :\n Nome da Loja: " + this.nome + "\n Quantidade de Funcionarios: "
                + this.quantidadeFuncionarios +
                "\n Salario base dos funcionários: R$ " + this.salarioBaseFuncionario + "\n Endereço: " + this.endereco +
                "\n Data de fundação: " + this.dataFundacao + "\n Produtos em estoque: " + this.estoqueProdutos;
    }
}
