package interfaze;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaAlumno extends JPanel {
	private JTextField tfDni;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfEdad;
	private JTextField tfSexo;
	private JTextField tfDivicion;

	/**
	 * Create the panel.
	 */
	public AltaAlumno() {
		setBorder(new TitledBorder(null, "Ingresar Alumno", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(7, 2, 5, 5));
		
		JLabel lblDNI = new JLabel("Ingrese su DNI");
		add(lblDNI);
		
		tfDni = new JTextField();
		add(tfDni);
		tfDni.setColumns(10);
		
		JLabel lblIngreseSuNombre = new JLabel("Ingrese su nombre");
		add(lblIngreseSuNombre);
		
		tfNombre = new JTextField();
		add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblIngreseSuApellido = new JLabel("Ingrese su apellido");
		add(lblIngreseSuApellido);
		
		tfApellido = new JTextField();
		add(tfApellido);
		tfApellido.setColumns(10);
		
		JLabel lblIngreseSuEdad = new JLabel("Ingrese su edad");
		add(lblIngreseSuEdad);
		
		tfEdad = new JTextField();
		add(tfEdad);
		tfEdad.setColumns(10);
		
		JLabel lblIngreseSuSexo = new JLabel("Ingrese su sexo");
		add(lblIngreseSuSexo);
		
		tfSexo = new JTextField();
		add(tfSexo);
		tfSexo.setColumns(10);
		
		JLabel lblIngreseSuDivicin = new JLabel("Ingrese su divici\u00F3n");
		add(lblIngreseSuDivicin);
		
		tfDivicion = new JTextField();
		add(tfDivicion);
		tfDivicion.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		add(btnBorrar);
		
		JButton btnGuardar = new JButton("Guardar");
		add(btnGuardar);

	}

}
