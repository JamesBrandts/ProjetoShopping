package Testes;

import Classes.Cosmetico;
import Classes.Data;
import Classes.Endereco;
import Classes.Loja;

public class TesteLoja {
    public static void main(String args[]){
        Loja lojaCosmetico = new Cosmetico("Loja do João", 10, 5000.0, new Endereco("Rua do João", "João Pessoa", "Joãonopolis", "Joãolandia", "954550", "0", "Casa"), new Data(10, 10, 10), 0);
        System.out.println(lojaCosmetico);
        System.out.println(lojaCosmetico.getClass().getSimpleName());
    }
}
