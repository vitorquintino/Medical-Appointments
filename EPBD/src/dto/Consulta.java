package dto;
import java.sql.Time;
import java.sql.Date;

public class Consulta {
    private int idConsulta;
    private Date data;
    private Time inicio;
    private Time fim;
    private int pagou;
    private long valorPago;
    private String formaPagamento;
    private int codigoEspecialidade;
    private int crmMedico;
    private int idPaciente;
    
    
	public Consulta(int idConsulta, Date data, Time inicio, Time fim, int pagou, long valorPago, String formaPagamento,
			int codigoEspecialidade, int crmMedico, int idPaciente) {
		super();
		this.idConsulta = idConsulta;
		this.data = data;
		this.inicio = inicio;
		this.fim = fim;
		this.pagou = pagou;
		this.valorPago = valorPago;
		this.formaPagamento = formaPagamento;
		this.codigoEspecialidade = codigoEspecialidade;
		this.crmMedico = crmMedico;
		this.idPaciente = idPaciente;
	}
	public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getInicio() {
		return inicio;
	}
	public void setInicio(Time inicio) {
		this.inicio = inicio;
	}
	public Time getFim() {
		return fim;
	}
	public void setFim(Time fim) {
		this.fim = fim;
	}
	public int getPagou() {
		return pagou;
	}
	public void setPagou(int pagou) {
		this.pagou = pagou;
	}
	public long getValorPago() {
		return valorPago;
	}
	public void setValorPago(long valorPago) {
		this.valorPago = valorPago;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public int getCodigoEspecialidade() {
		return codigoEspecialidade;
	}
	public void setCodigoEspecialidade(int codigoEspecialidade) {
		this.codigoEspecialidade = codigoEspecialidade;
	}
	public int getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(int crmMedico) {
		this.crmMedico = crmMedico;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
}
