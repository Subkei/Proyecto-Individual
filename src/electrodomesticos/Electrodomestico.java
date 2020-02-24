package electrodomesticos;

/**
 * Clase padre Electrodomestico
 * Define atributos heredables y atributos por defecto, sin visibilidad
 * Un constructor por defecto, otro constructor para precio y peso, un último constructor con todos los atributos
 * Métodos getters, comprobar consumo energetico, comprobar color y el método precio final
 * @author: Sebastián Acevedo
 * @see: url
 * @version: 2020
 */
public class Electrodomestico {

	/**
	 * Atributos de la clase Electrodomestico
	 */
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	/**
	 * Atributos constantes por defecto de la clase Electrodomestico
	 */
	protected static final int PRECIO_BASE = 100;
	protected static final String COLOR = "blanco";
	protected static final char CONSUMO_ENERGETICO = 'F';
	protected static final double PESO = 5;
	
	/**
	 * Constructor con atributos por defecto
	 * @param precioBase Precio base de $100 para Electrodomestico
	 * @param color Color blanco para electrodomestico
	 * @param consumoEnergetico Consumo energetico con letra F para electrodomestico 
	 * @param peso Peso en kg 5 para electrodomestico
	 */
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	/**
	 * Constructor con parametros precio y peso, color y consumo energetico por defecto
	 * @param precioBase Precio base se define por defecto
	 * @param color Color se define con atributo constante
	 * @param consumoEnergetico Consumo Energetico se define con atributo constante
	 * @param peso Peso se define con atributo por defecto
	 */
	public Electrodomestico(int precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
	}

	/**
	 * Constructor con todos los atributos
	 * @param precioBase Precio base de Electrodomestico
	 * @param color Color de electrodomestico
	 * @param consumoEnergetico Consumo energetico entre A y F de electrodomestico 
	 * @param peso Peso en kg de electrodomestico
	 */
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	/**
	 * Métodos getters
	 */
	
	/**
	 * @return retorna el precio base de electrodomestico
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return retorna el color de electrodomestico
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return retorna el consumo energetico de electrodomestico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @return retorna el peso de electrodomestico
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * método comprueba que la letra es correcta, sino es correcta, usará la letra por defecto "F"
	 * @param letra
	 */
	protected void comprobarConsumoEnergetico(char letra) {
		consumoEnergetico = letra;
		if (letra >='A' && letra <= 'F') {
			this.consumoEnergetico = letra;
		} else {
			letra = CONSUMO_ENERGETICO;
		}
	}
	
	/**
	 * método comprueba que el color es correcto, sino lo es, usará en color por defecto
	 * @param color
	 */
	protected void comprobarColor(String color) {
		String[] colores = new String[] {"blanco", "negro", "rojo", "azul", "gris"};
		
		for (String arraycolores : colores) {
			if (arraycolores.equals(color)) {
				this.color = color;
			} else {
				this.color = COLOR;
			}
		}
	}
	
	/**
	 * método precio final, según el consumo energetico, aumentará su precio, y según su tamaño también
	 */
	public int precioFinal(){
		int precioAdicional = 0;
		if (consumoEnergetico == 'A') {
			precioAdicional += 100;
		} else if(consumoEnergetico == 'B') {
			precioAdicional += 80;
		} else if(consumoEnergetico == 'C') {
			precioAdicional += 60;
		} else if(consumoEnergetico == 'D') {
			precioAdicional += 50;
		} else if(consumoEnergetico == 'E') {
			precioAdicional += 30;
		} else if(consumoEnergetico == 'F') {
			precioAdicional += 10;
		}
		
		if (peso>0 && peso<=19) {
			precioAdicional += 10;
		} else if(peso>=20 && peso<=49) {
			precioAdicional += 50;
		} else if(peso>=50 && peso<=79) {
			precioAdicional += 80;
		} else if(peso>=80) {
			precioAdicional += 100;
		}
		return precioBase + precioAdicional;
	}
	
	/**
	 * método toString
	 */
	@Override
	public String toString() {
		return "Electrodomesticos [precio base: $" + precioBase + ", color: " + color + ", consumo energetico: "
				+ consumoEnergetico + ", peso: " + peso + "kg" +"]";
	}
}