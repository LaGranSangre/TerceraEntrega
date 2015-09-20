
public class Objeto {
	private String nombre;
	private int posX;
	private int posY;
	
	public Objeto(){
		
	}
	
	public Objeto(String nombre, int posX, int posY){
		this.setNombre(nombre);
		this.setPosX(posX);
		this.setPosY(posY);
	}

	private int getPosX() {
		return posX;
	}

	private void setPosX(int posX) {
		this.posX = posX;
	}

	private int getPosY() {
		return posY;
	}

	private void setPosY(int posY) {
		this.posY = posY;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public void Imprimir(){
		System.out.println("Nombre: " + getNombre() + " PosX: " + getPosX() + " PosY: " + getPosY());
	}
	
}

class ObjObstaculo extends Objeto{
	
	public ObjObstaculo(){
		
	}	
	
}

class ObjDeApoyo extends Objeto{
	
	public ObjDeApoyo(){
		
	}
}
