package lista7;
import java.util.*;
public class Exercicio2 {

		static int Menu(int menu) {
			return menu;
		}

		static double Fahrenheit(double C) {
			double F = 32 + C * 9 / 5;
			return F;
		}

		static double Celsius(double F) {
			double C = (F - 32) * 5 / 9;
			return C;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int menu;
			double C, F;
			System.out.println(
					"Digite [1] para calcular Celsius e [2] para calcular fahrenheit e " + "[0] para parar a repetição ");
			menu = input.nextInt();

			while (Menu(menu) != 0) {
				if (Menu(menu) == 1) {
					System.out.println("\ndigite a quantidade de graus em Fahrenheit para " + "converter para Celsius: ");
					F = input.nextDouble();
					System.out.printf(" \na quantidade convertida é de: %2f", Celsius(F));
				} else if (Menu(menu) == 2) {
					System.out.println("\ndigite a quantidade de graus em Celsius para " + "converter para Fahrenheit: ");
					C = input.nextDouble();
					System.out.printf("\n a quantidade convertida é de: %2f", Fahrenheit(C));
				} else {
					System.out.printf("\nVoce digitou um numero errado por favor digite novamente.");
				}

				System.out.println("\nDigite [1] para calcular Celsius e [2] para calcular fahrenheit e "
						+ "[0] para parar a repetição ");
				menu = input.nextInt();
			}
			System.out.printf("\nFim da repetição. ");
			input.close();

		}
}