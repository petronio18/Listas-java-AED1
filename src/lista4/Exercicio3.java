package lista4;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	     double numerador = 1,denominador = 1,soma=0;
	     
	     while(numerador <=100){
	    	 System.out.println("o calculo é:"+numerador+"/"+denominador);
	    	 numerador +=2;
	    	 denominador ++;
	    	 soma += numerador/denominador;
	     }
	     System.out.print("Resultado é:"+soma);

		entrada.close();
	}

}
