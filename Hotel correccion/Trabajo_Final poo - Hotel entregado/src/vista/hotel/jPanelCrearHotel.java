package vista.hotel;

import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import vista.hotel.jDialogHotel;

import modelo.Cliente;
import modelo.Hotel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class jPanelCrearHotel extends JPanel {
	
	private ArrayList<Hotel> auxlstHotel;
	private ArrayList<Hotel> aux2lstHotel;
	private JTextField txt_NombreCh;
	private JTextField txt_DireccionCh;
	private JTextField txt_EmailCh;
	private JTextField txt_TelefonoCh;
	private JTextField txt_RucCh;

	/**
	 * Create the panel.
	 */
	public jPanelCrearHotel(ArrayList<Hotel> lstHotel){
		setBackground(new Color(255, 255, 255));
		this.aux2lstHotel=lstHotel;
		lanzar_componentes();
	}
	/**/
	public void lanzar_componentes(){
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		
		JLabel lblCrearHotel = new JLabel("Crear Hotel");
		lblCrearHotel.setFont(new Font("Arial", Font.BOLD, 15));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(164)
					.addComponent(lblCrearHotel)
					.addContainerGap(204, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(lblCrearHotel)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crear_cliente();
				
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setBackground(new Color(0, 153, 204));
		
		JLabel lblNewLabel = new JLabel("Nombre\r\n");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel lblRuc = new JLabel("Ruc");
		lblRuc.setFont(new Font("Arial", Font.PLAIN, 14));
		
		txt_NombreCh = new JTextField();
		txt_NombreCh.setColumns(10);
		
		txt_DireccionCh = new JTextField();
		txt_DireccionCh.setColumns(10);
		
		txt_EmailCh = new JTextField();
		txt_EmailCh.setColumns(10);
		
		txt_TelefonoCh = new JTextField();
		txt_TelefonoCh.setColumns(10);
		
		txt_RucCh = new JTextField();
		txt_RucCh.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(1)
								.addComponent(lblRuc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addComponent(lblTelefono, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
						.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_DireccionCh, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_EmailCh, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_RucCh, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_TelefonoCh, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_NombreCh, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addGap(138))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(263, Short.MAX_VALUE)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(96))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(59, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(13))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(txt_NombreCh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDireccion)
						.addComponent(txt_DireccionCh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEmail)
						.addComponent(txt_EmailCh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(17)
							.addComponent(lblTelefono))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txt_TelefonoCh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txt_RucCh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblRuc)))
					.addGap(18)
					.addComponent(btnAceptar, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
	
	
	public void crear_cliente(){
		Hotel obj = new Hotel();
		
		obj.setNombre(this.txt_NombreCh.getText());
		obj.setDireccion(this.txt_DireccionCh.getText());
		obj.setEmail(this.txt_EmailCh.getText());
		obj.setTelefono(Integer.parseInt(this.txt_TelefonoCh.getText()));
		obj.setRuc(Integer.parseInt(this.txt_RucCh.getText()));
		if(obj!=null){//si el cliente tiene nombre e identificacion cuenta como valido
			JOptionPane.showMessageDialog(this,"Hotel creado con exito", "Crear hotel",JOptionPane.INFORMATION_MESSAGE);	
		
		}
		
		
		
		this.aux2lstHotel.add(obj);
		txt_NombreCh.setText("");
		txt_EmailCh.setText("");
		txt_DireccionCh.setText("");
		txt_TelefonoCh.setText("");
		txt_RucCh.setText("");
	}
}
