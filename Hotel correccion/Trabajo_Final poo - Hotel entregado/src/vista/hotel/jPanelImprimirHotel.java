package vista.hotel;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.util.ArrayList;

import vista.hotel.jDialogHotel;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;
import modelo.Hotel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class jPanelImprimirHotel extends JPanel {
	private JTable table;
	private JTextField txt_NombreH;
	private ArrayList<Hotel> aux3lstHotel;
	/**
	 * Create the panel.
	 */
	public jPanelImprimirHotel(ArrayList<Hotel> lstHotel) {
		this.aux3lstHotel = lstHotel;
		lanzar_componentes();
		}
		
		public void lanzar_componentes(){
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnCargarDatos = new JButton("Cargar datos");
		btnCargarDatos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCargarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrar_clientes();
			}
		});
		btnCargarDatos.setBackground(new Color(51, 204, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addComponent(btnCargarDatos))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 286, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnCargarDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Direccion", "Email", "Telefono", "Ruc"
			}
		));
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
	}

		public void mostrar_clientes()
		{
			Object matriz [][] = new Object[this.aux3lstHotel.size()][5];
			
			for(int i=0; i<this.aux3lstHotel.size() ;i++ ){
				matriz[i][0]= this.aux3lstHotel.get(i).getNombre();
				matriz[i][1] = this.aux3lstHotel.get(i).getDireccion();
				matriz[i][2] = this.aux3lstHotel.get(i).getEmail();
				matriz[i][3] = this.aux3lstHotel.get(i).getTelefono();
				matriz[i][4] = this.aux3lstHotel.get(i).getRuc();
				
			}
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Direccion", "Email", "Telefono", "Ruc"
					}
				));
			
		 
		}
		
}
