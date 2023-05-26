import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraBasicaTest {

    @Test
    void calcularMasaCorporal() {
        CalculadoraBasica calculadora = new CalculadoraBasica(70, 170, 30, "Mujer", 1);
        double masaCorporal = calculadora.calcularMasaCorporal(70, 170);
        Assertions.assertEquals(24.22, masaCorporal, 0.01);
    }

    @Test
    void calcularCaloriasMantenimiento() {
        CalculadoraBasica calculadora = new CalculadoraBasica(70, 170, 30, "Mujer", 1);
        double caloriasMantenimiento = calculadora.calcularCaloriasMantenimiento(70, 170, 30, "Mujer", 1);
        Assertions.assertEquals(1751.5, caloriasMantenimiento, 0.01);
    }

    @Test
    void determinarEstadoFisico() {
        CalculadoraBasica calculadora = new CalculadoraBasica(70, 170, 30, "Mujer", 1);
        String estadoFisico = calculadora.determinarEstadoFisico(24.22);
        Assertions.assertEquals("Peso normal", estadoFisico);
    }
}