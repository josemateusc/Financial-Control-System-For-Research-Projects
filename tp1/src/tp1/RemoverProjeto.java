package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RemoverProjeto {

	private JFrame frmRemoverProjeto;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverProjeto window = new RemoverProjeto();
					window.frmRemoverProjeto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemoverProjeto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRemoverProjeto = new JFrame();
		frmRemoverProjeto.setTitle("Remover Projeto");
		frmRemoverProjeto.setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Qual projeto deseja remover do sistema?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setToolTipText("Insira o nome do Projeto");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o nome do Projeto:");
		
		JButton btnNewButton = new JButton("Remover!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProjetosDAO projetoDAO = new ProjetosDAO();
					projetoDAO.removerProjeto(textField.getText()+"");
					new AcaoConfirmada().setVisible(true);
					frmRemoverProjeto.setVisible(false);
				}catch(Exception e1){ new ExceptionData().setVisible(true);}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Obs.: Se o projeto não existir, a remoção será considerada feita.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frmRemoverProjeto.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
									.addGap(264))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
									.addGap(169)))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(103))))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(31)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(41))
		);
		frmRemoverProjeto.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		frmRemoverProjeto.setVisible(b);
	}
	
}
