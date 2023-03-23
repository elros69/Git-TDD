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
}