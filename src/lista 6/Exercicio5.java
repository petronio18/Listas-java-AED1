package lista6;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {

		int cont = 0,opcao = 0,contCandidato1=0,contCandidato2=0,contCandidato3=0,contCandidato4=0,contVnulo=0,contVbranco=0;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Escolhar um candidato para votar:\n 1)Petrônio \n 2)Helena \n 3)Douglas \n 4)lucas \n 5)Voto Nulo \n 6)Voto em Branco ");
		
		
		System.out.println("Digite a opcao:");
		opcao = entrada.nextInt();
		
		while (opcao !=0) {	
			System.out.println("Digite a opcao:");
			opcao = entrada.nextInt();
			
			switch(opcao){
			
			case 1:
				
				contCandidato1++;
				
				break;
			case 2:
				
				contCandidato2++;
				break;
			case 3:
				
				contCandidato3++;
				break;
			case 4:
				
				contCandidato4++;
				break;
			case 5:
				
				contVnulo++;
				break;
			case 6:
				contVbranco++;
				break;
			}
			cont++;		
		}
		
		System.out.println("Numero de votos do candidato Petrônio:"+contCandidato1);
		System.out.println("Numero de votos da candidata Helena:"+contCandidato2);
		System.out.println("Numero de votos do candidato Douglas:"+contCandidato3);
		System.out.println("Numero de votos do candidato lucas:"+contCandidato4);
		System.out.println("Numero de votos Nulos:"+contVnulo);
		System.out.println("Numero de votos em Branco:"+contVbranco);
		
		entrada.close();
		
	}

}
