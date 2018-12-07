package dto;

public class Doenca {
    private int idDoenca;
    private String nome;
    
    
	public Doenca(int idDoenca, String nome) {
		super();
		this.idDoenca = idDoenca;
		this.nome = nome;
	}
	public int getIdDoenca() {
		return idDoenca;
	}
	public void setIdDoenca(int idDoenca) {
		this.idDoenca = idDoenca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
