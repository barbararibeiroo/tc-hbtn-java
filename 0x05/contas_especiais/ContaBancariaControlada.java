
public class ContaBancariaControlada extends ContaBancariaBasica {

	private double saldoMinimo = 0;
	private double valorPenalidade = 5;

	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
			double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		this.saldoMinimo = saldoMinimo;
		this.valorPenalidade = valorPenalidade;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getValorPenalidade() {
		return valorPenalidade;
	}

	public void setValorPenalidade(double valorPenalidade) {
		this.valorPenalidade = valorPenalidade;
	}
	@Override
	public void aplicarAtualizacaoMensal() {
		this.saldo = saldo - calcularTarifaMensal() + calcularJurosMensal() - valorPenalidade;

	}

	}


