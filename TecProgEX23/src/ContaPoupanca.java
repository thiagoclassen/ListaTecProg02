
public class ContaPoupanca extends Conta {

	@Override
	void jurosDiarios(int dias) {
		double juros = 0;
		juros = this.getSaldo() * 0.02;
		this.deposito(juros*dias);
	}

}
