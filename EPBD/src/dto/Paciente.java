package dto;

public class Paciente {
	private int cod;
	private String cpf;
	private int idade;
	private String telefone;
	private String endereco;
	private String sexo;
	private String nome;
	
	public Paciente(int cod, String cpf, int idade, String telefone, String endereco, String sexo, String nome) {
		super();
		this.cod = cod;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		this.endereco = endereco;
		this.sexo = sexo;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
