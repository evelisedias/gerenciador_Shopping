import java.util.Scanner;

import static java.lang.System.in;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Loja loja = new Loja();

        System.out.println("========== Bem-Vindo(a) ==========");
        System.out.println();
        
        
        Scanner Menu = new Scanner (System.in);
        
        int menu = 0;
        
        while (menu != 3) {
            System.out.println("========= Menu Principal =========");
            System.out.println();
            System.out.println("""
                    [1] Criar uma loja
                    [2] Criar um produto
                    [3] Sair""");

            System.out.println();
            System.out.print("Digite a opção desejada: ");
            menu = Menu.nextInt();

    
        
            if (menu == 1) {
                loja = novaLoja();
                System.out.println();
                
                
            } else if (menu == 2) {
                produto = novoProduto();
                System.out.println();

            } else if (menu == 3) {
                System.out.println("Dados cadastrados com sucesso.");
                System.out.println("Programa Finalizado!");
                System.out.println();
                
            }

            else{
                System.out.println("Opção inválida.");
                System.out.println();
            }
           
        }

        System.out.println("========== Validação do Produto ==========");
        System.out.println();
        System.out.print("Nome do Produto: " + produto.getNome());
        System.out.print("\nStatus da Validade: ");
        produto.estaVencido(new Data(20,10,2023));
        System.out.println();
        
        System.out.println("========== Informações da loja ==========");
        System.out.println();
        System.out.println(loja);
        System.out.println(); 
        

    }

    public static Loja novaLoja() {
        Scanner scannerLoja = new Scanner(in);
        System.out.print("Nome Fantasia: ");
        String nome = scannerLoja.nextLine();
        System.out.print("Digite a quantidade de funcionarios: ");
        int quantidadeFuncionarios = scannerLoja.nextInt();
        System.out.print("Digite o salario base: ");
        double salarioBaseFuncionario = scannerLoja.nextDouble();
        Data dataFundacao = novaData("========== Data da Constituição ==========");
        Endereco endereco = novoEndereco("========== Endereço ==========");
        System.out.print("Digite a quantidade máxima de produtos em estoque: ");
        int quantMaxProdutos = scannerLoja.nextInt();

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
    }

    public static Produto novoProduto() {
        Scanner scanner = new Scanner(in);
        System.out.print("Digite o nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        return new Produto(nome, preco, novaData("Digite a data de validade"));
    }

    private static Endereco novoEndereco(String mensagem) {
        Scanner scannerEndereco = new Scanner(in);
        System.out.println(mensagem);

        System.out.print("Logradouro: ");
        String nomeDaRua = scannerEndereco.nextLine();

        System.out.print("Nrº: ");
        String numero = scannerEndereco.nextLine();

        System.out.print("Cidade: ");
        String nomeDaCidade = scannerEndereco.nextLine();

        System.out.print("País: ");
        String pais = scannerEndereco.nextLine();

        System.out.print("Estado (UF): ");
        String estado = scannerEndereco.nextLine();

        System.out.print("CEP: ");
        String cep = scannerEndereco.nextLine();

        System.out.print("Complemento: ");
        String complemento = scannerEndereco.nextLine();

        return new Endereco(nomeDaRua, nomeDaCidade, estado, pais, cep, numero, complemento);
    }

    private static Data novaData(String mensagemInicial) {
        System.out.println(mensagemInicial);
        Scanner scannerData = new Scanner(in);
        System.out.print("Dia (dd): ");
        int dia = scannerData.nextInt();
        System.out.print("Mês (mm): ");
        int mes = scannerData.nextInt();
        System.out.print("Ano (aaaa): ");
        int ano = scannerData.nextInt();

        return new Data(dia, mes, ano);
    }
}