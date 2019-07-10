package modelo;

import java.util.List;

import javax.persistence.*;
import controle.*;

public class QuestoesHelper {
	public void getQuestoes() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		 entityManager.getTransaction().begin();

		 Query q = entityManager.createQuery("SELECT q FROM questoes q");

		 List<questoes> lista = q.getResultList();

		 for(int i=0; i<lista.size(); i++) {
		 System.out.print(lista.get(i).getPergunta() + ": ");
		 System.out.print(lista.get(i).getAlternativa1());
		 System.out.print(lista.get(i).getAlternativa2());
		 System.out.print(lista.get(i).getAlternativa3());
		 System.out.print(lista.get(i).getAlternativa4());
		 }

		 entityManager.close();
		 JPAUtil.shutdown();
	}
	
	public static void main(String Args[]) {
		QuestoesHelper q = new QuestoesHelper();
		q.getQuestoes();
	}
}
