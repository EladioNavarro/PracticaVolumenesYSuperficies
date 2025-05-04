package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

@Test
void testSuperficie() {
Cubo c = new Cubo(2); //*Constructor con parametros*/
double superficieEsperada = 24.0;
double superficieObtenida = c.superficie();
assertEquals(superficieEsperada,superficieObtenida);
}



@Test
void testConstructorPorDefecto() {
Cubo c = new Cubo();
        // lado == 1 - volumen = 1, superficie = 6·1.1 = 6
        assertEquals(1.0,  c.volumen());
        assertEquals(6.0,  c.superficie());
}


@Test
void testVolumen() {
Cubo c = new Cubo(2); //*Constructor con parametros*/
double volumenEsperada = 8.0;
double volumenObtenida = c.volumen();
assertEquals(volumenEsperada,volumenObtenida);
}


}
