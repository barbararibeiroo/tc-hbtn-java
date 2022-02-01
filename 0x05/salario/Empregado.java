
public class Empregado  {
	public double salarioFixo;

	public Empregado(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta() == true) {
		 return salarioFixo * 0.1f; 
		 }
		else {
			return 0.0f;
		}
	}	
	double calcularSalarioTotal(Departamento departamento) {
		return calcularBonus(departamento) + salarioFixo;
	}
}
