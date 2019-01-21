package extra;


import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	public static void main(String[] args) {
		new BinaryConverter().createUI();
			
		}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField textField = new JTextField(20);
JLabel label = new JLabel();
JButton button = new JButton();
private void createUI() {
	frame.add(panel);
	frame.setTitle("Convert 8 bits of binary to ASCII");
	panel.add(textField);
	
	
	panel.add(button);
	button.addMouseListener(this);
	button.setText("convert");
	panel.add(label);

	frame.setVisible(true);
	frame.pack();
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==button) {
		String c = convert(textField.getText());
		System.out.println(c);
		label.setText(c);
		frame.pack();
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
