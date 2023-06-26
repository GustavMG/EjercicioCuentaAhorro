package ejercicioCuentaAhorro;

public class Cuenta {
	//1. Atributos
	String titular;
	float cantidad;
	
	//2. Constructores
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//3. Métodos
	public void imprimirDatos() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}
}