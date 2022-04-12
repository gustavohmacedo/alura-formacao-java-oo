package heranca;

public abstract interface Autenticavel {

	public abstract void setUsuario(String usuario);

	public abstract void setSenha(int senha);

	public abstract boolean autenticarUsuario(String usuario, int senha);

}
