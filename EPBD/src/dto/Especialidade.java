package dto;

public class Especialidade {
	private int indice;	
	private int codigo;	
	private String nome;	
	private int idTaxa;
	
	
	public Especialidade(int indice, int codigo, String nome, int idTaxa) {
		super();
		this.indice = indice;
		this.codigo = codigo;
		this.nome = nome;
		this.idTaxa = idTaxa;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdTaxa() {
		return idTaxa;
	}
	public void setIdTaxa(int idTaxa) {
		this.idTaxa = idTaxa;
	}
}
