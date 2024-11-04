import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	Usuario uno = new Usuario(null, null);
	Cliente yo = new Cliente(null, null, null, 0);
	Veterinario yo2 = new Veterinario(null, null, null, 0);
		String[] menu = {"Asignar usuario y contraseña", "Iniciar Sesion", "Salir"};
		String eleccion;
		do {
			eleccion = (String)JOptionPane.showInputDialog(null, "Que quiere hacer?", null, 0, null, menu, menu[0]);
			switch (eleccion) {
			case "Asignar usuario y contraseña":
				uno.Registrarse();
				break;

			case "Iniciar Sesion":
				uno.IniciarSesion();
				if (uno.estaLogueado()==true) {
					String[] opciones = { "Cliente", "Veterinario", "Ver consulta","Salir" };
					int opcion;
					do {
						opcion = JOptionPane.showOptionDialog(null, "Elija su rol", null, 0, 0, null, opciones, opciones[0]);
						switch (opcion) {
						case 0:
							yo.sacarTurno();
							break;
	
						case 1:
							if (yo.verFecha()==true) {
								yo2.Tratamiento();
								yo2.Turno();
							}
							break;
						
						case 2:
							JOptionPane.showMessageDialog(null, yo.getTurno());
							break;
						
						case 3:
							JOptionPane.showMessageDialog(null, "Saliendo...");
							break;
						}
					} while (opcion!=3);
				}
				break;
				
			case "Salir":
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
			}
		} while (!eleccion.equals("Salir"));
	}
}
