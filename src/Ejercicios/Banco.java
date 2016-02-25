package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	// atributos
	List<CuentaBancaria> b = new ArrayList<CuentaBancaria>();
	//CuentaBancaria cb = new CuentaBancaria();
	
	//métodos
	public boolean guardarCuentas(CuentaBancaria cuenta) throws cuentaDuplicadaExcepcion{
		for (int i = 0; i < b.size(); i++) {
			if(!cuenta.getNumeroCuenta().equals(b.get(i).getNumeroCuenta()) && cuenta.getNumeroCuenta()!=null) continue;
			else throw new cuentaDuplicadaExcepcion();
		}
		return b.add(cuenta);
		
	}
	
	public boolean darBajaCuentas(CuentaBancaria cuenta){
		return b.remove(cuenta);
	}
	public CuentaBancaria devolverCuentaMayorSaldo(){
		CuentaBancaria cbMayorSaldo = b.get(0);
		for (int i = 0; i < CuentaBancaria.getCuentasCreadas()-1; i++) {
			if (b.get(i).getSaldo()>cbMayorSaldo.getSaldo()){
				cbMayorSaldo = b.get(i);
			}
		}
		return cbMayorSaldo;
	}
	
	public CuentaBancaria devolverCuentaMenorSaldo(){
		CuentaBancaria cbMenorSaldo = b.get(0);
		for (int i = 0; i < CuentaBancaria.getCuentasCreadas()-1; i++) {
			if (b.get(i).getSaldo()<cbMenorSaldo.getSaldo()){
				cbMenorSaldo = b.get(i);
			}
		}
		return cbMenorSaldo;
	}
	
	private double getSaldoMedio(){
		double saldoMedio = 0;
		for (int i = 0; i < CuentaBancaria.getCuentasCreadas()-1; i++) {
			saldoMedio += b.get(i).getSaldo();
		}
		return saldoMedio/CuentaBancaria.getCuentasCreadas();
	}
	
	public List<CuentaBancaria> devolverListaMorosos(){
		List<CuentaBancaria> listaMorosos = new ArrayList<CuentaBancaria>();
		for (int i = 0; i < b.size(); i++) {
			if(b.get(i).getSaldo()<0) listaMorosos.add(b.get(i));
		}
		return listaMorosos;
	}
	
	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < b.size(); i++) {
			cadena += "Numero de cuenta: " + b.get(i).getNumeroCuenta() + " Saldo: " + b.get(i).getSaldo() +"\n";
		}
		
		return cadena + "El saldo medio de " + b.size() + " cuentas es " + getSaldoMedio();
	}
	
	//método para probar la clase Banco
	/*public static void main(String[] args) {
		Banco banco = new Banco();
		CuentaBancaria cb = new CuentaBancaria();
		banco.guardarCuentas(cb);
		try {
			cb.setNumeroCuenta("1234567890");
			cb.setNumeroCuenta("9430301240");
		} catch (crearCuentaExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("Error al crear cuenta");
		}
		System.out.println(cb.getCuentasCreadas());
	}*/
	
}
