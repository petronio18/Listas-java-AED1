package lista6;
import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		
			int n; 
			double  s=1,d=1,f=1,x=0; 
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Digite a quantidade de respostas desejadas :");
			n = entrada.nextInt();
			while(d<=n) 
			{
				s+= 1/d*f;
				
				f = f *(x+1);
		        x++;
		        d++;
				System.out.printf("\n o valor da soma é  : %2f",s);
				}
			entrada.close();
	}
	

	}