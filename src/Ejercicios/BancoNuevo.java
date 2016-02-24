package Ejercicios;

import java.util.Random;

public class BancoNuevo{
	public static void main(String[] args) {
		Banco banco = new Banco();
		CuentaBancaria cb = null, cb1 = null, cb2 = null, cb3 = null, cb4 = null;
		banco.guardarCuentas(cb = new CuentaBancaria());
		banco.guardarCuentas(cb1 = new CuentaBancaria());
		banco.guardarCuentas(cb2 = new CuentaBancaria());
		banco.guardarCuentas(cb3 = new CuentaBancaria());
		banco.guardarCuentas(cb4 = new CuentaBancaria());
		try {
			cb.setNumeroCuenta(crearCuentasBancarias());
			cb1.setNumeroCuenta(crearCuentasBancarias());
			cb2.setNumeroCuenta(crearCuentasBancarias());
			cb3.setNumeroCuenta(crearCuentasBancarias());
			cb4.setNumeroCuenta(crearCuentasBancarias());
			
		} catch (crearCuentaExcepcion e) {
			System.out.println("No ha podido crearse la cuenta");
		}
		System.out.println(banco);
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