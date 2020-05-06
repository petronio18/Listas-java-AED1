package labAED1;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
	
        double num1,num2,div;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero:");
		num1 = entrada.nextDouble();
		System.out.print("Digite um numero:");
		num2 = entrada.nextDouble();
		
		if(num2>0) 
		{			
			div = (num1/num2);
			System.out.println("O Resultado é:"+div);	
		}
		else
		{
			System.out.println("O segundo valor não pode ser 0!");
			
			System.out.print("Digite um numero:");
			num1 = entrada.nextDouble();
			System.out.print("Digite um numero:");
			num2 = entrada.nextDouble();
			div = (num1/num2);
			System.out.println("O Resultado é:"+div);	
	
		}
		entrada.close();


	}
}