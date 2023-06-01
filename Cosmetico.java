
public class Cosmetico extends Loja {
    private double taxaComercializacao;

//Construtor da classe com o super puxando dados da classe mãe
    public Cosmetico (String nome, int QuantidadeDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int quantMaxProdutos, double taxaComercializacao){
        super(nome, QuantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
//Fim Construtor

//Getters and Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaDeComercializacao) {
        this.taxaComercializacao = taxaDeComercializacao;
    }
//Fim getters and setters

    @Override
    public String toString(){
        return "Ração Social: " + getNome() + "Data de Constituição: " + getDataFundacao() + 
        "Endereço: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
        "\nSalário base dos Funcionários: " + getSalarioBaseFuncionario() +
        "\nTaxa de Comercialização: " + getTaxaComercializacao();
    }

}
