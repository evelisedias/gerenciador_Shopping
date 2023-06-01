public class Alimentacao extends Loja {
    private Data dataAlvara;

//Inicio construtor com super
    public Alimentacao (String nome,int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantMaxProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.dataAlvara = dataAlvara;
    }
//Fim construtor

//Inicio getters and setters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
//Fim getters and setters

    @Override
    public String toString(){
        return "Ração Social: " + getNome() + "Data de Constituição: " + getDataFundacao() + 
        "Endereço: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
        "\nSalário base dos Funcionários: " + getSalarioBaseFuncionario() + "Data do Alvara de funcionamento: " + getDataAlvara();
    }
}//Fim classe Alimentação

