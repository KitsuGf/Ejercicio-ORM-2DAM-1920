package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MasStock extends JPanel {
	private JTextField campoNumericoMasStock;

	/**
	 * Create the panel.
	 */
	public MasStock() {
		setLayout(null);
		
		JButton btnAtrasMasStock = new JButton("Atras");
		btnAtrasMasStock.setBounds(332, 252, 89, 23);
		add(btnAtrasMasStock);
		
		JLabel lblAñadirStock = new JLabel("A\u00F1adir Stock");
		lblAñadirStock.setBounds(29, 256, 70, 14);
		add(lblAñadirStock);
		
		campoNumericoMasStock = new JTextField();
		campoNumericoMasStock.setToolTipText("");
		campoNumericoMasStock.setBounds(94, 253, 86, 20); 
		add(campoNumericoMasStock);
		campoNumericoMasStock.setColumns(10);
		
		JButton btnAñadirMasStock = new JButton("A\u00F1adir");
		btnAñadirMasStock.setBounds(233, 252, 89, 23);
		add(btnAñadirMasStock);
		//Select sin uso.
		String selectArticulo = "SELECT * FROM Articulo";
		
	}
}
