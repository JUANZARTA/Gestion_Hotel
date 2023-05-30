package vista.cliente;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import modelo.Cliente;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
public class jPanelCrearCliente extends JPanel {
	private JTextField txt_NombreC;
	private JTextField txt_NacionalidadC;
	private JTextField txt_TelefonoC;
	private JTextField txt_DireccionC;
	private JTextField txt_IdentificacionC;
	private JLabel lblNacionalidad_1;
	private ArrayList<Cliente> aux2LstCliente;
	/**
	 * Create the panel.
	 */
	public jPanelCrearCliente(ArrayList<Cliente> lstCliente) {
		this.aux2LstCliente = lstCliente;
		lanzar_componentes();
	}

	public void lanzar_componentes(){
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFormularioCrearCliente = new JLabel("FORMULARIO CREAR CLIENTE");
		lblFormularioCrearCliente.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFormularioCrearCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFormularioCrearCliente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		add(panel, BorderLayout.CENTER);
		
		txt_NombreC = new JTextField();
		txt_NombreC.setColumns(26);
		
		txt_NacionalidadC = new JTextField();
		txt_NacionalidadC.setColumns(26);
		
		txt_TelefonoC = new JTextField();
		txt_TelefonoC.setColumns(26);
		
		txt_DireccionC = new JTextField();
		txt_DireccionC.setColumns(26);
		
		txt_IdentificacionC = new JTextField();
		txt_IdentificacionC.setColumns(26);
		
		lblNacionalidad_1 = new JLabel("Nacionalidad");
		lblNacionalidad_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblDirrecion = new JLabel("Dirrecion");
		lblDirrecion.setFont(new Font("Arial", Font.PLAIN, 14));
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		JLabel lblIdentificacion = new JLabel("Identificacion");
		lblIdentificacion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBackground(new Color(0, 153, 204));
		btnAceptar.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crear_cliente();
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAceptar))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(98)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
										.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNacionalidad_1)
										.addComponent(lblDirrecion, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblIdentificacion, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addGap(43)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txt_NombreC, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addComponent(txt_NacionalidadC, 0, 0, Short.MAX_VALUE)
								.addComponent(txt_TelefonoC, 0, 0, Short.MAX_VALUE)
								.addComponent(txt_IdentificacionC, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
								.addComponent(txt_DireccionC, 0, 0, Short.MAX_VALUE))))
					.addGap(135))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txt_NombreC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDirrecion)
						.addComponent(txt_DireccionC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNacionalidad_1)
						.addComponent(txt_NacionalidadC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(txt_TelefonoC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdentificacion)
						.addComponent(txt_IdentificacionC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAceptar)
					.addGap(43))
		);
		panel.setLayout(gl_panel);
	}
	
	public void crear_cliente(){
		Cliente obj = new Cliente();
		
		obj.setNombre(this.txt_NombreC.getText());
		obj.setDireccion(this.txt_DireccionC.getText());
		obj.setNacionalidad(this.txt_NacionalidadC.getText());
		obj.setTelefono(Integer.parseInt(this.txt_TelefonoC.getText()));
		obj.setIdentificcion(Integer.parseInt(this.txt_IdentificacionC.getText()));
		if(obj!=null){//si el cliente tiene nombre e identificacion cuenta como valido
			JOptionPane.showMessageDialog(this,"fue creado el cliente", "crear cliente",JOptionPane.INFORMATION_MESSAGE);	
		
		}
		
		
		
		
		this.aux2LstCliente.add(obj);
		txt_NombreC.setText("");
		txt_IdentificacionC.setText("");
		txt_DireccionC.setText("");
		txt_TelefonoC.setText("");
		txt_NacionalidadC.setText("");
	}
}
