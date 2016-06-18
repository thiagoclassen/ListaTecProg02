
public class teste {

	public static void main(String[] args) {
		
		System.out.println("Assinatura Cliente");
		Assinatura.getAssinatura(new AssinaturaCliente());
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Assinatura Interna");
		Assinatura.getAssinatura(new AssinaturaInterna());
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Assinatura Default");
		Assinatura.getAssinatura(new AssinaturaDefault());

	}

}
