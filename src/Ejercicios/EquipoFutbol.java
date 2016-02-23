package Ejercicios;

public class EquipoFutbol {
	private enum Puesto {PORTERO, DEFENSA, CENTRO, DELANTERO};
	static class Entrenador {
		//atributos
		private String nombre;
		private int experiencia;
		//constructor
		public Entrenador() {
		}

		void entrenar(){
			System.out.println("Clase interna");
		}
	}
	private String x = "EquipoFutbol";
	void hacerEquipo(){
		
		class Jugador{
			//atributos
			private String nombre;
			private Puesto puesto;
			//constructor
			public Jugador() {
			}

			public void MetodoInterno(){
				System.out.println("metodo local  : Valor de x es " + x);
			}
		}
		Jugador jugador = new Jugador();
		jugador.MetodoInterno();
		
	}
	public static void main(String[] args) {
		EquipoFutbol.Entrenador c = new EquipoFutbol.Entrenador();
		c.entrenar();
		
		EquipoFutbol ft = new EquipoFutbol();
		ft.hacerEquipo();
	}
}
