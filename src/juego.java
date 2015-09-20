import java.util.Scanner;

public class juego {
<<<<<<< HEAD
	private PersonajePrincipal cristobal;
	private PersonajePrincipal hermana;
=======
	private static PersonajePrincipal cristobal;
	private static PersonajePrincipal hermana;
>>>>>>> origin/master
	private GestorMapas gestor;
	private Mapa mapa_actual;
	private InterpreteComandos Interprete;
	private Renderizador Rend;
<<<<<<< HEAD
	private boolean jugando = false;

	public juego() {
		cristobal = new PersonajePrincipal();
		hermana = new PersonajePrincipal();
		gestor = new GestorMapas();
		mapa_actual = new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal, hermana);// carga el mapa
															// inicial
		Interprete = new InterpreteComandos();
		Rend = new Renderizador();
		// aqui se añade el metodo de gestor que llena el mapa con informacion
		// del archivo
		// de texto
	}

	public int PantallaInicio() {
		System.out
				.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nIngrese su nombre de jugador: ");
		Scanner s = new Scanner(System.in);
		String str;
		str = s.nextLine();
		System.out.println();
		System.out.println();
		Rend.mostrarHistoria1();
		System.out.println();
		System.out
				.println("Bienvenido " + str + " que te diviertas jugando :)");
		System.out.println();
		return Rend.PantallaInicio();
	}
	//Mod2-Ini
	public int MatarEnemigo(String str, int nivel) {
		int tipoMapa = mapa_actual.getNivel();
		Scanner s = new Scanner(System.in);
		String str_1;
		switch (nivel) {
		case 0:
			if (str.compareTo("WDEWW") == 0 || str.compareTo("wdeww") == 0) {
				mapa_actual.setEnemigo(false);
				gestor.remover_enemigo((mapa_actual));
				return 1;
			}
		case 1:
			if (str.compareTo("ASDW") == 0 || str.compareTo("asdw") == 0) {
				mapa_actual.setEnemigo(false);
								
				cristobal.setPosY(cristobal.getPosY() - 1);				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);
				str_1 = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY() - 1);				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);
				str_1 = s.nextLine();
				
				gestor.remover_enemigo((mapa_actual));
				
				cristobal.setPosY(cristobal.getPosY() + 1);				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);
				str_1 = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY() + 1);				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);				
				
				return 1;
			}
		}
		return 0;
	}
	//Mod2-Fin

	public int AccionDiversa(String str) {
		if (str.compareTo("WQED") == 0 || str.compareTo("wqed") == 0) {
			Scanner s = new Scanner(System.in);
			cristobal.setPosX(cristobal.getPosX() + 1);
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);
			str = s.nextLine();
			cristobal.setPosX(cristobal.getPosX() + 1);
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);
			return 1;
		}
		return 0;
	}

	public int AccionHermana(String str) {
		if (str.compareTo("IUOL") == 0 || str.compareTo("iuol") == 0) {
			Scanner s = new Scanner(System.in);
			hermana.setPosX(hermana.getPosX() + 1);
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);
			str = s.nextLine();
			hermana.setPosX(hermana.getPosX() + 1);
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);
			return 1;
		}
		return 0;
	}

	public void AccionDuo(Mapa mapaActual) {
		int tipoMapa = mapaActual.getNivel();
		Scanner s = new Scanner(System.in);
		String str;

		switch (tipoMapa) {
		case 0:
			cristobal.setPosX(cristobal.getPosX() - 1);
			cristobal.setPosY(cristobal.getPosY() - 1);
			hermana.setPosX(hermana.getPosX() - 1);
			hermana.setPosY(hermana.getPosY() + 1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			// cristobal.setPosX(cristobal.getPosX()-1);
			cristobal.setPosY(cristobal.getPosY() - 1);
			// hermana.setPosX(hermana.getPosX()-1);
			hermana.setPosY(hermana.getPosY() + 1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() + 1);
			// cristobal.setPosY(cristobal.getPosY()-1);
			hermana.setPosX(hermana.getPosX() + 1);
			// hermana.setPosY(hermana.getPosY()+1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() + 3);
			// cristobal.setPosY(cristobal.getPosY()-1);
			hermana.setPosX(hermana.getPosX() + 3);
			// hermana.setPosY(hermana.getPosY()+1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() + 1);
			// cristobal.setPosY(cristobal.getPosY()-1);
			hermana.setPosX(hermana.getPosX() + 1);
			// hermana.setPosY(hermana.getPosY()+1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() - 1);
			cristobal.setPosY(cristobal.getPosY() + 2);
			hermana.setPosX(hermana.getPosX() - 1);
			hermana.setPosY(hermana.getPosY() - 2);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			break;

		case 1:
			if (cristobal.getPosX() == 5 && hermana.getPosX() == 5) {
				cristobal.setPosX(cristobal.getPosX() - 1);
				cristobal.setPosY(cristobal.getPosY() - 1);
				hermana.setPosX(hermana.getPosX() - 1);
				hermana.setPosY(hermana.getPosY() + 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 1);
				// cristobal.setPosY(cristobal.getPosY()-1);
				hermana.setPosX(hermana.getPosX() + 1);
				// hermana.setPosY(hermana.getPosY()+1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 2);
				// cristobal.setPosY(cristobal.getPosY()-1);
				hermana.setPosX(hermana.getPosX() + 2);
				// hermana.setPosY(hermana.getPosY()+1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 1);
				// cristobal.setPosY(cristobal.getPosY()-1);
				hermana.setPosX(hermana.getPosX() + 1);
				// hermana.setPosY(hermana.getPosY()+1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() - 1);
				cristobal.setPosY(cristobal.getPosY() + 2);
				hermana.setPosX(hermana.getPosX() - 1);
				hermana.setPosY(hermana.getPosY() - 2);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();
			} else {
				// cristobal.setPosX(cristobal.getPosX()-1);
				cristobal.setPosY(cristobal.getPosY() - 1);
				// hermana.setPosX(hermana.getPosX()-1);
				hermana.setPosY(hermana.getPosY() + 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 1);
				// cristobal.setPosY(cristobal.getPosY()-1);
				hermana.setPosX(hermana.getPosX() + 1);
				// hermana.setPosY(hermana.getPosY()+1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() - 1);
				cristobal.setPosY(cristobal.getPosY() - 2);
				hermana.setPosX(hermana.getPosX() - 1);
				hermana.setPosY(hermana.getPosY() - 2);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 1);
				// cristobal.setPosY(cristobal.getPosY()-1);
				hermana.setPosX(hermana.getPosX() + 1);
				// hermana.setPosY(hermana.getPosY()+1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosY(cristobal.getPosY() - 1);
				hermana.setPosY(hermana.getPosY() - 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosY(cristobal.getPosY() - 1);
				hermana.setPosY(hermana.getPosY() - 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosY(cristobal.getPosY() - 3);
				cristobal.setPosX(cristobal.getPosX() + 1);
				hermana.setPosY(hermana.getPosY() - 3);
				hermana.setPosX(hermana.getPosX() + 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosX(cristobal.getPosX() + 1);
				hermana.setPosX(hermana.getPosX() + 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();

				cristobal.setPosY(cristobal.getPosY() + 2);
				cristobal.setPosX(cristobal.getPosX() - 1);
				hermana.setPosY(hermana.getPosY() - 2);
				hermana.setPosX(hermana.getPosX() - 1);

				Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra
																	// el mapa
																	// luego de
																	// cada
																	// cambio
				str = s.nextLine();
			}
			break;

		case 2:
			// cristobal.setPosX(cristobal.getPosX()-1);
			cristobal.setPosY(cristobal.getPosY() - 1);
			// hermana.setPosX(hermana.getPosX()-1);
			hermana.setPosY(hermana.getPosY() + 1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() + 1);
			// cristobal.setPosY(cristobal.getPosY()-1);
			hermana.setPosX(hermana.getPosX() + 1);
			// hermana.setPosY(hermana.getPosY()+1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			cristobal.setPosX(cristobal.getPosX() + 3);
			// cristobal.setPosY(cristobal.getPosY()-1);
			hermana.setPosX(hermana.getPosX() + 3);
			// hermana.setPosY(hermana.getPosY()+1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			str = s.nextLine();

			mapa_actual.EliminaRata();

			// cristobal.setPosX(cristobal.getPosX()+3);
			cristobal.setPosY(cristobal.getPosY() - 1);
			// hermana.setPosX(hermana.getPosX()+3);
			hermana.setPosY(hermana.getPosY() - 1);

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);// se muestra el
																// mapa luego de
																// cada cambio
			Rend.mostrarHistoria(3);
			jugando = false;
		}
	}

	public void enviar_comando(char comando) {
		Interprete.InterpretarAccion(comando, cristobal, hermana, mapa_actual);
	}

	public boolean VerificarAccionDuo() {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String clave = "";
		String clave_min = "";
		int nivel = mapa_actual.getNivel();

		switch (nivel) {
		case 0:
			clave = "WSIKDDLL";
			clave_min = "wsikddll";
			break;
		case 1:
			if (cristobal.getPosX() == 5 && hermana.getPosX() == 5) {
				clave = "IWOELD";
				clave_min = "iwoeld";
			} else {
				clave_min = "wuoqei";
				clave = "WUOQEI";
			}
			break;
		case 2:
			clave_min = "ldoequoe";
			clave = "LDOEQUOE";
			break;
		}
		return (str.equals(clave) || str.equals(clave_min));
	}

	public void Jugar() {
		while (true) {
			if (EmpezarJuego() == 0)
				break;
		}
	}

	public int EmpezarJuego() {
		int opcion;
		if (PantallaInicio() == 0) // Salir del juego
			return 0;

		Scanner s = new Scanner(System.in);
		String str;
		jugando = true;
		while (true) {
			if (cristobal.getVida() <= 0) {
				System.out.println("GAME OVER!! FIN DEL JUEGO");
				this.FinalizarJuego();
				return 1;
			}

			int posCX = cristobal.getPosX(), posCY = cristobal.getPosY(), posHX = hermana
					.getPosX(), posHY = hermana.getPosY();

			Rend.mostrarMapa(mapa_actual, cristobal, hermana);

			int tipoCeldaH = mapa_actual.getMapa()[posHY][posHX].getTipo(), tipoCeldaC = mapa_actual
					.getMapa()[posCY][posCX].getTipo();

			if (tipoCeldaC == 1 && tipoCeldaH == 1) { // tipo 1 : 'D'
				while (true) {
					Rend.mostrarAccionDuo(mapa_actual.getNivel(),
							cristobal.getPosX(), hermana.getPosX());
					if (!jugando)
						break;
					if (VerificarAccionDuo()) {
						AccionDuo(mapa_actual);
						break;
					} else {
						cristobal.setVida(cristobal.getVida() - 2);
						if (cristobal.getVida() <= 0) {
							System.out.println("GAME OVER!! FIN DEL JUEGO");
							this.FinalizarJuego();
							return 1;
						}
					}
				}
				if (!jugando) {
					this.FinalizarJuego();
					return 1;
				}
			}

			if (mapa_actual.getNivel() == 0 && mapa_actual.isEnemigo() == true
					&& tipoCeldaC == 2) {
				while (true) {
					Rend.mostrarAccionCristobal(mapa_actual.getNivel());
					str = s.nextLine();
					if (MatarEnemigo(str,mapa_actual.getNivel()) == 1)
						break;
				}
			}
			//#Mod2-Fin
			if (mapa_actual.getNivel() == 1 && mapa_actual.isEnemigo() == true
					&& tipoCeldaC == 2) {
				while (true) {
					Rend.mostrarAccionCristobal(mapa_actual.getNivel());
					str = s.nextLine();
					if (MatarEnemigo(str, mapa_actual.getNivel()) == 1)
						break;
				}
			}
			//#Mod2-Fin

			if (mapa_actual.getNivel() == 2 && tipoCeldaC == 2) {
				while (true) {
					Rend.mostrarAccionCristobal(mapa_actual.getNivel());
					str = s.nextLine();
					if (AccionDiversa(str) == 1)
						break;
				}
			}
			if (mapa_actual.getNivel() == 2 && tipoCeldaH == 2) {
				while (true) {
					Rend.mostrarAccionHermana();
					str = s.nextLine();
					if (AccionHermana(str) == 1)
						break;
				}
			}
			str = s.nextLine();
			if (str.length() == 1) {
				enviar_comando(str.charAt(0));

				// Si llega al final del nivel
				if ((posCX == (mapa_actual.getNumCol() - 1))
						&& (posHX == posCX)) {
					mapa_actual.setNivel(mapa_actual.getNivel() + 1);
					Rend.mostrarHistoria(mapa_actual.getNivel());
					gestor.CargarMapa(mapa_actual, cristobal, hermana);// carga
																		// el
																		// mapa
																		// siguiente
					Rend.mostrarMapa(mapa_actual, cristobal, hermana);
				}

=======
	
	public juego(){
		cristobal=new PersonajePrincipal();
		hermana=new PersonajePrincipal();
		gestor=new GestorMapas();
		mapa_actual=new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal,hermana);//carga el mapa inicial
		Interprete=new InterpreteComandos();
		Rend=new Renderizador();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	
	
	public int PantallaInicio(){
		Rend.mostrarHistoria1();
		return Rend.PantallaInicio();
	}
	
	public int MatarEnemigo(String str){
		str.toUpperCase();
			
		if(str.compareTo("WDEWW")==0 || str.compareTo("wdeww")==0){
			mapa_actual.setEnemigo(false);
			gestor.remover_enemigo((mapa_actual));
			return 1;
		}
		return 0;
	}
	
	public void AccionDuo(Mapa mapaActual){
		int tipoMapa = mapaActual.getNivel();
		Scanner s = new Scanner(System.in);	
		String str;
				
		switch (tipoMapa){
		case 0:
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			//cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();		
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+3); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+3); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()+2);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()-2);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			break;
		
		case 1:
			if(cristobal.getPosX()==5 && hermana.getPosX()==5){
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
									
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+2); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+2); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()+2);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()-2);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
			}
			else{
				//cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-1);		
				//hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
									
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-2);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()-2);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				 
				cristobal.setPosY(cristobal.getPosY()-1);						
				hermana.setPosY(hermana.getPosY()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()-1);						
				hermana.setPosY(hermana.getPosY()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()-3);
				cristobal.setPosX(cristobal.getPosX()+1);
				hermana.setPosY(hermana.getPosY()-3);
				hermana.setPosX(hermana.getPosX()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				
				cristobal.setPosX(cristobal.getPosX()+1);				
				hermana.setPosX(hermana.getPosX()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()+2);
				cristobal.setPosX(cristobal.getPosX()-1);
				hermana.setPosY(hermana.getPosY()-2);
				hermana.setPosX(hermana.getPosX()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
>>>>>>> origin/master
			}
			break;
			
		case 2:
			//cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();		
			
			cristobal.setPosX(cristobal.getPosX()+3); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+3); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			mapa_actual.EliminaRata();
			
			//cristobal.setPosX(cristobal.getPosX()+3); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()+3); 
			hermana.setPosY(hermana.getPosY()-1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
		
		}
	}
<<<<<<< HEAD

	public void FinalizarJuego() {
		// reinicializar variables
		jugando = false;
		PersonajePrincipal.setVida(10);
		cristobal = new PersonajePrincipal();
		hermana = new PersonajePrincipal();
		gestor = new GestorMapas();
		mapa_actual = new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal, hermana);
		Interprete = new InterpreteComandos();
		Rend = new Renderizador();
	}

	public static void main(String args[]) {

		juego game = new juego();
		/*
		 * Mapa m = new Mapa(); GestorMapas gm = new GestorMapas();
		 * 
		 * m.MostrarMapa(); m.setNivel(2); gm.CargarMapa(m, cristobal);
		 * m.MostrarMapa();
		 */
		game.Jugar();

=======
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal,hermana, mapa_actual);
	}


	public boolean VerificarAccionDuo(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();		
		String clave="";
		String clave_min="";
		int nivel = mapa_actual.getNivel();
		
		switch (nivel){
			case 0:
				clave = "WSIKDDLL";
				clave_min="wsikddll";
				break;
			case 1:
				if(cristobal.getPosX()==5 && hermana.getPosX()==5){
					clave = "IWOELD";
					clave_min="iwoeld";
				}
				else {
					clave_min="wuoqei";
					clave = "WUOQEI";
				}
				break;
			case 2:
				clave_min="ldoequoe";
				clave ="LDOEQUOE";				
				break;
		}
		return (str.equals(clave)||str.equals(clave_min));
	}

	
	public void Jugar(){
		while(true){
			EmpezarJuego();
		}
	}
	
	public void EmpezarJuego(){
		int opcion;
		if(this.PantallaInicio()==0) //Salir del juego
			return;

		
		Scanner s = new Scanner(System.in);		
		String str;
		while(true){
			if(cristobal.getVida()<=0){
				System.out.println("GAME OVER!! FIN DEL JUEGO");
				this.FinalizarJuego();
				return;
			}
			int posCX = cristobal.getPosX(), posCY = cristobal.getPosY(), posHX = hermana.getPosX(), posHY = hermana.getPosY();
			
			this.Rend.mostrarMapa(this.mapa_actual,cristobal,hermana);
			
			int tipoCeldaH = this.mapa_actual.getMapa()[posHY][posHX].getTipo(), tipoCeldaC = this.mapa_actual.getMapa()[posCY][posCX].getTipo();  
			
			if(tipoCeldaC==1 && tipoCeldaH==1){ //tipo 1 : 'D'
				while(true){
					this.Rend.mostrarAccionDuo(this.mapa_actual.getNivel(), cristobal.getPosX(), hermana.getPosX());
					if(this.VerificarAccionDuo()){
						this.AccionDuo(this.mapa_actual);
						break;
					}
					else{
						cristobal.setVida(cristobal.getVida()-2);
						if(cristobal.getVida()<=0){
							System.out.println("GAME OVER!! FIN DEL JUEGO");
							this.FinalizarJuego();
							return;
						}
					}
				}
			}

					
							 
			if(this.mapa_actual.isEnemigo()==true && tipoCeldaC==2){
				while(true){
					this.Rend.mostrarAccionCristobal();
					str=s.nextLine();
					if(this.MatarEnemigo(str)==1)break;
				}				
			}
			str= s.nextLine();
			if(str.length()==1 ){
				this.enviar_comando(str.charAt(0));

			
			//Si llega al final del nivel
			if((posCX==(this.mapa_actual.getNumCol()-1)) && (posHX==posCX)){							
				this.mapa_actual.setNivel(this.mapa_actual.getNivel()+1);
				this.Rend.mostrarHistoria(this.mapa_actual.getNivel());
				this.gestor.CargarMapa(this.mapa_actual, cristobal,hermana);//carga el mapa siguiente
				this.Rend.mostrarMapa(this.mapa_actual, cristobal, hermana);
			}		

			}
		}
		
	}
	
	public void FinalizarJuego(){
		//reinicializar variables
		PersonajePrincipal.setVida(10);
		cristobal=new PersonajePrincipal();
		hermana=new PersonajePrincipal();
		gestor=new GestorMapas();
		mapa_actual=new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal,hermana);
		Interprete=new InterpreteComandos();
		Rend=new Renderizador();
	}
	
	public static void main(String args[]) {
		
		juego game=new juego();
		/*Mapa m = new Mapa();		
		GestorMapas gm = new GestorMapas();
		
		m.MostrarMapa();
		m.setNivel(2);
		gm.CargarMapa(m, cristobal);
		m.MostrarMapa();*/
		game.Jugar();
		
>>>>>>> origin/master
	}
}
