package enterprise;

import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * The stateless session bean.
 */
@Stateless
public class DirectoryManager implements AdministrationClient {

	/**
	 * the reference to the entity manager, which persistence context is "pu1".
	 */
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;

	@Override
	public Client addClient(Client c) {
		
		
		return null;
	}

	@Override
	public void removeClient(Client c) {
		
		
	}

	@Override
	public Client updatdeClientRights(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getClientRights(Client c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Objet addObjet(Objet o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteObjet(Objet o) {
		// TODO Auto-generated method stub
		
	}

}
