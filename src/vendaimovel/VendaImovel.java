
package vendaimovel;


import java.util.Scanner;

public class VendaImovel {

    
    public static void main(String[] args) {
        
    
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nome do vendedor:");
        String nome = entrada.nextLine();
        
        System.out.println("Valor do imóvel:");
        double valor = entrada.nextFloat();
        
        double comissao =0;
      
        
        if(valor < 30000){
            comissao = (valor*10)/100 ;
            
        } else if( valor >= 30000 && valor <50000){
            comissao = (valor*15) /100 ;
            
        }else if(valor >=50000){
            comissao = (valor*20)/100;
        }
        
        System.out.printf("A Comissão de " + nome + " nesta venda foi de : R$ %.2f%n", comissao);
    }
      
    
}
