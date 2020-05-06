package lista7;
import java.util.*;
public class Exercicio4 {
	
		static int Contagem(int A, int N) 
		{
			int cont=1;
			
			for(cont =0;A<=N;A++)
			{
				cont+= A;
				
			}
			System.out.printf("\nO resultado da somatoria é: [%d]",cont);
			return cont;
		}
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int A,N; 
			System.out.println("digite o primeiro valor: ");
			A = input.nextInt();
			System.out.println("digite o segundo valor: ");
			N = input.nextInt();
			Contagem(A,N);
			input.close();
		}
}
