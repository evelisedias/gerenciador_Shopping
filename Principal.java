import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        
     
        System.out.println("================ Bem - Vindo! ===============");

        Scanner Menu = new Scanner (System.in);
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println();
        System.out.println("=============== MENU PRINCIPAL ==============");
        System.out.println("============ Selecione uma opção ============");
        System.out.println();     
        
        
        int menu = 0;

        while (menu != 3) {
        
        System.out.println("(1) Criar uma loja \n(2) Criar um produto \n(3) Sair");
        System.out.print("Qual a opção desejada: ");
        menu = Menu.nextInt();
        System.out.println();

            if (menu == 1){

    //Criando perguntas pra criar a loja
                
                System.out.print("Digite o nome da loja: "); //nome
                String nome = entrada.next();

                System.out.print("\nDigite a quantidade de funcionários: "); //qtFuncionários
                int funcionarios = entrada.nextInt();

                System.out.print("\nDigite o salário base dos empregados: "); //Salbase
                double salbase = entrada.nextDouble();

                
    //Endereço
                System.out.print("\nEndereço");
                System.out.print("\nLogradouro: ");
                String rua = entrada.next();
                System.out.print("\nnúmero: ");
                String numero = entrada.next();
                System.out.print("\nCep: ");
                String cep = entrada.next();
                System.out.print("\nComplemento: ");
                String complemento = entrada.next();
                System.out.print("\nCidade: ");
                String cidade = entrada.next();
                System.out.print("\nEstado: ");
                String estado = entrada.next();
                System.out.print("\nPais: ");
                String pais = entrada.next();

    //Data Fundação
                System.out.print("\nDigite o dia de fundação (dd): ");
                int diaFund = entrada.nextInt();
                System.out.print("\nDigite o mês de fundação (mm): ");
                int mesFund = entrada.nextInt();
                System.out.print("\nDigite o ano de fundação (aaaa): ");
                int anoFund = entrada.nextInt();

    //Quantidade de produtos
                System.out.print("\nQual a quantidade de produtos para venda?");
                int qtdMaxProd = entrada.nextInt();

    //Criando endereço e data
                Data dataFundacao = new Data(diaFund,mesFund,anoFund);
                Endereco endereco = new Endereco(rua,cidade,estado,pais,cep,numero,complemento);


    //Criando a Loja
                Loja loja = new Loja(nome, funcionarios, salbase, endereco, dataFundacao, qtdMaxProd);
                
    //Fim loja
                    

            
            }else if (menu == 2) {

    //Criando perguntas para produto

                System.out.print("\nNome do produto: "); //Nome produto
                String nProduto = entrada.next();

                System.out.print("\nQual o preço do produto: "); //preço do produto
                double preco = entrada.nextDouble();

                System.out.print("\nData de válidade: "); //Validade do produto
                System.out.print("\nDia de vencimento (dd): ");
                int diaVenc = entrada.nextInt();
                System.out.print("\nMes de vencimento (mm): ");
                int mesVenc = entrada.nextInt();
                System.out.print("\nAno de vencimento (aaaa): ");
                int anoVenc = entrada.nextInt();
                Data datavenc = new Data(diaVenc, mesVenc, anoVenc);
        
    //Criando produto
                Produto produto1 = new Produto(nProduto,preco,datavenc);
                Produto produto2 = new Produto(nProduto,preco,datavenc);

            }else if (menu == 3) {
                System.out.println("Programa Finalizado!");
                break;
            }else {
                System.out.println("Opção inválida");
            }
            
            
        }
        
    }
    
        //Verifica produto vencido
        if (produto.estaVencido(new Data (20,10,2023)))
        System.out.print("Produto está vencido.");
        Loja.insereProduto(produto1);
        Loja.insereProduto(produto2);
        System.out.println(Loja);
        Loja.imprimeProdutos(); 



 
}
    
         
    


