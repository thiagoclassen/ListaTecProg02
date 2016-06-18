import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		AlunoDao dao = null;
		Aluno aluno = new Aluno();
		Scanner s = new Scanner(System.in);
		
		System.out.println("1 Entrada manual.");
		System.out.println("2 Entrada por arquivo.");
		
		if(s.nextInt()==1){
			dao = new ConsoleAlunoDao();			
		}else{
			dao = new FileAlunoDao();
		}
		
		aluno.setNota1(dao.lerNota1());
		aluno.setNota2(dao.lerNota2());		
		
		aluno.calculaMedia();
		
	}

}
