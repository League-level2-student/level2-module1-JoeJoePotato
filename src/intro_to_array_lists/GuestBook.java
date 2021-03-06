package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame=new JFrame("GuestBook.com");
JPanel panel=new JPanel();
JButton guests=new JButton("view geusts");
JButton add=new JButton("add a guest");

ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
	GuestBook g=new GuestBook();
g.book();
}
public void book() {
frame.setVisible(true);
guests.addActionListener(this);
add.addActionListener(this);
panel.add(guests);
panel.add(add);
frame.add(panel);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton j=(JButton)e.getSource();
	if(j==add) {
	String s=JOptionPane.showInputDialog("enter a name");
	names.add(s);
	}else{
		for(int i = 0; i < names.size(); i++){
			String q = names.get(i);
			System.out.println("Guest "+(i+1)+" is "+q);
		}
	}}
}
