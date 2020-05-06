package Lista5;

public class Exercicio3 {
	
	public static void main(String[] args) {
			
		double perimetro , pi;
		pi =3.14;

		for (double raio =1 ; raio<10;) {
			raio = raio +0.5;
			perimetro = (2*pi)*raio;
			System.out.println("Perimetro:"+perimetro);
		}

	}
	
}
