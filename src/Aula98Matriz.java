import java.util.Locale;
import java.util.Scanner;

public class Aula98Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int valor = sc.nextInt();
				matriz[i][j] = valor;				
			}
		}
		
		System.out.println("Matriz diagonal");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <matriz[i].length; j++) {
				if (matriz[i][j] < 0) {					
					soma++;
				}
			}
		}
		
		
		System.out.println("Numero negativos: " + soma);
		
		
		sc.close();

	}

}
