package Lista5;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int denominador =1,soma=0,numerador = 1,cont=0;
		
		for(cont= 0;cont<50;cont++) {
			
			 System.out.println("o calculo é:"+numerador+"/"+denominador);
	    	 numerador +=2;
	    	 denominador ++;
	    	 soma += numerador/denominador;
		}
		System.out.println("A soma é:"+soma);
		entrada.close();

	}

}
