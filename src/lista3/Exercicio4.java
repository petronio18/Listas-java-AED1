package lista3;
import java.util.*;
public class Exercicio4 {
	
	    public static void main(String args[]) {
	Scanner ent = new Scanner(System.in);
		    float valorReal = 0, cotaEuro, cotaDolar,result;
		    int op;
		    
		    System.out.println("Escolha a moeda que deseja fazer a conversao:\n[1]Dolar\n[2]Euro\n");
		    op= ent.nextInt();
			
	      switch(op){
	         case 1:
			System.out.printf("Digite o valor em reais que deseja converter: \n");
	                valorReal = ent.nextFloat();
	                System.out. printf("Digite a cotacao atual do dolar: \n");
	                cotaDolar = ent.nextFloat();
	                result = valorReal*cotaDolar;
	                System.out. printf("O valor de Reais em dolar é: %2.2f\n", result);
	                break;
	          case 2:
			System.out.printf("Digite a cotacao atual do euro: \n");
	                cotaEuro = ent.nextFloat();	
	                result = valorReal*cotaEuro;
	                System.out. printf("O valor de Reais em euro é: %5.2f\n", result);
	                break;
			default: System.out.println("Opição inválida");
			}
		

			    
}
	    }
