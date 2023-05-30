package vista.hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Hotel; 
import vista.cliente.jPanelCrearCliente;
import vista.cliente.jPanelEditarCliente;
import vista.cliente.jPanelImprimirCliente;
import vista.empleado.jPanelImprimirEmpleado;
import vista.hotel.jPanelCrearHotel;
import vista.hotel.jPanelEditarHotel;
import vista.hotel.jPanelImprimirHotel;
import vista.hotel.jDialogHotel;
import vista.hotel.jPanelInformeDatos;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class jDialogHotel extends JDialog {
	private final JPanel contentPanel = new JPanel();
	JPanel panel_1;
	private final JPanel contentPane2 = new JPanel();
	JPanel panel_2;
	/** panles de Hotel**/
	private jPanelCrearHotel objJPCrearHotel;
	private jPanelEditarHotel objJPEditarHotel;
	private jPanelImprimirHotel objJPImprimirHotel;
	private jPanelImprimirCliente objJPImprimirCliente;
	private vista.empleado.jPanelImprimirEmpleado objJPImprimirEmpleado;
	private jPanelInformeDatos objJPInformeDatos;
	
	private ArrayList<Hotel> auxlstHotel;
    private ArrayList<Cliente> auxHlstCliente;
    private ArrayList<Empleado> auxHlstEmpleado;

    private JButton btnElimnar;
	private JButton btnEditar;
	private JButton btnCrear;
	private JButton btnImprimir;
	
	private JButton btnEliminarEmpleado;
	private JButton btnEditarEmpleado;
	private JButton btnNewButton;
	private JButton btnImprimirEmpleado;
	private JLabel label_1;
	private JLabel label;
	private JButton btnInformeDeDatos;
	/**
	 * Create the dialog.
	 */
	public jDialogHotel(Frame padre, boolean modo, ArrayList<Hotel>lstHotel, 
			ArrayList<Cliente> lstCliente, ArrayList<Empleado> lstEmpleado) {
		
		this.auxHlstEmpleado = lstEmpleado;
		this.auxlstHotel = lstHotel;
		this.auxHlstCliente = lstCliente;
		this.objJPCrearHotel= new jPanelCrearHotel(this.auxlstHotel);
		this.objJPImprimirHotel= new jPanelImprimirHotel(this.auxlstHotel);
		this.objJPEditarHotel = new jPanelEditarHotel(this.auxlstHotel);
		this.objJPImprimirCliente = new jPanelImprimirCliente(this.auxHlstCliente);
		this.objJPImprimirEmpleado = new jPanelImprimirEmpleado(this.auxHlstEmpleado);
		this.objJPInformeDatos = new jPanelInformeDatos(this.auxHlstCliente,this.auxHlstEmpleado,this.auxlstHotel);
		
		lanzar_componentes();
	}
	/**
	 * Lanzar componentes
	 * */
	public void lanzar_componentes(){
		
		setBounds(100, 100, 837, 574);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		contentPanel.add(panel, BorderLayout.WEST);
		 btnElimnar = new JButton("Elimnar");
		 btnElimnar.setForeground(new Color(255, 0, 51));
		
		btnCrear = new JButton("Crear");
		btnCrear.setForeground(new Color(0, 0, 0));
		btnCrear.setBackground(new Color(255, 255, 255));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			lanzar_crearHotel();
			}
		});
		
		 btnEditar = new JButton("Editar");
		 btnEditar.setBackground(new Color(255, 255, 255));
		 btnEditar.setForeground(new Color(0, 0, 0));
		 btnEditar.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		lanzar_editarHotel();
		 	}
		 });
		
		 btnImprimir = new JButton("Imprimir");
		 btnImprimir.setForeground(new Color(0, 0, 0));
		 btnImprimir.setBackground(new Color(255, 255, 255));
		 btnImprimir.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		lanzar_imprimirHotel();
		 	}
		 });
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 153, 153));
		
		btnEliminarEmpleado = new JButton("Generar Factura\r\n\r\n");
		btnEliminarEmpleado.setBackground(new Color(51, 204, 255));
		
		btnEditarEmpleado = new JButton("Lista de Clientes");
		btnEditarEmpleado.setBackground(new Color(0, 204, 255));
		btnEditarEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lanzar_imprimirCliente();
			}
		});
		
		btnNewButton = new JButton("Lista de Empleados\r\n");
		btnNewButton.setBackground(new Color(0, 204, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		Lanzar_imprimirEmpleado();
			
			}
		});
		
		btnImprimirEmpleado = new JButton("lista de Facturas\r\n");
		btnImprimirEmpleado.setBackground(new Color(0, 204, 255));
		
		btnInformeDeDatos = new JButton("Informe de datos");
		btnInformeDeDatos.setBackground(new Color(255, 255, 0));
		btnInformeDeDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lanzar_informe();
			
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnInformeDeDatos)
						.addGroup(Alignment.LEADING, gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addComponent(btnEliminarEmpleado, 0, 0, Short.MAX_VALUE)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnEditarEmpleado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnImprimirEmpleado, 0, 0, Short.MAX_VALUE))))
					.addContainerGap(20, Short.MAX_VALUE))
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
					.addGap(18)
					.addComponent(btnInformeDeDatos)
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addComponent(btnEliminarEmpleado)
					.addGap(23))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 204));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Kmilozarta\\Trabajo_Final - Hotel entregado\\imagenes\\images (2).jpg"));
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Kmilozarta\\Trabajo_Final - Hotel entregado\\imagenes\\images (3).jpg"));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(24)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label)
					.addContainerGap(737, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 129, Short.MAX_VALUE)
						.addComponent(label_1, Alignment.TRAILING)))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnElimnar, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(btnCrear, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(btnElimnar)
					.addGap(26))
		);
		panel.setLayout(gl_panel);
		panel_1.setLayout(new BorderLayout(0, 0));
		contentPanel.setLayout(gl_contentPanel);
		panel_2.setLayout(gl_panel_2);
	}

	//LAnzar( crear editar imprimir y eliminar) HOtel
	
	public void lanzar_crearHotel(){
    	this.panel_1.remove(objJPEditarHotel);
		this.panel_1.remove(objJPImprimirHotel);
		this.panel_1.remove(objJPImprimirCliente);
		this.panel_1.remove(objJPImprimirEmpleado);
		this.panel_1.remove(objJPInformeDatos);
		this.panel_1.add(objJPCrearHotel);
    	this.panel_1.revalidate();
    	this.panel_1.repaint();
}
	public void lanzar_editarHotel(){
    	this.panel_1.remove(objJPCrearHotel);
		this.panel_1.remove(objJPImprimirHotel);
		this.panel_1.remove(objJPImprimirCliente);
		this.panel_1.remove(objJPImprimirEmpleado);
		this.panel_1.remove(objJPInformeDatos);
		this.panel_1.add(objJPEditarHotel);
    	this.panel_1.revalidate();
    	this.panel_1.repaint();
}
	public void lanzar_imprimirHotel(){
    	this.panel_1.remove(objJPCrearHotel);
		this.panel_1.remove(objJPEditarHotel);
		this.panel_1.remove(objJPImprimirCliente);
		this.panel_1.remove(objJPImprimirEmpleado);
		this.panel_1.remove(objJPInformeDatos);
		this.panel_1.add(objJPImprimirHotel);
    	this.panel_1.revalidate();
    	this.panel_1.repaint();

	}
	/** LLAMADO A LAS ARRAYLIST:
	 * mirar el listado de empleados
	 * mirar el listado de clientes 
	 * mirar el listido de factura
	 *                 **/

	public void Lanzar_imprimirCliente(){
		this.panel_1.remove(objJPCrearHotel);
		this.panel_1.remove(objJPEditarHotel);
		this.panel_1.remove(objJPImprimirHotel);
		this.panel_1.remove(objJPImprimirEmpleado);
		this.panel_1.remove(objJPInformeDatos);
		this.panel_1.add(objJPImprimirCliente);
		this.panel_1.revalidate();
		this.panel_1.repaint();
	}	
	public void Lanzar_imprimirEmpleado(){
		this.panel_1.remove(objJPCrearHotel);
		this.panel_1.remove(objJPEditarHotel);
		this.panel_1.remove(objJPImprimirHotel);
		this.panel_1.remove(objJPImprimirCliente);
		this.panel_1.remove(objJPInformeDatos);
		this.panel_1.add(objJPImprimirEmpleado);
		this.panel_1.revalidate();
		this.panel_1.repaint();
	}	
	public void Lanzar_informe(){
		this.panel_1.remove(objJPCrearHotel);
		this.panel_1.remove(objJPEditarHotel);
		this.panel_1.remove(objJPImprimirHotel);
		this.panel_1.remove(objJPImprimirCliente);
		this.panel_1.remove(objJPImprimirEmpleado);
		this.panel_1.add(objJPInformeDatos);
		this.panel_1.revalidate();
		this.panel_1.repaint();
	}	
}

