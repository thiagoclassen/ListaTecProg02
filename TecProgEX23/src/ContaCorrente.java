
public class ContaCorrente extends Conta{
	@Override
	void jurosDiarios(int dias) {
		double juros = 0;
		if(this.getSaldo()>1000){
			juros = (this.getSaldo()-1000)*0.01;
		}
		this.deposito(juros*dias);
	}
}
