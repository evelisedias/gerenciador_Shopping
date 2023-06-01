// início classe Data

public class Data {
   
    private int dia;
    private int mes;
    private int ano;
 
 // inicio construtor Data
 

    public Data ( int dia, int mes, int ano) {
      validar (dia, mes, ano);
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    
    }


  private void validar (int dia, int mes, int ano){
 
    if (ano < 0)  {
      System.out.println("Ano deve ser positivo. Data padrão adicionada: 01/01/2000");
      this.dia = 1;
      this.mes = 1;
      this.ano = 2000;
    
    }
    if (mes < 1 || mes > 12) {
      System.out.println( "Mês" + mes + "inválido. Data padrão adicionada: 01/01/2000") ;
      this.dia = 1;
      this.mes = 1;
      this.ano = 2000;
    }


 // verifica o último dias do mês
    
    int ultimoDia;
    switch (mes){ // mes com 30 dias
        
      case 4:
      case 6:
      case 9:
      case 11:
          ultimoDia = 30;
          break ;

      case 2: // Fevereiro
          if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){ // verifica Bissexto 
              ultimoDia  = 29;
  
          } else {
              ultimoDia = 28;
          }
          break;
      default: // outros meses
        ultimoDia = 31;
      }      
      if ( dia < 1 || dia > ultimoDia ) {
        System.out.println (" Dia deve ser entre 1 e " + ultimoDia + "Data padrão adicionada: 01/01/2000") ;
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
      } 
  } // Fim construtor 


 
    // inicio getters and Setters

      public int getDia() {
        return dia;
      }

      public void setDia(int dia) {
        this.dia = dia;
      }

      public int getMes() {
        return mes;
      }

      public void setMes(int mes) {
        this.mes = mes;
      }

      public int getAno() {
        return ano;
      }

      public void setAno(int ano) {
        this.ano = ano;
      }
       // Fim getters and Setters


    public static Data getDataValidade() {
        return null;
    }

}// Fim Classe