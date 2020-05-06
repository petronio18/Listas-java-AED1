package labAED1;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		
		double nota1, nota2,nota3,notaFinal,menorNota,precisarDPontos,calculoN;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua primeira nota:");
		nota1 = entrada.nextDouble();
		System.out.print("Digite sua segunda nota:");
		nota2 = entrada.nextDouble();
		System.out.print("Digite sua terceira nota:");
		nota3 = entrada.nextDouble();
		notaFinal = nota1 + nota2 + nota3;
		
		if(notaFinal >60)
		{
			System.out.println("\nAluno aprovado com:" + notaFinal + "pontos.");
		}
		else if(notaFinal>39 && notaFinal <60 )
		{
			System.out.println("\nAluno de reavaliação" + notaFinal +"pontos.");
			System.out.print("\nDigite sua menor nota:");
			menorNota = entrada.nextDouble();
			calculoN= (notaFinal-menorNota);
			precisarDPontos = (60 - calculoN);
			System.out.println("\nO aluno precisar de " + precisarDPontos + "pontos.");
		}
		else
		{
			System.out.println("\nAluno reprovado com " + notaFinal + "pontos." );
		}
		
		entrada.close();
	

	}

}
