package lista6;

public class Exercicio3 {
	
	public static void main(String[] args) {

		int contpar=0,contimpar=0,media=0;
		for(int cont= 1;cont<=10;cont++){
			media+=cont;
			if ( cont % 2 == 0 ) {
				System.out.println( cont + " é um número PAR.");
				contpar++;
				
			}
				else {
				System.out.println( cont + " é um número IMPAR.");
				contimpar++;
				}
		}
		media/=10;
		System.out.println("A media é:"+media);
		System.out.println("num pares lidos :"+contpar);
		System.out.println("num impar lidos:"+contimpar);
	}
}
	