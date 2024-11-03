import java.time.LocalDate;

public class Cliente {
	private String mail;
	private String tipoAnimal;
	private LocalDate fecha;
	
	public Cliente(String mail, String tipoAnimal, LocalDate fecha) {
		super();
		this.mail = mail;
		this.tipoAnimal = tipoAnimal;
		this.fecha = fecha;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	public void RegistrarAnimal() {
		
	}

	@Override
	public String toString() {
		return "Cliente [mail=" + mail + ", tipoAnimal=" + tipoAnimal + ", fecha=" + fecha + "]";
	}
	
	
}
