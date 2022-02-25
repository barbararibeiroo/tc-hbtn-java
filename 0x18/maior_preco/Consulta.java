import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	// Filter -> filtra informações

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		return pedido.getProdutos().stream().filter(t -> t.getCategoria().equals(CategoriaProduto.LIVRO))
				.collect(Collectors.toList());

	}

}
