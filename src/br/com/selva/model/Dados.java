package br.com.selva.model;

import java.io.Serializable;

public class Dados implements Serializable {
	
	private String nome;
	private String resposta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public Dados(String nome, String resposta) {
		
		this.nome = nome;
		this.resposta = resposta;
	}
	

}
