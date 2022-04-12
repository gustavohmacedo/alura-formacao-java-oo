package heranca;

public class TesteSistema {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Gustavo");
		gerente.setCpf("088.800.333-09");
		gerente.setSalario(5000.00);
		gerente.setUsuario("gustavohm2008@hotmail.com");
		gerente.setSenha(123456);
		gerente.autenticarUsuario("gustavohm2008@hotmail.com", 123456);
		System.out.println(gerente);
		//gerente.getBonicacao();
		//System.out.println();

		Administrador adm = new Administrador();
		adm.setNome("Peter Henrique");
		adm.setUsuario("adm@gmail.com");
		adm.setSenha(12345);
		gerente.autenticarUsuario("adm@gmail.com", 12345);
		System.out.println(adm);

		SistemaInterno sistema = new SistemaInterno();
		sistema.entrarSistemaInterno(gerente);
		sistema.entrarSistemaInterno(adm);
		

	}

}
