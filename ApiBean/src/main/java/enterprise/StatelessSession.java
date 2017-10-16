package enterprise;

import javax.ejb.Remote;

import enterprise.Customer;
/**
 * The API of the entity bean.
 */
@Remote
public interface AdministrationClient {
	String addUsers(Client c);
	String removeUser();
	String updatdeuser();
}
