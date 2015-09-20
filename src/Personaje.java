
public class Personaje implements Mostrable{
	private String nombre;
	private int posX;
	private int posY;
	private Celda posAnterior;	
	
	public Celda getposAnterior() {
		return posAnterior;
	}

	public void setposAnterior(Celda posAnterior) {
		this.posAnterior = posAnterior;
	}

	public Personaje(){
		this.nombre="nuevo";
		this.posX=0;
		this.posY=0;
		this.posAnterior=new Celda();
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

class PersonajePrincipal extends Personaje implements Mostrable {
	
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

class Enemigo extends Personaje implements Mostrable{
	public Enemigo(){
		
	}

	public void Imprimir(){
		super.Imprimir();
	}
}

