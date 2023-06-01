public class Vestuario extends Loja {
    private boolean produtosImportados;

   

    public Vestuario (String nome, int QuantidadeDeFuncionarios, double salarioBaseFuncionario, Endereco endereco, 
    Data dataFundacao, boolean produtosImportados, int quantMaxProdutos){
        super(nome, QuantidadeDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return "Ração Social: " + getNome() + "Data de Constituição: " + getDataFundacao() + 
        "Endereço: " + getEndereco()  +  "\nQuantidade de Empregados: " + getQuantidadeFuncionarios() + 
        "\nSalário base dos Funcionários: " + getSalarioBaseFuncionario() +
        "\nProdutos Importados: " + getProdutosImportados();
    }
}
