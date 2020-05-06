package lista4;
import java.util.*;
public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int  cont = 0 ,num,maior=0,menor=1000000,media = 0;
		
		while(cont <4) {
			
			System.out.println("Digite um  numero:");
			num = entrada.nextInt();
			if(num >maior) {
				maior= num;
			}
			if(num <menor) {
				menor = num;
			}
			media+=num;
			cont++;
		    }
		
		media/=4;
		System.out.println("O maior numero é:"+maior);
		System.out.println("O menor numero é:"+menor);
		System.out.println("A media é:"+media);
		
		entrada.close();
		
	}
}