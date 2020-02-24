package electrodomesticos;

/**
 * Clase ejecutable Menu
 * Contiene un Array con 10 posiciones, al cual se le asignan valores de cada una de las clases
 * Se recorre el Array y entrega un precio final, adem�s de mostrar el precio para cada clase
 * @author: Sebastián Acevedo
 * @see url
 * @version: 23/02/2020
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Array de electrodomesticos con 10 posiciones
		 */
		Electrodomestico reporteElectrodomesticos[] = new Electrodomestico[10];
		
		// carga los atributos constantes de la subclase Electrodomestico
		reporteElectrodomesticos[0] = new Electrodomestico();
		// llenado con precio y peso, el resto por defecto
		reporteElectrodomesticos[1] = new Electrodomestico(200, 20);
		// llenado con precio, color, consumo energetico, peso
		reporteElectrodomesticos[2] = new Electrodomestico(150, "azul", 'B', 15);
		// llenado con precio, color, consumo energetico, peso
		reporteElectrodomesticos[3] = new Electrodomestico(120, "negro", 'A', 18);
		
		// carga los atributos constantes de la subclase Televisión
		reporteElectrodomesticos[4] = new Television(); //100+10+10
		//llenado con precio y peso, el resto por defecto 
		reporteElectrodomesticos[5] = new Television(190, 25); //190+10+50
		// llenado con precio, color, consumo energetico, peso, resolución en pulgadas y sintonizador TDT 
		reporteElectrodomesticos[6] = new Television(150, "gris", 'A', 15, 42, false); // 150+100+10+50
		
		// carga los atributos constantes de la subclase Lavadora
		reporteElectrodomesticos[7] = new Lavadora();
		// llenado con precio y peso, el resto por defecto
		reporteElectrodomesticos[8] = new Lavadora(180, 65);
		// llenado con precio, color, consumo energetico, peso y carga
		reporteElectrodomesticos[9] = new Lavadora(250, "rojo", 'A', 55, 9);
		
		/**
		 * Se recorre el array y ejecuta el método precio
		 */
		System.out.println("--------------Listado de Electrodomesticos-------------");
		for (Electrodomestico electrodomestico : reporteElectrodomesticos) {
			System.out.println(electrodomestico);
		}
		
		/**
		 * Variables inicializadas para guardar los precios
		 */
		int precioFinalElectrodomestico = 0;
		int precioFinalTelevision = 0;
		int precioFinalLavadora = 0;
		
		/**
		 *  instanceof
		 */
		for (int i = 0; i < reporteElectrodomesticos.length; i++) {
			
			if (reporteElectrodomesticos[i] instanceof Electrodomestico) {
				 precioFinalElectrodomestico += reporteElectrodomesticos[i].precioFinal();
			}
			if (reporteElectrodomesticos[i] instanceof Television) {
				precioFinalTelevision += reporteElectrodomesticos[i].precioFinal();
			}
			if (reporteElectrodomesticos[i] instanceof Lavadora) {
				precioFinalLavadora += reporteElectrodomesticos[i].precioFinal();
			}
		}
		/**
		 * Mostrar la suma de precios para cada una de las clases, Electrodomesticos, Televisión y Lavadora
		 */
			System.out.println("\n--------------Suma de Precios--------------");
			System.out.println("\nSuma de Precios Electrodomestico: $" +precioFinalElectrodomestico);
			System.out.println("\nSuma de Precios Televisión: $" +precioFinalTelevision);
			System.out.println("\nSuma de Precios Lavadora: $" + precioFinalLavadora);
	}

}
