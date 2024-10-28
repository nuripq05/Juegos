
public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caballo[] caballos = {new Caballo("Caballo 1"),
				new Caballo("Caballo 2"),
				new Caballo("Caballo 3"),
				new Caballo("Caballo 4")
				
		};
		
		for(Caballo caballo: caballos) {
			caballo.start();
		}
				
	}

}
