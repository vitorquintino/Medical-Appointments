package model;

public class Diagnostico {
    private String tratamentoRecomendado;
    private String remedioReceitados;
    private int idDiagnostico;  
    private String observacoes; 
    
    public String getTratamentoRecomendado() {
		return tratamentoRecomendado;
	}
	public void setTratamentoRecomendado(String tratamentoRecomendado) {
		this.tratamentoRecomendado = tratamentoRecomendado;
	}
	public String getRemedioReceitados() {
		return remedioReceitados;
	}
	public void setRemedioReceitados(String remedioReceitados) {
		this.remedioReceitados = remedioReceitados;
	}
	public int getIdDiagnostico() {
		return idDiagnostico;
	}
	public void setIdDiagnostico(int idDiagnostico) {
		this.idDiagnostico = idDiagnostico;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public int getIdDoenca() {
		return idDoenca;
	}
	public void setIdDoenca(int idDoenca) {
		this.idDoenca = idDoenca;
	}
	public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	private int idDoenca ;
    private int idConsulta ;
}
