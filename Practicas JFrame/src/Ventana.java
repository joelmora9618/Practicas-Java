
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener{
	
	JButton button1,button2,button3;
	
	public Ventana()
	{
		setTitle("Ventana");
		setBounds(400,130,500,500);
		Container content = getContentPane();
	    button1 = new JButton(new ImageIcon("button1.png"));
	    button2 = new JButton(new ImageIcon("button1.png"));
	    button3 = new JButton(new ImageIcon("button1.png"));
		content.setLayout(new GridLayout(2,2));
		content.add(button1);
		content.add(button2);
		content.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[]args)
	{
		Ventana v = new Ventana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== button1)
			System.out.println("1");
		if(e.getSource()== button2)
			System.out.println("2");
		if(e.getSource()== button3)
			System.out.println("3");
		
	}
}
