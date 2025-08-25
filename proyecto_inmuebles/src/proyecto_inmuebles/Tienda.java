package proyecto_inmuebles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tienda extends JFrame {

	private JPanel contentPane;
	
	// Datos Terrenos
	public static String modelo0 = "120 metros²";
	public static double largo0 = 20.0;
	public static double ancho0 = 6.0;
	
	public static String modelo1 = "90 metros²";
	public static double largo1 = 15.0;
	public static double ancho1 = 6.0;
	
	public static String modelo2 = "72 metros²";
	public static double largo2 = 12.0;
	public static double ancho2 = 6.0;
	
	// Precio Metro Cuadrado
	public static double distrito0 = 600.0;
	public static double distrito1 = 500.0;
	public static double distrito2 = 350.0;
	
	// Factores
	public static double calle = 1.0;
	public static double parque = 1.2;
	public static double esquina = 1.4;
	
	// Descuentos
	public static double descuentoDistrito0 = 0.1;
	public static double descuentoDistrito1 = 0.07;
	public static double descuentoDistrito2 = 0.05;
	
	// Obsequios
	public static String obsequio1 = "Tostadora"; //72m2
	public static String obsequio2 = "Licuadora"; //90m2
	public static String obsequio3 = "Microondas"; //120m2
	
	// Número de ventas
	public static int contadorVentas = 0;
	public static double ventasAcumuladas = 0;
	public static double cuotaDiaria = 500000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda de Venta de Terrenos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem miSalir = new JMenuItem("Salir");
		miSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		mnArchivo.add(miSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		JMenuItem miConsultarTerrenos = new JMenuItem("Consultar terrenos");
		miConsultarTerrenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarTerreno d = new ConsultarTerreno();
				d.setVisible(true);
			}
		});
		mnMantenimiento.add(miConsultarTerrenos);
		
		JMenuItem miModificarTerrenos = new JMenuItem("Modificar Terrenos");
		miModificarTerrenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarAreaTerrenos d = new ModificarAreaTerrenos();
				d.setVisible(true);
			}
		});
		mnMantenimiento.add(miModificarTerrenos);
		
		JMenuItem miModificarPrecioM = new JMenuItem("Modificar Precio m2");
		miModificarPrecioM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarPrecioM d = new ModificarPrecioM();
				d.setVisible(true);
			}
		});
		mnMantenimiento.add(miModificarPrecioM);
		
		JMenuItem miListarTerrenos = new JMenuItem("Listar Terrenos");
		miListarTerrenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarTerrenos d = new ListarTerrenos();
				d.setVisible(true);
			}
		});
		mnMantenimiento.add(miListarTerrenos);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem miVender = new JMenuItem("Vender");
		miVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VenderTerrenos d = new VenderTerrenos();
				d.setVisible(true);
			}
		});
		mnVentas.add(miVender);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenuItem miConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		miConfigurarDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarDescuentos d = new ConfigurarDescuentos();
				d.setVisible(true);
			}
		});
		mnConfiguracin.add(miConfigurarDescuentos);
		
		JMenuItem miConfigurarObsequios = new JMenuItem("Configurar obsequios");
		miConfigurarObsequios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarObsequios d = new ConfigurarObsequios();
				d.setVisible(true);
			}
		});
		mnConfiguracin.add(miConfigurarObsequios);
		
		JMenuItem miConfigurarFactores = new JMenuItem("Configurar factores");
		miConfigurarFactores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfigurarFactores d = new ConfigurarFactores();
				d.setVisible(true);
			}
		});
		mnConfiguracin.add(miConfigurarFactores);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		JMenuItem miAcerca = new JMenuItem("Acerca de Tienda");
		miAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acerca d = new Acerca();
				d.setVisible(true);
			}
		});
		mnAyuda.add(miAcerca);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenid@ a nuestra tienda");
		lblBienvenido.setForeground(new Color(0, 0, 204));
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(75, 147, 371, 27);
		contentPane.add(lblBienvenido);
	}
	
	void salir() {
		int respuesta;
		respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "Salir",JOptionPane.OK_OPTION,JOptionPane.CANCEL_OPTION);
		
		if (respuesta == 0) {
			System.exit(0);
		}
	}
}
