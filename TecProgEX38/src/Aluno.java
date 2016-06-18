
public class Aluno {

	private double nota1;
	private double nota2;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public void calculaMedia() {
		double media = (this.nota1 + this.nota2) / 2;
		System.out.println("Media: " + media);
		if (media >= 6) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}
}
