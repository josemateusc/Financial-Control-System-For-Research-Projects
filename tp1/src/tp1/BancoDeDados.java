package tp1;
import java.sql.*;

/**
 * Classe BancoDeDados - Faz a conexao com o Banco de Dados
 * @author Jose Mateus Cordova Rodrigues &lt;jose.cordova@icomp.ufam.edu.br&gt;
 * @version 1.0, 2022-08-17
 */
public class BancoDeDados {
	/** Endereco do database*/
	private static String url = "jdbc:mysql://localhost:3306/db_projetos";
	/** Login do usuario*/
	private static String user = "root";
	/** Senha do usario*/
	private static String pass = "Jo2002se";
	protected static Connection conexao = null;
	
	/** Se nao houver a conexao, ela ira ser feita */
	public BancoDeDados() {
		if (conexao == null) conecta();
	}
	
	/** Esse metodo faz a conexao */
	private static boolean conecta() {
	    try {
	      conexao = DriverManager.getConnection(url, user, pass);
	      return true;
	    } catch (SQLException e) { System.out.println("Problema na conexão"); return false; }
	  }
	
	
	/** Esse metodo desconecta o Banco de Dados
	 * @return Se foi executada com sucesso */
	public static boolean desconecta() {
	    try {
	      conexao.close();
	      return true;
	    } catch (SQLException e) { System.out.println("Problema na desconexão"); return false; }
	  }

}
