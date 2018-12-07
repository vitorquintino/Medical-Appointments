package dto;

public class MedicoEspecialidade {
    private int codigoEspecialidad;
    private int crmMedico;
    
    
	public MedicoEspecialidade(int codigoEspecialidad, int crmMedico) {
		super();
		this.codigoEspecialidad = codigoEspecialidad;
		this.crmMedico = crmMedico;
	}
	
	public int getCodigoEspecialidad() {
		return codigoEspecialidad;
	}
	public void setCodigoEspecialidad(int codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}
	public int getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(int crmMedico) {
		this.crmMedico = crmMedico;
	}
	
}
