package dto;

import java.sql.Date;
import java.sql.Time;

public class ListaConsultas {
	String nomePaciente;
	Date data;
	Time hora;
	String nomeMedico;
	
	public ListaConsultas(String nomePaciente, Date data, Time hora, String nomeMedico) {
		super();
		this.nomePaciente = nomePaciente;
		this.data = data;
		this.hora = hora;
		this.nomeMedico = nomeMedico;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	
}
