package mn.iotstar.dao;

import javax.naming.spi.DirectoryManager;

import org.eclipse.tags.shaded.org.apache.xalan.transformer.KeyManager;

public class UsersDao_22162032 {
	 private DirectoryManager entityManager;

	    public Users findById(int id) {
	        return KeyManager.find(Users.class, id);
	    }

	    public List<Users> findAll() {
	        return entityManager.createQuery("FROM Users", Users.class).getResultList();
	    }

	    public void save(Users user) {
	        entityManager.persist(user);
	    }

	    public void update(Users user) {
	        entityManager.merge(user);
	    }

	    public void delete(int id) {
	        Users user = findById(id);
	        if (user != null) {
	            entityManager.remove(user);
	        }
	    }
}
