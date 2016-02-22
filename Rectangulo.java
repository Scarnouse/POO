package Ejercicios;

public class Rectangulo {
	//atributos
	private double ancho;
	private double alto;
	private static int numeroRectangulos;
	//constructor
	public Rectangulo(){
		this.ancho = 1;
		this.alto = 1;
		numeroRectangulos++;
	}
	public Rectangulo(double ancho, double alto){
		this.alto = alto;
		this.ancho = ancho;
		numeroRectangulos++;
	}
	//métodos
	public double getArea(){
		return this.ancho*this.alto;
	}
	public double getPerimetro(){
		return 2*this.ancho+2*this.alto;
	}
	
	/*public static int getNumeroRectangulos(){
		return numeroRectangulos;
	}
	
	class NumeroRectangulos{
		public int getNumeroRectangulos(){
			return numeroRectangulos;
		}
	}*/
	
	static class NumeroRectangulos{
		public static int getNumeroRectangulos(){
			return numeroRectangulos;
		}
	}
}
