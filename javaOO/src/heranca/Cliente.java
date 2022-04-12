package heranca;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
