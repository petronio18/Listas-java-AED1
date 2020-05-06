package labAED1;
import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		
		double preco,desconto,novoPreco;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite o preço de um produto:");
		preco = entrada.nextDouble();
	
		desconto = (preco*0.15);
		novoPreco = (preco -desconto);
		System.out.println("Valor do produto:"+preco);
		System.out.println("VAlor do desconto:"+desconto);
		System.out.println("Valor com o desconto aplicado:"+novoPreco);

		entrada.close();
		
	}

}
