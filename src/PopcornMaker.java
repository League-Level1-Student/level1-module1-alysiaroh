import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("What would you like the flavor of the popcorn to be?");
    String b = JOptionPane.showInputDialog("and how long do you want to cook it?");
    Popcorn p = new Popcorn(a);
	Microwave m = new Microwave();
	m.putInMicrowave(p);
	int c = Integer.parseInt(b);
	m.setTime(c);
	m.startMicrowave();
	
}
}
