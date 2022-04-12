package fluxo_entrada_arquivo;

import java.io.Serializable;

public class ClienteSerializacao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public ClienteSerializacao() {}
	
	public ClienteSerializacao(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "[nome: " + nome + ", cpf: " + cpf + ", profissao: " + profissao + "]";
	}
	
	

}
