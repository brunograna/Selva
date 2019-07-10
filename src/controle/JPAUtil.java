package controle;

import javax.persistence.*;

public class JPAUtil {
	private static final String PERSISTENCE_UNIT_NAME = "Modulo3"	;
	 private static EntityManagerFactory factory;
	 public static EntityManagerFactory getEntityManagerFactory() {
	 if (factory == null) {
	 factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	 }
	 return factory;
	 }
	 public static void shutdown() {
	 if (factory != null) {
	 factory.close();
	 }
	 }
}
