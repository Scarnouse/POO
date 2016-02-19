package ClasesInternas;

import Introduccion.Usuario;

public class TestClasesParametrizadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {1,2,3,4,5,6};
		ClasesParametrizadas<Integer> c1 = new ClasesParametrizadas<Integer>();
		for (int i : numeros) {
			c1.addElemento(i);
		}
		System.out.println(c1);
		String[] cadenas = {"hola","mundo","add"};
		ClasesParametrizadas<String> c2 = new ClasesParametrizadas<String>();
		for (String string : cadenas) {
			c2.addElemento(string);
		}
		System.out.println(c2);
		System.out.println("Elemento 0 de numeros :"+c1.getElemento(0));
		System.out.println("Elemento 0 de cadenas :"+c2.getElemento(0));
		//Trabajamos clase parametrizada
		ClasesParametrizadas<Usuario> c3 = new ClasesParametrizadas<Usuario>();
		//Trabajamos con objetos Usuarios
		
			try {
				//while(true){
				Usuario u1 = new Usuario("juan", "passJuan");
				c3.addElemento(u1);
				Usuario u2 = new Usuario("1pedro", "passPedro");
				c3.addElemento(u2);
				Usuario u3 = new Usuario("Romeo", "passJulieta");
				c3.addElemento(u3);
				//}
			} catch (Usuario.usuariosException e) {
				System.out.println("No es usuario válido");
			}
		
		System.out.println(c3);
		System.out.println("Elemento 0 de Usuarios: "+c3.getElemento(0));
		System.out.println("Passwor elemento 0: "+c3.getElemento(0).getPass());
		
		System.out.println("Elemento 3 de Usuarios: "+c3.getElemento(3));
		//System.out.println("Passwor elemento 3: "+c3.getElemento(3).getPass());
		//Origina la NullPointerException
		if (c3.getElemento(3)!=null){
			System.out.println("Elemento 3 de Usuarios: "+c3.getElemento(3));
			System.out.println("Passwor elemento 3: "+c3.getElemento(3).getPass());
		} else {
			System.out.println("Usuario no existe");
		}
	}

}
