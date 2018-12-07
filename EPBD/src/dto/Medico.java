package dto;

public class Medico {
    private int crm;
    private String nome;
    private String telefone;
    
	public Medico(int crm, String nome, String telefone) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.telefone = telefone;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
