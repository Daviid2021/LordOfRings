package interfaz;


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

import java.awt.Color;

public class VentanaPersonajes extends JFrame implements ActionListener {

	private JPanel pnlPrincipal;

	private JButton btnRegresar;
	private JButton btnPersonaje1;
	private JButton btnPersonaje2;
	private JButton btnPersonaje3;
	private JButton btnPersonaje4;
	private JButton btnPersonaje5;
	private JButton btnPersonaje6;
	private JButton btnPersonaje7;
	private JButton btnGenerar;

	private JLabel lblFondo;
	private JLabel lblPersonaje1;
	private JLabel lblPersonaje2;
	private JLabel lblPersonaje3;
	private JLabel lblPersonaje4;
	private JLabel lblPersonaje5;
	private JLabel lblPersonaje6;
	private JLabel lblPersonaje7;
	private JLabel lblCantidad;

	private JLabel lblCaracteristicas1;
	private JLabel lblCaracteristicas2;
	private JLabel lblCaracteristicas3;
	private JLabel lblCaracteristicas4;
	private JLabel lblCaracteristicas5;
	private JLabel lblCaracteristicas6;
	private JLabel lblCaracteristicas7;

	public JSpinner spnCantidad;

	public VentanaPersonajes() {
		setSize(800, 600); // Establecer tamaño
		setTitle("The Lord Of Rings"); // Agregar Titulo;
		setLocationRelativeTo(null);// salga en el centro
		iniciarComponentes();
		setResizable(false);
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

		btnPersonaje1 = new JButton();
		btnPersonaje1.setText("Hobbit");
		btnPersonaje1.setBounds(70, 70, 120, 40);
		btnPersonaje1.addActionListener(this);
		btnPersonaje1.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje1 = new JLabel();
		lblPersonaje1.setBounds(400, 100, 200, 400);
		lblPersonaje1.setVisible(false);

    
		lblCaracteristicas1 = new JLabel();
		lblCaracteristicas1.setText("<html><body>Vida:20 <br> Armadura: 1.0 <br>Arma: Espada </body></html>"); // Aca
																												// se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas1.setBounds(600, 100, 200, 400);
		lblCaracteristicas1.setForeground(Color.WHITE);
		lblCaracteristicas1.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas1.setVisible(false);

		ImageIcon Personaje1 = new ImageIcon("img/Personaje1.png");
		Icon Psj1 = new ImageIcon(Personaje1.getImage().getScaledInstance(lblPersonaje1.getWidth(),
				lblPersonaje1.getHeight(), Image.SCALE_SMOOTH));
		lblPersonaje1.setIcon(Psj1);

		// Personaje 2
		btnPersonaje2 = new JButton();
		btnPersonaje2.setText("Humano");
		btnPersonaje2.setBounds(70, 140, 120, 40);
		btnPersonaje2.addActionListener(this);
		btnPersonaje2.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje2 = new JLabel();
		lblPersonaje2.setBounds(400, 30, 200, 470);
		lblPersonaje2.setVisible(false);

		lblCaracteristicas2 = new JLabel();
		lblCaracteristicas2
				.setText("<html><body>Vida: 25 <br> Armadura: 2.0 <br>Arma: Espada Reforzada </body></html>"); // Aca se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas2.setBounds(600, 100, 200, 400);
		lblCaracteristicas2.setForeground(Color.WHITE);
		lblCaracteristicas2.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas2.setVisible(false);

		ImageIcon Personaje2 = new ImageIcon("img/Personaje2.png");
		Icon Psj2 = new ImageIcon(Personaje2.getImage().getScaledInstance(lblPersonaje2.getWidth(),
				lblPersonaje2.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje2.setIcon(Psj2);

		// Personaje 3

		btnPersonaje3 = new JButton();
		btnPersonaje3.setText("Elfo");
		btnPersonaje3.setBounds(70, 210, 120, 40);
		btnPersonaje3.addActionListener(this);
		btnPersonaje3.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje3 = new JLabel();
		lblPersonaje3.setBounds(350, 100, 200, 400);
		lblPersonaje3.setVisible(false);

		lblCaracteristicas3 = new JLabel();
		lblCaracteristicas3.setText("<html><body>Vida: 18 <br> Armadura: 0.7 <br>Arma: Arco </body></html>"); // Aca se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas3.setBounds(600, 100, 200, 400);
		lblCaracteristicas3.setForeground(Color.WHITE);
		lblCaracteristicas3.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas3.setVisible(false);

		ImageIcon Personaje3 = new ImageIcon("img/Personaje3.png");
		Icon Psj3 = new ImageIcon(Personaje3.getImage().getScaledInstance(lblPersonaje3.getWidth(),
				lblPersonaje3.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje3.setIcon(Psj3);

		// Personaje4

		btnPersonaje4 = new JButton();
		btnPersonaje4.setText("Mago");
		btnPersonaje4.setBounds(70, 280, 120, 40);
		btnPersonaje4.addActionListener(this);
		btnPersonaje4.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje4 = new JLabel();
		lblPersonaje4.setBounds(320, 100, 230, 400);
		lblPersonaje4.setVisible(false);

		lblCaracteristicas4 = new JLabel();
		lblCaracteristicas4.setText("<html><body>Vida: 50 <br> Armadura: 1.2 <br>Arma: Vara Mágica </body></html>"); // Aca
																														// se
																														// colocaria
																														// personaje1.getCaracteristicas;
		lblCaracteristicas4.setBounds(600, 100, 200, 400);
		lblCaracteristicas4.setForeground(Color.WHITE);
		lblCaracteristicas4.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas4.setVisible(false);

		ImageIcon Personaje4 = new ImageIcon("img/Personaje4.png");
		Icon Psj4 = new ImageIcon(Personaje4.getImage().getScaledInstance(lblPersonaje4.getWidth(),
				lblPersonaje4.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje4.setIcon(Psj4);

		// Personaje 5

		btnPersonaje5 = new JButton();
		btnPersonaje5.setText("Enano");
		btnPersonaje5.setBounds(70, 350, 120, 40);
		btnPersonaje5.addActionListener(this);
		btnPersonaje5.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje5 = new JLabel();
		lblPersonaje5.setBounds(350, 100, 200, 400);
		lblPersonaje5.setVisible(false);

		lblCaracteristicas5 = new JLabel();
		lblCaracteristicas5.setText("<html><body>Vida: 30 <br> Armadura: 3.0 <br>Arma: Hacha </body></html>"); // Aca se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas5.setBounds(600, 100, 200, 400);
		lblCaracteristicas5.setForeground(Color.WHITE);
		lblCaracteristicas5.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas5.setVisible(false);

		ImageIcon Personaje5 = new ImageIcon("img/Personaje5.png");
		Icon Psj5 = new ImageIcon(Personaje5.getImage().getScaledInstance(lblPersonaje5.getWidth(),
				lblPersonaje5.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje5.setIcon(Psj5);

		// Personaje 6

		btnPersonaje6 = new JButton();
		btnPersonaje6.setText("Gollum");
		btnPersonaje6.setBounds(70, 420, 120, 40);
		btnPersonaje6.addActionListener(this);
		btnPersonaje6.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje6 = new JLabel();
		lblPersonaje6.setBounds(350, 100, 200, 400);
		lblPersonaje6.setVisible(false);

		lblCaracteristicas6 = new JLabel();
		lblCaracteristicas6.setText("<html><body>Vida: 5 <br> Armadura: 0.1 <br>Arma: Ninguna </body></html>"); // Aca se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas6.setBounds(600, 100, 200, 400);
		lblCaracteristicas6.setForeground(Color.WHITE);
		lblCaracteristicas6.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas6.setVisible(false);

		ImageIcon Personaje6 = new ImageIcon("img/Personaje6.png");
		Icon Psj6 = new ImageIcon(Personaje6.getImage().getScaledInstance(lblPersonaje6.getWidth(),
				lblPersonaje6.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje6.setIcon(Psj6);

		// Personaje 7

		btnPersonaje7 = new JButton();
		btnPersonaje7.setText("Orco");
		btnPersonaje7.setBounds(70, 490, 120, 40);
		btnPersonaje7.addActionListener(this);
		btnPersonaje7.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblPersonaje7 = new JLabel();
		lblPersonaje7.setBounds(350, 100, 200, 400);
		lblPersonaje7.setVisible(false);

		lblCaracteristicas7 = new JLabel();
		lblCaracteristicas7.setText("<html><body>Vida: 25 <br> Armadura: 2.8 <br>Arma: Doble Hacha </body></html>"); // Aca se
																												// colocaria
																												// personaje1.getCaracteristicas;
		lblCaracteristicas7.setBounds(600, 100, 200, 400);
		lblCaracteristicas7.setForeground(Color.WHITE);
		lblCaracteristicas7.setFont(new Font("arial", Font.ITALIC, 16));
		lblCaracteristicas7.setVisible(false);

		ImageIcon Personaje7 = new ImageIcon("img/Personaje7.png");
		Icon Psj7 = new ImageIcon(Personaje7.getImage().getScaledInstance(lblPersonaje5.getWidth(),
				lblPersonaje5.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje7.setIcon(Psj7);

		// Botones y complementos de Abajo

		spnCantidad = new JSpinner();
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

		pnlPrincipal.add(btnRegresar);
		pnlPrincipal.add(btnPersonaje1);
		pnlPrincipal.add(lblPersonaje1);
		pnlPrincipal.add(lblCaracteristicas1);

		pnlPrincipal.add(btnPersonaje2);
		pnlPrincipal.add(lblPersonaje2);
		pnlPrincipal.add(lblCaracteristicas2);

		pnlPrincipal.add(btnPersonaje3);
		pnlPrincipal.add(lblPersonaje3);
		pnlPrincipal.add(lblCaracteristicas3);

		pnlPrincipal.add(btnPersonaje4);
		pnlPrincipal.add(lblPersonaje4);
		pnlPrincipal.add(lblCaracteristicas4);

		pnlPrincipal.add(btnPersonaje5);
		pnlPrincipal.add(lblPersonaje5);
		pnlPrincipal.add(lblCaracteristicas5);

		pnlPrincipal.add(btnPersonaje6);
		pnlPrincipal.add(lblPersonaje6);
		pnlPrincipal.add(lblCaracteristicas6);

		pnlPrincipal.add(btnPersonaje7);
		pnlPrincipal.add(lblPersonaje7);
		pnlPrincipal.add(lblCaracteristicas7);

		pnlPrincipal.add(spnCantidad);
		pnlPrincipal.add(lblCantidad);
		pnlPrincipal.add(btnGenerar);

		pnlPrincipal.add(lblFondo);

		add(pnlPrincipal);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnRegresar) {

			new VentanaInicio();
			this.setVisible(false);
		}

		else if (e.getSource() == btnPersonaje1) {

			lblPersonaje1.setVisible(true);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(true);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(false);

		} else if (e.getSource() == btnPersonaje2) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(true);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(true);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(false);

		} else if (e.getSource() == btnPersonaje3) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(true);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(true);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(false);
		}

		else if (e.getSource() == btnPersonaje4) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(true);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(true);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(false);
		} else if (e.getSource() == btnPersonaje5) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(true);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(true);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(false);
		} else if (e.getSource() == btnPersonaje6) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(true);
			lblPersonaje7.setVisible(false);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(true);
			lblCaracteristicas7.setVisible(false);
		} else if (e.getSource() == btnPersonaje7) {

			lblPersonaje1.setVisible(false);
			lblPersonaje2.setVisible(false);
			lblPersonaje3.setVisible(false);
			lblPersonaje4.setVisible(false);
			lblPersonaje5.setVisible(false);
			lblPersonaje6.setVisible(false);
			lblPersonaje7.setVisible(true);

			lblCaracteristicas1.setVisible(false);
			lblCaracteristicas2.setVisible(false);
			lblCaracteristicas3.setVisible(false);
			lblCaracteristicas4.setVisible(false);
			lblCaracteristicas5.setVisible(false);
			lblCaracteristicas6.setVisible(false);
			lblCaracteristicas7.setVisible(true);
		} else if (e.getSource() == btnGenerar) {

			if ((Integer) spnCantidad.getValue() == 0) {
				JOptionPane.showMessageDialog(null, "No se pueden Generar 0");
			} else {
				System.out.println("Se han creado " + spnCantidad.getValue());
        new VentanaPoblacion();
			}

			

			spnCantidad.setValue(0);

		}

	}

}