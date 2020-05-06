package labAED1;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {

		
		double num1,num2,num3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		num1 = entrada.nextDouble();
		System.out.println("Digite um valor ");
		num2 = entrada.nextDouble();
		System.out.println("Digite um valor");
		num3 = entrada.nextDouble();
		
		if(num1 > num2 && num1 >num3  ) {
		 System.out.print("maior "+ num1 + "meio"+num2 + "menor"+num3);//ok
		}
		else if(num2 >num1 && num2 > num3 ) {
			 System.out.print("maior "+ num2 + "meio"+num3 + "menor"+num1);
		}
		else if(num3 >num1 && num3 >num2 ){
			 System.out.print("maior "+ num3 + "meio"+num2 + "menor"+num1);
		}
		else if (num1 < num2 && num1 < num3) {
			 System.out.print("maior "+ num3 + "meio"+num2 + "menor"+num1);
		}
		else if (num2 < num1 && num2 < num3) {
			 System.out.print("maior "+ num1 + "meio"+num3+ "menor"+num2);
		}
		else if (num3< num1 && num3 < num2){
			 System.out.print("maior "+ num1 + "meio"+num3 + "menor"+num2);
		}
		else if (num3< num1 && num3 < num2){
			 System.out.print("maior "+ num3 + "meio"+num1 + "menor"+num2);
		}
		entrada.close();
		
		
		
	}
	
}
