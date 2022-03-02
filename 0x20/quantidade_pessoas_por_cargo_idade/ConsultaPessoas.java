
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	/*
	 * obterPessoasPorCargo: recebe uma lista de Pessoa e retorna um Map<String,
	 * List<Pessoa>> que contém o nome do cargo como chave do Map e a lista de
	 * pessoas daquele cargo como valor do Map.
	 */

	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
		return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));

	}
	// obterIdadePorCargo: recebe uma lista de Pessoa e retorna um Map<String,
	// List<Integer>> que contém
	// o nome do cargo como chave do Map e a lista de idades de pessoas daquele
	// cargo como valor do Map.

	public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> todasPessoas) {
		return todasPessoas.stream().collect(
				Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));

	}

	/*
	 * obterPessoasPorCargoAcimaDe40anos: recebe uma lista de Pessoa e retorna um
	 * Map<String, List<Pessoa>> que contém o nome do cargo como chave do Map e a
	 * lista de pessoas daquele cargo e que possuam idade acima de 40 anos como
	 * valor do Map.
	 */

	public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> todasPessoas) {
		return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
				Collectors.filtering(i -> i.getIdade() >= 40, Collectors.toList())));
	}

	/*obterPessoasAgrupadasPorCargoEmOrdemReversa: recebe uma lista de Pessoa e retorna um
	 TreeMap<String, TreeSet<Pessoa>> que contém o nome do cargo como chave 
	 do TreeMap e um TreeSet de pessoas daquele cargo como valor do TreeMap.
	A lista de cargos do TreeMap deve estar em ordem reversa.*/
	
	/*Utilizar Collectors.groupingBy instanciando TreeMap com 
	Comparator.reverseOrder e Collectors.toCollection(TreeSet::new)*/
	public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
			List<Pessoa> todasPessoas) {
		return todasPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo,
						() -> new TreeMap<>(Comparator.reverseOrder()),
						Collectors.toCollection(TreeSet::new)));
	}
/*obterContagemPessoasPorCargo: recebe uma lista de Pessoa e retorna um Map<String,
 *  Long> que contém o nome do cargo como chave do Map e a quantidade de pessoas daquele cargo como valor do Map*/

	public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> todasPessoas) {
		return todasPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
	}

	public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> todasPessoas) {
	
		return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, 
				Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
	}


	

	}


