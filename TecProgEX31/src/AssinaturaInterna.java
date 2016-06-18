
public class AssinaturaInterna extends Assinatura {

	public AssinaturaInterna() {
		super("João", "4° Andar, Sala 200", "45");
	}

	@Override
	void imprimirAssinatura() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Ramal: "+ this.ramal);
		System.out.println(this.mensagem);
	}

}
