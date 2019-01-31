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
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Excluir extends JPanel {
	private JTextField placa;
	private JTextPane message;
	private JButton btnExcluir;

	/**
	 * Create the panel.
	 */
	public Excluir() {
		setLayout(null);
		
		JLabel lblExcluirCadastro = new JLabel("Excluir Cadastro");
		lblExcluirCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblExcluirCadastro.setBounds(10, 11, 450, 20);
		add(lblExcluirCadastro);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(43, 59, 80, 14);
		add(lblPlaca);
		
		placa = new JTextField();
		placa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				message.setText("");
				btnExcluir.setVisible(false);
			}
		});
		placa.setBounds(133, 56, 170, 20);
		add(placa);
		placa.setColumns(10);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setVisible(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastrar.estacionamento.Deletar(placa.getText());
				placa.setText("");
				message.setText("");
				btnExcluir.setVisible(false);
			}
		});
		btnExcluir.setBounds(182, 265, 100, 23);
		add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(placa.getText().length() > 0) {
					String str = Cadastrar.estacionamento.Exibir_Busca(placa.getText());
					message.setText(str);
					btnExcluir.setVisible(Cadastrar.estacionamento.Buscar(placa.getText())!=-1?true:false);
				}else {
					JOptionPane.showMessageDialog(null, "Campo não preenchido!");
					message.setText("");
				}
			}
		});
		btnBuscar.setBounds(313, 55, 89, 23);
		add(btnBuscar);
		
		message = new JTextPane();
		message.setEditable(false);
		message.setBackground(UIManager.getColor("Button.background"));
		message.setBounds(133, 87, 170, 167);
		add(message);
	}
}
