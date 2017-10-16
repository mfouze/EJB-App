
package enterprise;

import javax.naming.InitialContext;

import enterprise.Customer;

import enterprise.StatelessSession;

public class StatelessJavaClient {
	public static void main(String args[]) {
		StatelessSession sb;
		Customer c;
	        try {
			InitialContext ic = new InitialContext();
			sb = (StatelessSession) ic.lookup("enterprise.StatelessSession");
			System.out.println("Inserting Customer and Orders... " + sb.testInsert());
			// Test query and navigation
			System.out.println("Verifying that all are inserted... " + sb.verifyInsert());
			// Get a detached instance 
			c = sb.findCustomer("Bat Man");
			// Remove entity
			System.out.println("Removing entity... " + sb.testDelete(c));
			// Query the results
			System.out.println("Verifying that all are removed... " + sb.verifyDelete());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
