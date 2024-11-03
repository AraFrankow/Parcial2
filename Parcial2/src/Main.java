import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	Usuario uno = new Usuario(null, null);
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
				break;
				
			case "Salir":
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
			}
		} while (!eleccion.equals("Salir"));

	}

}
