package lista2;
import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double nota1,nota2 ,nota3,media;
		
		System.out.println("Digite a primeira nota");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota");
        nota3 = entrada.nextDouble();
        media = (nota1+nota2+nota3)/3;
        if(media >= 6) {
        	System.out.print("aluno aprovado com a media de:"+media);
        	
        }
        else{
        	System.out.print("Aluno reprovado com a media de:"+media);
        	
        }
       
		
		
		entrada.close();
		
	}

}
