import java.util.Scanner;

public class Aula26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lendo texto e + dica pulo do gato para utilizar nextLine()
		int x = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();

	}

}
