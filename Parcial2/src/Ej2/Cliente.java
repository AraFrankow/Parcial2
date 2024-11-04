package Ej2;

import javax.swing.JOptionPane;

public class Cliente extends Libro{

	public Cliente(String nombre, String autor, Double precio, int cantidad, String genero, int cantGenTerror, int cantGenAventura, int cantGenFiccion) {
		super(nombre, autor, precio, cantidad, genero, cantGenTerror, cantGenAventura, cantGenFiccion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setCantidad(int cantidad) {
		super.setCantidad(cantidad);
	}
	
	
	public Libro ComprarLibro() {
		String criterio = JOptionPane.showInputDialog("Ingrese nombre del libro que quiera comprar");
		for (Libro elemento : Libreria.getStock()) {
			 if (elemento.getNombre().equals(criterio)) {
				 JOptionPane.showMessageDialog(null, "El libro "+elemento+" que estas buscando está disponible, su valor es de: "+elemento.getPrecio());
				 int opcion = JOptionPane.showConfirmDialog(null, "Lo querés comprar?");
				 if (opcion==0) {
					JOptionPane.showMessageDialog(null, "Comprado...");
					setCantidad(getCantidad()-1);
					if (elemento.getAutor().contains("King")) {
						int cantGenTerror =0;
						cantGenTerror = cantGenTerror+1;
					} else if(elemento.getAutor().contains("Verne")) {
						int cantGenAventura =0;
						cantGenAventura = cantGenAventura+1;
					} else {
						int cantGenFiccion =0;
						cantGenFiccion = cantGenFiccion+1;
					}
				}
			 }
		}
		JOptionPane.showMessageDialog(null, "No hay libros diponibles o el nombre que ingresaste no existe en nuestra libreria");
		return null;
	}

	
}
