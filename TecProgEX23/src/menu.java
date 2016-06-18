import java.util.Scanner;

public class menu {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int op;
		Conta conta = null;

		do {
			System.out.println("1 - Criar conta.");
			System.out.println("2 - ler saldo.");
			System.out.println("3 - depositar.");
			System.out.println("4 - sacar.");
			System.out.println("5 - saldo após X dias.");
			System.out.println("6 - sair.");

			op = s.nextInt();

			switch (op) {
			case 1:
				if (conta == null) {
					conta = criarConta();
				} else {
					System.out.println("Conta ja criada.");
				}
				break;
			case 2:
				conta.saldo();
				break;
			case 3:
				System.out.println("Valor: ");
				conta.deposito(s.nextDouble());
				break;
			case 4:
				System.out.println("Valor: ");
				conta.retirada(s.nextDouble());
				break;
			case 5:
				System.out.println("Dias: ");
				conta.jurosDiarios(s.nextInt());
				break;
			default:
				break;
			}
		} while (op != 6 && op > 0 && op < 7);

		s.close();
	}

	public static Conta criarConta() {
		int op;
		Scanner s = new Scanner(System.in);

		System.out.println("1 - Criar conta corrente.");
		System.out.println("2 - Criar conta poupança.");

		op = s.nextInt();

		Conta temp;
		if (op == 1) {
			temp = new ContaCorrente();
		} else {
			temp = new ContaCorrente();
		}

		System.out.println("Numero da cota: ");
		temp.setNumero(s.nextInt());
		
		return temp;
	}

}
