
public class Personaje {
	private String nombre;
	private int posX;
	private int posY;
	private Celda pos_anterior;
	
<<<<<<< HEAD
	/*public Personaje(){
		
	}*/
=======
>>>>>>> origin/master
	
	public Celda getPos_anterior() {
		return pos_anterior;
	}

	public void setPos_anterior(Celda pos_anterior) {
		this.pos_anterior = pos_anterior;
	}

	public Personaje(){
<<<<<<< HEAD
		this.nombre="nuevo";
		this.posX=0;
		this.posY=0;
=======
>>>>>>> origin/master
		this.pos_anterior=new Celda();
	}
	
	public Personaje(int posX, int posY){
		this.setPosX(posX);
		this.setPosY(posY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
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

class PersonajePrincipal extends Personaje{
	
	private static int vida = 10;
	
	public PersonajePrincipal(){
		
	}
	
	public void reducir_vida_movimiento(){
		setVida(getVida()-1);
	}
	
	public static int getVida() {
		return vida;
	}

	public static void setVida(int vida) {
		PersonajePrincipal.vida = vida;
	}
	
	public void Imprimir(){
		System.out.println(vida);
		super.Imprimir();
	}
	
	
	
}

class Enemigo extends Personaje{
	public Enemigo(){
		
	}

	public void Imprimir(){
		super.Imprimir();
	}
}

