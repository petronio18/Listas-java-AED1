package lista7;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		
		double x1,x2,y1,y2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1");
		x1 = input.nextDouble();
		System.out.println("Digite o valor de Y1");
		y1 = input.nextDouble();
		System.out.println("Digite o valor de X2");
		x2 = input.nextDouble();
		System.out.println("Digite o valor de Y2");
		y2 = input.nextDouble();
		
		System.out.println(conta(x1,y1,x2,y2));
		input.close();
	}
	static double conta(double x1,double y1,double x2,double y2) {
		
		double total = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
		
		return total;		
	}
}