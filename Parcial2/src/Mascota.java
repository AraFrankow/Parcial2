
public class Mascota {
	private String especie;
	private String nombre;
	private Cliente dueño;
	
	public Mascota(String especie, String nombre, Cliente dueño) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.dueño = dueño;
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
