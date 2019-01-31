package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Logar extends JPanel {
	private JTextField placa;
	private JTextPane message;
	/**
	 * Create the panel.
	 */
	public Logar() {
		setLayout(null);
		
		JLabel lblLogar = new JLabel("Tela de Login");
		lblLogar.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogar.setBounds(10, 11, 430, 20);
		add(lblLogar);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(43, 59, 80, 14);
		add(lblPlaca);
		
		placa = new JTextField();
		placa.setBounds(133, 56, 170, 20);
		add(placa);
		placa.setColumns(10);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(placa.getText().length() > 0) {
					String str = Cadastrar.estacionamento.Logar_Estacionamento(placa.getText());
					message.setText(str);
				}else {
					JOptionPane.showMessageDialog(null, "Campo não preenchido!");
					message.setText("");
				}
			}
		});
		btnLogar.setBounds(313, 55, 89, 23);
		add(btnLogar);
		
		message = new JTextPane();
		message.setEditable(false);
		message.setBackground(UIManager.getColor("Button.background"));
		message.setBounds(133, 87, 170, 167);
		add(message);
	}

}
