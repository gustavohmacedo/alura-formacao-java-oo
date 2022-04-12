package heranca;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonicacao() {
		System.out.println("Chamando método bonificação Gerente");
		System.out.printf("Bonificação = R$ %.2f", (super.getSalario() * 0.25));
		System.out.println();
		System.out.printf("Salário + Bonificação = R$ %.2f", super.getSalario() + (super.getSalario() * 0.25));

		return super.getSalario() + (super.getSalario() * 0.25);

	}

	@Override
	public String toString() {
		return "Gerente [Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", "
				+ String.format("Salário: %.2f", super.getSalario()) + "]";
	}

	@Override
	public void setUsuario(String usuario) {
		this.autenticador.setUsuario(usuario);

	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autenticarUsuario(String usuario, int senha) {
		return this.autenticador.autenticarUsuario(usuario, senha);

	}

}
