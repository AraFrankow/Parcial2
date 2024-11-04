package Ej2;

import javax.swing.JOptionPane;

public class Estadistica {

    public void calcularTotalVentas() {
        int totalVentas = 0;
        for (Libro libro : Libreria.getStock()) {
            totalVentas += libro.getVendido();
        }
        JOptionPane.showMessageDialog(null, "En total se han vendido " + totalVentas + " libros.");
    }
    
    public void masVendidoGenero() {
        int maxVentas = 0;
        String generoMasVendido = "";
        
        int terror = 0, aventura = 0, ficcion = 0;
        for (Libro libro : Libreria.getStock()) {
            terror += libro.getCantGenTerror();
            aventura += libro.getCantGenAventura();
            ficcion += libro.getCantGenFiccion();
        }
        
        if (terror > maxVentas) {
            maxVentas = terror;
            generoMasVendido = "Terror";
        }
        if (aventura > maxVentas) {
            maxVentas = aventura;
            generoMasVendido = "Aventura";
        }
        if (ficcion > maxVentas) {
            generoMasVendido = "Ficcion";
        }
        
        JOptionPane.showMessageDialog(null, "El género más vendido es " + generoMasVendido);
    }

    public void masVendidoAutor() {
        int maxVentas = 0;
        String autorMasVendido = "";
        
        int king = 0, verne = 0, bradbury = 0;
        for (Libro libro : Libreria.getStock()) {
            king += libro.getCantKing();
            verne += libro.getCantVerne();
            bradbury += libro.getCantBradbury();
        }
        
        if (king > maxVentas) {
            maxVentas = king;
            autorMasVendido = "King";
        }
        if (verne > maxVentas) {
            maxVentas = verne;
            autorMasVendido = "Verne";
        }
        if (bradbury > maxVentas) {
            autorMasVendido = "Bradbury";
        }
        
        JOptionPane.showMessageDialog(null, "El autor más vendido es " + autorMasVendido);
    }
}