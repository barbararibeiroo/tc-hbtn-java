import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

	private List<Post> posts = new ArrayList<>();

	public void adicionarPostagem(Post post) {
		if (posts.contains(post)) {
			throw new IllegalArgumentException("Postagem jah existente");

		}
		posts.add(post);
	}

	public Set<Autor> obterTodosAutores() {
		Set<Autor> autores = new TreeSet<>();
		for (Post post : posts) {
			autores.add(post.getAutor());
		}
		return autores;
	}

	public Map<Categorias, Integer> obterContagemPorCategoria() {
		Map<Categorias, Integer> contagem = new TreeMap<>();
		for (Post post : posts) {
			if (contagem.containsKey(post.getCategoria())) {
				contagem.put(post.getCategoria(), contagem.get(post.getCategoria()) + 1);
			} else {
				contagem.put(post.getCategoria(), 1);
			}
		}
		return contagem;
	}

	public Set<Post> obterPostsPorAutor(Autor autor) {
		Set<Post> postAutor = new TreeSet<>();
		for (Post post : posts) {
			if (post.getAutor().equals(autor)) {
				postAutor.add(post);
			}
		}
		return postAutor;
	}

	public Set<Post> obterPostsPorCategoria(Categorias categoria) {
		Set<Post> postCategoria = new TreeSet<>();
		for (Post post : posts) {
			if (post.getCategoria().equals(categoria)) {
				postCategoria.add(post);
			}
		}
		return postCategoria;
	}

	public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
		Map<Categorias, Set<Post>> categorias = new TreeMap<>();
		Set<Post> postCat;
		for (Post post : posts) {
			postCat = obterPostsPorCategoria(post.getCategoria());
			categorias.put(post.getCategoria(), postCat);
		}
		return categorias;
	}

	public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
		Map<Autor, Set<Post>> autores = new TreeMap<>();
		Set<Post> postAut;
		for (Post post : posts) {
			postAut = obterPostsPorAutor(post.getAutor());
			autores.put(post.getAutor(), postAut);
		}
		return autores;
	}

}
