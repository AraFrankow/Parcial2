package Ej2;

public class Libro {
	private String nombre;
	private String autor;
	private Double precio;
	private int cantidad;
	private String genero;
	
	public Libro(String nombre, String autor, Double precio, int cantidad, String genero) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	 
	
}
