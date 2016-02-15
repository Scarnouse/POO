package Introduccion;

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
	
	//ToString
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", pass=" + pass + "]";
	}
	
	
}

class usuariosException extends Exception{
	
}
