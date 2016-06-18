
abstract class Assinatura {
	
	protected String nome;
	protected String mensagem;
	protected String ramal;
	
	public Assinatura(String nome, String mensagem, String ramal) {
		this.nome = nome;
		this.mensagem = mensagem;
		this.ramal = ramal;
	}

	abstract void imprimirAssinatura();
	
	static void getAssinatura(Assinatura assinatura){
		assinatura.imprimirAssinatura();
	}
	
		
	
}
