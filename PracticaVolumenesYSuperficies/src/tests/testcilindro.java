package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;

class TestCilindro {
	

	@Test
	void testVolumen() {
	Cilindro c = new Cilindro(2,5);
	double volumenEsperado = 157;
	double volumenObtenido = c.volumen();
	assertEquals(volumenEsperado, volumenObtenido);
	}

@Test
void testSuperficie() {
Cilindro c = new Cilindro(2,5);
double superficieEsperado = 219.8;
double superficeObtenido = c.superficie();
assertEquals(superficieEsperado, superficeObtenido);
}



@Test
void testConstructorporDefecto() {
Cilindro c = new Cilindro();
// radio=1, altura=1 - superficie = 2π·1² + 2π·1·1 = 12.56 - volumen = π·1²·1 = 3.14 */
assertEquals(3.14, c.volumen());
assertEquals(12.56, c.superficie());

}

}
