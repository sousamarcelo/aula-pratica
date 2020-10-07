package entities;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return preco;
	}

	public void setValor(double preco) {
		this.preco = preco;
	}	

}
