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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Editar extends JPanel {
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
	private JTextField buscarPlaca;
	private JButton btnSalvar;
	private JRadioButton aluno;
	private JRadioButton servidor;
	private int index;
	private List<Veiculo> v = new ArrayList<>();
	
	/**
	 * Create the panel.
	 */
	public Editar() {
		setLayout(null);
		
		JLabel lblEditar = new JLabel("Editar Cadastro");
		lblEditar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditar.setBounds(10, 11, 465, 20);
		add(lblEditar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(20, 94, 60, 14);
		add(lblNome);
		
		nome = new JTextField();
		nome.setBounds(90, 91, 180, 20);
		add(nome);
		nome.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMatricula.setBounds(280, 94, 60, 14);
		add(lblMatricula);
		
		matricula = new JTextField();
		matricula.setBounds(350, 91, 110, 20);
		add(matricula);
		matricula.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(10, 119, 70, 14);
		add(lblUsuario);
		
		aluno = new JRadioButton("Aluno");
		aluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curso.setEnabled(true);
				semestre.setEnabled(true);
				cargo.setEnabled(false);
			}
		});
		tipo_usuario.add(aluno);
		aluno.setBounds(90, 115, 76, 23);
		add(aluno);
		
		servidor = new JRadioButton("Servidor");
		servidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curso.setEnabled(false);
				semestre.setEnabled(false);
				cargo.setEnabled(true);
			}
		});
		tipo_usuario.add(servidor);
		servidor.setBounds(180, 115, 90, 23);
		add(servidor);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurso.setBounds(20, 148, 60, 14);
		add(lblCurso);
		
		curso = new JTextField();
		curso.setEnabled(aluno.isSelected() ? true : false);
		curso.setBounds(90, 145, 180, 20);
		add(curso);
		curso.setColumns(10);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSemestre.setBounds(280, 148, 60, 14);
		add(lblSemestre);
		
		semestre = new JTextField();
		semestre.setEnabled(aluno.isSelected() ? true : false);
		semestre.setBounds(350, 145, 110, 20);
		add(semestre);
		semestre.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCargo.setBounds(20, 173, 60, 14);
		add(lblCargo);
		
		cargo = new JTextField();
		cargo.setEnabled(servidor.isSelected() ? true : false);
		cargo.setBounds(90, 170, 180, 20);
		add(cargo);
		cargo.setColumns(10);
		
		JLabel lblVeiculo = new JLabel("Ve\u00EDculo:");
		lblVeiculo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeiculo.setBounds(20, 198, 60, 14);
		add(lblVeiculo);
		
		JRadioButton moto = new JRadioButton("Moto");
		tipo_veiculo.add(moto);
		moto.setBounds(90, 194, 76, 23);
		add(moto);
		
		JRadioButton carro = new JRadioButton("Carro");
		tipo_veiculo.add(carro);
		carro.setBounds(180, 194, 90, 23);
		add(carro);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarca.setBounds(20, 223, 60, 14);
		add(lblMarca);
		
		marca = new JTextField();
		marca.setBounds(90, 220, 180, 20);
		add(marca);
		marca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblModelo.setBounds(280, 223, 60, 14);
		add(lblModelo);
		
		modelo = new JTextField();
		modelo.setBounds(350, 220, 110, 20);
		add(modelo);
		modelo.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCor.setBounds(20, 248, 60, 14);
		add(lblCor);
		
		cor = new JTextField();
		cor.setBounds(90, 245, 180, 20);
		add(cor);
		cor.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlaca.setBounds(280, 248, 60, 14);
		add(lblPlaca);
		
		placa = new JTextField();
		placa.setBounds(350, 245, 110, 20);
		add(placa);
		placa.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setVisible(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(nome.getText().length() > 0 && matricula.getText().length() > 0 && placa.getText().length() > 0) {
						if (aluno.isSelected()) {
							if (moto.isSelected()) {
								Cadastrar.estacionamento.Editar(index, nome.getText(), matricula.getText(),
										marca.getText(), modelo.getText(), cor.getText(), placa.getText());
								Limpar();
							} else {
								Cadastrar.estacionamento.Editar(index, nome.getText(), matricula.getText(),
										marca.getText(), modelo.getText(), cor.getText(), placa.getText());
								Limpar();
							}
						} else {
							if (moto.isSelected()) {
								Cadastrar.estacionamento.Editar(index, nome.getText(), matricula.getText(),
										marca.getText(), modelo.getText(), cor.getText(), placa.getText());
								Limpar();
							} else {
								Cadastrar.estacionamento.Editar(index, nome.getText(), matricula.getText(), 
										marca.getText(), modelo.getText(), cor.getText(), placa.getText());
								Limpar();
							}
						}
					}else {
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					}
			}
		});
		btnSalvar.setBounds(210, 276, 89, 23);
		add(btnSalvar);
		
		JLabel lblBuscarPlaca = new JLabel("Placa:");
		lblBuscarPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBuscarPlaca.setBounds(10, 51, 70, 14);
		add(lblBuscarPlaca);
		
		buscarPlaca = new JTextField();
		buscarPlaca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Limpar();
			}
		});
		buscarPlaca.setBounds(90, 48, 250, 20);
		add(buscarPlaca);
		buscarPlaca.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(buscarPlaca.getText().length() > 0) {
					int aux = Cadastrar.estacionamento.Buscar(buscarPlaca.getText());
					if(aux!=-1) {
						v = Cadastrar.estacionamento.Preencher();
						index = aux;
						nome.setText(v.get(aux).getProprietario().get(aux).getNome());
						matricula.setText(v.get(aux).getProprietario().get(aux).getMatricula());
						aluno.setSelected(v.get(aux).getProprietario().get(aux).getClass().getName()==Aluno.class.getName()?true:false);
						servidor.setSelected(v.get(aux).getProprietario().get(aux).getClass().getName()==Servidor.class.getName()?true:false);
						curso.setText(aluno.isSelected()?"":"");
						curso.setEnabled(aluno.isSelected()?true:false);
						semestre.setText(aluno.isSelected()?"":"");
						semestre.setEnabled(aluno.isSelected()?true:false);
						cargo.setText(servidor.isSelected()?"":"");
						cargo.setEnabled(servidor.isSelected()?true:false);
						moto.setSelected(v.get(aux).getTipo_de_veiculo()=="Moto"?true:false);
						carro.setSelected(v.get(aux).getTipo_de_veiculo()=="Carro"?true:false);
						marca.setText(v.get(aux).getMarca());
						modelo.setText(v.get(aux).getModelo());
						cor.setText(v.get(aux).getCor());
						placa.setText(v.get(aux).getPlaca());
						btnSalvar.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Placa não encontrada!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Campo não preenchido!");
				}
			}
		});
		btnBuscar.setBounds(350, 47, 89, 23);
		add(btnBuscar);

	}
	
	public void Limpar() {
		nome.setText("");
		matricula.setText("");
		curso.setText("");
		curso.setEnabled(aluno.isSelected()?true:false);
		semestre.setText("");
		semestre.setEnabled(aluno.isSelected()?true:false);
		cargo.setText("");
		cargo.setEnabled(servidor.isSelected()?true:false);
		marca.setText("");
		modelo.setText("");
		cor.setText("");
		placa.setText("");
		btnSalvar.setVisible(false);
	}
}

