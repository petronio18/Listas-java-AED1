package lista2;
import java.util.*;
public class Exercico2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salario,aumento=0;
		
		System.out.print("Digite o salario:");
		salario = entrada.nextDouble();
		if(salario <=500) {
			aumento = salario +(salario*0.30);
			System.out.println("Você ganhou um aumento de 30%");
			System.out.println("Valor do novo salario é"+aumento);
		}else {
			System.out.print("Voce nao tem direito ao aumento");
		}
		entrada.close();

	}

}
