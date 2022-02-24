import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos,  Predicate<Produto> p) {
		List<Produto> produtoFiltrar = new ArrayList<>();
		produtos.forEach(teste -> {
			if (p.test(teste)) {
				produtoFiltrar.add(teste);
			}
		});
		return produtoFiltrar;
	}
}