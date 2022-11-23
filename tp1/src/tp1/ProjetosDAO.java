package tp1;
import java.sql.*;

/**
 * Classe ProjetosDAO - Faz a comunicacao com o Banco de Dados e integra com a interface grafica
 * @author Jose Mateus Cordova Rodrigues &lt;jose.cordova@icomp.ufam.edu.br&gt;
 * @version 1.0, 2022-08-17
 */
public class ProjetosDAO extends BancoDeDados{
	/** Frase com conteúdo do projeto */
	public String str;
	
	/** Esse metodo imprime no console todos os projetos e seus atributos */
	public void listarProjetos() {
	    try {
	      Statement st = conexao.createStatement();
	      ResultSet rs = st.executeQuery("SELECT * FROM projetos");
	      while (rs.next()) {
	        System.out.print("Projeto: " + rs.getString(1) + 
	                           ", Professor: "+ rs.getString(2));
	        consultarRubrica(rs.getString(1));
	        System.out.println();
	        consultarDespesas(rs.getString(1));
	      }
	    }
	    catch (SQLException e) {System.out.println("Erro na Querry"); }
	}
	
	/** Esse metodo retorna um projetos e seus atributos que e buscado pelo nome
	 * @return a string retornada contem todos os elementos que caracterizam um sistemas*/
	public String listarProjeto(String projeto) {
	    try {
	      
	      Statement st = conexao.createStatement();
	      String query = "SELECT * FROM projetos WHERE Nome_Projeto="+"'"+projeto+"' AND nome_projeto IS NOT NULL";
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next()) {
	    	this.str = "";
	        System.out.print("Projeto: " + rs.getString(1) + 
	                           ", Professor: "+ rs.getString(2));
	        
	        this.str += "Projeto: "+rs.getString(1) + "\nProfessor: "+rs.getString(2);
	        
	        consultarRubrica(rs.getString(1));
	        System.out.println();
	        consultarDespesas(rs.getString(1));
	        
	      }
	      return str;
	    }
	    catch (SQLException e) {System.out.println("Erro na Querry"); return null;}
	}
	
	/** Esse metodo insere em um string as rubricas de um projeto que e buscado pelo nome */
	public void consultarRubrica(String projeto) {
	    try {
	      Statement st = conexao.createStatement();
	      String query = "SELECT * FROM rubricas WHERE Nome_Projeto="+"'"+projeto+"'";
	      ResultSet rs = st.executeQuery(query);
	      while (rs.next()) {
	        System.out.print(", Capital Previsto: "+ rs.getDouble(2) + 
	                           ", Capital Gasto: "+rs.getDouble(3) +
	                           ", Capital Disponível: "+ ( rs.getDouble(2) - rs.getDouble(3)) + 
	                           ", Material de Consumo Previsto: "+ rs.getDouble(4) + 
	                           ", Material de Consumo Gasto: "+rs.getDouble(5) +
	                           ", Material de Consumo Disponível: "+ ( rs.getDouble(4) - rs.getDouble(5)) +
	                           ", Serviço PF Previsto: "+ rs.getDouble(6) + 
	                           ", Serviço PF Gasto: "+rs.getDouble(7) +
	                           ", Serviço PF Disponível: "+ ( rs.getDouble(6) - rs.getDouble(7)) +
	                           ", Serviço PJ Previsto: "+ rs.getDouble(8) + 
	                           ", Serviço PJ Gasto: "+rs.getDouble(9) +
	                           ", Serviço PJ Disponível: "+ ( rs.getDouble(8) - rs.getDouble(9)) +
	                           ", Diárias Previsto: "+ rs.getDouble(10) + 
	                           ", Diárias Gasto: "+rs.getDouble(11) +
	                           ", Diárias Disponível: "+ ( rs.getDouble(10) - rs.getDouble(11)) +
	                           ", Passagens Previsto: "+ rs.getDouble(12) + 
	                           ", Passagens Gasto: "+rs.getDouble(13) +
	                           ", Passagens Disponível: "+ ( rs.getDouble(12) - rs.getDouble(13)));
	        this.str += "\nCapital Previsto: R$ "+ rs.getDouble(2) + 
                ", Capital Gasto: R$ "+rs.getDouble(3) +
                ", Capital Disponível: R$ "+ ( rs.getDouble(2) - rs.getDouble(3)) + 
                "\nMaterial de Consumo Previsto: R$ "+ rs.getDouble(4) + 
                ", Material de Consumo Gasto: R$ "+rs.getDouble(5) +
                ", Material de Consumo Disponível: R$ "+ ( rs.getDouble(4) - rs.getDouble(5)) +
                "\nServiço PF Previsto: R$ "+ rs.getDouble(6) + 
                ", Serviço PF Gasto: R$ "+rs.getDouble(7) +
                ", Serviço PF Disponível: R$ "+ ( rs.getDouble(6) - rs.getDouble(7)) +
                "\nServiço PJ Previsto: R$ "+ rs.getDouble(8) + 
                ", Serviço PJ Gasto: R$ "+rs.getDouble(9) +
                ", Serviço PJ Disponível: R$ "+ ( rs.getDouble(8) - rs.getDouble(9)) +
                "\nDiárias Previsto: R$ "+ rs.getDouble(10) + 
                ", Diárias Gasto: R$ "+rs.getDouble(11) +
                ", Diárias Disponível: R$ "+ ( rs.getDouble(10) - rs.getDouble(11)) +
                "\nPassagens Previsto: R$ "+ rs.getDouble(12) + 
                ", Passagens Gasto: R$ "+rs.getDouble(13) +
                ", Passagens Disponível: R$ "+ ( rs.getDouble(12) - rs.getDouble(13));
	      }
	    }
	    catch (SQLException e) {System.out.println("Erro na Querry"); }
	}
	
	/** Esse metodo retorna uma string com as despesas de um projeto que e buscado pelo nome, ou seja, retorna a lista de despesas
	 * @return A lista de Despesas */
	public String consultarDespesas(String projeto) {
	    try {
	      String lista = "";
	      Statement st = conexao.createStatement();
	      String query = "SELECT * FROM lista_despesas WHERE Nome_Projeto="+"'"+projeto+"'";
	      ResultSet rs = st.executeQuery(query);	      
	      int cont=0;
	      this.str +="\nLista de Despesas: ";
	      lista = "Projeto: " + projeto +"\nLista de Despesas: ";
	      
	      boolean flag = false; //se existe lista de despesa
	      
	      while (rs.next()) {
	    	  if(cont != 0) {
	    		  this.str+=", ";
	    		  lista+=", ";
	    	  }
	    	  this.str+=rs.getString(2);
	    	  lista+=rs.getString(2);
	    	  if(cont == 0) {
	    		  cont++;
	    		  flag=true;
	    	  }
//	        System.out.println("Despesa: "+ rs.getString(2));
	      }
	      if(flag==false) return "";
	      return lista;
	    }
	    catch (SQLException e) {System.out.println("Erro na Querry"); return "";}
	}
	
	/** Esse metodo cadastra um projeto no banco de dados
	 * @param projeto E um objeto do tipo Projeto, que contem todas as informacoes necessarias sobre um projeto */
	public void cadastrarProjeto(Projeto projeto) {
		try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("INSERT INTO projetos VALUES ( '" + 
		    		  						projeto.getProjeto() + "', '" + 
		    		  						projeto.getProfessor() + "')" );
		      cadastrarRubricas(projeto);
		      cadastrarDespesas(projeto.getProjeto(),projeto.getListaDespesas());
		    }
		    catch (SQLException e) {System.out.println("Erro no Cadastro do Projeto"); }
	}
	
	/** Esse metodo cadastra as rubricas no banco de dados
	 * @param projeto E um objeto do tipo Projeto, que contem as rubricas do projeto */
	public void cadastrarRubricas(Projeto projeto) {
		try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("INSERT INTO rubricas VALUES ( '" + 
		    		  						projeto.getProjeto() + "', '" + 
		    		  						projeto.getCapitalPrevisto() + "', '" +
		    		  						projeto.getCapitalGasto() + "', '" +
		    		  						projeto.getMaterialPrevisto() + "', '" +
		    		  						projeto.getMaterialGasto() + "', '" +
		    		  						projeto.getServicoPfPrevisto() + "', '" +
		    		  						projeto.getServicoPfGasto() + "', '" +
		    		  						projeto.getServicoPjPrevisto() + "', '" +
		    		  						projeto.getServicoPjGasto() + "', '" +
		    		  						projeto.getDiariasPrevisto() + "', '" +
		    		  						projeto.getDiariasGasto() + "', '" +
		    		  						projeto.getPassagensPrevisto() + "', '" +
		    		  						projeto.getPassagensGasto()
		    		  						+ "')" );
		    }
		    catch (SQLException e) {System.out.println("Erro no Cadastro de Rubricas"); }
	}
	
	/** Esse metodo cadastra a lista de despesa no banco de dados
	 * @param projeto E uma String que e o nome do projeto
	 * @param listaDespesas E a lista de despesas que deve ser adicionada
	*/
	public boolean cadastrarDespesas(String projeto,String listaDespesas) {
		try {
		      String despesa[] = listaDespesas.split(",");	
		     
		      for(int i=0; i<despesa.length; i++) {
		    	  if(despesa[i]!="") {
		    		  String query = "INSERT INTO lista_despesas VALUES ( '" + projeto + "',";
			    	  
			    	  query += "'" + despesa[i] + "'";
			    	  
			    	  query += ")";
			    	  Statement st = conexao.createStatement();
			    	  st.executeUpdate(query);
		    	  }
		      }
		      return true;
		    }
		    catch (SQLException e) {System.out.println("Erro no Cadastro da Lista de Despesa"); return false;}
	}
	
	/** Esse metodo remove o projeto do banco de dados
	 * @param projeto E uma String que e o nome do projeto
	*/
	public void removerProjeto(String projeto) {
		try {
		      Statement st = conexao.createStatement();
		      st.executeUpdate("DELETE FROM rubricas WHERE nome_projeto='" + 
		    		  						projeto + "'" );
		      st.executeUpdate("DELETE FROM lista_despesas WHERE nome_projeto='" + 
						projeto + "'" );
		      st.executeUpdate("DELETE FROM PROJETOS WHERE nome_projeto='" + 
						projeto + "'" );
		    }
		    catch (SQLException e) {System.out.println("Erro ao Deletar"); }
	}
	
	//A alteração foi feita dessa forma por uma questão de simplicidade, já que deveria ser alterado todo o projeto
	/** Esse metodo altera o projeto de mesmo nome no banco de dados
	 * @param projeto E um objeto do tipo Projeto que corresponde ao projeto alterado
	*/
	public void alterarProjeto(Projeto projeto) {
		removerProjeto(projeto.getProjeto());
		cadastrarProjeto(projeto);
	}
	
	/** Esse metodo remove a lista de despesa do banco de dados
	 * @param nome_projeto E uma String que e o nome do projeto
	 * @param despesa E a despesa que deve ser removida
	*/
	public void removerDespesa(String nome_projeto,String despesa) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM lista_despesas WHERE despesas='" + 
					despesa + "' AND nome_projeto='" + nome_projeto + "'" );
		}
		catch (SQLException e) {System.out.println("Erro ao Deletar Despesa"); }
	}
	
	/** Esse metodo altera a lista de despesa no banco de dados
	 * @param projeto E uma String que e o nome do projeto
	 * @param despesas E a lista de despesas que deve ser alterada
	*/
	public void alterarDespesa(String projeto, String despesas) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM lista_despesas WHERE nome_projeto='" + 
					projeto + "'" );
			cadastrarDespesas(projeto, despesas);
		}
		catch (SQLException e) {System.out.println("Erro ao Alterar Despesa"); }
	}
	
	/** Esse metodo retorna o valor do orcamento previsto de totos os projetos cadastrados
	 * @return cont E o contador que soma os valores previstos
	*/
	public double getOrcamentoTotal() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM rubricas");
			double cont = 0;
			while(rs.next()) {
				cont += rs.getDouble(2) + rs.getDouble(4) + rs.getDouble(6) + rs.getDouble(8) + rs.getDouble(10) +  rs.getDouble(12);
			}
			return cont;
		}
		catch (SQLException e) {System.out.println("Erro ao Contar os projetos"); return 0.0;}
	}
	
	/** Esse metodo retorna a quantidade de projetos cadastrados
	 * @return cont E o total de projetos
	*/
	public int getNumeroProjetos() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM projetos where nome_projeto IS NOT NULL");
			int cont = 0;
			while(rs.next()) {
				cont++;
			}
			return cont;
		}
		catch (SQLException e) {System.out.println("Erro ao Contar os projetos"); return 0;}
	}
	
	public static void main(String args[]) {
		ProjetosDAO projetosDAO = new ProjetosDAO();
		//projetosDAO.listarProjetos();
//		Projeto projeto = new Projeto("xxxxx", "Horacio", 5000.00, 0.0, 1000.00, 0.0, 500.00, 0.0, 50.00, 0.0, 0.0, 0.0, 0.0,0.0, "Chocolate,limao");
//		projetosDAO.listarProjeto("Devtitans");
		//projetosDAO.cadastrarProjeto(projeto);
//		projetosDAO.removerProjeto("");
		
//		projetosDAO.alterarProjeto(projeto);
		
//		projetosDAO.removerDespesas(projeto.getProjeto(), "cadeira");
		
//		projetosDAO.alterarDespesa(projeto);
//		System.out.println(projetosDAO.numeroProjetos());
//		projetosDAO.listarProjeto("icomp");
	}

	

}