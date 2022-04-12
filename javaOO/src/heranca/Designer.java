package heranca;

public class Designer extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Designer() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonicacao() {
		System.out.println("Chamando método bonificação Designer");
		return 250.00;
	}

	@Override
	public String toString() {
		return "Designer [Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", "
				+ String.format("Salário %.2f", getSalario()) + "]";
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
