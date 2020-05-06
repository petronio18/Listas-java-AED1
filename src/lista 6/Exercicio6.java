package lista6;
import java.util.*;
public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double filhos,salario = 0,mediasalario = 0,maiorsalario = 0,mediafilhos=0;
		int atemil=0,maisdmil=0;
		int cont= 0;
		
		System.out.println("Para finalizar o programa digite menos -1,digite 0 em filhos quando for encerrar.");
		
		while(salario !=-1)	{	
		System.out.println("Digite o salario:");
		salario = entrada.nextDouble();
		System.out.println("Digite a quantidade de filhos:");
		filhos = entrada.nextDouble();
		
		mediasalario+=salario;
		mediafilhos+=filhos;
		
		if(cont >maiorsalario) {
			maiorsalario =salario;
		}
		if(salario<=1000) {
		 atemil ++;
		}
		
		cont++;
		
		}
		mediafilhos/=cont;
		mediasalario/=cont-(1);
		atemil =atemil* 100/cont;
		
		System.out.printf("Media do numero de filhos na cidade é:%2f\n",mediafilhos);
		System.out.printf(" media do salario da populaçao é:%2f\n",mediasalario);
		System.out.printf("Maoir salario é:%2f\n",maiorsalario);
		System.out.printf("Pessoas com salario ate 1000$:%d",atemil);

		entrada.close();
	}
}

