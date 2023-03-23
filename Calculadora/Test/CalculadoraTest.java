import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @Test
    void devuelve0() {
        Integer valorInicial = Calculadora.sumar("");

        assertEquals(0, valorInicial);
    }

    @Test
    void devuelve1() {
        Integer valorInicial = Calculadora.sumar("1");

        assertEquals(1, valorInicial);
    }

    @Test
    void devuelve3() {
        Integer valorInicial = Calculadora.sumar("1","2");

        assertEquals(3, valorInicial);
    }

    @Test
    void devuelve4() {
        Integer valorInicial = Calculadora.sumar("1","1","2");

        assertEquals(4, valorInicial);
    }

}