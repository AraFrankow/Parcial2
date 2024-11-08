package Ej2;

import javax.swing.JOptionPane;

public class Usuario {
	protected String nombre;
	protected String contrasenia;
	private boolean registrado = false;
	private boolean iniciadoSesion = false;

	public Usuario(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public boolean IniciarSesion() {
		if (registrado) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			String contrasenia = JOptionPane.showInputDialog("Ingrese la contraseña");
			if (nombre.equals(getNombre())) {
				if (contrasenia.equals(getContrasenia())) {
					JOptionPane.showMessageDialog(null, "Ingresaste correctamente");
					iniciadoSesion=true;
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "Ingresaste mal el nombre");
					iniciadoSesion=false;
					return false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Ingresaste mal la contraseña");
				iniciadoSesion=false;
				return false;
			}
		}
		JOptionPane.showMessageDialog(null, "No esta registrado");
		iniciadoSesion=false;
		return false;
		
	}
	
	
	public boolean Registrarse() {
		if (!registrado) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario para registrarse");
			if (ValidarNombre(nombre)==true) {
				String contrasenia = JOptionPane.showInputDialog("Ingrese una contraseña que incluya mayus, minus, numero y 6 caracteres");
				if (ValidarContrasenia(contrasenia)==true) {
					JOptionPane.showMessageDialog(null, "Registro completado... Volviendo a la pagina principal...");
					setContrasenia(contrasenia);
					setNombre(nombre);
					registrado = true;
					return true;
				}else {
					JOptionPane.showMessageDialog(null, "La contraseña no cumple lo pedido");
					registrado = false;
					return false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "El nombre no cumple con lo pedido");
				registrado = false;
				return false;
			}		
		}
		return false;
			
	}
	
	public boolean estaRegistrado() {
		return registrado;
	}
	
	public boolean estaLogueado() {
		return iniciadoSesion;
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
	
	public static boolean ValidarContrasenia(String contra) {
		boolean mayus = false;
		boolean minus = false;
		boolean num = false;
		
		if (contra.length()>=6) {
			for (int i = 0; i < contra.length(); i++) {
				if (Character.isUpperCase(contra.charAt(i))) {
					mayus=true;
				}
				if (Character.isLowerCase(contra.charAt(i))) {
					minus=true;
				}
				if (Character.isDigit(contra.charAt(i))) {
					num=true;
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "La contraseña debe tener 6 caracteres");
			return false;
		}
		if (mayus && minus && num) {
			JOptionPane.showMessageDialog(null, "Es correcta");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "No cumple con lo pedido");
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrasenia=" + contrasenia + "]";
	}
	
	
}
