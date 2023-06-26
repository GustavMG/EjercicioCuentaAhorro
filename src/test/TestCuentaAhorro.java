package test;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class TestCuentaAhorro {

	public static void main(String[] args) {
		//Instancia #1 (CuentaAhorro)
		CajaAhorro cuenta01 = new CajaAhorro("Gustav", 1100.50f);//Cuando no quiero polimorfear
		
		//Instancia #2 (Plazo fijo)
		PlazoFijo inversion01 = new PlazoFijo("Tavo", 2500.5f, 12, 5.0f);
		
		//Mostrar la información de las cuentas
		cuenta01.mostrarInformacionCajaAhorro();	//titular y cantidad
		System.out.println("\n");
		inversion01.mostrarInformacionPlazofijo();	//titular, cantidad, plazo
	}

}
