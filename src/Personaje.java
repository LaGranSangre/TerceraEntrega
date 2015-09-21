
public abstract class Personaje implements Mostrable{
	private String nombre;
	private int posX;
	private int posY;
	private Celda posAnterior;	
	//private static int vida = 10;
	
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
	
	/*public void Imprimir(){
		System.out.println("Nombre: " + getNombre() + " PosX: " + getPosX() + " PosY: " + getPosY());
	}*/

	//Para el polimorfismo -> Metodo abstracto para saber si esta vivo el personaje o el enemigo
	public abstract boolean estaVivo(); 
	
	/*public void reducir_vida_movimiento(){
		setVida(getVida()-1);
	}
	
	public static int getVida() {
		return vida;
	}

	public static void setVida(int vida) {
		Personaje.vida = vida;
	}
	
	public void Imprimir(){
		System.out.println(getVida());
		//super.Imprimir();
	}*/
}

class PersonajePrincipal extends Personaje implements Mostrable{
	
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
		//this.vida = vida;
	}
	
	public void Imprimir(){
		System.out.println(vida);
		//super.Imprimir();
	}
	
	public boolean estaVivo(){
		if(vida<=0) return false;
		else return true;
	}
	
	public void mostrarMensaje(){
		System.out.println("ESTAMOS EN PERSONAJE PRINCIPAL");
	}
}

class Enemigo extends Personaje implements Mostrable{
	public Enemigo(){
		
	}

	public void Imprimir(){
		//super.Imprimir();
	}
	
	public boolean estaVivo(){
		if(-1<=0) return false;
		else return true;
	}
}

