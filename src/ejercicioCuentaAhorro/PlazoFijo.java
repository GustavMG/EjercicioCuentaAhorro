package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta {

	//Atributos
	public int plazo;
	public float interes;
	
	//Metodos
	//Metodo para heredar los datos (Constructor)
	public PlazoFijo(String titular, float cantidad, int plazo, float interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	
	public double obtenerImporte() {
//		float totalInteres = (cantidad*interes)/100;
		return (cantidad*interes)/100;
	}
	
	

	public void mostrarInformacionPlazofijo() {
		System.out.println("Información de la cuenta Plazo Fijo");
		imprimirDatos();
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total Interes: " + obtenerImporte());
	}

	@Override
	public String toString() {
		return "PlazoFijo [plazo=" + plazo + ", interes=" + interes + ", titular=" + titular + ", cantidad=" + cantidad
				+ "]";
	}

}