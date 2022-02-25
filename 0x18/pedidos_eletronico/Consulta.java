import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	// Inclua o método estático obterProdutosPorPrecoMinimo que recebe uma lista de
	// produtos e um preço mínimo.
	// Esse método deve retornar os produtos que possuem preço maior ou igual ao
	// preço mínimo passado por parâmetro

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {

		return produtos.stream().filter(p -> p.getPreco() >= precoMinimo).collect(Collectors.toList());
	}

//Inclua o método estático obterPedidosComEletronicos a classe Consulta que recebe uma 
	// lista de pedidos e retorna apenas os pedidos que possuem produtos que sejam
	// da categoria Eletronico.
	// DICA: Utilizar anyMatch
	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {

		return pedido.stream().filter(
				p -> p.getProdutos().stream().anyMatch(t -> t.getCategoria().equals(CategoriaProduto.ELETRONICO)))
				.collect(Collectors.toList());
	}

}
