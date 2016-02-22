package Ejercicios;

import java.util.Random;

public class BancoNuevo {
	Banco b = new Banco();
	Random r = new Random();
	String[] arrayCuentas = new String[5];
	String cuentaAleatoria = "";
	for(int j=0; i<5; i++){
		for(int i=0; i<10; i++) {
			cuentaAleatoria += r.nextInt(10);
		}
		arrayCuentas[j] = cuentaAleatoria;
	}	
}
