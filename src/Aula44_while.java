import java.util.Scanner;

public class Aula44_while {

	public static void main(String[] args) {
		//testando estrutura While
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inicial: ");
		double valor = sc.nextDouble();
		
		double soma = 0;
		
		while (valor != 0) {
			soma += valor;
			System.out.print("Digite valor: ");
			valor = sc.nextDouble();
		}
		
		System.out.println("A soma dos valores digitados é: " + soma);
		
		sc.close();

	}

}
