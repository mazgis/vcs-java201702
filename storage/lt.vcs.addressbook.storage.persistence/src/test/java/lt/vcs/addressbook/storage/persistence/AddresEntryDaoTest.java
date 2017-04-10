package lt.vcs.addressbook.storage.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class AddresEntryDaoTest {

	private static EntityManagerFactory emf;

	public void onClass() {
		emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
	}

	@Test
	public void test() {
		EntityManager em = emf.createEntityManager();
		AddresEntryDao entryDao=em.find(AddresEntryDao.class, 1);
	}

}
