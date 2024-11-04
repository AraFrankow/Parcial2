package Ej2;

public class Libro{
	private String nombre;
	private String autor;
	private Double precio;
	private int cantidad;
	private String genero;
	private int cantGenTerror;
	private int cantGenAventura;
	private int cantGenFiccion;
	private int cantKing;
	private int cantVerne;
	private int cantBradbury;
	private int vendido;
	
	public Libro(String nombre, String autor, Double precio, int cantidad, String genero, int cantGenTerror, int cantGenAventura, int cantGenFiccion, int cantKing, int cantVerne, int cantBradbury, int vendido) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
		this.genero = genero;
		this.cantGenTerror=cantGenTerror;
		this.cantGenAventura=cantGenAventura;
		this.cantGenFiccion=cantGenFiccion;
		this.cantKing=cantKing;
		this.cantVerne=cantVerne;
		this.cantBradbury=cantBradbury;
		this.vendido=vendido;
	}
	
	public int getVendido() {
		return vendido;
	}

	public void setVendido(int vendido) {
		this.vendido = vendido;
	}

	public int getCantGenTerror() {
		return cantGenTerror;
	}

	public void setCantGenTerror(int cantGenTerror) {
		this.cantGenTerror = cantGenTerror;
	}

	public int getCantGenAventura() {
		return cantGenAventura;
	}

	public void setCantGenAventura(int cantGenAventura) {
		this.cantGenAventura = cantGenAventura;
	}

	public int getCantGenFiccion() {
		return cantGenFiccion;
	}

	public void setCantGenFiccion(int cantGenFiccion) {
		this.cantGenFiccion = cantGenFiccion;
	}

	public int getCantKing() {
		return cantKing;
	}

	public void setCantKing(int cantKing) {
		this.cantKing = cantKing;
	}

	public int getCantVerne() {
		return cantVerne;
	}

	public void setCantVerne(int cantVerne) {
		this.cantVerne = cantVerne;
	}

	public int getCantBradbury() {
		return cantBradbury;
	}

	public void setCantBradbury(int cantBradbury) {
		this.cantBradbury = cantBradbury;
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

	public void registrarVenta() {
        if (cantidad > 0) {
            cantidad--;
            vendido++;

            // Actualiza el contador del género correspondiente
            if (genero.equalsIgnoreCase("Terror")) {
                cantGenTerror++;
            } else if (genero.equalsIgnoreCase("Aventura")) {
                cantGenAventura++;
            } else if (genero.equalsIgnoreCase("Ficcion")) {
                cantGenFiccion++;
            }

            // Actualiza el contador del autor correspondiente
            if (autor.equalsIgnoreCase("King")) {
                cantKing++;
            } else if (autor.equalsIgnoreCase("Verne")) {
                cantVerne++;
            } else if (autor.equalsIgnoreCase("Bradbury")) {
                cantBradbury++;
            }
        } else {
            System.out.println("No hay stock disponible para este libro.");
        }
    }
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad
				+ ", genero=" + genero + "]";
	}
	
	 
	
}
