package model;

public class Taxa {
	private int idTaxa;
	public int getIdTaxa() {
		return idTaxa;
	}
	public void setIdTaxa(int idTaxa) {
		this.idTaxa = idTaxa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public long getValor() {
		return valor;
	}
	public void setValor(long valor) {
		this.valor = valor;
	}
	private int ano;
	private int mes;
	private long valor;
}
