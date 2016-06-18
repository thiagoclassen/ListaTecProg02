
public class AssinaturaCliente extends Assinatura{
	
	public AssinaturaCliente() {
		super("João", "Consigo Descontos, yay!", "40");
	}

	@Override
	void imprimirAssinatura() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Ramal: "+ this.ramal);
		System.out.println(this.mensagem);
	}

}
