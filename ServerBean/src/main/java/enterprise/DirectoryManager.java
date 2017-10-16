package enterprise;

import java.sql.SQLException;
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
	 private static final String JPQL_SELECT_BY_MAIL = "SELECT * FROM AUCTION_CLIENT WHERE mail=:MAIL";
	 private static final String PARAM_MAIL= "MAIL";

	/**
	 * the reference to the entity manager, which persistence context is "pu1".
	 */
	@PersistenceContext(unitName = "pu1")
	private EntityManager em;

	@Override
	public Client addClient(Client c) {
		
		try {
			if(findClient(c.getMail())) {
			System.out.println("Le client "+c.getNom() +" "+c.getPrenom() +" est déja inscrit");
			
			}else {
				em.persist(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public void removeClient(Client c) {
		
		try {
			if(findClient(c.getMail())) {
			System.out.println("Le client "+c.getNom() +" "+c.getPrenom() +" n'est inscrit");
			
			}else {
				em.remove(c);
				System.out.println("le client "+c.getNom()+" "+ c.getPrenom() +" a ete bien supprime");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
	
	//fonction interne 
	
	private boolean findClient(String mail) throws SQLException {
		Client c=null;
		Query requete = em.createQuery( JPQL_SELECT_BY_MAIL );
        requete.setParameter( PARAM_MAIL, mail );
        
        try {
        	
        	c= (Client)requete.getSingleResult();
        }catch(Exception e) {
            throw new SQLException( e );

        }
		return (c==null) ? false : true ;
		
	}

}
