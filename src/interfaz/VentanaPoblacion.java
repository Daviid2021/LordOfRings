package interfaz;

import java.awt.Cursor;
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

public class VentanaPoblacion extends JFrame implements ActionListener {

	private JPanel pnlPrincipal;
	private JLabel lblFondo;
	private JButton btnRegresar;
	private JButton btnActualizar;

	private JLabel lblPersonaje11;
	private JLabel lblPersonaje12;
	private JLabel lblPersonaje13;
	private JLabel lblPersonaje14;
	private JLabel lblPersonaje15;
	private JLabel lblPersonaje16;
	private JLabel lblPersonaje17;
	private JLabel lblPersonaje18;
	private JLabel lblPersonaje19;

	private JLabel lblPersonaje21;
	private JLabel lblPersonaje22;
	private JLabel lblPersonaje23;
	private JLabel lblPersonaje24;
	private JLabel lblPersonaje25;
	private JLabel lblPersonaje26;
	private JLabel lblPersonaje27;
	private JLabel lblPersonaje28;
	private JLabel lblPersonaje29;

	private JLabel lblPersonaje31;
	private JLabel lblPersonaje32;
	private JLabel lblPersonaje33;
	private JLabel lblPersonaje34;
	private JLabel lblPersonaje35;
	private JLabel lblPersonaje36;
	private JLabel lblPersonaje37;
	private JLabel lblPersonaje38;
	private JLabel lblPersonaje39;

	private JLabel lblPersonaje41;
	private JLabel lblPersonaje42;
	private JLabel lblPersonaje43;
	private JLabel lblPersonaje44;
	private JLabel lblPersonaje45;
	private JLabel lblPersonaje46;
	private JLabel lblPersonaje47;
	private JLabel lblPersonaje48;
	private JLabel lblPersonaje49;

	private JLabel lblPersonaje51;
	private JLabel lblPersonaje52;
	private JLabel lblPersonaje53;
	private JLabel lblPersonaje54;
	private JLabel lblPersonaje55;
	private JLabel lblPersonaje56;
	private JLabel lblPersonaje57;
	private JLabel lblPersonaje58;
	private JLabel lblPersonaje59;

	private JLabel lblPersonaje61;
	private JLabel lblPersonaje62;
	private JLabel lblPersonaje63;

	private JLabel lblPersonaje71;
	private JLabel lblPersonaje72;
	private JLabel lblPersonaje73;
	private JLabel lblPersonaje74;
	private JLabel lblPersonaje75;
	private JLabel lblPersonaje76;

	
	
	private String cadena = "Se han creado 5 Humano/s";

	

	public VentanaPoblacion() {
		setSize(800, 600); // Establecer tamaño
		setTitle("The Lord Of Rings"); // Agregar Titulo;
		setLocationRelativeTo(null);// salga en el centro
		iniciarComponentes();
		setResizable(false);
	}

	public void iniciarComponentes() {

		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(null);

		lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
		lblFondo.setLayout(null);

		ImageIcon BannerInicio = new ImageIcon("img/FondoPoblacion.jpg");
		Icon Banner = new ImageIcon(BannerInicio.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(),
				Image.SCALE_SMOOTH));
		lblFondo.setIcon(Banner);

		btnRegresar = new JButton();
		btnRegresar.setBounds(20, 20, 30, 30);
		btnRegresar.addActionListener(this);
		btnRegresar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		ImageIcon Regresar = new ImageIcon("img/Regresar.png");
		Icon IconRegresar = new ImageIcon(Regresar.getImage().getScaledInstance(btnRegresar.getWidth(),
				btnRegresar.getHeight(), Image.SCALE_SMOOTH));
		btnRegresar.setIcon(IconRegresar);

		btnActualizar = new JButton();
		btnActualizar.setBounds(700, 20, 50, 50);
		btnActualizar.addActionListener(this);
		btnActualizar.setCursor(new Cursor(Cursor.HAND_CURSOR));

		ImageIcon Actualizar = new ImageIcon("img/Actualizar.png");
		Icon IconActualizar = new ImageIcon(Actualizar.getImage().getScaledInstance(btnActualizar.getWidth(),
				btnActualizar.getHeight(), Image.SCALE_SMOOTH));
		btnActualizar.setIcon(IconActualizar);

		// Personajes 1
		lblPersonaje11 = new JLabel();
		lblPersonaje11.setBounds(30, 50, 60, 75);
		lblPersonaje11.setVisible(false);

		lblPersonaje12 = new JLabel();
		lblPersonaje12.setBounds(90, 5, 60, 75);
		lblPersonaje12.setVisible(false);

		lblPersonaje13 = new JLabel();
		lblPersonaje13.setBounds(150, 5, 60, 75);
		lblPersonaje13.setVisible(false);

		lblPersonaje14 = new JLabel();
		lblPersonaje14.setBounds(90, 50, 60, 75);
		lblPersonaje14.setVisible(false);

		lblPersonaje15 = new JLabel();
		lblPersonaje15.setBounds(150, 50, 60, 75);
		lblPersonaje15.setVisible(false);

		lblPersonaje16 = new JLabel();
		lblPersonaje16.setBounds(210, 50, 60, 75);
		lblPersonaje16.setVisible(false);

		lblPersonaje17 = new JLabel();
		lblPersonaje17.setBounds(30, 95, 60, 75);
		lblPersonaje17.setVisible(false);

		lblPersonaje18 = new JLabel();
		lblPersonaje18.setBounds(90, 95, 60, 75);
		lblPersonaje18.setVisible(false);

		lblPersonaje19 = new JLabel();
		lblPersonaje19.setBounds(150, 95, 60, 75);
		lblPersonaje19.setVisible(false);

		ImageIcon Personaje1 = new ImageIcon("img/Personaje1.png");
		Icon Psj1 = new ImageIcon(Personaje1.getImage().getScaledInstance(lblPersonaje11.getWidth(),
				lblPersonaje11.getHeight(), Image.SCALE_SMOOTH));
		lblPersonaje11.setIcon(Psj1);
		lblPersonaje12.setIcon(Psj1);
		lblPersonaje13.setIcon(Psj1);
		lblPersonaje14.setIcon(Psj1);
		lblPersonaje15.setIcon(Psj1);
		lblPersonaje16.setIcon(Psj1);
		lblPersonaje17.setIcon(Psj1);
		lblPersonaje18.setIcon(Psj1);
		lblPersonaje19.setIcon(Psj1);

		// Personajes 2
		lblPersonaje21 = new JLabel();
		lblPersonaje21.setBounds(330, 50, 60, 75);
		lblPersonaje21.setVisible(false);

		lblPersonaje22 = new JLabel();
		lblPersonaje22.setBounds(400, 5, 60, 75);
		lblPersonaje22.setVisible(false);

		lblPersonaje23 = new JLabel();
		lblPersonaje23.setBounds(460, 5, 60, 75);
		lblPersonaje23.setVisible(false);

		lblPersonaje24 = new JLabel();
		lblPersonaje24.setBounds(400, 50, 60, 75);
		lblPersonaje24.setVisible(false);

		lblPersonaje25 = new JLabel();
		lblPersonaje25.setBounds(460, 50, 60, 75);
		lblPersonaje25.setVisible(false);

		lblPersonaje26 = new JLabel();
		lblPersonaje26.setBounds(520, 50, 60, 75);
		lblPersonaje26.setVisible(false);

		lblPersonaje27 = new JLabel();
		lblPersonaje27.setBounds(340, 95, 60, 75);
		lblPersonaje27.setVisible(false);

		lblPersonaje28 = new JLabel();
		lblPersonaje28.setBounds(400, 95, 60, 75);
		lblPersonaje28.setVisible(false);

		lblPersonaje29 = new JLabel();
		lblPersonaje29.setBounds(460, 95, 60, 75);
		lblPersonaje29.setVisible(false);

		ImageIcon Personaje2 = new ImageIcon("img/Personaje2.png");
		Icon Psj2 = new ImageIcon(Personaje2.getImage().getScaledInstance(lblPersonaje21.getWidth(),
				lblPersonaje21.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje21.setIcon(Psj2);
		lblPersonaje22.setIcon(Psj2);
		lblPersonaje23.setIcon(Psj2);
		lblPersonaje24.setIcon(Psj2);
		lblPersonaje25.setIcon(Psj2);
		lblPersonaje26.setIcon(Psj2);
		lblPersonaje27.setIcon(Psj2);
		lblPersonaje28.setIcon(Psj2);
		lblPersonaje29.setIcon(Psj2);

		int x31 = 250;
		int y31 = 90;

		// Personajes 3
		lblPersonaje31 = new JLabel();
		lblPersonaje31.setBounds(330 + x31, 50 + y31, 60, 75);
		lblPersonaje31.setVisible(false);

		lblPersonaje32 = new JLabel();
		lblPersonaje32.setBounds(400 + x31, 5 + y31, 60, 75);
		lblPersonaje32.setVisible(false);

		lblPersonaje33 = new JLabel();
		lblPersonaje33.setBounds(460 + x31, 5 + y31, 60, 75);
		lblPersonaje33.setVisible(false);

		lblPersonaje34 = new JLabel();
		lblPersonaje34.setBounds(400 + x31, 50 + y31, 60, 75);
		lblPersonaje34.setVisible(false);

		lblPersonaje35 = new JLabel();
		lblPersonaje35.setBounds(460 + x31, 50 + y31, 60, 75);
		lblPersonaje35.setVisible(false);

		lblPersonaje36 = new JLabel();
		lblPersonaje36.setBounds(520 + x31, 50 + y31, 60, 75);
		lblPersonaje36.setVisible(false);

		lblPersonaje37 = new JLabel();
		lblPersonaje37.setBounds(340 + x31, 95 + y31, 60, 75);
		lblPersonaje37.setVisible(false);

		lblPersonaje38 = new JLabel();
		lblPersonaje38.setBounds(400 + x31, 95 + y31, 60, 75);
		lblPersonaje38.setVisible(false);

		lblPersonaje39 = new JLabel();
		lblPersonaje39.setBounds(460 + x31, 95 + y31, 60, 75);
		lblPersonaje39.setVisible(false);

		ImageIcon Personaje3 = new ImageIcon("img/Personaje3.png");
		Icon Psj3 = new ImageIcon(Personaje3.getImage().getScaledInstance(lblPersonaje31.getWidth(),
				lblPersonaje31.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje31.setIcon(Psj3);
		lblPersonaje32.setIcon(Psj3);
		lblPersonaje33.setIcon(Psj3);
		lblPersonaje34.setIcon(Psj3);
		lblPersonaje35.setIcon(Psj3);
		lblPersonaje36.setIcon(Psj3);
		lblPersonaje37.setIcon(Psj3);
		lblPersonaje38.setIcon(Psj3);
		lblPersonaje39.setIcon(Psj3);

		int x41 = 250;
		int y41 = 230;
		int a41 = 90;
		int b41 = 105;

		// Personajes 4
		lblPersonaje41 = new JLabel();
		lblPersonaje41.setBounds(30, 50 + y41, a41, b41);
		lblPersonaje41.setVisible(false);

		lblPersonaje42 = new JLabel();
		lblPersonaje42.setBounds(90, 5 + y41, a41, b41);
		lblPersonaje42.setVisible(false);

		lblPersonaje43 = new JLabel();
		lblPersonaje43.setBounds(150, 5 + y41, a41, b41);
		lblPersonaje43.setVisible(false);

		lblPersonaje44 = new JLabel();
		lblPersonaje44.setBounds(90, 50 + y41, a41, b41);
		lblPersonaje44.setVisible(false);

		lblPersonaje45 = new JLabel();
		lblPersonaje45.setBounds(150, 50 + y41, a41, b41);
		lblPersonaje45.setVisible(false);

		lblPersonaje46 = new JLabel();
		lblPersonaje46.setBounds(210, 50 + y41, a41, b41);
		lblPersonaje46.setVisible(false);

		lblPersonaje47 = new JLabel();
		lblPersonaje47.setBounds(30, 95 + y41, a41, b41);
		lblPersonaje47.setVisible(false);

		lblPersonaje48 = new JLabel();
		lblPersonaje48.setBounds(90, 95 + y41, a41, b41);
		lblPersonaje48.setVisible(false);

		lblPersonaje49 = new JLabel();
		lblPersonaje49.setBounds(150, 95 + y41, a41, b41);
		lblPersonaje49.setVisible(false);

		ImageIcon Personaje4 = new ImageIcon("img/Personaje4.png");
		Icon Psj4 = new ImageIcon(Personaje4.getImage().getScaledInstance(lblPersonaje41.getWidth(),
				lblPersonaje41.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje41.setIcon(Psj4);
		lblPersonaje42.setIcon(Psj4);
		lblPersonaje43.setIcon(Psj4);
		lblPersonaje44.setIcon(Psj4);
		lblPersonaje45.setIcon(Psj4);
		lblPersonaje46.setIcon(Psj4);
		lblPersonaje47.setIcon(Psj4);
		lblPersonaje48.setIcon(Psj4);
		lblPersonaje49.setIcon(Psj4);

		// Personajes 5
		lblPersonaje51 = new JLabel();
		lblPersonaje51.setBounds(330, 50 + y41, 60, 75);
		lblPersonaje51.setVisible(false);

		lblPersonaje52 = new JLabel();
		lblPersonaje52.setBounds(400, 5 + y41, 60, 75);
		lblPersonaje52.setVisible(false);

		lblPersonaje53 = new JLabel();
		lblPersonaje53.setBounds(460, 5 + y41, 60, 75);
		lblPersonaje53.setVisible(false);

		lblPersonaje54 = new JLabel();
		lblPersonaje54.setBounds(400, 50 + y41, 60, 75);
		lblPersonaje54.setVisible(false);

		lblPersonaje55 = new JLabel();
		lblPersonaje55.setBounds(460, 50 + y41, 60, 75);
		lblPersonaje55.setVisible(false);

		lblPersonaje56 = new JLabel();
		lblPersonaje56.setBounds(520, 50 + y41, 60, 75);
		lblPersonaje56.setVisible(false);

		lblPersonaje57 = new JLabel();
		lblPersonaje57.setBounds(340, 95 + y41, 60, 75);
		lblPersonaje57.setVisible(false);

		lblPersonaje58 = new JLabel();
		lblPersonaje58.setBounds(400, 95 + y41, 60, 75);
		lblPersonaje58.setVisible(false);

		lblPersonaje59 = new JLabel();
		lblPersonaje59.setBounds(460, 95 + y41, 60, 75);
		lblPersonaje59.setVisible(false);

		ImageIcon Personaje5 = new ImageIcon("img/Personaje5.png");
		Icon Psj5 = new ImageIcon(Personaje5.getImage().getScaledInstance(lblPersonaje51.getWidth(),
				lblPersonaje51.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje51.setIcon(Psj5);
		lblPersonaje52.setIcon(Psj5);
		lblPersonaje53.setIcon(Psj5);
		lblPersonaje54.setIcon(Psj5);
		lblPersonaje55.setIcon(Psj5);
		lblPersonaje56.setIcon(Psj5);
		lblPersonaje57.setIcon(Psj5);
		lblPersonaje58.setIcon(Psj5);
		lblPersonaje59.setIcon(Psj5);

		int y61 = y41 + 190;
		// Personajes 6
		lblPersonaje61 = new JLabel();
		lblPersonaje61.setBounds(30, 50 + y61, 60, 75);
		lblPersonaje61.setVisible(false);

		lblPersonaje62 = new JLabel();
		lblPersonaje62.setBounds(90, 50 + y61, 60, 75);
		lblPersonaje62.setVisible(false);

		lblPersonaje63 = new JLabel();
		lblPersonaje63.setBounds(150, 50 + y61, 60, 75);
		lblPersonaje63.setVisible(false);

		ImageIcon Personaje6 = new ImageIcon("img/Personaje6.png");
		Icon Psj6 = new ImageIcon(Personaje6.getImage().getScaledInstance(lblPersonaje61.getWidth(),
				lblPersonaje61.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje61.setIcon(Psj6);
		lblPersonaje62.setIcon(Psj6);
		lblPersonaje63.setIcon(Psj6);

		int y71 = y41 + 190;
		int x71 = 270;
		// Personajes 7
		lblPersonaje71 = new JLabel();
		lblPersonaje71.setBounds(30 + x71, 50 + y71, 60, 75);
		lblPersonaje71.setVisible(false);

		lblPersonaje72 = new JLabel();
		lblPersonaje72.setBounds(90 + x71, 50 + y71, 60, 75);
		lblPersonaje72.setVisible(false);


		lblPersonaje73 = new JLabel();
		lblPersonaje73.setBounds(150 + x71, 50 + y71, 60, 75);
		lblPersonaje73.setVisible(false);


		lblPersonaje74 = new JLabel();
		lblPersonaje74.setBounds(210 + x71, 50 + y71, 60, 75);
		lblPersonaje74.setVisible(false);


		lblPersonaje75 = new JLabel();
		lblPersonaje75.setBounds(270 + x71, 50 + y71, 60, 75);
		lblPersonaje75.setVisible(false);


		lblPersonaje76 = new JLabel();
		lblPersonaje76.setBounds(330 + x71, 50 + y71, 60, 75);
		lblPersonaje76.setVisible(false);


		ImageIcon Personaje7 = new ImageIcon("img/Personaje7.png");
		Icon Psj7 = new ImageIcon(Personaje7.getImage().getScaledInstance(lblPersonaje71.getWidth(),
				lblPersonaje71.getHeight(), Image.SCALE_AREA_AVERAGING));
		lblPersonaje71.setIcon(Psj7);
		lblPersonaje72.setIcon(Psj7);
		lblPersonaje73.setIcon(Psj7);
		lblPersonaje74.setIcon(Psj7);
		lblPersonaje75.setIcon(Psj7);
		lblPersonaje76.setIcon(Psj7);

		pnlPrincipal.add(btnRegresar);
		pnlPrincipal.add(btnActualizar);

		pnlPrincipal.add(lblPersonaje19);
		pnlPrincipal.add(lblPersonaje18);
		pnlPrincipal.add(lblPersonaje17);
		pnlPrincipal.add(lblPersonaje16);
		pnlPrincipal.add(lblPersonaje15);
		pnlPrincipal.add(lblPersonaje14);
		pnlPrincipal.add(lblPersonaje13);
		pnlPrincipal.add(lblPersonaje12);
		pnlPrincipal.add(lblPersonaje11);

		pnlPrincipal.add(lblPersonaje29);
		pnlPrincipal.add(lblPersonaje28);
		pnlPrincipal.add(lblPersonaje27);
		pnlPrincipal.add(lblPersonaje26);
		pnlPrincipal.add(lblPersonaje25);
		pnlPrincipal.add(lblPersonaje24);
		pnlPrincipal.add(lblPersonaje23);
		pnlPrincipal.add(lblPersonaje22);
		pnlPrincipal.add(lblPersonaje21);

		pnlPrincipal.add(lblPersonaje39);
		pnlPrincipal.add(lblPersonaje38);
		pnlPrincipal.add(lblPersonaje37);
		pnlPrincipal.add(lblPersonaje36);
		pnlPrincipal.add(lblPersonaje35);
		pnlPrincipal.add(lblPersonaje34);
		pnlPrincipal.add(lblPersonaje33);
		pnlPrincipal.add(lblPersonaje32);
		pnlPrincipal.add(lblPersonaje31);

		pnlPrincipal.add(lblPersonaje49);
		pnlPrincipal.add(lblPersonaje48);
		pnlPrincipal.add(lblPersonaje47);
		pnlPrincipal.add(lblPersonaje46);
		pnlPrincipal.add(lblPersonaje45);
		pnlPrincipal.add(lblPersonaje44);
		pnlPrincipal.add(lblPersonaje43);
		pnlPrincipal.add(lblPersonaje42);
		pnlPrincipal.add(lblPersonaje41);

		pnlPrincipal.add(lblPersonaje59);
		pnlPrincipal.add(lblPersonaje58);
		pnlPrincipal.add(lblPersonaje57);
		pnlPrincipal.add(lblPersonaje56);
		pnlPrincipal.add(lblPersonaje55);
		pnlPrincipal.add(lblPersonaje54);
		pnlPrincipal.add(lblPersonaje53);
		pnlPrincipal.add(lblPersonaje52);
		pnlPrincipal.add(lblPersonaje51);

		pnlPrincipal.add(lblPersonaje63);
		pnlPrincipal.add(lblPersonaje62);
		pnlPrincipal.add(lblPersonaje61);

		pnlPrincipal.add(lblPersonaje76);
		pnlPrincipal.add(lblPersonaje75);
		pnlPrincipal.add(lblPersonaje74);
		pnlPrincipal.add(lblPersonaje73);
		pnlPrincipal.add(lblPersonaje72);
		pnlPrincipal.add(lblPersonaje71);

		pnlPrincipal.add(lblFondo);
		add(pnlPrincipal);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnRegresar) {
			new VentanaPersonajes();
			this.setVisible(false);
		}

		else if (e.getSource() == btnActualizar) {

			if (cadena == "Se han creado 1 Hobbit/s") {

				lblPersonaje11.setVisible(true);

			}
			else if (cadena == "Se han creado 2 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
				lblPersonaje15.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
				lblPersonaje15.setVisible(true);
				lblPersonaje16.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
				lblPersonaje15.setVisible(true);
				lblPersonaje16.setVisible(true);
				lblPersonaje17.setVisible(true);
				
			}
			else if (cadena == "Se han creado 8 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
				lblPersonaje15.setVisible(true);
				lblPersonaje16.setVisible(true);
				lblPersonaje17.setVisible(true);
				lblPersonaje18.setVisible(true);
				
			}
			else if (cadena == "Se han creado 9 Hobbit/s") {

				lblPersonaje11.setVisible(true);
				lblPersonaje12.setVisible(true);
				lblPersonaje13.setVisible(true);
				lblPersonaje14.setVisible(true);
				lblPersonaje15.setVisible(true);
				lblPersonaje16.setVisible(true);
				lblPersonaje17.setVisible(true);
				lblPersonaje18.setVisible(true);
				lblPersonaje19.setVisible(true);
				
			}
			
			//Creacion de los personajes 2 (Humanos)
			else if(cadena == "Se han creado 1 Humano/s") {
				
				lblPersonaje21.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
				lblPersonaje25.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
				lblPersonaje25.setVisible(true);
				lblPersonaje26.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
				lblPersonaje25.setVisible(true);
				lblPersonaje26.setVisible(true);
				lblPersonaje27.setVisible(true);
				
			}
			else if (cadena == "Se han creado 8 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
				lblPersonaje25.setVisible(true);
				lblPersonaje26.setVisible(true);
				lblPersonaje27.setVisible(true);
				lblPersonaje28.setVisible(true);
				
			}
			else if (cadena == "Se han creado 9 Humano/s") {

				lblPersonaje21.setVisible(true);
				lblPersonaje22.setVisible(true);
				lblPersonaje23.setVisible(true);
				lblPersonaje24.setVisible(true);
				lblPersonaje25.setVisible(true);
				lblPersonaje26.setVisible(true);
				lblPersonaje27.setVisible(true);
				lblPersonaje28.setVisible(true);
				lblPersonaje29.setVisible(true);
				
			}
			
			//Creacion Personaje 3
			
			else if(cadena == "Se han creado 1 Elfo/s") {
				
				lblPersonaje31.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
				lblPersonaje35.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
				lblPersonaje35.setVisible(true);
				lblPersonaje36.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
				lblPersonaje35.setVisible(true);
				lblPersonaje36.setVisible(true);
				lblPersonaje37.setVisible(true);
				
			}
			else if (cadena == "Se han creado 8 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
				lblPersonaje35.setVisible(true);
				lblPersonaje36.setVisible(true);
				lblPersonaje37.setVisible(true);
				lblPersonaje38.setVisible(true);
				
			}
			else if (cadena == "Se han creado 9 Elfo/s") {

				lblPersonaje31.setVisible(true);
				lblPersonaje32.setVisible(true);
				lblPersonaje33.setVisible(true);
				lblPersonaje34.setVisible(true);
				lblPersonaje35.setVisible(true);
				lblPersonaje36.setVisible(true);
				lblPersonaje37.setVisible(true);
				lblPersonaje38.setVisible(true);
				lblPersonaje39.setVisible(true);
				
			}
			
			//Creacion Personaje 4
			else if(cadena == "Se han creado 1 Mago/s") {
				
				lblPersonaje41.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
				lblPersonaje45.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
				lblPersonaje45.setVisible(true);
				lblPersonaje46.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
				lblPersonaje45.setVisible(true);
				lblPersonaje46.setVisible(true);
				lblPersonaje47.setVisible(true);
				
			}
			else if (cadena == "Se han creado 8 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
				lblPersonaje45.setVisible(true);
				lblPersonaje46.setVisible(true);
				lblPersonaje47.setVisible(true);
				lblPersonaje48.setVisible(true);
				
			}
			else if (cadena == "Se han creado 9 Mago/s") {

				lblPersonaje41.setVisible(true);
				lblPersonaje42.setVisible(true);
				lblPersonaje43.setVisible(true);
				lblPersonaje44.setVisible(true);
				lblPersonaje45.setVisible(true);
				lblPersonaje46.setVisible(true);
				lblPersonaje47.setVisible(true);
				lblPersonaje48.setVisible(true);
				lblPersonaje49.setVisible(true);
				
			}
			//Creacion Personaje 5
			else if(cadena == "Se han creado 1 Enanos/s") {
				
				lblPersonaje51.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
				lblPersonaje55.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
				lblPersonaje55.setVisible(true);
				lblPersonaje56.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
				lblPersonaje55.setVisible(true);
				lblPersonaje56.setVisible(true);
				lblPersonaje57.setVisible(true);
				
			}
			else if (cadena == "Se han creado 8 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
				lblPersonaje55.setVisible(true);
				lblPersonaje56.setVisible(true);
				lblPersonaje57.setVisible(true);
				lblPersonaje58.setVisible(true);
				
			}
			else if (cadena == "Se han creado 9 Enanos/s") {

				lblPersonaje51.setVisible(true);
				lblPersonaje52.setVisible(true);
				lblPersonaje53.setVisible(true);
				lblPersonaje54.setVisible(true);
				lblPersonaje55.setVisible(true);
				lblPersonaje56.setVisible(true);
				lblPersonaje57.setVisible(true);
				lblPersonaje58.setVisible(true);
				lblPersonaje59.setVisible(true);
				
			}
			
			//Creacion personaje 6 (Gollum)
			
			else if(cadena == "Se han creado 1 Gollum/s") {
				
				lblPersonaje61.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Gollum/s") {

				lblPersonaje61.setVisible(true);
				lblPersonaje62.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Gollum/s") {

				lblPersonaje61.setVisible(true);
				lblPersonaje62.setVisible(true);
				lblPersonaje63.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Gollum/s" || cadena == "Se han creado 5 Gollum/s" || 
					cadena == "Se han creado 6 Gollum/s"|| cadena == "Se han creado 7 Gollum/s" ||
					cadena == "Se han creado 8 Gollum/s" || cadena == "Se han creado 9 Gollum/s") {

				lblPersonaje61.setVisible(true);
				lblPersonaje62.setVisible(true);
				lblPersonaje63.setVisible(true);
				JOptionPane.showMessageDialog(null, "Limite de energía alcanzado, Máximos Gollums para generar: 3");
			}
			
			//Creacion Personaje 7
			else if(cadena == "Se han creado 1 Orco/s") {
				
				lblPersonaje71.setVisible(true);
			}
			
			
			else if (cadena == "Se han creado 2 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);

			}

			else if (cadena == "Se han creado 3 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);
				lblPersonaje73.setVisible(true);
			}
			else if (cadena == "Se han creado 4 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);
				lblPersonaje73.setVisible(true);
				lblPersonaje74.setVisible(true);
			}
			else if (cadena == "Se han creado 5 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);
				lblPersonaje73.setVisible(true);
				lblPersonaje74.setVisible(true);
				lblPersonaje75.setVisible(true);
				
			}
			else if (cadena == "Se han creado 6 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);
				lblPersonaje73.setVisible(true);
				lblPersonaje74.setVisible(true);
				lblPersonaje75.setVisible(true);
				lblPersonaje76.setVisible(true);
				
			}
			else if (cadena == "Se han creado 7 Orco/s" || cadena == "Se han creado 8 Orco/s" ||
					cadena == "Se han creado 9 Orco/s") {

				lblPersonaje71.setVisible(true);
				lblPersonaje72.setVisible(true);
				lblPersonaje73.setVisible(true);
				lblPersonaje74.setVisible(true);
				lblPersonaje75.setVisible(true);
				lblPersonaje76.setVisible(true);
				JOptionPane.showMessageDialog(null, "Limite de energía alcanzado, Máximos Orcos para generar: 6");
			}
			
		}
	}

}
