package modelo;

import java.util.List;

import javax.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import controle.JPAUtil;

public class UsuarioHelper {
	public void getUsuario() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Query q = entityManager.createQuery("SELECT q FROM usuario q");

		List<usuario> lista = q.getResultList();

		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i).getIp() + ": ");
			System.out.print(lista.get(i).getNome());
			System.out.print(lista.get(i).getResposta());
			System.out.print(lista.get(i).getDAT_Hora());
		}

		entityManager.close();
		JPAUtil.shutdown();
	}

	public void setUsuario() {
		EntityManagerFactory teste = Persistence.createEntityManagerFactory("Modulo3");
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

		usuario user = new usuario();

		user.setNome("TesteCaio");
		user.setIp("Teste321");
		user.setResposta(1);
		user.setDAT_Hora("10/07/2019/1624");

		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();

		entityManager.close();
		System.out.println("Salvo Com Susseso!!");
	}

	public static void main(String Args[]) {
		UsuarioHelper q = new UsuarioHelper();
		q.getUsuario();
	}
}
