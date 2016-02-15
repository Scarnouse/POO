package Introduccion;

import java.util.Random;

public class Usuario {
	//Atributos
	private String login;
	private String pass;
	private static int numeroUsuarios;
	
	//Constructor
	public Usuario(String login, String pass) throws usuariosException {
		if (validarUsuario(login)){
			this.login = login;
			this.pass = pass;
			numeroUsuarios++;
		} else {
			throw new usuariosException();
		}
	}
	//getter y setter
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public static int getNumeroUsuarios() {
		return numeroUsuarios;
	}
	
	//métodos
	private static boolean validarUsuario(String login){
		return login.matches("[a-zA-Z].*");
	}
	public static String generarLogin(){
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm"
				+ "MnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!"
				+ "<&{}";
		final int tamañoMaximo = 22;
		Random r = new Random();
		int tamaño = r.nextInt(tamañoMaximo);
		String usuario = "";
		for (int i = 0; i < tamaño; i++) {
			int elegirCaracter = r.nextInt(FUENTE_CARACTERES.length()-1);
			usuario += FUENTE_CARACTERES.charAt(elegirCaracter);
		}
		return usuario;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", pass=" + pass + "]";
	}
	
	
}

class usuariosException extends Exception{
	
}
