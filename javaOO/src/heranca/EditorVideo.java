package heranca;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonicacao() {

		return 150.00;
	}

	@Override
	public String toString() {
		return "Editor [Nome:" + super.getNome() + ", CPF: " + super.getCpf() + ", "
				+ String.format("Salário %.2f", super.getSalario()) + "]";
	}

}
