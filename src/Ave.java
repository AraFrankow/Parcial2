import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Ave extends Veterinario{

	public Ave(LocalDate horario_dia, String motivo, String diagnostico, double costo) {
		super(horario_dia, motivo, diagnostico, costo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Tratamiento() {
		String[] opciones = { "Cabeza", "Alas y patas", "Cuerpo" };
		int opcion = JOptionPane.showOptionDialog(null, "Revisando...", null, 0, 0, null, opciones, opciones[0]);
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, "Viendo la cabeza...");
			int num = (int) (Math.random()*2+1);
			if (num==1) {
				JOptionPane.showMessageDialog(null, "Su cabeza esta bien");
			} else {
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura");
			}
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "Viendo las alas y las patas...");
			num = (int) (Math.random()*5+1);
			if (num==1) {
				JOptionPane.showMessageDialog(null, "Sus alas y patas estan bien");
			} else if(num==2){
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la ala izquierda");
			} else if(num==3){
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la pata izquierda");
			} else if(num==4){
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la ala derecha");
			} else{
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la pata derecha");
			}
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Viendo el cuerpo...");
			num = (int) (Math.random()*3+1);
			if (num==1) {
				JOptionPane.showMessageDialog(null, "Su cuerpo esta bien");
			} else if(num==2){
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la panza");
			} else {
				JOptionPane.showMessageDialog(null, "Tiene una pequeña lastimadura en la espalda");
			}
			break;	
		}
	}
	

	
}
