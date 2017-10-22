
package enterprise;

import javax.naming.InitialContext;



public class StatelessJavaClient {
	public static void main(String args[]) {
	        try {
			InitialContext ic = new InitialContext();
			System.out.println("Test");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
