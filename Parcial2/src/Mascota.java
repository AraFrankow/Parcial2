import java.time.LocalDate;

public class Mascota extends Cliente{
	private String especie;
	private String nombre;
	private Cliente dueño;
	
	public Mascota(LocalDate horario_dia, String motivo, String diagnostico, double costo) {
		super(horario_dia, motivo, diagnostico, costo);
		// TODO Auto-generated constructor stub
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente getDueño() {
		return dueño;
	}
	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}

	@Override
	public String toString() {
		return "Mascota [especie=" + especie + ", nombre=" + nombre + ", dueño=" + dueño + "]";
	}
	
	
	
}
