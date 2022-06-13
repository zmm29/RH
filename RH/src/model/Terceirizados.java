package model;

public class Terceirizados extends Funcionario {

	private String dataFimContrato;
	private String funcao;
	
	public Terceirizados(String cpf, String nome, String endereco, String dataAdmissao,
		String titulacao, float salarioBase, String dataFimContrato, String funcao) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.dataFimContrato = dataFimContrato;
		this.funcao = funcao;
	}
	
	public void setDataFimContrato(String dataFimContrato) {
		this.dataFimContrato = dataFimContrato;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getDataFimContrato() {
		return this.dataFimContrato;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	public float calculaSalario() {
        if (this.funcao.equalsIgnoreCase("professor") && getTitulacao().equalsIgnoreCase("Mestre")) {
            return this.getSalarioBase() * 1.15f;
        } else if (this.funcao.equalsIgnoreCase("professor") && this.getTitulacao().equalsIgnoreCase("Doutor")) {
            return this.getSalarioBase() * 1.3f;
        }
        return this.getSalarioBase();
	}
	
}	