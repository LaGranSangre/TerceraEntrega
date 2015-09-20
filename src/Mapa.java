import java.io.*;

public class Mapa {
	private int numFil;
	private int numCol;
	private Celda [][] mapa;
	private int nivel;
	private boolean enemigo;
	
	public boolean isEnemigo() {
		return enemigo;
	}

	public void setEnemigo(boolean enemigo) {
		this.enemigo = enemigo;
	}

	public int getNumCol() {
		return numCol;
	}
	
	public void setNumCol(int numCol) {
		this.numCol = numCol;
	}
	
	public int getNumFil() {
		return numFil;
	}
	
	public void setNumFil(int numFil) {
		this.numFil = numFil;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}	
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public void setMapa(Celda[][] mapa) {
		this.mapa = mapa;
	}
	
	public Celda ObtenerCelda(int x, int y){
		return getMapa()[x][y];
	}
	
	public Mapa(){ //Crea el mapa con todas las celdas en 0
		enemigo=false;
		numFil = 12;
		numCol = 16;
		setMapa(new Celda[numFil][numCol]);
		for(int i=0;i<numFil;i++){
			//mapa[i] = new Celda[numCol];
			for(int j=0;j<numCol;j++){
				getMapa()[i][j] = new Celda();
				getMapa()[i][j].setCelda('0');
			}
		}
		nivel = 0;
	}
	
	/*public void MoverCristobal(int viejo_x,int viejo_y,Personaje Cristobal){
		//Asumiendo que solo puede moverse de espacios tipo tipoCelda>=1 && tipoCelda<=4 no se sabe de donde viene el cuy
		//otro atributo del personaje!
		Celda[][] temp=this.getMapa();
				
		//temp[viejo_x][viejo_y].setCelda(Cristobal.getPos_anterior().getCelda());
		temp[viejo_x][viejo_y].setCelda('a');
		temp[Cristobal.getPosY()][Cristobal.getPosX()].setCelda('A');
	}
	
	public void MoverHermana(int viejo_x,int viejo_y,Personaje Hermana){
		//Asumiendo que solo puede moverse de espacios tipo tipoCelda>=1 && tipoCelda<=4 no se sabe de donde viene el cuy
		//otro atributo del personaje!
		Celda[][] temp=this.getMapa();
				
		//temp[viejo_x][viejo_y].setCelda(Cristobal.getPos_anterior().getCelda());
		temp[viejo_x][viejo_y].setCelda('b');
		temp[Hermana.getPosY()][Hermana.getPosX()].setCelda('B');
	}
	*/
	
	
	public void EliminaRata(){
		int i, j;
		for(i=0;i<numFil;i++){
			for(j=0;j<numCol;j++)
				if(this.isEnemigo())
					this.mapa[i][j].setTipo(4);			
		}
	}
	
	
	public void MostrarMapa(int xC, int yC, int xH, int yH){
		
		
		System.out.println("============================");
		System.out.println("MATRIZ DE CARACTERES");
		System.out.println("============================");
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++){
				if (j==xC && i==yC)
					System.out.print("A ");
				else if((j==xH && i==yH))
					System.out.print("B ");
				else
					System.out.print(mapa[i][j].getCelda() + " ");
				}
			System.out.println();
		}
		/*System.out.println();
		System.out.println("============================");
		System.out.println("MATRIZ DE TIPOS");
		System.out.println("============================");
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++)
				System.out.print(mapa[i][j].getTipo() + " ");
			System.out.println();
		}*/
	}

}