package heranca;

public class SistemaInterno {
	
	private String usuario = "gustavohm2008@hotmail.com";
	private int senha = 123456;

	public void entrarSistemaInterno(Autenticavel aut) {
		
		boolean autenticou = aut.autenticarUsuario(usuario, senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pdoe entrar no sitema!");
		}
	}

}
