import java.util.Scanner;

public class ConsoleAlunoDao implements AlunoDao{

	@Override
	public double lerNota1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nota: ");
		return s.nextDouble();
	}

	@Override
	public double lerNota2() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nota: ");
		return s.nextDouble();
	}

}
