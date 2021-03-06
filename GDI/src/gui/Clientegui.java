package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import teste.Cliente;
import teste.Connect;
import teste.Endereco;
import teste.RepositorioCliente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Clientegui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomeCli;
	private JTextField textFieldNomeBus;
	private JTextField textFieldCpfCli;
	private JTextField textFieldCpfBusca;
	private JTextField textFieldSexoCli;
	private JTextField textFieldDataNascCli;
	private JTextField textFieldPesoCli;
	private JTextField textFieldCepCli;
	private JTextField textFieldNumCli;
	private JTextField textFieldRuaCli;
	private JTextField textFieldTelCli;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientegui frame = new Clientegui();
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
	public Clientegui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preencha os dados:");
		lblNewLabel.setBounds(10, 50, 128, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPesquisePor = new JLabel("Pesquise por:");
		lblPesquisePor.setBounds(268, 50, 128, 14);
		contentPane.add(lblPesquisePor);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 102, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldNomeCli = new JTextField();
		textFieldNomeCli.setBounds(50, 99, 208, 20);
		contentPane.add(textFieldNomeCli);
		textFieldNomeCli.setColumns(10);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(268, 99, 46, 14);
		contentPane.add(label);
		
		textFieldNomeBus = new JTextField();
		textFieldNomeBus.setColumns(10);
		textFieldNomeBus.setBounds(308, 96, 208, 20);
		contentPane.add(textFieldNomeBus);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 133, 46, 14);
		contentPane.add(lblCpf);
		
		textFieldCpfCli = new JTextField();
		textFieldCpfCli.setColumns(10);
		textFieldCpfCli.setBounds(50, 130, 208, 20);
		contentPane.add(textFieldCpfCli);
		
		JLabel lblCpf_1 = new JLabel("Cpf:");
		lblCpf_1.setBounds(268, 127, 46, 14);
		contentPane.add(lblCpf_1);
		
		textFieldCpfBusca = new JTextField();
		textFieldCpfBusca.setColumns(10);
		textFieldCpfBusca.setBounds(308, 124, 208, 20);
		contentPane.add(textFieldCpfBusca);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 161, 46, 14);
		contentPane.add(lblSexo);
		
		textFieldSexoCli = new JTextField();
		textFieldSexoCli.setColumns(10);
		textFieldSexoCli.setBounds(50, 158, 208, 20);
		contentPane.add(textFieldSexoCli);
		
		JLabel lblDataNas = new JLabel("Data Nas.:");
		lblDataNas.setBounds(10, 189, 46, 14);
		contentPane.add(lblDataNas);
		
		textFieldDataNascCli = new JTextField();
		textFieldDataNascCli.setColumns(10);
		textFieldDataNascCli.setBounds(50, 186, 208, 20);
		contentPane.add(textFieldDataNascCli);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 217, 46, 14);
		contentPane.add(lblPeso);
		
		textFieldPesoCli = new JTextField();
		textFieldPesoCli.setColumns(10);
		textFieldPesoCli.setBounds(50, 214, 208, 20);
		contentPane.add(textFieldPesoCli);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 248, 46, 14);
		contentPane.add(lblCep);
		
		textFieldCepCli = new JTextField();
		textFieldCepCli.setColumns(10);
		textFieldCepCli.setBounds(50, 245, 208, 20);
		contentPane.add(textFieldCepCli);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(10, 278, 46, 14);
		contentPane.add(lblNmero);
		
		textFieldNumCli = new JTextField();
		textFieldNumCli.setColumns(10);
		textFieldNumCli.setBounds(50, 275, 208, 20);
		contentPane.add(textFieldNumCli);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(10, 306, 46, 14);
		contentPane.add(lblRua);
		
		textFieldRuaCli = new JTextField();
		textFieldRuaCli.setColumns(10);
		textFieldRuaCli.setBounds(50, 303, 208, 20);
		contentPane.add(textFieldRuaCli);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome=textFieldNomeCli.getText();
				String cpf=textFieldCpfCli.getText();
				String sexo=textFieldSexoCli.getText();
				String data=textFieldDataNascCli.getText();
				String[]telefone={textFieldTelCli.getText()};
				String peso=textFieldPesoCli.getText();
				double pesoCli=Double.parseDouble(peso);
				
				String cep=textFieldCepCli.getText();
				String num=textFieldNumCli.getText();
				int numero=Integer.parseInt(num);
				String rua=textFieldRuaCli.getText();
				Connect.init();	
				RepositorioCliente rep=new RepositorioCliente(Connect.getConnection());
				try {
					rep.inserirCliente(cpf, nome, sexo, data, telefone, pesoCli, new Endereco(cep,numero,rua));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{ 
					Connect.close();
					}
			}
		});
		btnNewButton.setBounds(49, 378, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPesquisar = new JButton("Pesquisar Nome");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=textFieldNomeBus.getText().toString();
				
				Connect.init();	
				RepositorioCliente rep=new RepositorioCliente(Connect.getConnection());
				
				try {
					
					Cliente aux=rep.buscaNome(nome);				
				    if(aux == null) textArea.setText("Cliente n�o Cadastrado!");					
					else textArea.setText(aux.toString());
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
				finally{ 
					Connect.close();
					}
			}
		});
		btnPesquisar.setBounds(266, 378, 144, 23);
		contentPane.add(btnPesquisar);
		
		textFieldTelCli = new JTextField();
		textFieldTelCli.setColumns(10);
		textFieldTelCli.setBounds(50, 334, 208, 20);
		contentPane.add(textFieldTelCli);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 337, 46, 14);
		contentPane.add(lblTelefone);
		
		textArea = new JTextArea();
		textArea.setBounds(268, 172, 248, 181);
		contentPane.add(textArea);
		
		JButton btnRelatorio = new JButton("Relat\u00F3rio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connect.init();
				RepositorioCliente rep=new RepositorioCliente(Connect.getConnection());
				try {
					textArea.setText(rep.relatorioCliente().toString());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnRelatorio.setBounds(268, 410, 89, 23);
		contentPane.add(btnRelatorio);
		
		JButton btnPesquisarPorCpf = new JButton("Pesquisar  Cpf");
		btnPesquisarPorCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cpf=textFieldNomeBus.getText().toString();
				Connect.init();	
				RepositorioCliente rep=new RepositorioCliente(Connect.getConnection());
				
				try {
					
					Cliente aux=rep.buscaCPF(cpf);				
				    if(aux == null) textArea.setText("Cliente n�o Cadastrado!");					
					else textArea.setText(aux.toString());
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
				finally{ 
					Connect.close();
					}
		
				
			}
		});
		btnPesquisarPorCpf.setBounds(431, 378, 133, 23);
		contentPane.add(btnPesquisarPorCpf);
	}
}
