package Lista5;
import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double nota = 0,media=0;
		int cont=0;
		
		for(cont =0;cont<10;cont++) {
			
			System.out.println("Digite sua nota");
			nota = entrada.nextDouble();
			media+=nota;
		}
		media/=10;
		System.out.println("A media da turma é:"+media);
		entrada.close();
	}

}
