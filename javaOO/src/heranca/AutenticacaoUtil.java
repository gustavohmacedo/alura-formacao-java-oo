package heranca;

public class AutenticacaoUtil {

	private String usuario;
	private int senha;

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticarUsuario(String usuario, int senha) {
		if (this.usuario == usuario && this.senha == senha) {
			System.out.println("Autenticado com sucesso!");
			return true;
		} else {
			System.out.println("Erro de autenticação! Favor, verifique o seu nome de usuário e senha.");
			return false;

		}
	}

}
