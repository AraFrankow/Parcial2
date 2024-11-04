import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Cliente extends Turno{
	private String mail;
	private Turno turno;
	
	public Cliente(LocalDate horario_dia, String motivo, String diagnostico, double costo) {
		super(horario_dia, motivo, diagnostico, costo);
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public boolean verFecha() {
		LocalDate ahora = LocalDate.of(2024, 11, validarNumeros("Ingrese el dia que es hoy"));
		if (ahora.equals(getHorario_dia())) {
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Todavia falta para su consulta");
			return false;
		}
	}
	
	public void sacarTurno() {
		setHorario_dia(null);
		if (getHorario_dia().isBefore(LocalDate.now())) {
			do {
				JOptionPane.showMessageDialog(null, "Hubo un error con la fecha ingresada, vuelva a ingresarla");
				setHorario_dia(null);
			} while (getHorario_dia().isBefore(LocalDate.now()));
		}
		String motivo = JOptionPane.showInputDialog("Ingrese el motivo de su consulta");
		if (motivo.isEmpty()) {
			do {
				motivo = JOptionPane.showInputDialog("Ingrese el motivo de su consulta nuevamente");
			} while (motivo.isEmpty());
			setMotivo(motivo);
		}else {
			setMotivo(motivo);
		}
	}

	public int validarNumeros(String numero) {
		boolean numer ;
		String num ="" ;
		do {
			numer =true;
			num = JOptionPane.showInputDialog(numero);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(numero);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					numer = false;
					break;
				}
			}
		} while (!numer);
		return Integer.parseInt(num);
	}
	
	@Override
	public String toString() {
		return "Cliente [mail=" + mail + ", turno=" + (turno != null ? turno.toString() : "No hay turno asignado") + "]";
	}
	
	
}
