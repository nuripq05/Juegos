
public class Corredor extends Thread {
	private String corredor;
	private static String ganador;//para que todos los hilos compartan esta variable.
	
	public Corredor(String corredor) {
		this.corredor = corredor;
	}
	public void run () {
		try {
			System.out.println(corredor + " a salido");
			Thread.sleep((long)(Math.random()* 5000));//Aleatoriamente hace que cualquiera de los tres jugarores tarde X tiempo diferente para llegar a la meta
			System.out.println(corredor + " va por la mitad de camino");
			Thread.sleep((long)(Math.random()* 5000));
			System.out.println(corredor+ " ha finalizado la carrera");
			if (ganador == null) {
				synchronized(Corredor.class) { //para que solo un hilo pueda acceder al mensaje de ganador
					if (ganador == null) {
						ganador = corredor;
						System.out.println(corredor + " es el ganador");
					}
				}
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
