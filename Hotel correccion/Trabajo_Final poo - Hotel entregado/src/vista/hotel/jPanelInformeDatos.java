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
import modelo.Empleado;
import modelo.Hotel;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class jPanelInformeDatos extends JPanel {
	private ArrayList<Hotel> auxlstHotel;
	
	private JTable table;
	private JTextField txt_NombreC;
	private ArrayList<Cliente> auxHlstCliente;
	
	//private JTable table_1;
	private JTextField txt_NombreEe;
	private ArrayList<Empleado> aux2lstEmpleado;
	private JTable table_2;
	private JTable table_3;
	/**
	 * Create the panel.
	 */
	public jPanelInformeDatos(ArrayList<Cliente> lstCliente, ArrayList<Empleado> lstEmpleado, ArrayList<Hotel> lstHotel) {
	this.auxlstHotel=lstHotel;
	this.auxHlstCliente= lstCliente;
	this.aux2lstEmpleado= lstEmpleado;
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
				mostrar_empleado();
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCargarDatos)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnCargarDatos)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "identificacion"
			}
		));
		scrollPane_1.setViewportView(table_3);
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre","Direccion", "Nacionalidad"
			}
		));
		panel.setLayout(gl_panel);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Nombre", "Direccion", "Nacionalidad"
			}
		));
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);

	}
	
	public void mostrar_clientes()
	{
		Object matriz [][] = new Object[this.auxHlstCliente.size()][3];
		
		for(int i=0; i<this.auxHlstCliente.size() ;i++ ){
			matriz[i][0]= this.auxHlstCliente.get(i).getNombre();
			matriz[i][1] = this.auxHlstCliente.get(i).getDireccion();
			matriz[i][2] = this.auxHlstCliente.get(i).getNacionalidad();
	
		}
		table.setModel(new DefaultTableModel(
				matriz,
				new String[] {
						 "Nombre", "Direccion", "Nacionalidad"
				}
			));
	}

	public void mostrar_empleado()
	{
	Object matriz [][] = new Object[this.aux2lstEmpleado.size()][2];
		
		for(int i=0; i<this.aux2lstEmpleado.size() ;i++ ){
			matriz[i][0] = this.aux2lstEmpleado.get(i).getNombre();
			matriz[i][1] = this.aux2lstEmpleado.get(i).getIdentificcion();
		}
		table_3.setModel(new DefaultTableModel(
				matriz,
				new String[] {
					"Nombre","identificacion"
				}
			));

}
	
}







