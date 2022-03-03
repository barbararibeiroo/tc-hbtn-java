package armazem;

public interface Armazenavel<E> {

	public void adicionarAoInventario(String nome, E valor); 
	
	public E adicionarAoInventario(String nome);
}
