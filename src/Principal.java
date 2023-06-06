import java.util.Scanner;
import Classes.Loja;
import Classes.Endereco;
import Classes.Data;
import Classes.Produto;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para criar uma loja. \n Digite 2 para criar um produto. \n Digite 3 para sair.");

        int numeroEscolhido = sc.nextInt();

        if (numeroEscolhido != 1 && numeroEscolhido != 2 && numeroEscolhido != 3) {
            System.out.println("Opção invalida! Tente novamente.");
            System.out
                    .println("Digite 1 para criar uma loja. \n Digite 2 para criar um produto. \n Digite 3 para sair.");
        } else if (numeroEscolhido == 1) {
            System.out.println("Digite o nome da loja");
            String nome = sc.next();

            System.out.print("Digite a quantidade de funcionários:");
            int quantidadeFuncionarios = sc.nextInt();

            System.out.print("Digite o salário base dos funcionários:");
            double salarioBaseFuncionario = sc.nextDouble();

            System.out.println("Digite o endereço da loja:");
            String enderecoString = sc.next();
            String[] enderecoArray = enderecoString.split(",");
            String nomeDaRua = (enderecoArray[0]);
            String cidade = (enderecoArray[1]);
            String estado = (enderecoArray[2]);
            String pais = (enderecoArray[3]);
            String cep = (enderecoArray[4]);
            String numero = (enderecoArray[5]);
            String complemento = (enderecoArray[6]);
            Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

            System.out.println("Digite a data de fundação da loja em formato dd/mm/aaaa");
            String fundacaoString = sc.next();
            String[] fundacaoArray = fundacaoString.split("/");
            int dia = Integer.parseInt(fundacaoArray[0]);
            int mes = Integer.parseInt(fundacaoArray[1]);
            int ano = Integer.parseInt(fundacaoArray[2]);
            Data fundacao = new Data(dia, mes, ano);

            Loja novaLoja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, fundacao);
            System.out.println(novaLoja);

        } else if (numeroEscolhido == 2) {
            System.out.println("Digite o nome do produto:");
            String nomeProduto = sc.next();

            System.out.println("Digite o preco do produto:");
            int preco = sc.nextInt();

            System.out.println("Digite a data de vencimento do produto:");
            String validadeString = sc.next();
            String[] validadeArray = validadeString.split("/");
            int diaProduto = Integer.parseInt(validadeArray[0]);
            int mesProduto = Integer.parseInt(validadeArray[1]);
            int anoProduto = Integer.parseInt(validadeArray[3]);
            Data validade = new Data(diaProduto, mesProduto, anoProduto);

            Produto novoProduto = new Produto(nomeProduto, preco, validade);
            System.out.println(novoProduto);

        }

        sc.close();
    }
}