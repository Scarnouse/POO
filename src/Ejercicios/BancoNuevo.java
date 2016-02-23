package Ejercicios;

import java.util.Random;

public class BancoNuevo{
	public static void main(String[] args) {
		Banco b = new Banco();
		
		CuentaBancaria cb = null, cb1 = null, cb2 = null, cb3 = null, cb4 = null;
		try {
			cb = new CuentaBancaria(crearCuentasBancarias());
			cb1 = new CuentaBancaria(crearCuentasBancarias());
			cb2 = new CuentaBancaria(crearCuentasBancarias());
			cb3 = new CuentaBancaria(crearCuentasBancarias());
			cb4 = new CuentaBancaria(crearCuentasBancarias());
		} catch (crearCuentaExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("Cuenta errónea");
		}
		
		try {
			b.guardarCuentas(cb);
			b.guardarCuentas(cb1);
			b.guardarCuentas(cb2);
			b.guardarCuentas(cb3);
			b.guardarCuentas(cb4);
		} catch (cuentaDuplicadaExcepcion e) {
			System.out.println("Cuenta duplicada");
		}
		
		System.out.println(b);
	}
	static private String crearCuentasBancarias(){
		Random r = new Random();
		String cuentaBancaria = "";
		for (int i = 0; i < 10; i++) {
			cuentaBancaria += r.nextInt(10);
		}
		return cuentaBancaria;
	}
}