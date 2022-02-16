package provedores;

public class Sedex implements ProvedorFrete {

	public Sedex() {

	}

	@Override
	public double calcularFrete(double peso, double valor) {
		if (peso > 1000) {
			valor = valor * 0.10;
		} else {
			valor = valor * 0.05;
		}
		return valor;

		// return (peso > 1000 ? (valor*0.10): (valor*0.05));

	}

	public TipoProvedorFrete obterTipoProvedorFrete() {
		return TipoProvedorFrete.SEDEX;
	}

}
