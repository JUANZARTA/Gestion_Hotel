package vista.cliente;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import vista.cliente.jDialogCliente;
import modelo.Cliente;
import vista.cliente.jPanelCrearCliente;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class jPanelEditarCliente extends JPanel {
	private JTextField txt_NombreE;
	private JTextField txt_NacionalidadE;
	private JTextField txt_TelefonoE;
	private JTextField txt_DireccionE;
    private ArrayList<Cliente> aux3lstCliente;
    private JTextField txt_Buscar;
    private JTextField txt_IdentificacionE;
    private JButton btnAceptar;
    private JButton btnBuscar;
    int pos=-1;
	/**
	 * Create the panel.
	 */
	public jPanelEditarCliente(ArrayList<Cliente> lstCliente) { 
		lanzar_componentes();
	     
		this.aux3lstCliente = lstCliente;
	}
	
	 /**
	  * 
	  * */
	public void lanzar_componentes(){
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblFormularioEditarCliente = new JLabel("Formulario Editar Cliente");
		lblFormularioEditarCliente.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFormularioEditarCliente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblFormularioEditarCliente, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		add(panel, BorderLayout.CENTER);
		
		txt_NombreE = new JTextField();
		txt_NombreE.setColumns(10);
		
		txt_NacionalidadE = new JTextField();
		txt_NacionalidadE.setColumns(10);
		
		txt_TelefonoE = new JTextField();
		txt_TelefonoE.setColumns(10);
		
		JLabel lblNombre = new JLabel("Editar Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_DireccionE = new JTextField();
		txt_DireccionE.setColumns(10);
		
		JLabel lblDirrecion = new JLabel("Editar Direccion");
		lblDirrecion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblNacionalidad = new JLabel("Editar Nacionalidad");
		lblNacionalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblTelefono = new JLabel("Editar Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		
		 btnAceptar = new JButton("Aceptar");
		 btnAceptar.setEnabled(false);
		btnAceptar.setBackground(new Color(0, 153, 204));
		btnAceptar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editar_cliente();
				
			}
		});
		
		 btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			buscar();
			//Activar_boton();
			
			}
		});
		
		txt_Buscar = new JTextField();
		txt_Buscar.setColumns(10);
		
		JLabel lblEditarIdentificscion = new JLabel("Editar Identificscion");
		lblEditarIdentificscion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_IdentificacionE = new JTextField();
		txt_IdentificacionE.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(btnBuscar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblEditarIdentificscion)
									.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
								.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
								.addComponent(lblNacionalidad, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
								.addComponent(lblTelefono)
								.addComponent(lblDirrecion))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(txt_IdentificacionE, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAceptar))
									.addGap(66))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txt_TelefonoE, Alignment.LEADING)
										.addComponent(txt_DireccionE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
										.addComponent(txt_NacionalidadE, Alignment.LEADING)
										.addComponent(txt_NombreE, Alignment.LEADING))
									.addContainerGap(64, Short.MAX_VALUE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(txt_NombreE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addComponent(lblDirrecion))
						.addComponent(txt_DireccionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNacionalidad)
						.addComponent(txt_NacionalidadE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefono)
						.addComponent(txt_TelefonoE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEditarIdentificscion)
						.addComponent(txt_IdentificacionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAceptar)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}
public int buscar(){
		
		for(int i = 0 ; i < this.aux3lstCliente.size();i++ ){
		
			if(Integer.parseInt(this.txt_Buscar.getText()) == this.aux3lstCliente.get(i).getIdentificcion()){		
				btnBuscar.setEnabled(true);
			pos = i;
			btnAceptar.setEnabled(true);
				JOptionPane.showMessageDialog(null,"Cliente encontrado."
						,"Editar cliente",JOptionPane.INFORMATION_MESSAGE);
		
			}
		
		}if (pos == -1 ){
			btnAceptar.setEnabled(false);
			JOptionPane.showMessageDialog(null,"Cliente no encontrado."
					,"Editar cliente",JOptionPane.ERROR_MESSAGE);
		
	}
		return pos;
		
		} 
public void editar_cliente(){
	 if(pos != -1){
		 
	if(this.txt_NombreE.getText().length() != 0){
	this.aux3lstCliente.get(pos).setNombre(this.txt_NombreE.getText());
	}
	if(this.txt_NacionalidadE.getText().length() != 0){
		
	this.aux3lstCliente.get(pos).setNacionalidad(this.txt_NacionalidadE.getText());
	}
	if(this.txt_TelefonoE.getText().length() != 0){
	this.aux3lstCliente.get(pos).setTelefono(Integer.parseInt(this.txt_TelefonoE.getText()));
	}
	if(this.txt_DireccionE.getText().length() != 0){
	this.aux3lstCliente.get(pos).setDireccion(this.txt_DireccionE.getText());
	}
	if(this.txt_IdentificacionE.getText().length() != 0){
	this.aux3lstCliente.get(pos).setIdentificcion(Integer.parseInt(this.txt_IdentificacionE.getText()));
	}
	 }
	if(this.txt_NombreE.getText().length() != 0 || this.txt_NacionalidadE.getText().length() != 0 || this.txt_TelefonoE.getText().length() != 0
			|| this.txt_DireccionE.getText().length() != 0 || this.txt_IdentificacionE.getText().length() != 0 ){
		//this.btnAceptar.setEnabled(false);
		JOptionPane.showMessageDialog(this,"El cliente ha sido editado", "Editar cliente",JOptionPane.INFORMATION_MESSAGE);
	}
	
	txt_NombreE.setText("");
	txt_IdentificacionE.setText("");
	txt_DireccionE.setText("");
	txt_TelefonoE.setText("");
	txt_NacionalidadE.setText("");
	txt_Buscar.setText("");
	
	pos = -1;
}
}
