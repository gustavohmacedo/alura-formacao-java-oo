package br.com.alura.modelo;

/**
 * Classe lan�a uma exce��o, caso o saldo seja insuficiente para alguma opera��o.
 * @author Gustavo Henrique
 *
 */
public class SaldoInsuficienteException extends Exception {

	/**
	 * Par�metro passa uma mensagem como argumento para o construtor da super-classe.
	 * @param msg
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
