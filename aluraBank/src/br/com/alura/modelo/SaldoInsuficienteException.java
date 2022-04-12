package br.com.alura.modelo;

/**
 * Classe lança uma exceção, caso o saldo seja insuficiente para alguma operação.
 * @author Gustavo Henrique
 *
 */
public class SaldoInsuficienteException extends Exception {

	/**
	 * Parâmetro passa uma mensagem como argumento para o construtor da super-classe.
	 * @param msg
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
