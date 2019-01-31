package estacionamento;

/**
 * 
 * IFCE - Campus Maracanaú
 * <br>POO (2018.1) - Prof. Jefferson Figueiredo
 * @author HENRIQUE, ISABEL, KELLYANE
 *
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Cadastrar panelCadastrar;
	private Excluir panelExcluir;
	private Pesquisar panelPesquisar;
	private Editar panelEditar;
	private Logar panelLogar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("PROJETO POO (2018.1)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCabecario = DefaultComponentFactory.getInstance().createTitle("Estacionamento IFCE - Campus Maracana\u00FA");
		lblCabecario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCabecario.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCabecario, BorderLayout.NORTH);
		
		JLabel lblRodape = DefaultComponentFactory.getInstance().createLabel("Desenvolvido por alunos do IFCE - Campus Maracana\u00FA");
		lblRodape.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblRodape.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRodape, BorderLayout.SOUTH);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar, BorderLayout.WEST);
		
		JMenuItem mntmInicio = new JMenuItem("In\u00EDcio");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelEditar.setVisible(false);
				panelCadastrar.setVisible(false);
				panelExcluir.setVisible(false);
				panelPesquisar.setVisible(false);
				panelLogar.setVisible(true);
			}
		});
		mntmInicio.setSelected(true);
		mntmInicio.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(mntmInicio);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogar.setVisible(false);
				panelEditar.setVisible(false);
				panelPesquisar.setVisible(false);
				panelExcluir.setVisible(false);
				panelCadastrar.setVisible(true);
			}
		});
		mntmCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(mntmCadastrar);
		
		JMenuItem mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogar.setVisible(false);
				panelEditar.setVisible(false);
				panelPesquisar.setVisible(false);
				panelCadastrar.setVisible(false);
				panelExcluir.setVisible(true);
			}
		});
		
		JMenuItem mntmPesquisar = new JMenuItem("Pesquisar");
		mntmPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogar.setVisible(false);
				panelEditar.setVisible(false);
				panelExcluir.setVisible(false);
				panelCadastrar.setVisible(false);
				panelPesquisar.setVisible(true);
			}
		});
		mntmPesquisar.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(mntmPesquisar);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mntmEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogar.setVisible(false);
				panelPesquisar.setVisible(false);
				panelCadastrar.setVisible(false);
				panelExcluir.setVisible(false);
				panelEditar.setVisible(true);
			}
		});
		mntmEditar.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(mntmEditar);
		mntmExcluir.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(mntmExcluir);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		panelCadastrar = new Cadastrar();
		panelCadastrar.setVisible(false);
		panelCadastrar.setBounds(0, 0, 500, 400);
		desktopPane.add(panelCadastrar);
		
		panelExcluir = new Excluir();
		panelExcluir.setVisible(false);
		panelExcluir.setBounds(0, 0, 500, 400);
		desktopPane.add(panelExcluir);
		
		panelPesquisar = new Pesquisar();
		panelPesquisar.setVisible(false);
		panelPesquisar.setBounds(0, 0, 500, 400);
		desktopPane.add(panelPesquisar);
		
		panelEditar = new Editar();
		panelEditar.setVisible(false);
		panelEditar.setBounds(0, 0, 500, 400);
		desktopPane.add(panelEditar);
		
		panelLogar = new Logar();
		panelLogar.setBounds(0, 0, 500, 400);
		desktopPane.add(panelLogar);
	}

}
