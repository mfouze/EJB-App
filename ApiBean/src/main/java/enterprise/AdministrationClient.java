package enterprise;

import javax.ejb.Remote;
/**
 * The API of the entity bean.
 */
@Remote
public interface AdministrationClient {
	//Ajouter un Client
	public Client addClient(Client c);
	//supprimer un Client
	public void removeClient(Client c);
	//mettre à jour un les droits d'un client
	public Client updatdeClientRights(Client c);
	//recuperer les droits d'un client
	public int getClientRights(Client c);
	
	//ajouter un objet 
	public Objet addObjet(Objet o);
	//supprimer un objet
	public void deleteObjet(Objet o);
	
	
	 
	
	
}
