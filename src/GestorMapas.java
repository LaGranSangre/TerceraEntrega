import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class GestorMapas {
	private List<String>nombresMapas;
	
	public GestorMapas(){
		nombresMapas = new ArrayList<String>();
		for(int i=1;i<=3;i++){
			String nombre = "mapa";
			nombre = nombre + i;
			nombre = nombre + ".txt";
			nombresMapas.add(nombre);
			nombre = "";
		}
	}
	
	public void CargarMapa(Mapa mapa, Personaje cristobal, Personaje hermana){ //Constructor de mapa
		char celda;
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    int nivel = mapa.getNivel();
		try{
			archivo =  new File(nombresMapas.get(nivel));
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			//Lectura del archivo de texto
			String linea;
			int fila = 0;
			while((linea=br.readLine())!=null){
				for(int index=0;index<linea.length();index++){
					mapa.getMapa()[fila][index].setCelda(linea.charAt(index));
					mapa.getMapa()[fila][index].setTipo(linea.charAt(index));
					celda = mapa.getMapa()[fila][index].getCelda();
					if(celda=='A'){						//Posicion inicial de cristobal
						cristobal.setPosX(index);		//guardo en cristobal sus coordenadas iniciales
						cristobal.setPosY(fila);	
						mapa.getMapa()[fila][index].setCelda('S');
						mapa.getMapa()[fila][index].setTipo('S');
						//cristobal.getPos_anterior().setCelda(linea.charAt(index));
						//cristobal.getPos_anterior().setTipo(linea.charAt(index));
						}
					if(celda=='B'){//le hermana						
						hermana.setPosX(index);
						hermana.setPosY(fila);
						mapa.getMapa()[fila][index].setCelda('N');
						mapa.getMapa()[fila][index].setTipo('N');
						//hermana.getPos_anterior().setCelda(linea.charAt(index));
						//hermana.getPos_anterior().setTipo(linea.charAt(index));
						}
				}
				fila++;
			}
		}catch(Exception e){
	         e.printStackTrace();
		}finally{
	        // En el finally cerramos el fichero, para asegurarnos
	        // que se cierra tanto si todo va bien como si salta 
	        // una excepcion.
	        try{                    
	           if( null != fr ){   
	              fr.close();     
	           }                  
	        }catch (Exception e2){ 
	           e2.printStackTrace();
	        }
	   }
	}
	
	public void remover_enemigo(Mapa map){		
		for(int i=0;i<map.getNumFil();++i)
			for(int j=0;j<map.getNumCol();++j)
<<<<<<< HEAD
				if(map.getMapa()[i][j].getCelda()=='E'){
					map.getMapa()[i][j].setCelda('N');
					map.getMapa()[i][j].setTipo('N');
				}
=======
				if(map.getMapa()[i][j].getCelda()=='E')
					map.getMapa()[i][j].setCelda('N');							
>>>>>>> origin/master
	}
}
