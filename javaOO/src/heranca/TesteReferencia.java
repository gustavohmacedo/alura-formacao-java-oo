package heranca;

public class TesteReferencia {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Peter");
		g1.setSalario(15000.00);
		g1.setCpf("022.555.777-88");
		System.out.println(g1);

		EditorVideo editor = new EditorVideo();
		editor.setNome("Gustavo");
		editor.setSalario(7000.00);
		editor.setCpf("033.525.999-77");
		System.out.println(editor);

		Designer designer = new Designer();
		designer.setNome("Sarah");
		designer.setSalario(4000.00);
		designer.setCpf("044.888.000-11");
		System.out.println(designer);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(editor);
		controle.registra(designer);
		System.out.println();
		System.out.println("Soma Bonificação total = " + controle.getSoma());

	}

}
