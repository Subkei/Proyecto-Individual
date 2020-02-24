package electrodomesticos;

/**
 * Clase Televisión, subclase hija de la clase electrodomestico
 * Define atributos heredables y atributos por defecto
 * Un constructor por defecto, otro constructor para precio y peso,
 * un último constructor con carga y el resto de los atributos heredados de la clase padre
 * métodos getters y el método precio final
 * @author: Sebastián Acevedo
 * @see: url
 * @version: 2020
 */
public class Television extends Electrodomestico{

	/**
	 * Atributos de la subclase televisión
	 */
	private double resolucion;
	private boolean sintonizadorTDT;
	
	/**
	 * Atributos constantes por defecto de la subclase televisión
	 */
	private static final double RESOLUCION = 20;
	private static final boolean SINTONIZADOR_TDT = false;
	
	/**
	 * Constructor con atributos por defecto
	 * @param resolucion Resolucion de imagen en pulgadas "
	 * @param sintonizadorTDT Sintonizador TDT si viene incorporado al televisión o no
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	/**
	 * Constructor con parametros precio y peso heredados de la clase Electrodomestico
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}
	
	/**
	 * Constructor con todos los atributos
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(int precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Métodos getters
	 */
	
	/**
	 * @return retorna la resolucion de Televisión
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * @return retorna el sintonizadorTDT de Televisión ya sea true o false
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * método precio final, si tiene una resolución mayor de 40 pulgadas,
	 * se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €
	 * @param precioFinal Precio final
	 * @return retorna el precio base más el precio adicional de Televisión con el incremento si corresponde
	 */
	public int precioFinal() {
		int precioAdicional = super.precioFinal();
		if (resolucion>40) {
			precioAdicional = (int) (precioBase + (precioBase * 1.3));
		}
		if (sintonizadorTDT) {
			precioAdicional += 50;
		}
		return precioAdicional;
	}

	/**
	 * método toString
	 */
	@Override
	public String toString() {
		return "Television [Precio base: $" + getPrecioBase() + ", Color: " + getColor() + ", Consumo Energetico: " + getConsumoEnergetico() + ", Peso: " + getPeso() + "kg" +", Resolucion: " + resolucion + ", Sintonizador TDT: " + sintonizadorTDT + "]";
	}
	
}