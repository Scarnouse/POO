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
	
	//contructor
	public CuentaBancaria(){
		this.numeroCuenta = "";
		this.saldo = 0;
		this.interes = 2.5;
		this.Date = new Date();
	}
	
	public CuentaBancaria(double saldo, double interes){
		this.saldo = saldo;
		this.interes = interes;
	}

	//getter y setter

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
	
	private String crearDigitoControl(){
		String PREFIJO+
	}
	
	
}
