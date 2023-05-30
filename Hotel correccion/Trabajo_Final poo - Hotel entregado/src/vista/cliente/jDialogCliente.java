package vista.cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;
import modelo.Empleado;
import vista.cliente.jPanelCrearCliente;
import vista.cliente.jPanelEditarCliente;
import vista.cliente.jPanelImprimirCliente;
import vista.empleado.jPanelCrearEmpleado;
import vista.empleado.jPanelEditarEmpleado;
import vista.empleado.jPanelImprimirEmpleado;
import vista.hotel.jDialogHotel;
import vista.hotel.jPanelEditarHotel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class jDialogCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JPanel panel_1;
	private final JPanel contentPane2 = new JPanel();
	JPanel panel_2;
	/**  Paneles de Clientes                  */
	private jPanelCrearCliente objJPCrearCliente;
	private jPanelEditarCliente objJPEditarCliente;
	private jPanelImprimirCliente objJPImprimirCliente;
	private ArrayList<Cliente> lstClientes;
	/**Paneles de Empleados **/

	private jPanelCrearEmpleado objJPCrearEmpleado;
	private jPanelImprimirEmpleado objJPImprimirEmpleado;
	private jPanelEditarEmpleado objJPEditarEmpleado;
	private ArrayList<Empleado> lstEmpleados;
	
	private JButton btnElimnar;
	private JButton btnEditar;
	private JButton btnCrear;
	private JButton btnImprimir;
	
	private JButton btnNewButton;
	private JButton btnEditarEmpleado;
	private JButton btnImprimirEmpleado;
	private JButton btnEliminarEmpleado;
	private JLabel lblNewLabel;
	private JPanel panel_3;
	private JLabel lblCrearCliente;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public jDialogCliente(Frame padre, boolean modo, ArrayList<Cliente> lstCliente,ArrayList<Empleado> lstEmpleado) {
		super(padre,modo);
		this.lstClientes = lstCliente;
		this.lstEmpleados = lstEmpleado;
		this.objJPCrearCliente = new jPanelCrearCliente(this.lstClientes);
		this.objJPImprimirCliente = new jPanelImprimirCliente(this.lstClientes);
		this.objJPEditarCliente = new jPanelEditarCliente(this.lstClientes);
		this.objJPCrearEmpleado = new jPanelCrearEmpleado(this.lstEmpleados);
		this.objJPEditarEmpleado= new jPanelEditarEmpleado(this.lstEmpleados);
		this.objJPImprimirEmpleado = new jPanelImprimirEmpleado(this.lstEmpleados);
		
	lanzar_componentes(); 
	}
	public void lanzar_componentes(){
		{
		setBounds(100, 100, 836, 441);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setForeground(new Color(0, 206, 209));
		contentPanel.add(panel, BorderLayout.WEST);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBackground(new Color(255, 255, 255));
		btnCrear.setForeground(new Color(0, 0, 0));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lanzar_crearCliente();
			}
			
		});
		
		btnEditar = new JButton("Editar");
		btnEditar.setBackground(new Color(255, 255, 255));
		btnEditar.setForeground(new Color(0, 0, 0));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lanzar_editarCliente();
				
				
			}
		});
		
		btnElimnar = new JButton("Elimnar");
		btnElimnar.setForeground(Color.RED);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(new Color(0, 0, 0));
		btnImprimir.setBackground(new Color(255, 255, 255));
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lanzar_imprimirCliente();
			}
		});
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Kmilozarta\\Trabajo_Final - Hotel entregado\\imagenes\\images (1).jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
						.addComponent(btnCrear, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(btnEditar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(btnImprimir, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
						.addComponent(btnElimnar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEditar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimir)
					.addGap(18)
					.addComponent(btnElimnar)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		 panel_1 = new JPanel();
		 panel_1.setBackground(new Color(204, 204, 204));
		contentPanel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
	}
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		panel_2.setToolTipText("");
		contentPanel.add(panel_2, BorderLayout.EAST);
		/////////////////////////////////////////////////////////////////
		// Botones para empleados....
		btnNewButton = new JButton("Crear empleado");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			lanzar_crearEmpleado();
			}
		});
		
		btnEditarEmpleado = new JButton("Editar empleado");
		btnEditarEmpleado.setBackground(new Color(255, 255, 255));
		btnEditarEmpleado.setForeground(new Color(0, 0, 0));
		btnEditarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lanzar_editarEmpleado();
			}
		});
		
		btnImprimirEmpleado = new JButton("Imprimir empleado");
		btnImprimirEmpleado.setForeground(new Color(0, 0, 0));
		btnImprimirEmpleado.setBackground(new Color(255, 255, 255));
		btnImprimirEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			lanzar_imprimirEmpleado();
			}
		});
		
		btnEliminarEmpleado = new JButton("Eliminar empleado");
		btnEliminarEmpleado.setForeground(Color.RED);
		////////////////////////////////////////////////////////////////
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
						.addComponent(btnEditarEmpleado, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
						.addComponent(btnImprimirEmpleado, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
						.addComponent(btnEliminarEmpleado, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEditarEmpleado, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnImprimirEmpleado, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
					.addComponent(btnEliminarEmpleado)
					.addGap(49))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 255));
		contentPanel.add(panel_3, BorderLayout.NORTH);
		
		lblCrearCliente = new JLabel("Clientes y Empleados\r\n");
		lblCrearCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrearCliente.setForeground(new Color(0, 0, 51));
		lblCrearCliente.setFont(new Font("Arial Black", Font.PLAIN, 15));
		panel_3.add(lblCrearCliente);

	}	

	
    //public jDialogCliente(ArrayList<Cliente> lstCliente2) {
		// TODO Auto-generated constructor stub
	
/**
 * LAnzar( crear editar imprimir y eliminar) Clientes
 * */

public void lanzar_crearCliente(){
    	this.panel_1.remove(objJPEditarCliente);
    	this.panel_1.remove(objJPImprimirCliente);
        this.panel_1.remove(objJPCrearEmpleado);
        this.panel_1.remove(objJPEditarEmpleado);
        this.panel_1.remove(objJPImprimirEmpleado);
    	this.panel_1.add(objJPCrearCliente);
    	this.panel_1.revalidate();
    	this.panel_1.repaint();
    	/*this.panel_1.remove(objJPEliminarCliente);
    	
    	*/
    }
public void Lanzar_editarCliente(){
	this.panel_1.remove(objJPCrearCliente);
	this.panel_1.remove(objJPImprimirCliente);
	this.panel_1.remove(objJPCrearEmpleado);
    this.panel_1.remove(objJPEditarEmpleado);
	this.panel_1.remove(objJPImprimirEmpleado);
	this.panel_1.add(objJPEditarCliente);
	this.panel_1.revalidate();
	this.panel_1.repaint();

}	
public void Lanzar_imprimirCliente(){
	this.panel_1.remove(objJPCrearCliente);
	this.panel_1.remove(objJPEditarCliente);
	this.panel_1.remove(objJPCrearEmpleado);
    this.panel_1.remove(objJPEditarEmpleado);;
	this.panel_1.remove(objJPImprimirEmpleado);
	this.panel_1.add(objJPImprimirCliente);	
	this.panel_1.revalidate();
	this.panel_1.repaint();
	}

	/**
	 * LAnzar( crear editar imprimir y eliminar) Empleados
	 * */

public void lanzar_crearEmpleado(){
    	this.panel_1.remove(objJPEditarCliente);
    	this.panel_1.remove(objJPImprimirCliente);
    	this.panel_1.remove(objJPCrearCliente);
        this.panel_1.remove(objJPEditarEmpleado);
    	this.panel_1.remove(objJPImprimirEmpleado);
    	this.panel_1.add(objJPCrearEmpleado);
    	this.panel_1.revalidate();
    	this.panel_1.repaint();
}
public void Lanzar_editarEmpleado(){
	this.panel_1.remove(objJPCrearCliente);
	this.panel_1.remove(objJPImprimirCliente);
	this.panel_1.remove(objJPCrearEmpleado);
	this.panel_1.remove(objJPImprimirEmpleado);
	this.panel_1.add(objJPEditarEmpleado);
	this.panel_1.revalidate();
	this.panel_1.repaint();

}	
public void lanzar_imprimirEmpleado(){
	this.panel_1.remove(objJPEditarCliente);
	this.panel_1.remove(objJPImprimirCliente);
	this.panel_1.remove(objJPCrearCliente);
	this.panel_1.remove(objJPCrearEmpleado);
    this.panel_1.remove(objJPEditarEmpleado);
	this.panel_1.add(objJPImprimirEmpleado);	
	this.panel_1.revalidate();
	this.panel_1.repaint();
	
}


}