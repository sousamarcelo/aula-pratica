import java.util.Locale;
import java.util.Scanner;

public class Aula25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Lendo uma palavra no teclado
//		System.out.print("Digite alguma coisa: ");
//		String x = sc.next();
//		System.out.println();
//		System.out.print("Você digitou: " + x);
		
		//Lendo um numero inteiro no teclado
//		System.out.print("Digite um numero: ");		
//		int numero = sc.nextInt();
//		System.out.println();
//		System.out.println("Voce digitou: " + numero);
		
		//Lendo numero ponto flutuante
//		System.out.print("Digite um numero com casa descima: ");
//		double numero = sc.nextDouble();
//		System.out.println();
//		System.out.println("Você digitou: " + numero);
		
		//Lendo caracter
//		System.out.print("Digite um caracter: ");
//		char letra = sc.next().charAt(0);
//		System.out.println();
//		System.out.println("Voce digitou: " + letra);
		
		// Lendo varias informações na mesma linha		
		System.out.print("Digite tres informações: ");
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);		
		
		sc.close();

	}

}
