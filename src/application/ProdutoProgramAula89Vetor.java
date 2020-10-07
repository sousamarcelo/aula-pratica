package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProdutoProgramAula89Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vator: ");
		int tamanho = sc.nextInt();
		
		Produto[] vetor = new Produto[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.printf("%dº produto%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getValor();
		}
		
		double media = soma / vetor.length;
		
		System.out.println("Preço media = " + String.format("%.2f", media));
		
		sc.close();

	}

}
