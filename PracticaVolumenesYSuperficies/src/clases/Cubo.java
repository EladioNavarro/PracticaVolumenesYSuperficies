package clases;

public class Cubo {
int lado;

	

	public Cubo() {

		this.lado = 1;

	}
	

	public Cubo(int lado) {

		if (lado > 0)

			this.lado = lado;

		else

			this.lado = 1;  
		
		/**Si el numero no es entero entonces pongo 1 por defecto*/	
	}
	
	/**

	 * Calculo superficie de cubo

	 * @return superficie del cubo

	 */

	public double superficie() {

		return 6 * (lado * lado);  /**lado.lado= el area de una cara * 6 = la superficie*/
	}

	/**

	 * Calculo volumen de cubo

	 * @returnel volumen  cubo

	 */

	public double volumen() {

		return lado * lado * lado;

	}
}
