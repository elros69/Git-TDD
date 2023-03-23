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

    @Test
    void testearNumero4() {
        String valorInicial = FizzBuzz.returnNumber(4);

        assertEquals("4", valorInicial);
    }

    @Test
    void testearNumero5() {
        String valorInicial = FizzBuzz.returnNumber(5);

        assertEquals("Buzz", valorInicial);
    }

    @Test
    void testearNumero6() {
        String valorInicial = FizzBuzz.returnNumber(6);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero7() {
        String valorInicial = FizzBuzz.returnNumber(7);

        assertEquals("7", valorInicial);
    }

    @Test
    void testearNumero8() {
        String valorInicial = FizzBuzz.returnNumber(8);

        assertEquals("8", valorInicial);
    }

    @Test
    void testearNumero9() {
        String valorInicial = FizzBuzz.returnNumber(9);

        assertEquals("Fizz", valorInicial);
    }

    @Test
    void testearNumero10() {
        String valorInicial = FizzBuzz.returnNumber(10);

        assertEquals("Buzz", valorInicial);
    }
}