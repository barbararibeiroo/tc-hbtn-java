import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private double preco;
	private double percentualMarkUp = 0.1;

	Consumer<Double> atualizarMarkUp = preco -> percentualMarkUp = (preco/100);
	Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkUp);

	public Produto(double preco, String nome) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getPercentualMarkUp() {
		return percentualMarkUp;
	}

}
