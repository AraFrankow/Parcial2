
public class Veterinario {
	private int edadAnimal;
	private String consulta;
	
	public Veterinario(int edadAnimal, String consulta) {
		super();
		this.edadAnimal = edadAnimal;
		this.consulta = consulta;
	}

	public int getEdadAnimal() {
		return edadAnimal;
	}
	public void setEdadAnimal(int edadAnimal) {
		this.edadAnimal = edadAnimal;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	
	public void Tratamiento() {
		
	}

	@Override
	public String toString() {
		return "Veterinario [edadAnimal=" + edadAnimal + ", consulta=" + consulta + "]";
	}
	
}
