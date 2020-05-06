package lista4;
import java.util.*;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada =new Scanner(System.in);
		
		double num=0 ,cont=0;
		
		while(cont <3 ){
			System.out.println("Digite um numero");
			num = entrada.nextDouble();
		
			if((num % 3)==0) {
				System.out.println("Numero é divisivel por 3:"+num);
				
			}else {
				System.out.println("Numero não é divisivel por 3:"+num);
			}
		
			cont++;
				
	  }
		entrada.close();
	}
}
