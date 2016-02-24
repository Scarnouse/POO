package Ejercicios;

import java.util.Random;

public class BancoNuevo{
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		for (int i = 0; i < 5; i++) {
			try {
				banco.guardarCuentas(new CuentaBancaria());
				banco.b.get(i).setNumeroCuenta(crearCuentasBancarias());
			} catch (cuentaDuplicadaExcepcion | crearCuentaExcepcion e) {
				System.out.println("Cuenta errónea");
			}
			
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