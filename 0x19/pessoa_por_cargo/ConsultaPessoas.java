import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

	/*obterPessoasPorCargo: recebe uma lista de Pessoa e retorna um Map<String, List<Pessoa>> 
	que contém o nome do cargo como chave do Map e a lista de pessoas daquele cargo como valor do Map.*/
	
	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
		return todasPessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo));
				
	}

	
}
