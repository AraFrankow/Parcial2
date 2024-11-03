import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Cliente extends Usuario{
	private String mail;
	
	public Cliente(String nombre, String contrasenia) {
		super(nombre, contrasenia);
		
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	public void RegistrarAnimal() {
		Mascota mia = new Mascota(null, null);
		String animal;
		String[] opciones = {"Gato", "Ave", "Perro"};
		int opcion = JOptionPane.showOptionDialog(null, "Elija el animal que tiene", null, 0, 0, null, opciones, opciones[0]);
		if (opcion==0) {
			animal = "Gato";
			mia.setEspecie(animal);
		} else if(opcion==1) {
			animal = "Ave";
			mia.setEspecie(animal);
		} else {
			animal = "Perro";
			mia.setEspecie(animal);
		}
		String nombreAni = JOptionPane.showInputDialog("Ingrese el nombre del animal");
		
		
		mia.setNombre(nombreAni);
	}
	
	public void sacarTurno() {
		Turno hoy = new Turno(null, mail, mail, 0);
		hoy.setHorario_dia(null);
		if (hoy.getHorario_dia().isBefore(LocalDate.now())) {
			do {
				JOptionPane.showMessageDialog(null, "Hubo un error con la fecha ingresada, vuelva a ingresarla");
				hoy.setHorario_dia(null);
			} while (hoy.getHorario_dia().isBefore(LocalDate.now()));
		}
		String motivo = JOptionPane.showInputDialog("Ingrese el motivo de su consulta");
		if (motivo.isEmpty()) {
			do {
				motivo = JOptionPane.showInputDialog("Ingrese el motivo de su consulta nuevamente");
			} while (motivo.isEmpty());
			hoy.setMotivo(motivo);
		}else {
			hoy.setMotivo(motivo);
		}
	}

	@Override
	public String toString() {
		return "Cliente [mail=" + mail + "]";
	}
	
	
}
