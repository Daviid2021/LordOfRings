package interfaz;


import AbstractFactory.FabricaAbstracta;
import AbstractFactory.FabricaElfos;
import AbstractFactory.FabricaEnanos;
import AbstractFactory.FabricaGollum;
import AbstractFactory.FabricaHobbits;
import AbstractFactory.FabricaHumanos;
import AbstractFactory.FabricaMagos;
import AbstractFactory.FabricaOrcos;
import ElementosPersonajes.Arma;
import ElementosPersonajes.Armadura;
import ElementosPersonajes.Vida;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.Color;

public class VentanaPersonajes extends JFrame implements ActionListener {
	FabricaAbstracta Fabrica;
	Arma arma;
	Armadura armadura;
	Vida vida;
	
	
	
	
	private JPanel pnlPrincipal;

	private boolean genera = false;
        private VentanaPoblacion ventanaPoblacion;
	private JButton btnRegresar;
	private JToggleButton btnPersonaje1;
	private JToggleButton btnPersonaje2;
	private JToggleButton btnPersonaje3;
	private JToggleButton btnPersonaje4;
	private JToggleButton btnPersonaje5;
	private JToggleButton btnPersonaje6;
	private JToggleButton btnPersonaje7;
	private JButton btnGenerar;
	private JButton btnVerAldea;

	private JLabel lblFondo;
	private JLabel lblPersonaje1;
	private JLabel lblPersonaje2;
	private JLabel lblPersonaje3;
	private JLabel lblPersonaje4;
	private JLabel lblPersonaje5;
	private JLabel lblPersonaje6;
	private JLabel lblPersonaje7;
	private JLabel lblCantidad;
	private JLabel lblCaracteristicas;

	public JSpinner spnCantidad;
	
	private String cadena;
	

	public VentanaPersonajes() {
		setSize(800, 600); // Establecer tamaño
		setTitle("The Lord Of Rings"); // Agregar Titulo;
		setLocationRelativeTo(null);// salga en el centro
		iniciarComponentes();
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
        public VentanaPoblacion getVentanaPoblacion(){
            if(ventanaPoblacion==null){
                ventanaPoblacion=new VentanaPoblacion();
            }
            return ventanaPoblacion;
        }

	public void iniciarComponentes() {

		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(null);

		btnRegresar = new JButton();
		btnRegresar.setBounds(20, 20, 30, 30);
		btnRegresar.addActionListener(this);
		btnRegresar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		ImageIcon Regresar = new ImageIcon("img/Regresar.png");
		Icon IconRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(btnRegresar.getWidth(),
				btnRegresar.getHeight(), Image.SCALE_SMOOTH));
		btnRegresar.setIcon(IconRegresar);

		lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
		lblFondo.setLayout(null);

		ImageIcon BannerInicio = new ImageIcon("img/FondoPersonajes.jpg");
		Icon Banner = new ImageIcon(BannerInicio.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(),
				Image.SCALE_SMOOTH));
		lblFondo.setIcon(Banner);

		// Personaje 1

		btnPersonaje1 = new JToggleButton();
		btnPersonaje1.setText("Hobbit");
		btnPersonaje1.setBounds(70, 70, 120, 40);
		btnPersonaje1.addActionListener(this);
		btnPersonaje1.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje1 = new JLabel();
		lblPersonaje1.setBounds(400, 100, 200, 400);
		lblPersonaje1.setVisible(false);

		lblCaracteristicas = new JLabel();
		// se
		// colocaria
		// personaje1.getCaracteristicas;
		lblCaracteristicas.setBounds(600, 100, 200, 400);
		lblCaracteristicas.setForeground(Color.WHITE);
		lblCaracteristicas.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas.setVisible(false);

		ImageIcon Personaje1 = new ImageIcon("img/Personaje1.png");
		Icon Psj1 = new ImageIcon(Personaje1.getImage().getScaledInstance(lblPersonaje1.getWidth(),
				lblPersonaje1.getHeight(), Image.SCALE_SMOOTH));
		lblPersonaje1.setIcon(Psj1);

		// Personaje 2
		btnPersonaje2 = new JToggleButton();
		btnPersonaje2.setText("Humano");
		btnPersonaje2.setBounds(70, 140, 120, 40);
		btnPersonaje2.addActionListener(this);
		btnPersonaje2.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje2 = new JLabel();
		lblPersonaje2.setBounds(400, 30, 200, 470);
		lblPersonaje2.setVisible(false);

		ImageIcon Personaje2 = new ImageIcon("img/Personaje2.png");
		Icon Psj2 = new ImageIcon(Personaje2.getImage().getScaledInstance(lblPersonaje2.getWidth(),
				lblPersonaje2.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje2.setIcon(Psj2);

		// Personaje 3

		btnPersonaje3 = new JToggleButton();
		btnPersonaje3.setText("Elfo");
		btnPersonaje3.setBounds(70, 210, 120, 40);
		btnPersonaje3.addActionListener(this);
		btnPersonaje3.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje3 = new JLabel();
		lblPersonaje3.setBounds(350, 100, 200, 400);
		lblPersonaje3.setVisible(false);

		ImageIcon Personaje3 = new ImageIcon("img/Personaje3.png");
		Icon Psj3 = new ImageIcon(Personaje3.getImage().getScaledInstance(lblPersonaje3.getWidth(),
				lblPersonaje3.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje3.setIcon(Psj3);

		// Personaje4

		btnPersonaje4 = new JToggleButton();
		btnPersonaje4.setText("Mago");
		btnPersonaje4.setBounds(70, 280, 120, 40);
		btnPersonaje4.addActionListener(this);
		btnPersonaje4.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje4 = new JLabel();
		lblPersonaje4.setBounds(320, 100, 230, 400);
		lblPersonaje4.setVisible(false);

		ImageIcon Personaje4 = new ImageIcon("img/Personaje4.png");
		Icon Psj4 = new ImageIcon(Personaje4.getImage().getScaledInstance(lblPersonaje4.getWidth(),
				lblPersonaje4.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje4.setIcon(Psj4);

		// Personaje 5

		btnPersonaje5 = new JToggleButton();
		btnPersonaje5.setText("Enano");
		btnPersonaje5.setBounds(70, 350, 120, 40);
		btnPersonaje5.addActionListener(this);
		btnPersonaje5.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje5 = new JLabel();
		lblPersonaje5.setBounds(350, 100, 200, 400);
		lblPersonaje5.setVisible(false);

		ImageIcon Personaje5 = new ImageIcon("img/Personaje5.png");
		Icon Psj5 = new ImageIcon(Personaje5.getImage().getScaledInstance(lblPersonaje5.getWidth(),
				lblPersonaje5.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje5.setIcon(Psj5);

		// Personaje 6

		btnPersonaje6 = new JToggleButton();
		btnPersonaje6.setText("Gollum");
		btnPersonaje6.setBounds(70, 420, 120, 40);
		btnPersonaje6.addActionListener(this);
		btnPersonaje6.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje6 = new JLabel();
		lblPersonaje6.setBounds(350, 100, 200, 400);
		lblPersonaje6.setVisible(false);

		ImageIcon Personaje6 = new ImageIcon("img/Personaje6.png");
		Icon Psj6 = new ImageIcon(Personaje6.getImage().getScaledInstance(lblPersonaje6.getWidth(),
				lblPersonaje6.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje6.setIcon(Psj6);

		// Personaje 7

		btnPersonaje7 = new JToggleButton();
		btnPersonaje7.setText("Orco");
		btnPersonaje7.setBounds(70, 490, 120, 40);
		btnPersonaje7.addActionListener(this);
		btnPersonaje7.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje7 = new JLabel();
		lblPersonaje7.setBounds(350, 100, 200, 400);
		lblPersonaje7.setVisible(false);

		ImageIcon Personaje7 = new ImageIcon("img/Personaje7.png");
		Icon Psj7 = new ImageIcon(Personaje7.getImage().getScaledInstance(lblPersonaje5.getWidth(),
				lblPersonaje5.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje7.setIcon(Psj7);

		// Botones y complementos de Abajo

		SpinnerModel sm = new SpinnerNumberModel(1, 0, 9, 1);
		spnCantidad = new JSpinner(sm);
		spnCantidad.setBounds(490, 520, 50, 25);

		lblCantidad = new JLabel();
		lblCantidad.setBounds(270, 520, 200, 25);
		lblCantidad.setText("Cantidad a generar:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("arial", Font.ITALIC, 20));

		btnGenerar = new JButton();
		btnGenerar.setBounds(610, 510, 120, 40);
		btnGenerar.setText("Generar");
		btnGenerar.addActionListener(this);

		btnVerAldea = new JButton();
		btnVerAldea.setBounds(610, 450, 120, 40);
		btnVerAldea.setText("Ver Aldea");
		btnVerAldea.addActionListener(this);

		pnlPrincipal.add(btnRegresar);
		pnlPrincipal.add(btnPersonaje1);
		pnlPrincipal.add(lblPersonaje1);
		pnlPrincipal.add(lblCaracteristicas);

		pnlPrincipal.add(btnPersonaje2);
		pnlPrincipal.add(lblPersonaje2);

		pnlPrincipal.add(btnPersonaje3);
		pnlPrincipal.add(lblPersonaje3);

		pnlPrincipal.add(btnPersonaje4);
		pnlPrincipal.add(lblPersonaje4);

		pnlPrincipal.add(btnPersonaje5);
		pnlPrincipal.add(lblPersonaje5);

		pnlPrincipal.add(btnPersonaje6);
		pnlPrincipal.add(lblPersonaje6);

		pnlPrincipal.add(btnPersonaje7);
		pnlPrincipal.add(lblPersonaje7);

		pnlPrincipal.add(spnCantidad);
		pnlPrincipal.add(lblCantidad);
		pnlPrincipal.add(btnGenerar);
		pnlPrincipal.add(btnVerAldea);

		pnlPrincipal.add(lblFondo);

		add(pnlPrincipal);
		this.setVisible(true);
	}
        public String getCantidadPersonajes(){
            return cadena;
        }
        public void setCantidadPersonajes(String cadena){
            this.cadena=cadena;
        }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		

		if (e.getSource() == btnRegresar) {

			new VentanaInicio();
			this.setVisible(false);
		}

		else if (e.getSource() == btnPersonaje1) {
			
			if(btnPersonaje1.isSelected()==true) {
				
				lblPersonaje1.setVisible(true);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaHobbits();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje2.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje6.setSelected(false);
				btnPersonaje7.setSelected(false);
				
				
				
				
			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
			}

			

		} else if (e.getSource() == btnPersonaje2) {

			if(btnPersonaje2.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(true);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaHumanos();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje6.setSelected(false);
				btnPersonaje7.setSelected(false);
				
				
			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
			}
			

		} else if (e.getSource() == btnPersonaje3) {

			if(btnPersonaje3.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(true);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaElfos();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje2.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje6.setSelected(false);
				btnPersonaje7.setSelected(false);
				
				
			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
				
			}
			
		
		}

		else if (e.getSource() == btnPersonaje4) {

			
			if(btnPersonaje4.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(true);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaMagos();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje2.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje6.setSelected(false);
				btnPersonaje7.setSelected(false);
				
				
			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
				
			}
		

		} else if (e.getSource() == btnPersonaje5) {

			if(btnPersonaje5.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(true);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaEnanos();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje2.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje6.setSelected(false);
				btnPersonaje7.setSelected(false);
				

			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
				
			}
			
			
		
		} else if (e.getSource() == btnPersonaje6) {

			if(btnPersonaje6.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(true);
				lblPersonaje7.setVisible(false);
				Fabrica = new FabricaGollum();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje2.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje7.setSelected(false);
				
				
			}
			else {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);
			}
			
			

		} else if (e.getSource() == btnPersonaje7) {

			if(btnPersonaje7.isSelected()==true) {
				
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(true);
				Fabrica = new FabricaOrcos();
				arma = Fabrica.crearArma();
				armadura = Fabrica.crearArmadura();
				vida = Fabrica.crearVida();
				lblCaracteristicas.setText("<html><body>Vida: " + vida.operacion() + " <br> Armadura: "
						+ armadura.operacion() + " <br>Arma: " + arma.operacion() + " </body></html>");
				lblCaracteristicas.setVisible(true);
				
				btnPersonaje1.setSelected(false);
				btnPersonaje2.setSelected(false);
				btnPersonaje3.setSelected(false);
				btnPersonaje4.setSelected(false);
				btnPersonaje5.setSelected(false);
				btnPersonaje6.setSelected(false);
				
				
			}
			else {
				lblPersonaje1.setVisible(false);
				lblPersonaje2.setVisible(false);
				lblPersonaje3.setVisible(false);
				lblPersonaje4.setVisible(false);
				lblPersonaje5.setVisible(false);
				lblPersonaje6.setVisible(false);
				lblPersonaje7.setVisible(false);
				lblCaracteristicas.setVisible(false);

			}
			
			

		} else if (e.getSource() == btnGenerar) {

			
			
			if (btnPersonaje1.isSelected() == false && btnPersonaje2.isSelected() == false
					&& btnPersonaje3.isSelected() == false && btnPersonaje4.isSelected() == false
					&& btnPersonaje5.isSelected() == false && btnPersonaje6.isSelected() == false
					&& btnPersonaje7.isSelected() == false) {
				JOptionPane.showMessageDialog(null, "Debe seleccionar un personaje");

				genera = false;
			} else {
				genera = true;
			}

			if ((Integer) spnCantidad.getValue() == 0) {
				JOptionPane.showMessageDialog(null, "No se pueden Generar 0");
			} else if ((Integer) spnCantidad.getValue() != 0 && genera == true) {

				if (btnPersonaje1.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() +" Hobbit/s");
                                        System.out.println(cadena);
					
				} else if (btnPersonaje2.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Humano/s");
					System.out.println(cadena);
				} else if (btnPersonaje3.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Elfo/s");
					System.out.println(cadena);
				} else if (btnPersonaje4.isSelected() == true) {
                                    setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Mago/s");
					System.out.println(cadena);
				} else if (btnPersonaje5.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Enanos/s");
					System.out.println(cadena);
				} else if (btnPersonaje6.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Gollum/s");
					System.out.println(cadena);
				} else if (btnPersonaje7.isSelected() == true) {
                                        setCantidadPersonajes("Se han creado " + spnCantidad.getValue() + " Orco/s");
					System.out.println(cadena);
				}

//				new VentanaPoblacion();
//				this.setVisible(false);
				btnPersonaje1.setSelected(false);
				lblPersonaje1.setVisible(false);
				btnPersonaje2.setSelected(false);
				lblPersonaje2.setVisible(false);
				btnPersonaje3.setSelected(false);
				lblPersonaje3.setVisible(false);
				btnPersonaje4.setSelected(false);
				lblPersonaje4.setVisible(false);
				btnPersonaje5.setSelected(false);
				lblPersonaje5.setVisible(false);
				btnPersonaje6.setSelected(false);
				lblPersonaje6.setVisible(false);
				btnPersonaje7.setSelected(false);
				lblPersonaje7.setVisible(false);
				
				lblCaracteristicas.setVisible(false);

				spnCantidad.setValue(0);
			}

		}
		
		 else if (e.getSource() == btnVerAldea){
                        getVentanaPoblacion().setCadena(cadena);
                        System.out.println(getVentanaPoblacion().getCadena());
                        this.setVisible(false);
		}

	}
}