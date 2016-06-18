import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAlunoDao implements AlunoDao {

	private BufferedReader bufferedReader;

	public FileAlunoDao() {
		try {
			this.bufferedReader = new BufferedReader(new FileReader("src/aluno.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		}
	}

	@Override
	public double lerNota1() {
		double nota = 0;
		try {
			nota = Double.parseDouble(this.bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		return nota;
	}

	@Override
	public double lerNota2() {
		double nota = 0;
		try {
			nota = Double.parseDouble(this.bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		return nota;
	}

}
