package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	// atributos
	List<CuentaBancaria> b = new ArrayList<CuentaBancaria>();
	
	//métodos
	public void guardarCuentas(CuentaBancaria cuenta){
		b.add(cuenta);
	}
	public void darBajaCuentas(CuentaBancaria cuenta){
		b.remove(cuenta);
	}
	public CuentaBancaria devolverCuentaMayorSaldo(){
		CuentaBancaria cbMayorSaldo = b.get(0);
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).getSaldo()>cbMayorSaldo.getSaldo()){
				cbMayorSaldo = b.get(i);
			}
		}
		return cbMayorSaldo;
	}
	
	public CuentaBancaria devolverCuentaMenorSaldo(){
		CuentaBancaria cbMenorSaldo = b.get(0);
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).getSaldo()<cbMenorSaldo.getSaldo()){
				cbMenorSaldo = b.get(i);
			}
		}
		return cbMenorSaldo;
	}
	
	private double getSaldoMedio(){
		double saldoMedio = 0;
		for (int i = 0; i < b.size(); i++) {
			saldoMedio += b.get(i).getSaldo();
		}
		return saldoMedio/b.size();
	}
	
	@Override
	public String toString() {
		return "El saldo medio de " + b.size() + " cuentas es " + getSaldoMedio();
	}
	
	//método para probar la clase Banco
	/*public static void main(String[] args) {
		Banco b = null;
		CuentaBancaria cb, cb1, cb2, cb3, cb4;
		try {
			b = new Banco();
			b.guardarCuentas(cb = new CuentaBancaria("1234567890"));
			b.guardarCuentas(cb1 = new CuentaBancaria("2254843352"));
			b.guardarCuentas(cb2 = new CuentaBancaria("8433625300"));
			b.guardarCuentas(cb3 = new CuentaBancaria("9622558957"));
			b.guardarCuentas(cb4 = new CuentaBancaria("5736225484"));
			cb.depositarDinero(62.53);
			cb.depositarDinero(84.33);
			cb2.depositarDinero(22.54);
			cb1.depositarDinero(57.36);
			cb4.depositarDinero(55.89);
			cb4.depositarDinero(96.22);
			cb3.depositarDinero(59.81);
			cb4.depositarDinero(30.45);
			cb2.depositarDinero(91.37);
			cb3.depositarDinero(50.75);
			System.out.println(b.devolverCuentaMayorSaldo());
			System.out.println(b.devolverCuentaMenorSaldo());
			System.out.println(b);
		} catch (crearCuentaExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("Cuenta errónea");
		}
		
	}*/
	
}
