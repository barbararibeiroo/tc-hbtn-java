package provedores;

public class Loggi implements ProvedorFrete{


	public Loggi() {
		
	}
	@Override
	public double calcularFrete(double peso, double valor) {	
		if(peso > 5000) {
			valor = valor * 0.12;
		}else {
			valor = valor * 0.04;
		}
		return valor;
		//return (peso > 5000 ? (valor*0.12): (valor*0.04)); 
		
	}
	
	public TipoProvedorFrete obterTipoProvedorFrete() {	
		return TipoProvedorFrete.LOGGI;
	}
	
}


