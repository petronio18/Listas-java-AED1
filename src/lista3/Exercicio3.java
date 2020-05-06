package lista3;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double salario,horasT,horasE,valorhoraT,salarioMes,VhoraExtra,salarioBruto,salarioImposto = 0,salarioFinal;
		int Vdepentes = 32,depentes;
		
		System.out.println("Digite o salario:");
		salario = input.nextDouble();
		System.out.println("Digite as horas trabalhadas:");
		horasT = input.nextDouble();
		System.out.println("Digite as horas extras: ");
		horasE = input.nextDouble();
		System.out.println("Digite o numero de depentes:");
		depentes = input.nextInt();
		valorhoraT =salario/(horasT*5) ;//valor horas trabalhadas
		salarioMes = horasT*valorhoraT;
		VhoraExtra = horasE *(valorhoraT+0.50);
		salarioBruto = salario +(depentes*Vdepentes)+(VhoraExtra);
		
		
		if(salarioBruto < 2000){
			System.out.println("insento de imposto");
			
			
		}else if(salarioBruto < 5000) {
			
			System.out.println("Desconto de 10% do imposto de renda");
			salarioImposto = salarioBruto -0.10;   
			
			
		}else{
			System.out.println("Desconto de 20% do imposto de renda");
			salarioImposto = salarioBruto  - 0.20;			
		}
		
		if(salarioImposto <1500) {
			
			System.out.println("voce ganhou uma bonificaçao de 100$");
			salarioFinal = salarioImposto +100;
		}else {
			System.out.println("voce ganhou uma bonificaçao de 50$");
			salarioFinal = salarioImposto+50;
		}
		System.out.println("Salario Bruto"+salarioBruto);
		System.out.println("salario liquido"+salarioFinal);
		
		input.close();
	}

}
