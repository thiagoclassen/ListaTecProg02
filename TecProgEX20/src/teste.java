import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Coordenada X e Y do primeiro ponto: ");
		Ponto a = new Ponto(s.nextInt(), s.nextInt());
		System.out.println("Coordenada X e Y do segundo ponto: ");
		Ponto b = new Ponto(s.nextInt(), s.nextInt());
		System.out.println("Coordenada X e Y do terceiro ponto: ");
		Ponto c = new Ponto(s.nextInt(), s.nextInt());
		
		
		Triangulo abc = new Triangulo(a, b, c);
		abc.calculaPerimetro();
		
		s.close();
	}

}
