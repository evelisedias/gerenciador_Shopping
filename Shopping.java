import java.util.Arrays;
import static java.util.Objects.isNull;

public class Shopping {

//Atributos
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

//Construtor do Shopping
    public Shopping (String nome, Endereco endereco, int quantMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja [quantMaxLojas];
    }
//Fim do Construtor

//Métodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
//Fim dos getters and setters

//Início método insere loja

    public boolean insereLoja (Loja loja){
        for (int i=0; i<lojas.length; i++){
            if(lojas[i] == null){
                this.lojas[i] = loja;
                System.out.println("Loja " + loja.getNome() + " inserida com sucesso!" );
                return true;               
            }
        }
        return false;
    }

//Fim método insere loja

//Início método remove loja

    public boolean removeLoja(String nome){
       for (int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)){
                lojas[i] = null;
                System.out.println("Loja " + nome + " removida com Sucesso!");
                return true;
            }
       }
       return false;
    }

//Fim método remove loja

//Inicio método quantidade de lojas por tipo

    public int quantidadeLojasPorTipo (String tipo){
        
        int quant = 0;

        for (int i=0; i<lojas.length; i++){
            if (lojas[i].getNome().contains(tipo)){
                quant ++;
                System.out.println("Loja" + tipo + "encontrada");
            }
        }
        if (quant == 0) {
            System.out.println("Erro: Loja não encontrada para o tipo desejado.");
            return -1;
        }
        return quant;
    }
 

//Fim método quantidade de lojas por tipo

//Método Loja com seguro mais caro

    public Informatica lojaSeguroMaisCaro() { 
        Informatica contador = null;

        for (Loja _loja : this.lojas) {
            if (_loja instanceof Informatica atual) {

                if (isNull(contador)) {
                    contador = atual;
                }

                if (atual.getSeguroEletronicos() > contador.getSeguroEletronicos()) {
                    contador = atual;
                }
            }
        }

        return contador;
    }
    @Override
    public String toString() {
        return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
    }
//Fim Método Loja com seguro mais caro


//Fim método remove loja
   // @Override

    /*public String toString() {
        return "Shopping Center " + nome + "Localizado no endereço: " + endereco + ", lojas: " + Arrays.toString(lojas) + "]";
    }*/

}
