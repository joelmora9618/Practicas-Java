package interfaze;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;

public class PanelMenu extends JPanel implements ActionListener{

	JButton btnAlta,
			btnBaja,
			btnModificacion,
			btnListar,
			btnSalir;
	AltaAlumno alta;
	
	/**
	 * Create the panel.
	 */
	public PanelMenu(JButton btnAlta,JButton btnBaja,JButton btnModificacion,JButton btnListar,JButton btnSalir)
	{
		this.btnAlta = btnAlta;
		this.btnBaja = btnBaja;
		this.btnModificacion = btnModificacion;
		this.btnListar = btnListar;
		this.btnSalir = btnSalir;
		
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Practica ABM Rest", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setLayout(new GridLayout(6, 1, 5, 5));
		
		JLabel lblMenuPrincipal = new JLabel("Menu principal");
		lblMenuPrincipal.setFont(new Font("Segoe UI Black", Font.BOLD, 26));
		lblMenuPrincipal.setForeground(Color.RED);
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMenuPrincipal);
		
		btnAlta = new JButton("Ingresar Alumno");
		btnAlta.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(btnAlta);
		
		btnBaja = new JButton("Eliminar Alumno");
		btnBaja.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(btnBaja);
		
		btnModificacion = new JButton("Modificar Alumno");
		btnModificacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(btnModificacion);
		
		btnListar = new JButton("Lista de Alumnos");
		btnListar.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(btnListar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(btnSalir);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== btnAlta)
			
		
		if(e.getSource()== btnBaja)
			System.out.println("2");
		if(e.getSource()== btnModificacion)
			System.out.println("3");
		if(e.getSource()== btnListar)
			System.out.println("4");
		if(e.getSource()== btnSalir)
			System.out.println("5");
	}

}
