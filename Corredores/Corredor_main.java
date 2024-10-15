
public class Corredor_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread c1 = new Thread (new Corredor ("Juan"));
		Thread c2 = new Thread (new Corredor ("Mario"));
		Thread c3 = new Thread (new Corredor ("Ernesto"));
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (Exception e) {
			
		}
	}

}
