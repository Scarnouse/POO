package ClasesInternas;

import ClasesInternas.Externa.Interna;

public class TestClasesInternas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa e = new Externa();
		//Externa.Interna i = e.new Interna();
		//System.out.println(i.multiplicarNumeros(5, 10));
		System.out.println(e.metodo(3, 4));
	}

}

class Externa{
	private static final int CONSTANTE = 12;
	public Externa() {
		System.out.println("Creado objeto externo");
	}
	class Interna {
		private Interna() {
			System.out.println("Creado objeto interno");
		}
		private int multiplicarNumeros(int valorUno, int valorDos){
			return valorUno*valorDos*CONSTANTE;
		}
		
	}
	public int metodo(int valorUno, int valorDos){
		Interna i = new Interna();
		return i.multiplicarNumeros(valorUno,valorDos);
	}
	
}