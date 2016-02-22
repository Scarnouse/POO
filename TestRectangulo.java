package Ejercicios;

import Ejercicios.Rectangulo.NumeroRectangulos;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		
		//System.out.println(Rectangulo.getNumeroRectangulos());
		
		/*Rectangulo.NumeroRectangulos nr = r1.new NumeroRectangulos();
		System.out.println(nr.getNumeroRectangulos());*/
		
		System.out.println(Rectangulo.NumeroRectangulos.getNumeroRectangulos());
		
	}

}
