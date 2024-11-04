package Ej2;

import javax.swing.JOptionPane;

public class Cliente extends Libro{

	public Cliente(String nombre, String autor, Double precio, int cantidad, String genero, int cantGenTerror, int cantGenAventura, int cantGenFiccion, int cantKing, int cantVerne, int cantBradbury, int vendido) {
		super(nombre, autor, precio, cantidad, genero, cantGenTerror, cantGenAventura, cantGenFiccion, cantKing, cantVerne, cantBradbury, vendido);
		// TODO Auto-generated constructor stub
	}
		
	public void ComprarLibro() {
		String criterio = JOptionPane.showInputDialog("Ingrese el nombre del libro que quiere comprar");
        for (Libro elemento : Libreria.getStock()) {
            if (elemento.getNombre().equalsIgnoreCase(criterio)) {
                JOptionPane.showMessageDialog(null, "El libro " + elemento.getNombre() + " está disponible, su valor es: " + elemento.getPrecio());
                int opcion = JOptionPane.showConfirmDialog(null, "¿Lo quieres comprar?");
                if (opcion == 0) {
                    if (elemento.getCantidad() <= 0) {
                        JOptionPane.showMessageDialog(null, "No hay libros disponibles");
                    } else {
                        JOptionPane.showMessageDialog(null, "Comprando...");
                        elemento.registrarVenta();
                        JOptionPane.showMessageDialog(null, "Compra realizada. Total vendido: " + elemento.getVendido());
                    }
                }
            }
        }
	}

	
}
