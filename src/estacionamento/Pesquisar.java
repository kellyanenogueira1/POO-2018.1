package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class Pesquisar extends JPanel {
	private JTextField placa;
	private JTextPane message;

	/**
	 * Create the panel.
	 */
	public Pesquisar() {
		setLayout(null);
		
		JLabel lblTelaDePesquisa = new JLabel("Pesquisar Cadastro");
		lblTelaDePesquisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDePesquisa.setBounds(10, 11, 430, 14);
		add(lblTelaDePesquisa);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(31, 55, 70, 14);
		add(lblPlaca);
		
		placa = new JTextField();
		placa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				message.setText("");
			}
		});
		placa.setBounds(111, 52, 170, 20);
		add(placa);
		placa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(placa.getText().length() > 0) {
					String str = Cadastrar.estacionamento.Exibir_Busca(placa.getText());
					message.setText(str);
				}else {
					JOptionPane.showMessageDialog(null, "Campo não preenchido!");
					message.setText("");
				}
			}
		});
		btnPesquisar.setBounds(291, 51, 100, 23);
		add(btnPesquisar);
		
		message = new JTextPane();
		message.setEditable(false);
		message.setBackground(UIManager.getColor("Button.background"));
		message.setBounds(133, 87, 170, 167);
		add(message);
	}
}
