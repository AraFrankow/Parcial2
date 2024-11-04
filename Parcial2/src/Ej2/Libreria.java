package Ej2;

import java.util.LinkedList;

public class Libreria {
	static LinkedList<Libro> stock = new LinkedList<Libro>();
	
	public Libreria() {
		this.stock = stock;
	}
	
	public static LinkedList<Libro> getStock() {
		return stock;
	}

	public void setStock(LinkedList<Libro> stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Libreria [stock=" + stock + "]";
	}

}
