package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarProjeto {

	private JFrame frmAlterarProjeto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNewLabel_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_10;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarProjeto window = new AlterarProjeto();
					window.frmAlterarProjeto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlterarProjeto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlterarProjeto = new JFrame();
		frmAlterarProjeto.setTitle("Alterar Projeto");
		frmAlterarProjeto.setBounds(100, 100, 543, 369);
		
		JLabel lblNewLabel = new JLabel("Insira os dados do Projeto que deseja alterar!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Caso o projeto não exista, ele será criado! :)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do Projeto:");
		
		textField = new JTextField();
		textField.setToolTipText("Insira o Nome do Projeto que deseja alterar");
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome do Professor:");
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Insira o professor responsável");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Despesa de Capital:");
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Valor Previsto");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Valor Gasto");
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Material de Consumo:");
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Valor Previsto");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("Valor Gasto");
		textField_5.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Lista de Despesas:");
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Insira a lista de despesas");
		textField_6.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Serviço de Terceiros / PF:");
		
		textField_7 = new JTextField();
		textField_7.setToolTipText("Valor Previsto");
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("Valor Gasto");
		textField_8.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Serviço de Terceiros / PJ:");
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("Valor Previsto");
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setToolTipText("Valor Gasto");
		textField_10.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Diárias");
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("Valor Previsto");
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setToolTipText("Valor Gasto");
		textField_12.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Passagens:");
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("Valor Previsto");
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setToolTipText("Valor Gasto");
		textField_14.setColumns(10);
		
		JButton btnNewButton = new JButton("Alterar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Projeto projeto = new Projeto(textField.getText(),textField_1.getText(),
					Double.parseDouble(textField_2.getText()), Double.parseDouble(textField_3.getText()),
					Double.parseDouble(textField_4.getText()), Double.parseDouble(textField_5.getText()),
					Double.parseDouble(textField_7.getText()), Double.parseDouble(textField_8.getText()),
					Double.parseDouble(textField_9.getText()), Double.parseDouble(textField_10.getText()),
					Double.parseDouble(textField_11.getText()), Double.parseDouble(textField_12.getText()),
					Double.parseDouble(textField_13.getText()), Double.parseDouble(textField_14.getText()),
					textField_6.getText()
					);
					
					ProjetosDAO projetoDAO = new ProjetosDAO();
					projetoDAO.alterarProjeto(projeto);
					new AcaoConfirmada().setVisible(true);
					frmAlterarProjeto.setVisible(false);
				}catch(Exception e1){ new ExceptionData().setVisible(true); }
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmAlterarProjeto.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
									.addGap(76)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
											.addGap(19)))))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
							.addGap(320))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_6)
							.addContainerGap(364, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_7))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_9))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_10))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		frmAlterarProjeto.getContentPane().setLayout(groupLayout);
	}
	public void setVisible(boolean b) {
		frmAlterarProjeto.setVisible(true);
	}
}
