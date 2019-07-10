package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import controle.JPAUtil;

public class UsuarioHelper {
	public void getUsuario() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		 entityManager.getTransaction().begin();

		 Query q = entityManager.createQuery("SELECT q FROM usuario q");

		 List<usuario> lista = q.getResultList();

		 for(int i=0; i<lista.size(); i++) {
		 System.out.print(lista.get(i).getIp() + ": ");
		 System.out.print(lista.get(i).getNome());
		 System.out.print(lista.get(i).getResposta());
		 System.out.print(lista.get(i).getDAT_Hora());
		 }

		 entityManager.close();
		 JPAUtil.shutdown();
	}
	
	public void setUsuario() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		Query p = entityManager.createQuery("insert into usuario (ip,nome,resposta) values");
		
	}
	
	public static void main(String Args[]) {
		UsuarioHelper q = new UsuarioHelper();
		q.getUsuario();
	}
}
