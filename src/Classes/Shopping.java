package Classes;

public class Shopping {
    String nome;
    Endereco endereco;
    Loja [] lojas;
    
    public Shopping (String nome,Endereco endereco, Loja [] lojas, int quantidadeDeLojas ) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeDeLojas];
    }

    public void QuantidadeDeLojas (int quantidade) {
        this.lojas = new Loja[quantidade];
    }

    public String getNome () {
        return nome;
    }

    public Endereco getEndereco () {
        return endereco;
    }

    public Loja[] getLojas () {
        return lojas;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setEndereco (Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas (Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja (Loja lojas) {
        for (int i = 0; i < this.lojas.length ;i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = lojas;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja (String nomeDaloja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i].getNome() == nomeDaloja) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    } 

    public int quantidadeLojasPorTipo (String tipoDeLoja) {
       if (tipoDeLoja == Loja.) {

       }
    }

    public String toString () {
        return "Nome do Shopping: " + this.nome + "\nEndereço: " + this.endereco + "\nLojas do shopping: " + this.lojas;
    }
}
