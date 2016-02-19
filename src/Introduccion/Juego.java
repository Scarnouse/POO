package Introduccion;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	//Atributos
	private String nombreJuego;
	private String categoria;
	private int puntuacion;
	private List<Usuario> listaUsuarios;
	//constructor
	public Juego(String nombreJuego, String categoria) {
		this.nombreJuego = nombreJuego;
		this.categoria = categoria;
		this.puntuacion = 0;
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	//métodos
	public void addUsuario(Usuario u){
		this.listaUsuarios.add(u);
	}
	public boolean deleteUsuario(String login){
		for (Usuario usuario : listaUsuarios) {
			if (usuario.getLogin().equals(login)) return listaUsuarios.remove(usuario);
		}
		return false;				
	}
	public void variarPuntuacion (int puntuacion){
		this.puntuacion+=puntuacion;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Juego [nombreJuego=" + nombreJuego + ", categoria=" + categoria + ", puntuacion=" + puntuacion
				+ ", listaUsuarios=" + listaUsuarios + "]";
	}
	
	
}
