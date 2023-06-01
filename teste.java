public class teste {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Av. João wallig","Porto Alegre", "RS", "Brasil", "93218280", "54", "Shopping Iguatemi");
        Data d1 = new Data(22, 05, 2005);
        Loja l1 = new Loja("Subway", 5, 1320.00,e1,d1,3);
        
        System.out.println(l1);
        l1.imprimeProdutos();
        
        Produto p1 = new Produto("Água s/ gás", 6.00, new Data(25, 12, 2023));
        Produto p2 = new Produto("Água c/ gás", 6.00, new Data(25, 12, 2023));
        Produto p3 = new Produto("Monster", 15.00, new Data(25, 12, 2023));
        Produto p4 = new Produto("Coca", 8.00, new Data(25, 12, 2023));
        System.out.println("TESTE PRODUTOS");
        l1.insereProduto(p1);
        l1.imprimeProdutos();
        System.out.println("Adicionando produto ");
        l1.insereProduto(p2);
        l1.imprimeProdutos();
        System.out.println("Adicionando produto ");
        l1.insereProduto(p3);
        l1.imprimeProdutos();
        System.out.println("Adicionando produto ");
        l1.insereProduto(p4);
        System.out.println("------ Lista de Produtos Adicionados --------");
        l1.imprimeProdutos();
        System.out.println("==========================");
        System.out.println("Removendo produtos...");
        System.out.println("==========================");

        l1.removeProduto("Água c/ gás");
        System.out.println("==========================");
        System.out.println("Imprimindo produtos");
        System.out.println("==========================");
        l1.imprimeProdutos();
        l1.removeProduto("Monster");
        System.out.println("Imprimindo produtos");
        System.out.println("==========================");
        l1.imprimeProdutos();
        System.out.println("==========================");

        System.out.println("TESTANDO CADASTRO DE SHOPPING");
        Loja l2 = new Loja("Kalzone", 10, 1325.0, e1, d1, 2);
        Loja l3 = new Loja("beefs", 10, 1325.0, e1, d1, 2);
        Shopping s1 = new Shopping("Iguatemi", e1, 3);
        System.out.println("INSERINDO LOJAS");
        s1.insereLoja(l1);
      
        s1.insereLoja(l3);
        System.out.println("IMPRIMINDO LOJAS");
        //s1.imprimeLojas();
        System.out.println("REMOVENDO LOJAS");
        s1.removeLoja("subway");
        
        

    }
}
