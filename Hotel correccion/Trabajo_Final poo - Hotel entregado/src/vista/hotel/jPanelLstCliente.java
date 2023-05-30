package vista.hotel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import vista.cliente.jDialogCliente;
import vista.hotel.jDialogHotel;
import modelo.Cliente;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class jPanelLstCliente extends JPanel {
	private JTable table;
	private JTextField txt_NombreC;
	private ArrayList<Cliente> auxHlstCliente;
	/**
	 * Create the panel.
	 */
	public jPanelLstCliente(ArrayList<Cliente> lstCliente) {
	this.auxHlstCliente= lstCliente;
		lanzar_Componentes();
		
	}
	public void lanzar_Componentes(){
setLayout(new BorderLayout(0, 0));

		
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnCargarDatos = new JButton("Cargar datos");
		btnCargarDatos.setBackground(Color.LIGHT_GRAY);
		btnCargarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrar_clientes();
			
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
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
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnCargarDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Direccion", "Telefono", "Nacionalidad",// "Identificcion"
			}
		));
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);

	}
	
	public void mostrar_clientes()
	{
		Object matriz [][] = new Object[this.auxHlstCliente.size()][5];
		
		for(int i=0; i<this.auxHlstCliente.size() ;i++ ){
			matriz[i][0]= this.auxHlstCliente.get(i).getNombre();
			matriz[i][1] = this.auxHlstCliente.get(i).getDireccion();
			matriz[i][2] = this.auxHlstCliente.get(i).getTelefono();
			matriz[i][3] = this.auxHlstCliente.get(i).getNacionalidad();
			matriz[i][4] = this.auxHlstCliente.get(i).getIdentificcion();
		}
		table.setModel(new DefaultTableModel(
				matriz,
				new String[] {
					"Nombre", "Direccion", "Telefono", "Nacionalidad",//"identificcion"
				}
			));
		
	 
	}
}

