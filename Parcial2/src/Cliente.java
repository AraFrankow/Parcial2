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
