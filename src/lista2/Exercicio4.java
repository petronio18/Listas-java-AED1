package lista2;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		int opcao;
		double salario,novoSalario;
		
		System.out.println("digite seu salario:");
		salario = entrada.nextDouble();
		System.out.println("digite a opçao que corresponde ao seu plano de trabalho:");
		System.out.println("a)aumento de 20% .");
		System.out.println("b)aumento de 30%.");
		System.out.println("c)aumneot de 45%.");
		opcao = entrada.next().charAt(0);
		switch(opcao){
		case 'a':
			novoSalario =salario+(salario*0.20);
			System.out.println("salario atual:"+salario);
			System.out.println("novo salario:"+novoSalario);
			break;
		case 'b':
			novoSalario =salario+(salario*0.30);
			System.out.println("salario atual:"+salario);
			System.out.println("novo salario:"+novoSalario);
			break;
		case 'c':
			novoSalario =salario+(salario*0.45);
			System.out.println("salario ataul:"+salario);
			System.out.println("noovo salario:"+novoSalario);
			break;
		}
		entrada.close();
	}
}
