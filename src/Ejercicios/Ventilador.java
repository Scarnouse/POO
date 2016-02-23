package Ejercicios;

public class Ventilador {
	//campos
	private enum Velocidad { LENTO, MEDIO, RAPIDO };
	private Velocidad velocidad;
	private boolean funcionando;
	private double radio;
	private String color;
	
	//getters y setters
	public Velocidad getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Velocidad velocidad) {
		this.velocidad = velocidad;
	}
	public boolean isFuncionando() {
		return funcionando;
	}
	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//constructor
	public Ventilador() {
		this.velocidad = Velocidad.LENTO;
		this.funcionando = false;
		this.radio = 50;
		this.color = "blanco";
	}
	
	@Override
	public String toString() {
		return "Ventilador [velocidad=" + velocidad + ", funcionando=" + funcionando + ", radio=" + radio + ", color="
				+ color + "]";
	}
}
