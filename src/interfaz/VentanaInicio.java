package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio extends JFrame implements ActionListener {

	private JPanel pnlPrincipal;
	private JPanel Fondo;
	private JButton btnInicio;
	private JLabel lblFondo;

	public VentanaInicio() {
		setSize(400, 250); // Establecer tamaño
		setTitle("The Lord Of Rings"); // Agregar Titulo;
		setLocationRelativeTo(null);// salga en el centro
		iniciarComponentes();
		setResizable(false);
	}

	public void iniciarComponentes() {

		pnlPrincipal = new JPanel();
		pnlPrincipal.setLayout(null);

		btnInicio = new JButton();
		btnInicio.setText("Start");
		btnInicio.setBounds(130, 120, 130, 30);
		btnInicio.addActionListener(this);
		btnInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));

		lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, this.getWidth(), this.getHeight());
		lblFondo.setLayout(null);

		ImageIcon BannerInicio = new ImageIcon("img/BannerInicio.jpg");
		Icon Banner = new ImageIcon(BannerInicio.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(),Image.SCALE_SMOOTH));
		lblFondo.setIcon(Banner);

		pnlPrincipal.add(btnInicio);
		pnlPrincipal.add(lblFondo);

		add(pnlPrincipal);
		this.setVisible(true);

	}

	// Debo agregarle el if(e.getSource()==btnOk{Acción con ese botón}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnInicio){
			
			new VentanaPersonajes();
			this.setVisible(false);
			}

	}

}
