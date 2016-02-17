package Introduccion;

import java.util.ArrayList;
import java.util.List;

public class TestUsuario {

	public static void main(String[] args) {
		List<Usuario> usuariosValidos = new ArrayList<Usuario>();
		while (usuariosValidos.size() !=5){
			String login = Usuario.generarLoginOPass();
			String pass = Usuario.generarLoginOPass();
			try {
				Usuario u = new Usuario(login, pass);
				usuariosValidos.add(u);
			} catch (usuariosException e) {
				System.out.println("Login no correcto: "+login);
			}
		}
		System.out.println(usuariosValidos);
		System.out.println("Numero de usuarios creados: "+Usuario.getNumeroUsuarios());
	}

}
