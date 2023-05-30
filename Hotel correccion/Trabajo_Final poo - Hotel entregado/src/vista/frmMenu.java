package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
//
import vista.cliente.jDialogCliente;
import vista.cliente.jPanelCrearCliente;
import vista.hotel.jDialogHotel;
import vista.hotel.jPanelCrearHotel;

//import vista.cliente.jDialogEmpleado;
//
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Hotel;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class frmMenu extends JFrame {

	private JPanel contentPane;
    private ArrayList<Cliente> lstCliente;
    private ArrayList<Empleado> lstEmpleado;
    private ArrayList<Hotel> lstHotel;	
    private jDialogCliente objJDialogCliente;
	//private jDialogEmpleado objJDialogEmpleado;
	/**
	 * Create the frame.
	 */
	public frmMenu() {
		this.lstCliente = new ArrayList<Cliente>();
		this.lstEmpleado = new ArrayList<Empleado>();
		this.lstHotel = new ArrayList<Hotel>();
		lanzar_componentes();
    }
     /** * Lanzar componentes
	 * */
	public void lanzar_componentes(){
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 703, 426);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(0, 153, 255));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(0, 153, 255));
	panel.setLayout(null);
	
	JLabel lblHotel_1 = new JLabel("HOTEL");
	lblHotel_1.setBackground(new Color(0, 153, 255));
	lblHotel_1.setForeground(new Color(102, 0, 51));
	lblHotel_1.setFont(new Font("Arial Black", Font.BOLD, 25));
	lblHotel_1.setBounds(10, 11, 129, 31);
	panel.add(lblHotel_1);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(new Color(204, 204, 204));
	panel_1.setLayout(null);
	
	JButton btnClientes = new JButton("CLIENTES \r\nand \r\nEMPLEADOS\r\n");
	btnClientes.setBackground(new Color(255, 255, 255));
	btnClientes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			lanzar_cliente();
		}
	});
	btnClientes.setFont(new Font("Algerian", Font.PLAIN, 15));
	btnClientes.setBounds(124, 4, 219, 53);
	panel_1.add(btnClientes);
	
	JButton btnHotel = new JButton("HOTEL");
	btnHotel.setBackground(new Color(255, 255, 255));
	btnHotel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			lanzar_hotel();
		}
	});
	btnHotel.setFont(new Font("Algerian", Font.PLAIN, 15));
	btnHotel.setBounds(0, 4, 126, 53);
	panel_1.add(btnHotel);
	
	JLabel lblNewLabel = new JLabel("\r\n\r\n");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Kmilozarta\\Trabajo_Final - Hotel entregado\\imagenes\\48996058.jpg"));
	GroupLayout gl_contentPane = new GroupLayout(contentPane);
	gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(30)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
				.addGap(91)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
	);
	gl_contentPane.setVerticalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(11)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 321, Short.MAX_VALUE))
	);
	contentPane.setLayout(gl_contentPane);
	}
	/**
	 * lanzar clientes, EMPLEADOS y hotel
	 * */
	public void lanzar_cliente(){
		jDialogCliente objJDCliente = new jDialogCliente(this,false, this.lstCliente,this.lstEmpleado);
		objJDCliente.setVisible(true);
	}
	public void lanzar_hotel(){
		jDialogHotel objJDHotel = new jDialogHotel(this,false, this.lstHotel, this.lstCliente, this.lstEmpleado);
		objJDHotel.setVisible(true);
	}
}

