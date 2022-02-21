import java.util.Objects;

public class Autor implements Comparable<Autor> {

	private String nome;
	private String sobrenome;

	public Autor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sobrenome, other.sobrenome);
	}

	@Override
	public int compareTo(Autor autor) {
		return this.toString().compareTo(autor.toString());
	}
}
