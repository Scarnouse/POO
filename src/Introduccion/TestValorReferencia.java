package Introduccion;

public class TestValorReferencia {

	public static void main(String[] args) {
		Persona p = new Persona("Juanito", 22);
		System.out.println("antes de llamar a cambiar: " + p);
		cambiar(p);
		System.out.println("después de llamar a cambiar: " + p);
		System.out.println("-------------------------------------");
		int a = 5;
		int b = 10;
		System.out.println("antes de llamar a cambiarTiposPrimitivos a:" + a + " b:" + b);
		cambiarTiposPrimitivos(a, b);
		System.out.println("después del metodo cambiarTiposPrimitivos a:"+ a +"  b:"+ b);
	}

	public static void cambiar(Persona p1){
		
		p1.setNombre("Juaquinito");
		p1.setEdad(12);
		System.out.println("dentro del método cambiar: "+ p1);
	}
	
	public static void cambiarTiposPrimitivos (int a, int b){
		int auxiliar;
		
		auxiliar = a;
		a = b;
		b = auxiliar;	
		System.out.println("dentro del método cambiarTiposPrimitivos a:"+a+" b:"+b);
	}
}
