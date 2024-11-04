package Ej2;

import javax.swing.JOptionPane;

public class Admin {
	public void agregar_libro() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro");
		if (ValidarNombre(nombre)==false) {
			do {
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro otra vez");
			} while (ValidarNombre(nombre)==false);
		}
		String[] autores = { "Steaphen King", "Julio Verne", "Ray Bradbury"};
		String eleccion = (String)JOptionPane.showInputDialog(null, "Que quiere hacer?", null, 0, null, autores, autores[0]);
		Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del libro"));
		if (precio<0) {
			do {
				precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del libro otra vez"));
			} while (precio<0);
		}
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros que hay"));
		if (cantidad<0) {
			do {
				cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros que hay otra vez"));
			} while (cantidad<0);
		}
		String[] genero = { "Terror", "Aventura", "Ciencia Ficcion"};
		String eleccionGen = (String)JOptionPane.showInputDialog(null, "Que quiere hacer?", null, 0, null, genero, genero[0]);
		Libro nuevo = new Libro(nombre, eleccion, precio, cantidad, eleccionGen, 0, 0, 0, 0, 0, 0, 0);
		for (Libro item : Libreria.getStock()) {
			if (item.getNombre().equals(nuevo.getNombre())) {
				item.setCantidad( item.getCantidad() + nuevo.getCantidad());
				JOptionPane.showMessageDialog(null, "Se agrego al stock existente");
				return;
			} 
		}
		Libreria.getStock().add(nuevo);
		JOptionPane.showMessageDialog(null, "Se agregó!");
	}
	
	public Libro buscar_libro() {
		if (Libreria.getStock().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay libros para buscar");
			return null;
		}
		int opcion = JOptionPane.showOptionDialog(null,
				"Menu", null, 0, 0, null,
				Libreria.getStock().toArray(), 
				Libreria.getStock().toArray()[0]);
		
		return Libreria.getStock().get(opcion);
	
	}
	
	public Libro eliminar_libro() {
		if (Libreria.getStock().isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay libros para eliminar");
			return null;
		}
		int opcion = JOptionPane.showOptionDialog(null,
				"Menu", null, 0, 0, null,
				Libreria.getStock().toArray(), 
				Libreria.getStock().toArray()[0]);
		return Libreria.getStock().remove(opcion);
	}
	
	public static boolean ValidarNombre(String nombre) {
		boolean numero = false;
		if (nombre.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Está vacio el nombre");
			return false;
		} else {
			for (int i = 0; i < nombre.length(); i++) {
				if (Character.isDigit(nombre.charAt(i))) {
					numero=true;
				}
			}
			if (numero==true) {
				JOptionPane.showMessageDialog(null, "No puede tener numeros un nombre");
				return false;
			} else {
				return true;
			}
		}
	}
}
