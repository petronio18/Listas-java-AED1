package lista2;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double velocidade,velocidadeP;
		
		System.out.println("Digite a sua velocidade:");
		velocidade = entrada.nextDouble();
		System.out.println("Digite o limite da velocidade na avenida:");
		velocidadeP = entrada.nextDouble();
		if( velocidade < velocidadeP){
			System.out.println("motorista dentro da lei ");
			}
			
			else if ( (velocidade > velocidadeP + 10)){
				   
				   System.out.println(" voce ganhou uma multa de R$50,00");
				   
				  }else if (velocidade > velocidadeP + 11 && velocidade > velocidadeP + 30){
				   System.out.println(" voce ganhou uma multa de R$100,00 ");

				  }else if (velocidade > velocidadeP + 30){
				   System.out.println("voce ganhou uma multa de R$200,00 ");
				
				  }		
				
		entrada.close();
	}

}

