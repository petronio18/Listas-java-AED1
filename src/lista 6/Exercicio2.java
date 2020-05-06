package lista6;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {

double numerador = 4, denominador = 1, pi = 0;
		
		System.out.print("Pi = ");
		for (int i = 0; numerador/denominador >= 0.001; i++) 
		{
			if(i % 2 == 0)
			{
				pi += numerador / denominador;
				
				if(i > 0)
					System.out.println(" + ");
			}
			else
			{
				pi -= numerador / denominador;
				System.out.println(" - ");
			}
			System.out.printf("%.0f/%.0f", numerador, denominador);
			denominador += 2;
		}
		System.out.println("\n\nPi = " + pi);
	}

}