import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.Aula;
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

	//Inclua o método estático aplicar15PorcentoDescontoEletronicos na classe 
	//Consulta que recebe uma lista de produtos e retorna todos os produtos,
	//porém os produtos que sejam eletronicos deve estar com 15% de desconto aplicado no preço.
	public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
		return produtos.stream().map(produto -> {
			if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO))
				produto.setPreco(produto.getPreco() - produto.getPreco() * 0.15);
			return produto;
		}).collect(Collectors.toList());
	}

	// return this.aulas.stream().mapToInt(Aula::getTempo).sum();
}
