package vista.empleado;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import modelo.Cliente;
import modelo.Empleado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JComboBox;

public class jPanelEditarEmpleado extends JPanel {
	private JTextField txt_NombreE;
	private JTextField txt_TelefonoE;
	private JTextField txt_DireccionE;
    private ArrayList<Empleado> aux3lstEmpleado;
    private JTextField txt_Buscar;
    private JTextField txt_IdentificacionE;
   private JButton btnBuscar;
    private JButton btnAceptar;
    int pos= -1;
	/**
	 * Create the panel.
	 */
	public jPanelEditarEmpleado(ArrayList<Empleado> lstEmpleado) {
	     lanzar_componentes();
		this.aux3lstEmpleado = lstEmpleado;
	}
	public void lanzar_componentes(){
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFormularioEditarCliente = new JLabel("Formulario Editar Cliente");
		lblFormularioEditarCliente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblFormularioEditarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFormularioEditarCliente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		add(panel, BorderLayout.CENTER);
		
		txt_NombreE = new JTextField();
		txt_NombreE.setColumns(10);
		
		txt_TelefonoE = new JTextField();
		txt_TelefonoE.setColumns(10);
		
		JLabel lblNombre = new JLabel("Editar Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_DireccionE = new JTextField();
		txt_DireccionE.setColumns(10);
		
		JLabel lblDirrecion = new JLabel("Editar Direccion");
		lblDirrecion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNacionalidad = new JLabel("cargo");
		lblNacionalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblTelefono = new JLabel("Editar Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setEnabled(false);
		btnAceptar.setBackground(new Color(0, 153, 204));
		btnAceptar.setFont(new Font("Arial", Font.BOLD, 15));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editar_Empleado();
			}
		});
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			buscar();
			
			}
		});
		
		txt_Buscar = new JTextField();
		txt_Buscar.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblIdentificacion = new JLabel("Identificacion");
		lblIdentificacion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_IdentificacionE = new JTextField();
		txt_IdentificacionE.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBuscar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(283, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(61, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblDirrecion)
									.addGap(92)))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblTelefono, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNacionalidad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblIdentificacion)
							.addGap(110)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_IdentificacionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txt_DireccionE, Alignment.TRAILING)
							.addComponent(txt_NombreE, Alignment.TRAILING)
							.addComponent(txt_TelefonoE, Alignment.TRAILING)
							.addComponent(comboBox, Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnAceptar))))
					.addGap(110))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(txt_NombreE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDirrecion)
								.addComponent(txt_DireccionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNacionalidad)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(23)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelefono)
								.addComponent(txt_TelefonoE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBuscar)
							.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIdentificacion)
						.addComponent(txt_IdentificacionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(btnAceptar)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);

	}

	public int buscar(){
		
		for(int i = 0 ; i < this.aux3lstEmpleado.size();i++ ){
			
			if(Integer.parseInt(this.txt_Buscar.getText()) == this.aux3lstEmpleado.get(i).getIdentificcion()){		
				btnBuscar.setEnabled(true);
			pos = i;
			btnAceptar.setEnabled(true);
				JOptionPane.showMessageDialog(null,"Cliente encontrado."
						,"Editar cliente",JOptionPane.INFORMATION_MESSAGE);
		
			}
		
		}if (pos == -1 ){
			btnAceptar.setEnabled(false);
			JOptionPane.showMessageDialog(null,"Empleado no encontrado."
					,"Editar empleado",JOptionPane.ERROR_MESSAGE);
		
	}
		return pos;
	}
	
	public void editar_Empleado(){
		 
		if(this.txt_NombreE.getText().length() != 0){
		this.aux3lstEmpleado.get(pos).setNombre(this.txt_NombreE.getText());
		}
		if(this.txt_TelefonoE.getText().length() != 0){
		this.aux3lstEmpleado.get(pos).setTelefono(Integer.parseInt(this.txt_TelefonoE.getText()));
		}
		if(this.txt_DireccionE.getText().length() != 0){
		this.aux3lstEmpleado.get(pos).setDireccion(this.txt_DireccionE.getText());
		}
		if(this.txt_IdentificacionE.getText().length() != 0){
		this.aux3lstEmpleado.get(pos).setIdentificcion(Integer.parseInt(this.txt_IdentificacionE.getText()));
		}
		
		if(this.txt_NombreE.getText().length() != 0 ||  this.txt_TelefonoE.getText().length() != 0
				|| this.txt_DireccionE.getText().length() != 0 || this.txt_IdentificacionE.getText().length() != 0 ){
			//this.btnAceptar.setEnabled(false);
			JOptionPane.showMessageDialog(this,"El cliente ha sido editado", "Editar cliente",JOptionPane.INFORMATION_MESSAGE);
		}
		
		txt_NombreE.setText("");
		txt_IdentificacionE.setText("");
		txt_DireccionE.setText("");
		txt_TelefonoE.setText("");
		txt_Buscar.setText("");
	}

}
