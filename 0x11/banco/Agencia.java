
import java.util.ArrayList;

public class Agencia {

	private String nome;
	private ArrayList<Cliente> clientes;
	
	public Agencia(String nome) {
		this.nome = nome;
		this.clientes = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	
	private Cliente buscarCliente(String nomeCliente) {
	     for (int i =0; i < clientes.size();i++){
	            if (clientes.get(i).getNome().equals(nomeCliente)){
	                return clientes.get(i);
	            }
	        }
	        return null;
	    }


	public boolean adicionarTransacaoCliente(String nomeCliente, double valorTansacaoInicial) {
		Cliente cliLocalizado = buscarCliente(nomeCliente);
		if (cliLocalizado == null) {
			return false;
		}
		
		cliLocalizado.adicionarTransacao(valorTansacaoInicial);
		return true;
		
	}
			
	public boolean novoCliente(String nomeCliente, double valorTansacaoInicial) {
		Cliente cliLocalizado = buscarCliente(nomeCliente);
		if (cliLocalizado != null) {
			return false;
		}
		Cliente novoCliente = new Cliente(nomeCliente, valorTansacaoInicial);
		clientes.add(novoCliente);
		
		return true;
	
		
	}
	
	
}
