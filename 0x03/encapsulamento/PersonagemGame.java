package controle;

public class PersonagemGame {

	private int saudeAtual;
	private String nome;

	public PersonagemGame(int saudeAtual, String nome) {
		this.saudeAtual = saudeAtual;
		this.nome = nome;
	}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
