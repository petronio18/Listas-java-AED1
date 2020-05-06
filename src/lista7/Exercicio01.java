package lista7;
import java.util.*;
public class Exercicio01 {
	
	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero:");
		num3 = entrada.nextInt();
	
		System.out.println(maior(num1,num2,num3));
		System.out.println(menor(num1,num2,num3));
		System.out.println(media(num1,num2,num3));
		entrada.close();
	}	
	
	static int maior(int n1,int n2,int n3) {
		
		int maior =Integer.MIN_VALUE;
		
		if(n1>maior) {
			maior = n1;
		}
		if(n2 > maior) {
			maior =n2;
		}
		if(n3>maior) {
			maior=n3;
			
		}
		
		return maior;
	}
	
	public static int menor(int n1,int n2,int n3) {
		
		int menor = Integer.MAX_VALUE;
		
		if(n1<menor) {
			menor = n1;
		}
		if(n2 < menor ) {
			menor =n2;
		}
		if(n3<menor) {
			menor=n3;
			
		}
		
		return menor;
	}
	
	public static double media(int n1,int n2,int n3){
		
		double media;
		media =n1+n2+n3/3;
	
		return media;
	}
}
