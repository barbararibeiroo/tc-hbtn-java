import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia {


	private List<T> midias = new ArrayList<>();

	//adicionarMidia: que recebe um valor do tipo genérico e adiciona o elemento na lista.
	//obterListaMidias: que retorna a lista de elementos.
	

	public void adicionarMidia(T midia) {
		this.midias.add(midia);
		
	}



	public List<T> obterListaMidias() {
		return midias ;
	}







	



}

	



