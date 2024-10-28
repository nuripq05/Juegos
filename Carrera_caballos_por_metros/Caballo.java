
public class Caballo extends Thread {
	private String nombre;
	
	public Caballo(String nombre) {
		this.nombre=nombre;
	}
	
	public void run() {
		for(int i = 0; i < 100; i+= (int)(Math.random()* 10)) {
			System.out.println(nombre+ " lleva " + i + "metros" );
			try {
				Thread.sleep((int) (Math.random()* 1000));
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		System.out.println(nombre + " ha finalizado la carrera");
	}
}
