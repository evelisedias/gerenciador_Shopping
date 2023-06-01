import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Entrada de dados do menu
        
        int menu = 0;
        
        while (menu != 3) {
        System.out.println("------------------- Menu Principal -------------------\n------------------- Escolha uma opção -------------------");
        System.out.println("(1) Criar uma loja \n(2) Criar um produto \n(3) Sair\nQual a opção desejada: ");
        menu = entrada.nextInt();

        if (menu == 1){

//Criando perguntas pra criar a loja
            
            System.out.println("Digite o nome da loja: "); //nome
            String nome = entrada.next();

            System.out.println("Digite a quantidade de funcionários: "); //qtFuncionários
            int funcionarios = entrada.nextInt();

            System.out.println("Digite o salário base dos empregados: "); //Salbase
            double salbase = entrada.nextDouble();

            
//Endereço
            System.out.println("\nPor favor, digite o endereço");
            System.out.println("Rua: ");
            String rua = entrada.next();
            System.out.println("número: ");
            String numero = entrada.next();
            System.out.println("Cep: ");
            String cep = entrada.next();
            System.out.println("Complemento: ");
            String complemento = entrada.next();
            System.out.println("Cidade: ");
            String cidade = entrada.next();
            System.out.println("Estado: ");
            String estado = entrada.next();
            System.out.println("Pais: ");
            String pais = entrada.next();

//Data Fundação
            System.out.println("Digite o dia de fundação (dd): ");
            int diaFund = entrada.nextInt();
            System.out.println("Digite o mês de fundação (mm): ");
            int mesFund = entrada.nextInt();
            System.out.println("Digite o ano de fundação (aaaa): ");
            int anoFund = entrada.nextInt();

//Quantidade de produtos
            System.out.println("Qual a quantidade de produtos para venda?");
            int qtdMaxProd = entrada.nextInt();

//Criando endereço e data
            Data dataFundacao = new Data(diaFund,mesFund,anoFund);
            Endereco endereco = new Endereco(rua,cidade,estado,pais,cep,numero,complemento);


//Criando a Loja
            Loja l1 = new Loja(nome, funcionarios, salbase, endereco, dataFundacao, qtdMaxProd);
            
            //Fim loja
                

        
        }else if (menu == 2) {

//Criando perguntas para produto

            System.out.println("Nome do produto: "); //Nome produto
            String nProduto = entrada.next();

            System.out.println("Qual o preço do produto: "); //preço do produto
            double preco = entrada.nextDouble();

            System.out.println("Data de válidade: "); //Validade do produto
            System.out.println("Dia de vencimento (dd): ");
            int diaVenc = entrada.nextInt();
            System.out.println("Mes de vencimento (mm): ");
            int mesVenc = entrada.nextInt();
            System.out.println("Ano de vencimento (aaaa): ");
            int anoVenc = entrada.nextInt();
            Data datavenc = new Data(diaVenc, mesVenc, anoVenc);
     
//Criando produto
            Produto p1 = new Produto(nProduto,preco,datavenc); 

            
            
        }else if (menu == 3) {
            break;
        }else {
            System.out.println("Opção inválida");
        }
    }  
//Criando validador do produto
     System.out.println("Digite a data atual abaixo (dd/mm/aaaa)");
     System.out.println("Dia: ");
     int diaAtual = entrada.nextInt();
     System.out.println("Mês: ");
     int mesAtual = entrada.nextInt();
     System.out.println("Ano: ");
     int anoAtual = entrada.nextInt();
     Data hoje = new Data(diaAtual, mesAtual, anoAtual); 
    }
    

// Produto.estaVencido(hoje);
}
