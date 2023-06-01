public class Bijuteria extends Loja {
    private double metaVendas;

//Construtor com super 
    public Bijuteria(String nome,int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int quantMaxProdutos, double metaVendas){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantMaxProdutos);
        this.metaVendas = metaVendas;

    }
//Fim construtor

//Inicio getters and setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
//Fim getters and setters

@Override
public String toString(){
    return "Ração Social: " + getNome() + "Data de Constituição: " + getDataFundacao() + 
    "Endereço: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
    "\nSalário base dos Funcionários: " + getSalarioBaseFuncionario() + "Meta de vendas: " + getMetaVendas();


}

}//Fim classe
