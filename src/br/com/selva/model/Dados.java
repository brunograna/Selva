package br.com.selva.model;

import java.io.Serializable;
import java.sql.Date;

public class Dados implements Serializable {
	
	private String nome;
	private String resposta;
	private String ip;
    private Date dataHora;
    
	
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
	 
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
}
