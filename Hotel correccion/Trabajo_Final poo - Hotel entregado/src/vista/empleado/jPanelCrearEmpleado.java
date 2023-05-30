package vista.empleado;
import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import modelo.Cliente;
import modelo.Empleado;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import modelo.Empleado.Cargo;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
public class jPanelCrearEmpleado extends JPanel {
	private JTextField txt_DireccionCe;
	private JTextField txt_TelefonoCe;
	private JTextField txt_NombreCe;
	private JTextField txt_IdentificacionCe;
	private ArrayList<Empleado> auxlstEmpleado;
	JComboBox<Cargo> comboBox = new JComboBox<Cargo>();;
	
	private String Carg;
	/**
	 

* Create the panel.
	 */
	public jPanelCrearEmpleado(ArrayList<Empleado> lstEmpleado) {
		setBackground(new Color(255, 255, 255));
		this.auxlstEmpleado = lstEmpleado;
	 lanzar_componentes();
	}
	public void lanzar_componentes(){
		setLayout(new BorderLayout(0, 0));
		JLabel lblFormularioCrearEmpleado = new JLabel("FORMULARIO CREAR EMPLEADO");
		lblFormularioCrearEmpleado.setBackground(new Color(204, 204, 204));
		lblFormularioCrearEmpleado.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add(lblFormularioCrearEmpleado, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		add(panel, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNacionalidad_1 = new JLabel("Cargo\r\n");
		lblNacionalidad_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblDirrecion = new JLabel("Dirrecion");
		lblDirrecion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblIdentificacion = new JLabel("Identificacion");
		lblIdentificacion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_DireccionCe = new JTextField();
		txt_DireccionCe.setColumns(26);
		
		txt_TelefonoCe = new JTextField();
		txt_TelefonoCe.setColumns(26);
		
		txt_NombreCe = new JTextField();
		txt_NombreCe.setColumns(26);
		
		txt_IdentificacionCe = new JTextField();
		txt_IdentificacionCe.setColumns(26);
		
		
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		comboBox.setModel(new DefaultComboBoxModel(Cargo.values()));
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.setBackground(new Color(0, 153, 204));
		btnAceptar_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			crear_empleado();
			}
		});
		
	    
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAceptar_1)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDirrecion, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNacionalidad_1)
								.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIdentificacion, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txt_DireccionCe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
									.addComponent(txt_NombreCe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
								.addComponent(txt_IdentificacionCe, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
								.addComponent(txt_TelefonoCe, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
					.addGap(163))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_NombreCe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_DireccionCe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDirrecion))
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNacionalidad_1))
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_TelefonoCe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdentificacion)
						.addComponent(txt_IdentificacionCe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAceptar_1)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}

	public void crear_empleado(){
		Empleado obj = new Empleado();
		int index=-1;
		Cargo aux;
		index= comboBox.getSelectedIndex();
		aux=comboBox.getItemAt(index);
		
		obj.setNombre(this.txt_NombreCe.getText());
		obj.setDireccion(this.txt_DireccionCe.getText());
		obj.setCargo(aux);
		obj.setTelefono(Integer.parseInt(this.txt_TelefonoCe.getText()));
		obj.setIdentificcion(Integer.parseInt(this.txt_IdentificacionCe.getText()));
		if(obj!=null){
			JOptionPane.showMessageDialog(this,"fue creado el Empleado", "crear Empleado",JOptionPane.INFORMATION_MESSAGE);	
		
		}

		this.auxlstEmpleado.add(obj);
		
		txt_NombreCe.setText("");
		txt_IdentificacionCe.setText("");
		txt_DireccionCe.setText("");
		txt_TelefonoCe.setText("");
		
		
	}
}
