package enterprise;

import javax.ejb.Remote;

@Remote
public interface AdministrationEnchere {
	
	//Commencer les encheres
	public void startAuction();
	//Fermer une enchere 
	public void closeAuction();
	//Envoyer Offre
	public void sendBid();

}
