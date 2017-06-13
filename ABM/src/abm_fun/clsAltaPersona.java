package abm_fun;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Interface.intEntrada;
import Model.clsBasePersona;
import Model.clsContactoPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class clsAltaPersona extends JFrame implements ActionListener
{
	private clsBasePersona Persona;
	private JTextField tfDni,
					   tfNombre,
					   tfApellido,
					   tfEdad;
	 private JButton btnSalir,
	 				 btnGuardar;
	 private JLabel lbTitle,
	 				lbDni,
	 				lbNombre,
	 				lbApellido,
	 				lbEdad;
	 JFrame frame;

	public clsAltaPersona()
	{
		 super();                    // usamos el contructor de la clase padre JFrame
	     configurarVentana();        // configuramos la ventana
	     inicializarComponentes();   // inicializamos los atributos o componentes
	}
	
	private void configurarVentana()
	{
		this.setTitle("Nuevo Usuario");                          // colocamos titulo a la ventana
	    this.setSize(350, 310);                                 // colocamos tamanio a la ventana (ancho, alto)
	    this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	    this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	    this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	}
	
	private void inicializarComponentes()
	{
		// creamos los componentes
		lbTitle = new JLabel();		
		lbTitle.setText("ALTA DE USUARIOS");    				// colocamos un texto a la etiqueta
		lbTitle.setBounds(130, 10, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		
		lbDni = new JLabel();		
		lbDni.setText("Ingrese DNI");    					// colocamos un texto a la etiqueta
		lbDni.setBounds(30, 50, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		tfDni = new JTextField();								
		tfDni.setBounds(130, 50, 200, 30); 						// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		
		lbNombre = new JLabel();		
		lbNombre.setText("Ingrese Nombre");    					// colocamos un texto a la etiqueta
		lbNombre.setBounds(30, 90, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		tfNombre = new JTextField();
		tfNombre.setBounds(130, 90, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		
		lbApellido = new JLabel();		
		lbApellido.setText("Ingrese Apellido");    					// colocamos un texto a la etiqueta
		lbApellido.setBounds(30, 130, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		tfApellido = new JTextField();
		tfApellido.setBounds(130, 130, 200, 30); 				// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		
		lbEdad = new JLabel();		
		lbEdad.setText("Ingrese Edad");    					// colocamos un texto a la etiqueta
		lbEdad.setBounds(30, 170, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		tfEdad = new JTextField();
		tfEdad.setBounds(130, 170, 200, 30); 					// colocamos posicion y tamanio a la caja (x, y, ancho, alto)
		
		btnSalir = new JButton("Atras");
		btnSalir.setBounds(60, 230, 100, 30); 					// colocamos posicion y tamanio al boton (x, y, ancho, alto)
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(190, 230, 100, 30); 				// colocamos posicion y tamanio al boton (x, y, ancho, alto)
		    
		// configuramos los componentes
		btnSalir.addActionListener(this);
		btnGuardar.addActionListener(this);
			
		this.add(lbTitle);
		this.add(lbDni);
		this.add(tfDni);
		this.add(lbNombre);
		this.add(tfNombre);
		this.add(lbApellido);
		this.add(tfApellido);
		this.add(lbEdad);
		this.add(tfEdad);
		this.add(btnSalir);
		this.add(btnGuardar);
	
	}
	
	public static void main(String[] args)
	{
		clsAltaPersona alta = new clsAltaPersona();      // creamos una ventana
		alta.setVisible(true);             // hacemos visible la ventana creada
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== btnSalir)
		{
			this.dispose();
		}
			   
		else if(e.getSource()== btnGuardar)
		{
			System.out.println("2");
		}
				
	}
	
	


}
