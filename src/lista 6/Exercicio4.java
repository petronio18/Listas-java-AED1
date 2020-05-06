package lista6;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		
	double precoCompra = 1, precoVenda, menor10 = 0, meio = 0, maior20 = 0, lucro, totalVenda = 0, totalCompra = 0;

	Scanner entrada = new Scanner(System.in);

		while(precoCompra > 0)
		{
			System.out.println("Digite o preço de compra: ");
			precoCompra = entrada.nextDouble();
			
			if(precoCompra > 0)
			{
				System.out.println("Digite o preço de venda: ");
				precoVenda = entrada.nextDouble();
				
				lucro = precoVenda - precoCompra;
				
				if(lucro < 0.10 * precoVenda)
					menor10++;
				else if(lucro >= 0.10 * precoVenda && lucro <= 0.20 * precoVenda)
					meio++;
				else
					maior20++;
				
				totalCompra += precoCompra;
				totalVenda += precoVenda;
			}
			
			System.out.println("------------------------");
		}
		lucro = totalVenda - totalCompra;
		
		System.out.println("\nLucro < 10%: " + menor10);
		System.out.println("10% <= lucro <= 20%: " + meio);
		System.out.println("Lucro > 20%: " + maior20);
		System.out.println("Venda total = R$ " + totalVenda);
		System.out.println("Compra total = R$ " + totalCompra);
		System.out.println("\nLucro total = R$ " + lucro);
		
		entrada.close();
	}
	
}