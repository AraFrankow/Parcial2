import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Veterinario extends Turno{
	private int edadAnimal;
	private String consulta;
	private Mascota mascota;

	public Veterinario(LocalDate horario_dia, String motivo, String diagnostico, double costo) {
		super(horario_dia, motivo, diagnostico, costo);
		// TODO Auto-generated constructor stub
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
	
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
	public void Tratamiento() {
		Mascota mia = new Mascota(null, null);
		String animal;
		String[] opciones = {"Gato", "Ave", "Perro"};
		int opcion = JOptionPane.showOptionDialog(null, "Elija el animal que tiene", null, 0, 0, null, opciones, opciones[0]);
		if (opcion==0) {
			mia.setEspecie("Gato");
			Gato gatito = new Gato(null, null, null, 0);
			gatito.Tratamiento();
		} else if(opcion==1) {
			mia.setEspecie("Ave");
			Ave aveMini = new Ave(null, null, null, 0);
			aveMini.Tratamiento();
		} else {
			mia.setEspecie("Perro");
			Perro perrito = new Perro(null, null, null, 0);
			perrito.Tratamiento();
		}
		String nombreAni = JOptionPane.showInputDialog("Ingrese el nombre del animal");
		mia.setNombre(nombreAni);
	}

	public void Turno() {
		Turno hoy = new Turno(null, consulta, consulta, edadAnimal);
		String diagnostico = JOptionPane.showInputDialog("Ingrese el diagnostico que le dio");
		if (diagnostico.isEmpty()) {
			do {
				diagnostico = JOptionPane.showInputDialog("Ingrese el motivo de su consulta nuevamente");
			} while (diagnostico.isEmpty());
			hoy.setDiagnostico(diagnostico);
		}else {
			hoy.setDiagnostico(diagnostico);
		}
		
		Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la consulta"));
		if (precio<0) {
			do {
				precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la consulta nuevamente"));
			} while (precio<0);
			hoy.setCosto(precio);
		}else {
			hoy.setCosto(precio);
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Veterinario [edadAnimal=" + edadAnimal + ", consulta=" + consulta + "]";
	}
	
}
