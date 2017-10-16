package enterprise;

import javax.ejb.Remote;
/**
 * The API of the entity bean.
 */
@Remote
public interface AdministrationClient {
	//Ajouter un Client
	String addClient(Client c);
	String removeClient(Client c);
	String updatdeClient(Client c);
	
}
