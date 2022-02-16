package provedores;

public class JadLog implements ProvedorFrete {

	public JadLog() {
		
	}
	@Override
	public double calcularFrete(double peso, double valor) {
		if(peso > 2000) {
			valor = valor * 0.07;
		}else {
			valor = valor * 0.045;
		}
		return valor;
		//return (peso > 2000 ? (valor*0.07): (valor*0.045)); 
		
	}
	
	public TipoProvedorFrete obterTipoProvedorFrete() {	
		return TipoProvedorFrete.JADLOG;
	}
	
}
