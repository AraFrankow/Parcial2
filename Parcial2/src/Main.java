import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	Usuario uno = new Usuario(null, null);
	Cliente yo = new Cliente(null, null);
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
				String[] opciones = { "Cliente", "Veterinario", "Salir" };
				int opcion;
				do {
					opcion = JOptionPane.showOptionDialog(null, "Elija su rol", null, 0, 0, null, opciones, opciones[0]);
					switch (opcion) {
					case 0:
						yo.RegistrarAnimal();
						yo.sacarTurno();
						break;

					case 1:
						yo2.Tratamiento();
						yo2.Turno();
						break;
					
					case 2:
						JOptionPane.showMessageDialog(null, "Saliedo...");
						break;
					}
				} while (opcion!=2);
				

				break;
				
			case "Salir":
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
			}
		} while (!eleccion.equals("Salir"));

	}

}
