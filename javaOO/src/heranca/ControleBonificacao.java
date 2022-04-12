package heranca;

public class ControleBonificacao {

	private double soma = 0;

	public void registra(Funcionario func) {
		double bonificao = func.getBonicacao();
		this.soma += bonificao;
	}
	
	public double getSoma() {
		
		return this.soma;
	}

}
