package tp1;

/**
 * Classe Projeto - E a classe do objeto que caracteriza e contem os atributos dos projetos
 * @author Jose Mateus Cordova Rodrigues &lt;jose.cordova@icomp.ufam.edu.br&gt;
 * @version 1.0, 2022-08-17
 */
public class Projeto {
	private String projeto;
	private String professor;
	private double capitalPrevisto;
	private double capitalGasto;
	private double materialPrevisto;
	private double materialGasto;
	private double servicoPfPrevisto;
	private double servicoPfGasto;
	private double servicoPjPrevisto;
	private double servicoPjGasto;
	private double diariasPrevisto;
	private double diariasGasto;
	private double passagensPrevisto;
	private double passagensGasto;
	private String listaDespesas;
	
	/** E o Construtor da classe Projeto
	 * @param projeto Representa o nome do projeto
	 * @param professor Representa o nome do professor
	 * @param capitalPrevisto Representa o orcamento previsto destinado a Despesas de Capital
	 * @param capitalGasto Representa o orcamento gasto da Despesas de Capital
	 * @param materialPrevisto Representa o orcamento previsto destinado a Material de Consumo
	 * @param materialGasto Representa o orcamento gasto de Material de Consumo
	 * @param servicoPfPrevisto Representa o orcamento previsto destinado a Servicos de Terceiros / Pessoa Fisica
	 * @param servicoPfGasto Representa o orcamento gasto de Servicos de Terceiros / Pessoa Fisica
	 * @param servicoPjPrevisto Representa o orcamento previsto destinado a Servicos de Terceiros / Pessoa Juridica
	 * @param servicoPjGasto Representa o orcamento gasto de Servicos de Terceiros / Pessoa Juridica
	 * @param diariasPrevisto Representa o orcamento previsto destinado a Diarias
	 * @param diariasGasto Representa o orcamento gasto de Diarias
	 * @param passagensPrevisto Representa o orcamento previsto destinado a Passagens
	 * @param passagensGasto Representa o orcamento gasto de Passagens
	 * @param listaDespesas Representa a Lista de Despesas
	 */
	public Projeto(String projeto, String professor, double capitalPrevisto, double capitalGasto, double materialPrevisto,
			double materialGasto, double servicoPfPrevisto, double servicoPfGasto, double servicoPjPrevisto, 
			double servicoPjGasto, double diariasPrevisto, double diariasGasto,  double passagensPrevisto,
			double passagensGasto, String listaDespesas) {
		
		this.projeto = projeto;
		this.professor = professor;
		this.capitalPrevisto = capitalPrevisto;
		this.capitalGasto = capitalGasto;
		
		this.materialPrevisto = materialPrevisto;
		this.materialGasto = materialGasto;
		
		this.servicoPfPrevisto = servicoPfPrevisto;
		this.servicoPfGasto = servicoPfGasto;
		
		this.servicoPjPrevisto = servicoPjPrevisto;
		this.servicoPjGasto = servicoPjGasto;
		
		this.diariasPrevisto = diariasPrevisto;
		this.diariasGasto = diariasGasto;
		
		this.passagensPrevisto = passagensPrevisto;
		this.passagensGasto = passagensGasto;
		
		this.listaDespesas = listaDespesas;		
	}
	/** E o Construtor da classe Projeto porem nao atribui caracteristicas ao projeto*/
	public Projeto() {	
	}
	
	/** Retorna o nome do projeto
	 * @return projeto Nome do Projeto */
	public String getProjeto() {
		return projeto;
	}
	
	/** Guarda nome do projeto
	 * @param projeto Nome do Projeto */
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	/** Retorna o nome do Professor
	 * @return professor Nome do Professor */
	public String getProfessor() {
		return professor;
	}
	
	/** Guarda nome do Professor
	 * @param professor Nome do Professor */
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	/** Retorna o valor previstos para a rubrica de Despesas de Capital
	 * @return capitalPrevisto Valor Previsto para Despesas de Capital */
	public double getCapitalPrevisto() {
		return capitalPrevisto;
	}

	/** Guarda o valor previstos para a rubrica de Despesas de Capital
	 * @param capitalPrevisto Valor Previsto para Despesas de Capital */
	public void setCapitalPrevisto(double capitalPrevisto) {
		this.capitalPrevisto = capitalPrevisto;
	}

	/** Retorna o valor gasto da rubrica de Despesas de Capital
	 * @return capitalGasto Valor Gasto da Despesas de Capital */
	public double getCapitalGasto() {
		return capitalGasto;
	}

	/** Guarda o valor gasto da rubrica de Despesas de Capital
	 * @param capitalGasto Valor Gasto para Despesas de Capital */
	public void setCapitalGasto(double capitalGasto) {
		this.capitalGasto = capitalGasto;
	}

	/** Retorna o valor previsto para rubrica de Material de Consumo
	 * @return materialPrevisto Valor Previsto de Material de Consumo */
	public double getMaterialPrevisto() {
		return materialPrevisto;
	}

	/** Guarda o valor previsto da rubrica de Material de Consumo
	 * @param materialPrevisto Valor Previsto de Material de Consumo */
	public void setMaterialPrevisto(double materialPrevisto) {
		this.materialPrevisto = materialPrevisto;
	}

	/** Retorna o valor gasto para rubrica de Material de Consumo
	 * @return materialGasto Valor Gasto de Material de Consumo */
	public double getMaterialGasto() {
		return materialGasto;
	}

	/** Guarda o valor gasto da rubrica de Material de Consumo
	 * @param materialGasto Valor Gasto de Material de Consumo */
	public void setMaterialGasto(double materialGasto) {
		this.materialGasto = materialGasto;
	}

	/** Retorna o valor previsto para rubrica de Servico de Terceiros / Pessoa Fisica
	 * @return servicoPfPrevisto Valor Previsto para Material Servico de Terceiros / Pessoa Fisica */
	public double getServicoPfPrevisto() {
		return servicoPfPrevisto;
	}

	/** Guarda o valor previsto da rubrica de Servico de Terceiros / Pessoa Fisica
	 * @param servicoPfPrevisto Valor Previsto de Servico de Terceiros / Pessoa Fisica */
	public void setServicoPfPrevisto(double servicoPfPrevisto) {
		this.servicoPfPrevisto = servicoPfPrevisto;
	}

	/** Retorna o valor gasto para rubrica de Servico de Terceiros / Pessoa Fisica
	 * @return servicoPfPrevisto Valor Gasto de Material Servico de Terceiros / Pessoa Juridica */
	public double getServicoPfGasto() {
		return servicoPfGasto;
	}

	/** Guarda o valor gasto da rubrica de Servico de Terceiros / Pessoa Fisica
	 * @param servicoPfGasto Valor Gasto de Servico de Terceiros / Pessoa Fisica */
	public void setServicoPfGasto(double servicoPfGasto) {
		this.servicoPfGasto = servicoPfGasto;
	}

	/** Retorna o valor previsto para rubrica de Servico de Terceiros / Pessoa Juridica
	 * @return servicoPjPrevisto Valor Previsto para Material Servico de Terceiros / Pessoa Juridica */
	public double getServicoPjPrevisto() {
		return servicoPjPrevisto;
	}

	/** Guarda o valor previsto da rubrica de Servico de Terceiros / Pessoa Juridica
	 * @param servicoPjPrevisto Valor Previsto de Servico de Terceiros / Pessoa Juridica */
	public void setServicoPjPrevisto(double servicoPjPrevisto) {
		this.servicoPjPrevisto = servicoPjPrevisto;
	}

	/** Retorna o valor gasto para rubrica de Servico de Terceiros / Pessoa Juridica
	 * @return servicoPjGasto Valor Gasto de Material Servico de Terceiros / Pessoa Juridica */
	public double getServicoPjGasto() {
		return servicoPjGasto;
	}

	/** Guarda o valor gasto da rubrica de Servico de Terceiros / Pessoa Juridica
	 * @param servicoPjGasto Valor Gasto de Servico de Terceiros / Pessoa Juridica */
	public void setServicoPjGasto(double servicoPjGasto) {
		this.servicoPjGasto = servicoPjGasto;
	}

	/** Retorna o valor previsto para rubrica de Diarias
	 * @return diariasPrevisto Valor Previsto para Diarias */
	public double getDiariasPrevisto() {
		return diariasPrevisto;
	}

	/** Guarda o valor previsto da rubrica de Diarias
	 * @param diariasPrevisto Valor Previsto de Diarias */
	public void setDiariasPrevisto(double diariasPrevisto) {
		this.diariasPrevisto = diariasPrevisto;
	}

	/** Retorna o valor gasto para rubrica de Diarias
	 * @return diariasGasto Valor Gasto de Diarias */
	public double getDiariasGasto() {
		return diariasGasto;
	}

	/** Guarda o valor gasto da rubrica de Diarias
	 * @param diariasGasto Valor Gasto de Diarias */
	public void setDiariasGasto(double diariasGasto) {
		this.diariasGasto = diariasGasto;
	}

	/** Retorna o valor previsot para rubrica de Passagens
	 * @return passagensPrevisto Valor Previsto para Passagens */
	public double getPassagensPrevisto() {
		return passagensPrevisto;
	}

	/** Guarda o valor gasto da rubrica de Diarias
	 * @param passagensPrevisto Valor Previsto para Passagens */
	public void setPassagensPrevisto(double passagensPrevisto) {
		this.passagensPrevisto = passagensPrevisto;
	}

	/** Retorna o valor gasto para rubrica de Passagens
	 * @return passagensGasto Valor Gasto de Passagens */
	public double getPassagensGasto() {
		return passagensGasto;
	}

	/** Guarda o valor gasto da rubrica de Passagens
	 * @param passagensGasto Valor Gasto de Passagens */
	public void setPassagensGasto(double passagensGasto) {
		this.passagensGasto = passagensGasto;
	}

	/** Retorna de Lista de Despesas
	 * @return listaDespesas Conteúdo da Lista de Despesas */
	public String getListaDespesas() {
		return listaDespesas;
	}

	/** Guarda de Lista de Despesas
	 * @param listaDespesas Conteúdo da Lista de Despesas */
	public void setListaDespesas(String listaDespesas) {
		this.listaDespesas = listaDespesas;
	}
	
	
}
