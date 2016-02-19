package Introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class TestJuego {

	public static void main(String[] args) {
		Juego j = new Juego("Programación","informática");
		try (Scanner sc = new Scanner(new File("usuarios.txt"));){
			//String palabra = sc.next();
			String login;
			String pass;
			Usuario u;
			String linea;
			while (sc.hasNextLine()){
				linea = sc.nextLine();
				String[] valores = linea.split("\\s+");
				if (valores.length==2){
					login = valores[0];
					pass = valores[1];
				} else {
					login = valores[0];
					pass = Usuario.generarLoginOPass();
				}
				try {
					u = new Usuario(login.trim(),pass.trim());
					j.addUsuario(u);
					j.variarPuntuacion((int)Math.random()*99);
					
				} catch (Usuario.usuariosException e){
					System.out.println("Login "+ login + " no valido");
				}
			}
			System.out.println("Inicialmente");
			System.out.println(j);
			System.out.println("Eliminando Usuario");
			if (j.deleteUsuario("Luis")) System.out.println("Usuario borrado");
			else System.out.println("Usuario no encontrado");
			System.out.println(j);
			if (j.deleteUsuario("Geronimo")) System.out.println("Usuario borrado");
			else System.out.println("Usuario no encontrado");
			System.out.println(j);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no existe");
		}
		
		
		
	}

}
