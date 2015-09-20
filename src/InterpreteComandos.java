import java.util.Scanner;

public class InterpreteComandos {
	
	public InterpreteComandos(){	
	}
	
	public void revisarTrigger(Mapa mapa,int x,int y){	
		if(mapa.getMapa()[y][x].getCelda()=='T'){
			for(int i=0;i<mapa.getNumFil();++i) 
				if(mapa.getMapa()[i][x].getCelda()=='T')
					mapa.getMapa()[i][x].setCelda('N');				
			mapa.setEnemigo(true);
		}
	}
	
	public void InterpretarAccion(char key, PersonajePrincipal cristobal, PersonajePrincipal hermana, Mapa mapa){
		int x, y, xH, yH, tipoCelda, numFil, numCol;
		java.lang.Character.toLowerCase(key);  //cambio el caracter a minusculas
		//POSICION DE CRISTOBAL
		x = cristobal.getPosX();//posicion de cristobal
		y = cristobal.getPosY();
		//POSICION DE HERMANA
		xH = hermana.getPosX();
		yH = hermana.getPosY();
		
		numFil = mapa.getNumFil();//limites del mapa
		numCol = mapa.getNumCol();
		switch(key){
		case 'w':	//Mover arriba
		case 'W':			
			if (y>=1 && y<numFil){
				tipoCelda = mapa.getMapa()[y-1][x].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){	
					--y;
					cristobal.setPosY(y);
				}
			}
			break;
		case 's': //Mover abajo
		case 'S':			
			if (y>=0 && y<numFil-1){
				tipoCelda = mapa.getMapa()[y+1][x].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					y++;
					cristobal.setPosY(y);
				}
			}
			break;
		case 'd': //Mover derecha
		case 'D':			
			if (x>=0 && x<numCol-1){
				tipoCelda = mapa.getMapa()[y][x+1].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					x++;
					cristobal.setPosX(x);
				}					
			}
			break;
		case 'a'://Mover izquierda	
		case 'A':					
			if (x>=1 && x<numCol){
				tipoCelda = mapa.getMapa()[y][x-1].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					x--;
					cristobal.setPosX(x);
				}
			}						
			break;
		
			//MOVER HERMANA
					case 'i':	//Mover arriba
					case 'I':						
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (yH>=1 && yH<numFil){
							tipoCelda = mapa.getMapa()[yH-1][xH].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){	
								--yH;
								hermana.setPosY(yH);								
							}
						}
						revisarTrigger(mapa, xH, yH);
						break;
					case 'k': //Mover abajo
					case 'K':						
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (yH>=0 && yH<numFil-1){
							tipoCelda = mapa.getMapa()[yH+1][xH].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								yH++;
								hermana.setPosY(yH);
							}
						}
						revisarTrigger(mapa, xH, yH);
						break;
					case 'l': //Mover derecha
					case 'L':						
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (xH>=0 && xH<numCol-1){
							tipoCelda = mapa.getMapa()[yH][xH+1].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								xH++;
								hermana.setPosX(xH);								
							}					
						}
						revisarTrigger(mapa, xH, yH);						
						break;
					case 'j'://Mover izquierda	
					case 'J':						
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (xH>=1 && xH<numCol){
							tipoCelda = mapa.getMapa()[yH][xH-1].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								xH--;
								hermana.setPosX(xH);
							}
						}
						revisarTrigger(mapa, xH, yH);
						break;
		}
	}
	public void InterpretarComandoEspecial(String key, String comando, Personaje personaje, Mapa mapa){
		if (comando.compareTo(key)==0){			
		}
	}
}