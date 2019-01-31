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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastrar extends JPanel {
	private JTextField nome;
	private JTextField matricula;
	private JTextField curso;
	private JTextField semestre;
	private JTextField cargo;
	private JTextField marca;
	private JTextField modelo;
	private JTextField cor;
	private JTextField placa;
	private final ButtonGroup tipo_usuario = new ButtonGroup();
	private final ButtonGroup tipo_veiculo = new ButtonGroup();
	public static Estacionamento estacionamento = new Estacionamento();

	/**
	 * Create the panel.
	 */
	public Cadastrar() {
		setLayout(null);
		
		JLabel lblTelaDeCadastro = new JLabel("Cadastrar Veículo");
		lblTelaDeCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaDeCadastro.setBounds(10, 11, 465, 20);
		add(lblTelaDeCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(20, 56, 60, 14);
		add(lblNome);
		
		nome = new JTextField();
		nome.setBounds(90, 53, 180, 20);
		add(nome);
		nome.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMatricula.setBounds(280, 56, 60, 14);
		add(lblMatricula);
		
		matricula = new JTextField();
		matricula.setBounds(350, 53, 110, 20);
		add(matricula);
		matricula.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(10, 81, 70, 14);
		add(lblUsuario);
		
		JRadioButton aluno = new JRadioButton("Aluno");
		aluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curso.setEnabled(true);
				semestre.setEnabled(true);
				cargo.setEnabled(false);
			}
		});
		tipo_usuario.add(aluno);
		aluno.setBounds(90, 77, 76, 23);
		add(aluno);
		
		JRadioButton servidor = new JRadioButton("Servidor");
		servidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curso.setEnabled(false);
				semestre.setEnabled(false);
				cargo.setEnabled(true);
			}
		});
		tipo_usuario.add(servidor);
		servidor.setBounds(180, 77, 90, 23);
		add(servidor);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurso.setBounds(20, 110, 60, 14);
		add(lblCurso);
		
		curso = new JTextField();
		curso.setEnabled(aluno.isSelected() ? true : false);
		curso.setBounds(90, 107, 180, 20);
		add(curso);
		curso.setColumns(10);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSemestre.setBounds(280, 110, 60, 14);
		add(lblSemestre);
		
		semestre = new JTextField();
		semestre.setEnabled(aluno.isSelected() ? true : false);
		semestre.setBounds(350, 107, 110, 20);
		add(semestre);
		semestre.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo.setBounds(20, 135, 60, 14);
		add(lblCargo);
		
		cargo = new JTextField();
		cargo.setEnabled(servidor.isSelected() ? true : false);
		cargo.setBounds(90, 132, 180, 20);
		add(cargo);
		cargo.setColumns(10);
		
		JLabel lblVeiculo = new JLabel("Ve\u00EDculo:");
		lblVeiculo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeiculo.setBounds(20, 160, 60, 14);
		add(lblVeiculo);
		
		JRadioButton moto = new JRadioButton("Moto");
		tipo_veiculo.add(moto);
		moto.setBounds(90, 156, 76, 23);
		add(moto);
		
		JRadioButton carro = new JRadioButton("Carro");
		tipo_veiculo.add(carro);
		carro.setBounds(180, 156, 90, 23);
		add(carro);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setBounds(20, 185, 60, 14);
		add(lblMarca);
		
		marca = new JTextField();
		marca.setBounds(90, 182, 180, 20);
		add(marca);
		marca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(280, 185, 60, 14);
		add(lblModelo);
		
		modelo = new JTextField();
		modelo.setBounds(350, 182, 110, 20);
		add(modelo);
		modelo.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setBounds(20, 210, 60, 14);
		add(lblCor);
		
		cor = new JTextField();
		cor.setBounds(90, 207, 180, 20);
		add(cor);
		cor.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(280, 210, 60, 14);
		add(lblPlaca);
		
		placa = new JTextField();
		placa.setBounds(350, 207, 110, 20);
		add(placa);
		placa.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nome.getText().length() > 0 && matricula.getText().length() > 0 && placa.getText().length() > 0) {
					if (aluno.isSelected()) {
						if (moto.isSelected()) {
							estacionamento.Cadastrar(new Veiculo(new Aluno(nome.getText(), matricula.getText(), curso.getText(), semestre.getText()),
									moto.getText(), marca.getText(), modelo.getText(), cor.getText(), placa.getText()));	
							Limpar();	
						} else if (carro.isSelected()) {
							estacionamento.Cadastrar(new Veiculo(new Aluno(nome.getText(), matricula.getText(), curso.getText(), semestre.getText()),
									carro.getText(), marca.getText(), modelo.getText(), cor.getText(), placa.getText()));
							Limpar();	
						} else {
							JOptionPane.showMessageDialog(null, "Selecione o tipo de veículo!");
						}
					} else if (servidor.isSelected()) {
						if (moto.isSelected()) {
							estacionamento.Cadastrar(new Veiculo(new Servidor(nome.getText(), matricula.getText(), cargo.getText()),
									moto.getText(), marca.getText(), modelo.getText(), cor.getText(), placa.getText()));
							Limpar();	
						} else if (carro.isSelected()) {
							estacionamento.Cadastrar(new Veiculo(new Servidor(nome.getText(), matricula.getText(), cargo.getText()), 
									carro.getText(), marca.getText(), modelo.getText(), cor.getText(), placa.getText()));
							Limpar();	
						} else {
							JOptionPane.showMessageDialog(null, "Selecione o tipo de veículo!");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Selecione o tipo de usuário!");
					}	
				}else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				}
			}
		});
		btnSalvar.setBounds(199, 267, 89, 23);
		add(btnSalvar);
		
	}
	
	public void Limpar() {
		nome.setText("");
		matricula.setText("");
		curso.setText("");
		semestre.setText("");
		cargo.setText("");
		marca.setText("");
		modelo.setText("");
		cor.setText("");
		placa.setText("");	
	}
}
