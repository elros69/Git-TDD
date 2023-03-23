import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testearNumero1() {
        String valorInicial = FizzBuzz.returnNumber(1);

        assertEquals("1", valorInicial);
    }

    @Test
    void testearNumero2() {
        String valorInicial = FizzBuzz.returnNumber(2);

        assertEquals("2", valorInicial);
    }

    @Test
    void testearNumero3() {
        String valorInicial = FizzBuzz.returnNumber(3);

        assertEquals("Fizz", valorInicial);
    }
}