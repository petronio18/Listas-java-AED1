package Lista5;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {
			
		Scanner entrada =new Scanner(System.in);
		int num,numAux=512,cont =9;
		String tentativa;
		
		for(int i = 0;i<=10;i++){
			
			System.out.printf("2^%d =% \t",i,Math.pow(2,i));
		}
		System.out.println("\n");
	
		System.out.print("Pense em um numero entre 1 a 1023:");
		num = entrada.nextInt();
		
		for(int i=0;i<3;i++){
			
			System.out.printf("O número é igual, menor ou maior do que %d? (Por favor, digite \"=\", \"<\" ou \">\"):",numAux);
			tentativa = entrada.next();
			cont--;
			
			if(tentativa.equals("<")) {
				numAux -=Math.pow(2, cont);
			}else if(tentativa.equals(">")) {
				numAux +=Math.pow(2, cont);
			}else if(tentativa.equals("=")) {
				System.out.print("Acertei!!!!");
			}
			
		}
		entrada.close();
	}

}
