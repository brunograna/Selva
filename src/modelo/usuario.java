package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class usuario implements Serializable  {
	private static final long serialVersionUID = -5045562122911858303L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int id_user;
	private String ip;
	private String nome;
	private int resposta;
	private String DAT_Hora;
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	public String getDAT_Hora() {
		return DAT_Hora;
	}
	public void setDAT_Hora(String dAT_Hora) {
		DAT_Hora = dAT_Hora;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
