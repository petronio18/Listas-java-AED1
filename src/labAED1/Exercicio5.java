package labAED1;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {

		double num1, num2,num3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite um valor:");
		num2 = entrada.nextDouble();
		System.out.print("Digite um valor:");
		num3 = entrada.nextDouble();
		
		
		if(num1 >num2 && num1>num3) {
			System.out.print("Ordem cresente:"+num1 + num2 + num3);
		}
		else if(num2 > num1 && num2 >num3) {
			System.out.print("Ordem cresente:"+num1 + num3 + num2);
			
		}
		else if(num3 >num1 && num3 >num2) {
			System.out.print("ordem cresente:"+num2+num3+num1);
		}
		else if (num1<num2 && num1<num3) {
			System.out.print("ordem cresente:"+num2+num1+num3);
		}
		else if (num2<num1 && num2<num3) {
			System.out.print("ordem cresente:"+num3+num1+num2);
		}
		else if(num3 <num1 && num3 <num2) {
			System.out.print("ordem cresente:"+num3+num2+num1);
		}
		
		entrada.close();
		
	}
}
