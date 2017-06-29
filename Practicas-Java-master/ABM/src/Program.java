import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Interface.intEntrada;
import Interface.intSalida;
import Model.clsContactoPersona;
import abm_fun.clsAltaPersona;
import abm_fun.clsBajaPersonas;
import abm_fun.clsImprimir;
import abm_fun.clsPersonas;

public class Program  extends JFrame implements ActionListener
{
	static JButton button1,
				   button4,
				   button5;
	clsAltaPersona alta;
	clsPersonas personas;
	
	
	public Program()
	{
		 super();                    // usamos el contructor de la clase padre JFrame
	     configurarVentana();        // configuramos la ventana
	     inicializarComponentes();   // inicializamos los atributos o componentes
	}
	
	private void configurarVentana()
	{
		this.setTitle("PracticasJem");                          // colocamos titulo a la ventana
	    this.setSize(350, 310);                                 // colocamos tamanio a la ventana (ancho, alto)
	    this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	    this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	    this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	}
	
	private void inicializarComponentes()
	{
		// creamos los componentes
		button1 = new JButton("Ingresar Usuario");
		button1.setBounds(70, 80, 200, 30); 
		button4 = new JButton("Listado de Usuarios");
		button4.setBounds(70, 120, 200, 30); 
		button5 = new JButton("Salir");
		button5.setBounds(70, 160, 200, 30); 
		    
		// configuramos los componentes
		button1.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
			
		this.add(button1);
		this.add(button4);
		this.add(button5);
	
	}
	
	public static void main(String[] args)
	{
		 Program program = new Program();      // creamos una ventana
		 program.setVisible(true);             // hacemos visible la ventana creada
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button1)
		{
			alta = new clsAltaPersona();
		    alta.show();
		}
			
		else if(e.getSource()== button4)
		{
			personas = new clsPersonas();
			personas.show();
		}
			
		else if(e.getSource()== button5)
		{
			if (JOptionPane.showConfirmDialog(new JFrame(), 
					"Seguro que desea Salir?", "Salir", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
					System.exit(0); 
		}
			
	}
	
}
