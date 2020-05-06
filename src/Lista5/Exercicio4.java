package Lista5;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int F=50,C=0,cont=0;
		for(cont=0;cont<=10;cont++) {
			
			System.out.println("divisao"+F);
			C = (F-32)*5/9;
			F+=5;
		}
		System.out.println("rusultado:"+C);
		
		entrada.close();

	}

}
