import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String popcornFlavor = JOptionPane.showInputDialog("What type of popcorn do you want?");
	String minutes = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
	//converting from string to int
	Popcorn p = new Popcorn(popcornFlavor);
	Microwave m = new Microwave();
	m.putInMicrowave(p);
	m.setTime(22222); //< using int from jopt
	m.startMicrowave();
}
}
