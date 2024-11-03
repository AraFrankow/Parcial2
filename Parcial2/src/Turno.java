import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Turno {
	private LocalDate horario_dia;
	private String motivo;
	private String diagnostico;
	private double costo;
	private String medico;
	private Mascota mascota;
	
	public Turno(LocalDate horario_dia, String motivo, String diagnostico, double costo) {
		super();
		this.horario_dia = horario_dia;
		this.motivo = motivo;
		this.diagnostico = diagnostico;
		this.costo = costo;
	}
	public LocalDate getHorario_dia() {
		return horario_dia;
	}
	public void setHorario_dia(LocalDate horario_dia) {
		this.horario_dia = LocalDate.of(validarNumeros("Ingrese año para el turno"), validarNumeros("Ingrese mes para el turno"), validarNumeros("Ingrese dia para el turno"));
		JOptionPane.showMessageDialog(null, "Agendando proximo turno...");
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	@Override
	public String toString() {
		return "Turno [horario_dia=" + horario_dia + ", motivo=" + motivo + ", diagnostico=" + diagnostico + ", costo="
				+ costo + ", medico=" + medico + ", mascota=" + mascota + "]";
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
	
}
