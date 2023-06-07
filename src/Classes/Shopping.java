package Classes;

public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeDeLojas) { // Quantidade de lojas é o tamanho do vetor
                                                                             // de lojas, não precisa ter o Loja[] lojas
                                                                             // como parâmetro
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeDeLojas];
    }

    public void QuantidadeDeLojas(int quantidade) {
        this.lojas = new Loja[quantidade];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja lojas) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = lojas;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeDaloja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i].getNome() == nomeDaloja) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        if (tipoDeLoja != "Alimentacao" &&
                tipoDeLoja != "Bijuteria" &&
                tipoDeLoja != "Cosmetico" &&
                tipoDeLoja != "Informatica" &&
                tipoDeLoja != "Vestuario") {
            return -1;
        }
        int quantidade = 0;
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getClass().getSimpleName() == tipoDeLoja) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) this.lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > lojaSeguroMaisCaro.getSeguroEletronicos()) {
                    lojaSeguroMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }

    public String toString() {
        String lojas = "";
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null) {
                lojas += this.lojas[i] + "\n";
            }
        }
        return "Nome do Shopping: " + this.nome + "\nEndereço: " + this.endereco + "\nLojas do shopping: " + lojas;
    }
}
