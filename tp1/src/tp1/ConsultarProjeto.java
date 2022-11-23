package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ConsultarProjeto {

	private JFrame frmConsultaDeProjeto;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarProjeto window = new ConsultarProjeto();
					window.frmConsultaDeProjeto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarProjeto() {
		initialize("");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String str) {
		frmConsultaDeProjeto = new JFrame();
		frmConsultaDeProjeto.setTitle("Consulta de Projeto");
		frmConsultaDeProjeto.setBounds(100, 100, 797, 527);
		
		JLabel lblNewLabel = new JLabel("Qual projeto deseja consultar?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setToolTipText("Insira o nome do projeto");
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					ProjetosDAO projetoDAO = new ProjetosDAO();
					String string = projetoDAO.listarProjeto(textField.getText());
					if(string!=null) {
						frmConsultaDeProjeto.setVisible(false);
						initialize("\n"+string);
						frmConsultaDeProjeto.setVisible(true);
					}
					else {
						frmConsultaDeProjeto.setVisible(false);
						initialize("");
						frmConsultaDeProjeto.setVisible(true);
						new ExceptionData().setVisible(true);
					}
					
				}catch(Exception e1){ new ExceptionData().setVisible(true);}
			}
		});
		
		JTextArea txtrResultadon = new JTextArea();
		txtrResultadon.setEditable(false);
		txtrResultadon.setText("Resultado:" + str);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConsultaDeProjeto.setVisible(false);
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frmConsultaDeProjeto.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(149)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
					.addGap(139))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(191)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
					.addGap(186))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrResultadon, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(346, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(312))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(txtrResultadon, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addContainerGap())
		);
		frmConsultaDeProjeto.getContentPane().setLayout(groupLayout);
	}
	public void setVisible(boolean b) {
		frmConsultaDeProjeto.setVisible(b);
	}
}
