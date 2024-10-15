import java.util.*;

public class Torres {
	
	int[] torre1;
	int[] torre2;
	int[] torre3;
	
	int n_fichas =3;
	
	int ficha_en_mano = 0;
	
	Scanner scan;
	
	boolean victoria = true;
	
	public Torres(int pa) {
		 n_fichas = pa;
	}
	
	void Start() {
		torre1 = new int[n_fichas];
		
		torre2 = new int[n_fichas];

		torre3 = new int[n_fichas];
		
		scan = new Scanner (System.in);
		
		torre1[0] = 1;
		torre2[1] = 1;
		torre3[2] = 1;

		for(int i = 0; i < n_fichas; i++) {
			torre1[i] = i + 1;
			torre2[i] = 0;
			torre3[i] = 0;
		}
		
		scan = new Scanner (System.in);
			
		/*int a = 0;
		while (a < n_fichas) {
			torre1[a]=1;
			a++;
		}*/		
	}
	
	void Pintar() {
		for (int i = 0; i < n_fichas; i++) {
			
			System.out.println(torre1[i]);
		}
		System.out.print("\n");
		for (int i = 0; i < n_fichas; i++) {
			
			System.out.println(torre2[i]);
		}
		System.out.print("\n");
		for (int i = 0; i < n_fichas; i++) {
			
			System.out.println(torre3[i]);
		}
		System.out.print("\n");
		System.out.print("Ficha en mano" + ficha_en_mano);
			
	}

	void TurnoSacarFicha() {
		System.out.println("Selecciona una torre para sacar ficha. 1/2/3");
		int input_usuario = 0;
		input_usuario=scan.nextInt();
		
		if (input_usuario == 1) {
			
			for (int posiciondelatorre = 0; posiciondelatorre < n_fichas;posiciondelatorre++) {
				
				if(torre1[posiciondelatorre] != 0) {
					
					if (ficha_en_mano == 0) {
					ficha_en_mano = torre1[posiciondelatorre];
					torre1[posiciondelatorre] = 0;
					}
				}
			}
		}
		else if (input_usuario == 2) {
			for (int posiciondelatorre = 0; posiciondelatorre < n_fichas;posiciondelatorre++) {
				
				if(torre2[posiciondelatorre] != 0) {
					
					if (ficha_en_mano == 0) {
					ficha_en_mano = torre1[posiciondelatorre];
					torre2[posiciondelatorre] = 0;
					}
				}
			}
		}
		else if (input_usuario == 3) {
			for (int posiciondelatorre = 0; posiciondelatorre < n_fichas;posiciondelatorre++) {
				
				if(torre3[posiciondelatorre] != 0) {
					
					if (ficha_en_mano == 0) {
					ficha_en_mano = torre1[posiciondelatorre];
					torre3[posiciondelatorre] = 0;
					}
				}
			}
		}
		
	}
	
    boolean TurnoPonerFicha()
    { 
        System.out.println("Selecciona una torre para poner ficha. 1 / 2 / 3");
        int input_usuario = 0;
        input_usuario = scan.nextInt();

        switch(input_usuario)
        {
            case 1:
                for(int sitio = n_fichas - 1; sitio >= 0; sitio--)
                {
                    if(torre1[sitio] == 0)
                    {
                        if(sitio != n_fichas - 1)
                        {
                            if(torre1[sitio + 1] > ficha_en_mano)
                            {
                                torre1[sitio] = ficha_en_mano;
                                ficha_en_mano = 0;
                                return true;
                            }
                        }
                        else
                        {
                            torre1[sitio] = ficha_en_mano;
                            ficha_en_mano = 0;
                            return true;
                        }
                    }
                }
            break;
            case 2:
                for(int sitio = n_fichas - 1; sitio >= 0; sitio--)
                {
                    if(torre2[sitio] == 0)
                    {
                        if(sitio != n_fichas - 1)
                        {
                            if(ficha_en_mano < torre2[sitio + 1])
                            {
                                torre2[sitio] = ficha_en_mano;
                                ficha_en_mano = 0;
                                return true;
                            } 
                        }
                        else
                        {
                            torre2[sitio] = ficha_en_mano;
                            ficha_en_mano = 0;
                            return true;
                        }

                    }
                }
            break;
            case 3:
                for(int sitio = n_fichas - 1; sitio >= 0; sitio--)
                {
                    if(torre3[sitio] == 0)
                    {
                        if(sitio != n_fichas - 1)
                        {
                            if(ficha_en_mano < torre3[sitio + 1])
                            {
                                torre3[sitio] = ficha_en_mano;
                                ficha_en_mano = 0;
                                return true;
                            } 
                        }
                        else
                        {
                            torre3[sitio] = ficha_en_mano;
                            ficha_en_mano = 0;
                            return true;
                        }
                    }
                }
            break;
        }

        return false;
    }

    void ComprobarVictoria()
    {
        if(torre2[0] != 0 || torre3[0] != 0)
        {
            victoria = true;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Torres t = new Torres(3);
		t.Start();
		while(true) {
			t.Pintar();
			t.TurnoSacarFicha();
			t.Pintar();
			while(t.TurnoPonerFicha() == false){
				t.Pintar();
			}
			
		}
		
	}

}
