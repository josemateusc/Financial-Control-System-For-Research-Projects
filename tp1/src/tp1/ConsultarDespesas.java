package tp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarDespesas {

	private JFrame frmConsultaDeDespesas;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarDespesas window = new ConsultarDespesas();
					window.frmConsultaDeDespesas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarDespesas() {
		initialize("");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String str) {
		frmConsultaDeDespesas = new JFrame();
		frmConsultaDeDespesas.setTitle("Consulta de Despesas");
		frmConsultaDeDespesas.setBounds(100, 100, 783, 530);
		
		JLabel lblNewLabel = new JLabel("Consulta de Despesas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o nome do Projeto:");
		
		textField = new JTextField();
		textField.setToolTipText("Insira o nome do Projeto");
		textField.setColumns(10);
		
		JTextPane txtpnResultado = new JTextPane();
		txtpnResultado.setText("Resultado: "+str);
		txtpnResultado.setEditable(false);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProjetosDAO projetoDAO = new ProjetosDAO();
					String string = projetoDAO.consultarDespesas(textField.getText());
					String str = "Projeto: " + textField.getText() +"\nLista de Despesas: ";
					if(string != str) {
						frmConsultaDeDespesas.setVisible(false);
						initialize("\n"+string);
						frmConsultaDeDespesas.setVisible(true);
					}
					else {
						frmConsultaDeDespesas.setVisible(false);
						initialize("");
						frmConsultaDeDespesas.setVisible(true);
					}
					
				}catch(Exception e1){ new ExceptionData().setVisible(true);}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Se o projeto não existir ou estiver errado, a consulta será ignorada");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		GroupLayout groupLayout = new GroupLayout(frmConsultaDeDespesas.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 564, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnResultado, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(txtpnResultado, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		frmConsultaDeDespesas.getContentPane().setLayout(groupLayout);
	}
	public void setVisible(boolean b) {
		frmConsultaDeDespesas.setVisible(b);
	}
}
