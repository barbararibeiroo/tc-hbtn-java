import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import preco_minimo.CategoriaProduto;

public class Consulta {

	// Filter -> filtra informações

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		return pedido.getProdutos().stream().filter(t -> t.getCategoria().equals(CategoriaProduto.LIVRO))
				.collect(Collectors.toList());

	}
	// Ordene a lista de produtos por preco com order reversa e obtenha o primeiro
	// produto.
	// Utilize Comparator.comparing com reversed

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
		return produtos.stream().sorted(Comparator.comparing(Produto::getPreco).reversed()).findFirst().orElse(null);

	}

}
