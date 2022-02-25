package maior_preco;

import preco_minimo.CategoriaProduto;

public class Produto {

	private int codigo;
	private String nome;
	private CategoriaProduto categoria;
	private double preco;

	public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " " + categoria + " R$ " + String.format("%.2f", preco);
	}

}
