import javax.swing.*;
import java.awt.event.*;
class MiVentana extends JFrame {
 public MiVentana() {
 setSize(400, 400);
 setTitle("Titulo de la Ventana");
 setVisible(true);
 addWindowListener(new MiObservadorVentana(this));
 addKeyListener(new MiObservadorTeclado());
 }
}
class MiObservadorVentana implements WindowListener {
 MiVentana refVentana;
 public MiObservadorVentana(MiVentana refVentana) {
 this.refVentana = refVentana;
 }
 public void windowActivated(WindowEvent e) {
 }
 public void windowClosed(WindowEvent e) {
 }
 public void windowClosing(WindowEvent e) {
 refVentana.dispose();
 System.exit(0);
 }
 public void windowDeactivated(WindowEvent e) {
 }
 public void windowDeiconified(WindowEvent e) {
 }
 public void windowIconified(WindowEvent e) {
 }
 public void windowOpened(WindowEvent e) {
 }
}
class MiObservadorTeclado implements KeyListener {
 public void keyTyped(KeyEvent e) {
 displayInfo(e, "KEY TYPED: ");
 }
 public void keyPressed(KeyEvent e) {
 displayInfo(e, "KEY PRESSED: ");
 }
 public void keyReleased(KeyEvent e) {
 displayInfo(e, "KEY RELEASED: ");
 }
 private void displayInfo(KeyEvent e, String s){
	 
	 String charString, keyCodeString, modString, tmpString;
	 char c = e.getKeyChar();
	 int keyCode = e.getKeyCode();
	 int modifiers = e.getModifiers();
	 if (Character.isISOControl(c)) {
	 charString = "key character = "
	 + "(an unprintable control character)";
	 } else {
	 charString = "key character = '"
	 + c + "'";
	 }
	 keyCodeString = "key code = " + keyCode
	 + " ("
	 + KeyEvent.getKeyText(keyCode)
	 + ")";
	 modString = "modifiers = " + modifiers;
	 tmpString = KeyEvent.getKeyModifiersText(modifiers);
	 if (tmpString.length() > 0) {
	 modString += " (" + tmpString + ")";
	 } else {
	 modString += " (no modifiers)";
	 }
	 System.out.println(s + "\n"
	 + " " + charString + "\n"
	 + " " + keyCodeString + "\n"
	 + " " + modString);
	 }
	} 
