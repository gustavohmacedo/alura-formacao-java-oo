package heranca;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonicacao() {
		System.out.println("Chamando método bonificação Administrador");
		return 50.00;
	}

	@Override
	public String toString() {
		return "Administrador [Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", "
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
