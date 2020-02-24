package electrodomesticos;

/**
 * Clase Lavadora, subclase hija de la clase electrodomestico
 * Define atributos heredables y atributos por defecto
 * Un constructor por defecto, otro constructor para precio y peso,
 * un último constructor con carga y el resto de los atributos heredados de la clase padre
 * Métodos getters y el método precio final
 * @author: Sebastián Acevedo
 * @see: url
 * @version: 2020
 */
public class Lavadora extends Electrodomestico {
	
	/**
	 * Atributos de la subclase Lavadora
	 */
	private int carga;
	
	/**
	 * Atributos constantes por defecto de la subclase Lavadora
	 */
	private static final int CARGA = 5;
	
	/**
	 * Constructor con atributos por defecto
	 * @param carga Capacidad de carga en kg de Lavadora
	 */
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	/**
	 * Constructor con parametros precio y peso heredados de la clase Electrodomestico
	 * @param precioBase Precio base heredado de la clase Electrodomestico
	 * @param peso Peso heredado de la clase Electrodomestico
	 */
	public Lavadora(int precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}

	/**
	 * Constructor con la carga y el resto de los atributos heredados
	 * @param precioBase Precio base heredado de la clase Electrodomestico
	 * @param color Color heredado de la clase Electrodomestico
	 * @param consumoEnergetico Consumo energetico heredado de la clase Electrodomestico
	 * @param peso Peso heredado de la clase Electrodomestico
	 */
	public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	/**
	 * Métodos getters
	 */
	
	/**
	 * @return retorna la carga de Lavadora
	 */
	public int getCarga() {
		return carga;
	}
	/**
	 * método precio final, una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio
	 * @param precioFinal Precio final
	 * @return el precio adicional de Lavadora
	 */
	public int precioFinal() {
		int precioAdicional = super.precioFinal();
		if (carga>=30) {
			precioAdicional += 50;
		}
		return precioAdicional;
	}
	
	/**
	 * método toString
	 */
	@Override
	public String toString() {
		return "Lavadora [Precio base: $" + getPrecioBase() + ", Color: " + getColor() + ", Consumo Energetico: " + getConsumoEnergetico() + ", Peso: " + getPeso() + "kg" + ", Capacidad de carga: " + carga + "]";
	}
}