import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//melhorando codigo da aula anterior utilizando try-with-resources

public class Aula183TryWithResources {

	public static void main(String[] args) {

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
