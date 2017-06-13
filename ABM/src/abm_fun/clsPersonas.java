package abm_fun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.text.Element;
import javax.swing.text.html.ListView;

import Model.clsBasePersona;

public class clsPersonas extends JFrame implements ActionListener {

	 private JButton btnSalir,
	 				 btnEliminar,
	 				 btnModificar;
	 
	public clsPersonas()
	{
		 super();                    // usamos el contructor de la clase padre JFrame
	     configurarVentana();        // configuramos la ventana
	     inicializarComponentes();   // inicializamos los atributos o componentes
	}
	
	private void configurarVentana()
	{
		this.setTitle("Lista de Personas");                          // colocamos titulo a la ventana
	    this.setSize(350, 310);                                 // colocamos tamanio a la ventana (ancho, alto)
	    this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
	    this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
	    this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
	}
	
	private void inicializarComponentes()
	{
		// creamos los componentes
		
		clsBasePersona persona1 = new clsBasePersona("joel","mora",20,39715645);
		clsBasePersona persona2 = new clsBasePersona("walter","martinez",21,3515645);
		clsBasePersona persona3 = new clsBasePersona("marcos","perez",20,39513645);
		ArrayList<String>items = new ArrayList();
		items.add(persona1.getNombre());
		items.add(persona2.getNombre());
		items.add(persona3.getNombre());
		 JList list = new JList(items.toArray());
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setBounds(20,10,300,200);
		list.setVisibleRowCount(-1);
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250, 80));
		btnSalir = new JButton("Atras");
		btnSalir.setBounds(15, 230, 100, 30); 					// colocamos posicion y tamanio al boton (x, y, ancho, alto)
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(125, 230, 100, 30); 					// colocamos posicion y tamanio al boton (x, y, ancho, alto)
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(235, 230, 100, 30); 					// colocamos posicion y tamanio al boton (x, y, ancho, alto)

		
		// configuramos los componentes
		btnSalir.addActionListener(this);	
		this.add(list);
		this.add(btnSalir);
		this.add(btnEliminar);
		this.add(btnModificar);
	
	}
	
	public static void main(String[] args)
	{
		clsPersonas personas = new clsPersonas();      // creamos una ventana
		personas.setVisible(true);             // hacemos visible la ventana creada
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== btnSalir)
		{
			this.dispose();
		}
	}

}
