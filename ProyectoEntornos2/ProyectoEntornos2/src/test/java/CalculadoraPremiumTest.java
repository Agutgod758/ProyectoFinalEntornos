import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraPremiumTest {

    @Test
    void calcularProteinas() {
        CalculadoraPremium calculadora = new CalculadoraPremium(70, 170, 30, "Mujer", 1);
        double proteinas = calculadora.calcularProteinas("objetivo", 70);
        Assertions.assertEquals(154, proteinas, 0.01);
    }

    @Test
    void calcularGrasas() {
        CalculadoraPremium calculadora = new CalculadoraPremium(70, 170, 30, "Mujer", 1);
        double grasas = calculadora.calcularGrasas("objetivo", 1, 70, 170, 30, "Mujer");
        Assertions.assertEquals(68.11, grasas, 0.01);
    }

    @Test
    void calcularHidratosCarbono() {
        CalculadoraPremium calculadora = new CalculadoraPremium(70, 170, 30, "Mujer", 1);
        double hidratosCarbono = calculadora.calcularHidratosCarbono("objetivo", 1, 70, 170, 30, "Mujer");
        Assertions.assertEquals(218.93, hidratosCarbono, 0.01);
    }
}