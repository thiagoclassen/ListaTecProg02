
public class Triangulo {
	
	private Ponto A;
	private Ponto B;
	private Ponto C;
	
	public Triangulo(Ponto a, Ponto b, Ponto c) {
		A = a;
		B = b;
		C = c;
	}
	
	public void calculaPerimetro(){
		int res = distanciaPontos(this.A, this.B) +
		distanciaPontos(this.A, this.C) +
		distanciaPontos(this.B, this.C);
		
		System.out.println("O perimetro é: "+res);
	}
	
	private int distanciaPontos(Ponto a, Ponto b){
		
		int x = (int)Math.pow((a.getX()-b.getX()),2);
		int y = (int)Math.pow((a.getY()-b.getY()),2);
		return (int)Math.sqrt(x+y);		
	}
	
	public Ponto getA() {
		return A;
	}
	public void setA(Ponto a) {
		A = a;
	}
	public Ponto getB() {
		return B;
	}
	public void setB(Ponto b) {
		B = b;
	}
	public Ponto getC() {
		return C;
	}
	public void setC(Ponto c) {
		C = c;
	}
	
	
	
}
