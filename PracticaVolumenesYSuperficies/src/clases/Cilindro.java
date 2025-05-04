package clases;

public class Cilindro {

	
	double altura, radio;

	final double PI = 3.14;

	

	public Cilindro(double a, double r) {

		if (a > 0 && r > 0 ) {

			this.altura = a;

			this.radio = r;

		}
	

		else //*1 y 1 por defecto, en lugar de IllegalArgumentException*/

			this.altura = 1;

			this.radio = 1;

	}


	public Cilindro() {

		this.radio = 1;

		this.altura = 1;

	}


	/**

	 * Calculo la superficie del cilindro

	 * @return superficie de un cilindro

	 */

	public double superficie() {

		return (2 * PI * (this.radio * this.radio)) + (2 * PI * (this.radio * this.altura));

	}


	/**

	 * Calculo volumen del cilindro

	 * @return el volumen de un cilindro

	 */

	public double volumen() {

		return (PI * (this.radio * this.radio)) * this.altura;

	}
}
