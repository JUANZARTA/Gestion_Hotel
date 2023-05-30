package vista.hotel;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import modelo.Empleado;
import modelo.Hotel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class jPanelEditarHotel extends JPanel {
	private JTextField txt_NombreE;
	private JTextField txt_DireccionE;
	private JTextField txt_EmailE;
	private JTextField txt_TelefonoE;
	private JTextField txt_RucE;
	private ArrayList<Hotel> aux3lstHotel;
	private JButton btnBuscar;
	private JButton btnAceptar;
	int pos=-1;
	private JTextField txt_Buscar;

	/**
	 * Create the panel.
	 */
	public jPanelEditarHotel(ArrayList<Hotel> lstHotel) {
		this.aux3lstHotel = lstHotel;
		lanzar_componentes();
	}
	public void lanzar_componentes(){

		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblEditarHotel = new JLabel("Editar Hotel");
		
		JLabel lblEditarNombre = new JLabel("Editar Nombre");
		
		txt_NombreE = new JTextField();
		txt_NombreE.setColumns(10);
		
		JLabel lblEditarDireccion = new JLabel("Editar Direccion");
		
		JLabel lblEditarEmail = new JLabel("Editar Email");
		
		JLabel lblEditarTelefono = new JLabel("Editar Telefono");
		
		JLabel lblEditarRuc = new JLabel("Editar RUC");
		
		txt_DireccionE = new JTextField();
		txt_DireccionE.setColumns(10);
		
		txt_EmailE = new JTextField();
		txt_EmailE.setColumns(10);
		
		txt_TelefonoE = new JTextField();
		txt_TelefonoE.setColumns(10);
		
		txt_RucE = new JTextField();
		txt_RucE.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setEnabled(false);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editar_Hotel();
			}
		});
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscar();
			}
		});
		
		txt_Buscar = new JTextField();
		txt_Buscar.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEditarNombre)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblEditarTelefono, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblEditarDireccion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
						.addComponent(lblEditarEmail, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEditarRuc))
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_RucE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_TelefonoE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_EmailE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_DireccionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_NombreE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEditarHotel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBuscar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(300, Short.MAX_VALUE)
					.addComponent(btnAceptar)
					.addGap(59))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEditarHotel)
							.addGap(40))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBuscar)
								.addComponent(txt_Buscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEditarNombre)
						.addComponent(txt_NombreE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEditarDireccion)
						.addComponent(txt_DireccionE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEditarEmail)
						.addComponent(txt_EmailE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEditarTelefono)
							.addGap(18)
							.addComponent(lblEditarRuc))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txt_TelefonoE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txt_RucE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addComponent(btnAceptar)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}

public int buscar(){
		
		for(int i = 0 ; i < this.aux3lstHotel.size();i++ ){
			
			if(Integer.parseInt(this.txt_Buscar.getText()) == this.aux3lstHotel.get(i).getRuc()){		
				btnBuscar.setEnabled(true);
			pos = i;
			btnAceptar.setEnabled(true);
				JOptionPane.showMessageDialog(null,"Hotel encontrado."
						,"Editar Hotel",JOptionPane.INFORMATION_MESSAGE);
		
			}
		
		}if (pos == -1 ){
			btnAceptar.setEnabled(false);
			JOptionPane.showMessageDialog(null,"Hotel no encontrado."
					,"Editar Hotel",JOptionPane.ERROR_MESSAGE);
		
	}
		return pos;
	}
	public void editar_Hotel(){
		 if(pos != -1){
		if(this.txt_NombreE.getText().length() != 0){
		this.aux3lstHotel.get(pos).setNombre(this.txt_NombreE.getText());
		}
		if(this.txt_TelefonoE.getText().length() != 0){
		this.aux3lstHotel.get(pos).setTelefono(Integer.parseInt(this.txt_TelefonoE.getText()));
		}
		if(this.txt_DireccionE.getText().length() != 0){
		this.aux3lstHotel.get(pos).setDireccion(this.txt_DireccionE.getText());
		}
		if(this.txt_EmailE.getText().length() != 0){
			this.aux3lstHotel.get(pos).setDireccion(this.txt_RucE.getText());
			}
		if(this.txt_RucE.getText().length() != 0){
			this.aux3lstHotel.get(pos).setDireccion(this.txt_RucE.getText());
			}
		if(this.txt_NombreE.getText().length() != 0 ||  this.txt_TelefonoE.getText().length() != 0
				|| this.txt_DireccionE.getText().length() != 0 ){
			//this.btnAceptar.setEnabled(false);
			JOptionPane.showMessageDialog(this,"El cliente ha sido editado", "Editar cliente",JOptionPane.INFORMATION_MESSAGE);
		}
		}
		txt_NombreE.setText("");
		txt_EmailE.setText("");
		txt_DireccionE.setText("");
		txt_TelefonoE.setText("");
		txt_RucE.setText("");
		txt_Buscar.setText("");
	}
}