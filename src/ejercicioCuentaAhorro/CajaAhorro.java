package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {

	
	//Metodos
	//Metodo para heredar los datos
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	}
	
	//Metodo para mostrar la información
	public void mostrarInformacionCajaAhorro() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}
	
	//toString para mostrar datos
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
