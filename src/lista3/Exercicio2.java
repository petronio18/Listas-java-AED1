package lista3;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int mes,ano,dia,diaH,mesH,anoH;
		int idade;
		
		System.out.println("Digite a data do seu aniversario:\nNesse formato dia/mes/ano");
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		ano = entrada.nextInt();
		System.out.println("Digite a data de hoje.Nesse formato dia/mes/ano");
		diaH = entrada.nextInt();
		mesH = entrada.nextInt();
		anoH = entrada.nextInt();
		
		idade= anoH - ano;
	
		if(idade >18) {
			System.out.println("A maioridade penal");
		}else {
			System.out.println(" maioridade civil");
		}
		
		                          
		
		
		
		
		entrada.close();
	}

}
