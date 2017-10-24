package enterprise;

import javax.ejb.Stateless;

@Stateless
public class AuctionManager implements AdministrationEnchere {

	@Override
	public void startAuction() {
		// TODO Auto-generated method stub
		System.out.println("L'enchere a commencé");
	}

	@Override
	public void closeAuction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBid() {
		// TODO Auto-generated method stub
		
	}

}
