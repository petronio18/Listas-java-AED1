package lista3;
import java.util.*;
public class Exercio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double real,euro,dolar,conversao = 0;
		int opcao = 0;
		
		System.out.println("Digite o valor em Real que dejesa converter:");
		real = entrada.nextDouble();
		System.out.println("Digite a opçao:\n1)Dolar\n2)Euro");
		opcao = entrada.nextInt();
		
		switch(opcao){
		case 1:
			System.out.println("Digite o valor da cotaçao do dolar:");
			dolar = entrada.nextDouble();
			conversao = dolar * real;
			System.out.println("Você tem em dolar:"+conversao);
			break;
		case 2:
			System.out.println("Digite o vaor da cotaçao do euro:");
			euro = entrada.nextDouble();
			conversao = euro * real;
			System.out.println("Você tem em euro:"+conversao);
			break;
		}
		
		
		entrada.close();
		
	}

}
