package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;

public class CadastrarProjeto {

	private JFrame frmCadastrarProjeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProjeto window = new CadastrarProjeto();
					window.frmCadastrarProjeto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarProjeto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastrarProjeto = new JFrame();
		frmCadastrarProjeto.setTitle("Cadastrar Projeto");
		frmCadastrarProjeto.setBounds(150, 150, 449, 356);
		
		JLabel lblNewLabel = new JLabel("Formulário de cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextPane txtpnTeste = new JTextPane();
		txtpnTeste.setToolTipText("Insira o Nome do Projeto");
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Projeto:");
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do Professor: ");
		
		JTextPane txtpnTeste_1 = new JTextPane();
		txtpnTeste_1.setToolTipText("Insira o Nome do Professor Responsável");
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Despesas de Capital: ");
		
		JTextPane txtpnTeste_1_1 = new JTextPane();
		txtpnTeste_1_1.setToolTipText("Valor Previsto");
		
		JTextPane txtpnTeste_1_1_3 = new JTextPane();
		txtpnTeste_1_1_3.setToolTipText("Valor Gasto");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Material de Consumo: ");
		
		JTextPane txtpnTeste_1_1_1 = new JTextPane();
		txtpnTeste_1_1_1.setToolTipText("Valor Previsto");
		
		JTextPane txtpnTeste_1_1_1_1 = new JTextPane();
		txtpnTeste_1_1_1_1.setToolTipText("Valor Gasto");
		
		JLabel lblNewLabel_1_2 = new JLabel("Serviço de Terceiros/PF:");
		
		JTextPane txtpnTeste_1_2 = new JTextPane();
		txtpnTeste_1_2.setToolTipText("Valor Previsto");
		
		JTextPane txtpnTeste_1_2_2 = new JTextPane();
		txtpnTeste_1_2_2.setToolTipText("Valor Gasto");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Serviço de Terceiros/PJ:");
		
		JTextPane txtpnTeste_1_2_1 = new JTextPane();
		txtpnTeste_1_2_1.setToolTipText("Valor Previsto");
		
		JTextPane txtpnTeste_1_2_1_2 = new JTextPane();
		txtpnTeste_1_2_1_2.setToolTipText("Valor Gasto");
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Diárias:");
		
		JTextPane txtpnTeste_1_2_1_1 = new JTextPane();
		txtpnTeste_1_2_1_1.setToolTipText("Valor Previsto");
		
		JTextPane txtpnTeste_1_2_1_1_2 = new JTextPane();
		txtpnTeste_1_2_1_1_2.setToolTipText("Valor Gasto");
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Passagens:");
		
		JTextPane txtpnTeste_1_2_1_1_1 = new JTextPane();
		txtpnTeste_1_2_1_1_1.setToolTipText("Valor Previsto");
		
		JLabel lblNewLabel_2 = new JLabel("Lista de Despesas:");
		
		JTextPane txtpnTeste_1_1_2 = new JTextPane();
		txtpnTeste_1_1_2.setToolTipText("Insira as despesas separadas por vírgulas");
		
		JTextPane txtpnTeste_1_2_1_1_1_1 = new JTextPane();
		txtpnTeste_1_2_1_1_1_1.setToolTipText("Valor Gasto");
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				System.out.println(Double.parseDouble(txtpnTeste_1_2_1_1_1_1.getText()));
			try {
				Projeto projeto = new Projeto(txtpnTeste.getText(),txtpnTeste_1.getText(),
	 			Double.parseDouble(txtpnTeste_1_1.getText()), Double.parseDouble(txtpnTeste_1_1_3.getText()),
	  			Double.parseDouble(txtpnTeste_1_1_1.getText()), Double.parseDouble(txtpnTeste_1_1_1_1.getText()),
	  			Double.parseDouble(txtpnTeste_1_2.getText()), Double.parseDouble(txtpnTeste_1_2_2.getText()),
	  			Double.parseDouble(txtpnTeste_1_2_1.getText()), Double.parseDouble(txtpnTeste_1_2_1_2.getText()),
	  			Double.parseDouble(txtpnTeste_1_2_1_1.getText()), Double.parseDouble(txtpnTeste_1_2_1_1_2.getText()),
	  			Double.parseDouble(txtpnTeste_1_2_1_1_1.getText()), Double.parseDouble(txtpnTeste_1_2_1_1_1_1.getText()),
	  			(txtpnTeste_1_1_2.getText()+""));
				
				ProjetosDAO projetosDAO = new ProjetosDAO();
				projetosDAO.cadastrarProjeto(projeto);
				new AcaoConfirmada().setVisible(true);
				frmCadastrarProjeto.setVisible(false);
			}catch(Exception e1){ new ExceptionData().setVisible(true); }
			
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frmCadastrarProjeto.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(txtpnTeste, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(txtpnTeste_1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1_1_1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
							.addGap(22))
						.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnTeste_1_1_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnTeste_1_1_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtpnTeste_1_1_2, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2_1_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnTeste_1_2_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_2_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnTeste_1_2_1_2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_2_1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtpnTeste_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnTeste_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
					.addGap(25))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnTeste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtpnTeste_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnTeste_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnTeste_1_1_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_1_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnTeste_1_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnTeste_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnTeste_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtpnTeste_1_2_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_2_1, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnTeste_1_2_1, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
								.addComponent(txtpnTeste_1_2_1_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_2_1_1, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtpnTeste_1_2_1_1, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
								.addComponent(txtpnTeste_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtpnTeste_1_2_1_1_1, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(txtpnTeste_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
					.addGap(2)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(txtpnTeste_1_1_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		frmCadastrarProjeto.getContentPane().setLayout(groupLayout);
	}
	
	public void setVisible(boolean b) {
		frmCadastrarProjeto.setVisible(true);
	}
}
