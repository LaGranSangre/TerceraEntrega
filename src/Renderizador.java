import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Renderizador {
	private Celda[][] mapaAMostrar;
	private String[]nombresHistorias={"Historia1.txt","","Historia3.txt","Historia4.txt"};
	private String[][]historia;
	
	public Renderizador(){
		CargarHistorias();
	}
	
	public void mostrarMapa(Mapa m,Personaje p1,Personaje p2){
		int xC=p1.getPosX(),yC=p1.getPosY();
		int xH=p2.getPosX(),yH=p2.getPosY();
		generarMapaAMostrar(m);
		limpiarPantalla();
		System.out.println("============================");
		System.out.println("MATRIZ DE CARACTERES");
		System.out.println("============================");
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		for(int i=0;i<m.getNumFil();i++){
			for(int j=0;j<m.getNumCol();j++){
				if (j==xC && i==yC)
					System.out.print("A ");
				else if((j==xH && i==yH))
					System.out.print("B ");
				else
					System.out.print(impresionCelda(m.getMapa()[i][j])+" ");
			}
			System.out.println();
		}				
	}	

	public char impresionCelda(Celda c){
		return (char)(c.getCelda());
	}
	
	private final static void limpiarPantalla()
	{
	    for(int i=0;i<25;i++)
			System.out.println("");
	}
	
	public void generarMapaAMostrar(Mapa m){
		int numFil=m.getNumFil();
		int numCol=m.getNumCol();
		mapaAMostrar=new Celda[numFil][numCol];
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++){
				mapaAMostrar[i][j]=m.getMapa()[i][j];
			}
		}
	}
	
	public int PantallaInicio(){
		char opcion;
		//Muestra bienvenida
		System.out.println("*********Bienvenido al Juego*********");
		System.out.println("*********El Valioso Cristobal*********");
		System.out.println("\n\nPulse cualquier tecla para continuar....");
		//Se lee cualquier entrada para continuar
		//AQUI HAY QUE CORREGIR TMB PARA QUE SE APRETE SIN ENTER.
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		while(true){
			//Muestra bienvenida
			System.out.println("Ingrese una de las siguientes opciones:");
			System.out.println("(a) Iniciar Juego");
			System.out.println("(b) Salir");
			//lee la opcion ingresada
			str = s.nextLine();
			if(str.length()==1 ){ //Si se ingreso un caracter			
				opcion = str.charAt(0);
				java.lang.Character.toLowerCase(opcion);
				if (opcion=='a'|| opcion=='A')
					return 1;
				if (opcion=='b' || opcion=='B'){
					while(true){
						System.out.println("¿Está seguro de que desea salir del juego?");
						System.out.println("[Y/N] (Y: Sí, N: No)");
						str = s.nextLine();
						if(str.length()==1 ){
							opcion = str.charAt(0);
							java.lang.Character.toLowerCase(opcion);
							if(opcion=='y'|| opcion=='Y')
								return 0;
							if(opcion=='n'|| opcion=='N')
								break;											
						}
						System.out.println("La opción ingresada no es válida");
					}
				}
				else
					System.out.println("La opción ingresada no es válida");
			}
			else		
				System.out.println("La opción ingresada no es válida");
		}
	}
	

	public void mostrarAccionDuo(int nivel, int posCX, int posHX){
		String clave="";
		switch (nivel){
		case 0:
			clave = "WSIKDDLL";
			break;
		case 1:
			if(posCX==5 && posHX==5)
				clave = "IWOELD";
			else 
				clave = "WUOQEI";
			break;
		case 2:
			clave ="LDOEQUOE";				
			break;
		}
		System.out.println("Presione las teclas: " + clave);
	}
	
	public void mostrarAccionCristobal(int nivel){
		switch (nivel){
		case 0:
			System.out.println("Persione las teclas: WDEWW");
			break;			
		case 1: 	
			System.out.println("Persione las teclas: QWEASD");  
			break;			
		case 2:
			System.out.println("Presione las teclas: WQED");
			break;
		}		
	}
	public void mostrarAccionHermana(){
		System.out.println("Presione las teclas: IUOL");
	}
	public void mostrarHistoria1(){
		limpiarPantalla();
		mostrarHistoria(0);
	}

	public void mostrarHistoria2(){
		limpiarPantalla();
	}
	
	public void mostrarHistoria(int numNivel){
		limpiarPantalla();
		if(nombresHistorias[numNivel].length()!=0){
			for(int i=0;historia[numNivel][i].length()!=0;i++){
				System.out.println(historia[numNivel][i]);
				for(int j=0;j<5;j++)
					for(int k=0;k<1000000000;k++);;
			}
		}
	}
	
	public void CargarHistorias(){ //Constructor de mapa
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    historia=new String[nombresHistorias.length][50];
	    for(int i=0;i<nombresHistorias.length;i++){
			try{
				if(nombresHistorias[i].length()==0)continue;
				
				archivo =  new File(nombresHistorias[i]);
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				int fila = 0;
				while((linea=br.readLine())!=null){
					historia[i][fila]=linea;
					fila++;
				}
				historia[i][fila]="";
			}catch(Exception e){
		         e.printStackTrace();
			}finally{
		        try{                    
		           if( null != fr ){   
		              fr.close();     
		           }                  
		        }catch (Exception e2){ 
		           e2.printStackTrace();
		        }
		   }
	    }
	}
	
	public void mostrarInstr(String[] instr){
		limpiarPantalla();		
			for(int i=0;instr[i].length()!=0;i++){
				System.out.println(instr[i]);
				for(int j=0;j<5;j++)
					for(int k=0;k<1000000000;k++);;
			}		
	}
	
	public void CargarInstrucciones(){ 
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String[] instr = new String[50];	    
			try{								
				archivo =  new File("Instrucciones.txt");
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				int fila = 0;
				while((linea=br.readLine())!=null){
					instr[fila]=linea;
					fila++;
				}
				instr[fila]="";
				mostrarInstr(instr);
				System.out.println("Pulse cualquier tecla para continuar....");
				Scanner s = new Scanner(System.in);
				String str;
				str = s.nextLine();
			}catch(Exception e){
		         e.printStackTrace();
			}finally{
		        try{                    
		           if( null != fr ){   
		              fr.close();     
		           }                  
		        }catch (Exception e2){ 
		           e2.printStackTrace();
		        }
		   }
	    
	}
}