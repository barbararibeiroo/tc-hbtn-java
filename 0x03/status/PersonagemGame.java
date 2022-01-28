public class PersonagemGame {

	private int saudeAtual;
	private String nome;
	private String status;

	public PersonagemGame(int saudeAtual, String nome) {
		this.setSaudeAtual(saudeAtual);
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return nome;
	}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public String getStatus() {
		return status;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
		if (saudeAtual > 0) {
			this.status = "vivo";
		} else {
			this.status = "morto";
		}
	}

	public void receberCura(int quantidadeDeCura) {
		this.saudeAtual = saudeAtual + quantidadeDeCura;
		this.setSaudeAtual(saudeAtual);
		if (saudeAtual > 100) {
			saudeAtual = 100;
		}

	}

	public void tomarDano(int quantidadeDeDano) {
		this.saudeAtual = saudeAtual - quantidadeDeDano;
		this.setSaudeAtual(saudeAtual);
		if (saudeAtual < 0) {
			saudeAtual = 0;
		}
	}

}
