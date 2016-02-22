package Ejercicios;

import java.util.Random;

public class BancoNuevo{
	public static void main(String[] args) {
		Banco b = new Banco();
		Random r = new Random();
		String[] arrayCuentas = new String[5];
		for(int j=0; j<5; j++){
			String cuentaAleatoria = "";
			for(int i=0; i<10; i++) {
				cuentaAleatoria += r.nextInt(10);
			}
			System.out.println(cuentaAleatoria);
			arrayCuentas[j] = cuentaAleatoria;
		}
		
		//¿Cómo comparo las cuentas?
		
		CuentaBancaria cb, cb1, cb2, cb3, cb4;
		try {
			b.guardarCuentas(cb = new CuentaBancaria(arrayCuentas[0]));
			b.guardarCuentas(cb1 = new CuentaBancaria(arrayCuentas[1]));
			b.guardarCuentas(cb2 = new CuentaBancaria(arrayCuentas[2]));
			b.guardarCuentas(cb3 = new CuentaBancaria(arrayCuentas[3]));
			b.guardarCuentas(cb4 = new CuentaBancaria(arrayCuentas[4]));
			
		} catch (crearCuentaExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("Cuenta errónea");
		}
	}			
}
