package lista4;
import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int cont = 0;
		double notaAluno = 0,media = 0;
		while(cont <10) {
		    
			System.out.println("Digite a Nota do aluno");
		    notaAluno = input.nextDouble();
		    media += notaAluno ;
		    cont++;	    
	}
	    media/=10;
		System.out.print(media);
		input.close();
	}
}