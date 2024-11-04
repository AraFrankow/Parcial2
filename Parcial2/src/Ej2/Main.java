package Ej2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Admin yo = new Admin();
		Usuario otro = new Usuario("", "");
		Cliente yoComprador = new Cliente(null, null, null, 0, null, 0, 0, 0);
		String[] menu = {"Registrarse", "Iniciar Sesion", "Salir"};
		String eleccion;
		do {
			eleccion = (String)JOptionPane.showInputDialog(null, "Que quiere hacer?", null, 0, null, menu, menu[0]);
			switch (eleccion) {
			case "Registrarse":
				otro.Registrarse();
				break;
			
			case "Iniciar Sesion":
				otro.IniciarSesion();
				if (otro.estaLogueado()==true) {
					String[] opciones = { "Cliente", "Admin", "Salir" };
					int opcion;
					do {
						opcion = JOptionPane.showOptionDialog(null, "Elija su rol", null, 0, 0, null, opciones, opciones[0]);
						switch (opcion) {
						case 0:
							yoComprador.ComprarLibro();
							break;
	
						case 1:
							String[] acciones = { "Agregar libro", "Buscar libro", "Borrar libro", "Salir" };
							int accion;
							do {
								accion = JOptionPane.showOptionDialog(null, "Elija su rol", null, 0, 0, null, acciones, acciones[0]);
								switch (accion) {
								case 0:
									yo.agregar_libro();
									break;
	
								case 1:
									yo.buscar_libro();
									break;
									
								case 2:
									yo.eliminar_libro();
									break;
								
								case 3:
									JOptionPane.showMessageDialog(null, "Saliendo...");
									break;
								}
							} while (accion!=3);
							break;
						
						case 2:
							JOptionPane.showMessageDialog(null, "Saliendo...");
							break;
						}
					} while (opcion!=2);
				}else {
					JOptionPane.showMessageDialog(null, "No iniciaste sesion");
				}
				break;
				
			case "Salir":
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
			}
		} while (!eleccion.equals("Salir"));

	}

}
