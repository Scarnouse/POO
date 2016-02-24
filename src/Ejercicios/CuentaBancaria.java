package Ejercicios;

import java.util.Date;

public class CuentaBancaria {
	//atributos
	private String numeroCuenta;
	private double saldo;
	private double interes;
	private Date fechaCreacion;
	private final String ENTIDAD = "1234";
	private final String OFICINA ="5678";
	private static int cuentasCreadas = 0;
	
	//contructor
	public CuentaBancaria(){
		this.numeroCuenta = "";
		this.saldo = 0;
		this.interes = 2.5;
		this.fechaCreacion = new Date();
		cuentasCreadas++;
	}
	
	public CuentaBancaria(double saldo, double interes){
		this.saldo = saldo;
		this.interes = interes;
		cuentasCreadas++;
	}

	//getter y setter

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) throws crearCuentaExcepcion {
		if (numeroCuenta.matches("[0-9]{10}")){
			this.numeroCuenta = numeroCuenta;
		} else {
			throw new crearCuentaExcepcion();
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public int getCuentasCreadas(){
		return cuentasCreadas;
	}
	
	private String crearDigitoControl(){
		String digitoControl ="";
		int primerDigito = 0;
		String prefijo = ENTIDAD+OFICINA+"00";
		int sumaPrimerDigito = 0;
		final int[] DIGITOS = {1,2,4,8,5,10,9,7,3,6}; 
		for (int i = 0; i < DIGITOS.length; i++) {
			sumaPrimerDigito += Character.getNumericValue(prefijo.charAt(i))*DIGITOS[i];
		}
		primerDigito = 11-(sumaPrimerDigito%11);
		if (primerDigito==10) primerDigito=1;
		else if (primerDigito==11) primerDigito=0;
		int segundoDigito = 0;
		int sumaSegundoDigito = 0;
		for (int i = 0; i < DIGITOS.length; i++) {
			sumaSegundoDigito += Character.getNumericValue(this.numeroCuenta.charAt(i))*DIGITOS[i];
		}
		primerDigito = 11-(sumaSegundoDigito%11);
		if (segundoDigito==10) segundoDigito=1;
		else if (segundoDigito==11) segundoDigito=0;
		digitoControl = segundoDigito+""+primerDigito;
		return digitoControl;
	}
	
	public void depositarDinero(double cantidad){
		this.saldo += cantidad;
	}
	
	public void retirarDinero (double cantidad) throws retirarDineroExcepcion{
		if (saldo>0){
			this.saldo -= cantidad;
		} else {
			throw new retirarDineroExcepcion();
		}
	}

	@Override
	public String toString() {
		return "Cuenta [Numero de Cuenta: " + ENTIDAD +" "+ OFICINA + " " + crearDigitoControl() + " " + this.numeroCuenta + ", Saldo: " + saldo + "]";
	}

	//metodo de testeo
	/*public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.setNumeroCuenta("9430301240");	
			System.out.println(cb.crearDigitoControl());
			System.out.println(cb);
		} catch (crearCuentaExcepcion e) {

			System.out.println("Numero de cuenta errónea");
		}
		
	}*/

}

