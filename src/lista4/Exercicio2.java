package lista4;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double cont =0,media=0;
		double nota ;
		
		
		do {
			System.out.println("Digite a nota:");
			nota = entrada.nextDouble();
			
			media +=nota;
			cont++;
		}
		while(cont <3);
		media/=3;
		System.out.print(media);
		entrada.close();
	}

}
