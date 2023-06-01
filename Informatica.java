public class Informatica extends Loja {
    private double seguroEletronicos;

//Inicio Construtor com Super
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFuncacao, int quantMaxProdutos, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFuncacao, quantMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }


    //Inicio getters and setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
//Fim getters and setters
    
     @Override
            public String toString(){
                return "Ração Social: " + getNome() + "Data de Constituição: " + getDataFundacao() + 
                "Endereço: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
                "\nSalário base dos Funcionários: " + getSalarioBaseFuncionario() + "Valor do Seguro dos Eletrônicos: R$ " + getSeguroEletronicos();
            

        }
}
