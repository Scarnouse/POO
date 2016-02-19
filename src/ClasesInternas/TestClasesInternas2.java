package ClasesInternas;

public class TestClasesInternas2 {

	public static void main(String[] args) {
		

	}
	
}

class Externa1{
	private int variableInstancia = 5;
	private static int variableClase = 9;
	public static class Interna1{
		public int getterVariableInstancia(){
			/*return variableInstancia;
			 * No se puede acceder desde un miembro no estático
			 * a un miembro estático.
			 */
			public int getterVariableClase(){
				return variableClase;
			}
		}
		
	}
	
}
