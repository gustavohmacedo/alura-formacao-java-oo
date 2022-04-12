package br.com.alura.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre = 0;

	public GuardadorDeReferencias() {
		this.referencias = new Conta[10];
	}

	public void adiciona(Object ref) {

		this.referencias[posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int totalContasAdicionadas() {

		return this.posicaoLivre;
	}

	public Object buscarNumeroDaContaPorPosicao(int pos) {

		return this.referencias[pos];
	}

}
