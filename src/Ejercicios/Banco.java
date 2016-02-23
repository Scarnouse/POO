package Ejercicios;

import java.sql.Date;
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
		Banco banco = new Banco();
		CuentaBancaria cb = new CuentaBancaria();
		banco.guardarCuentas(cb);
		try {
			cb.setNumeroCuenta("1234567890");
		} catch (crearCuentaExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(banco);
	}*/
	
}
