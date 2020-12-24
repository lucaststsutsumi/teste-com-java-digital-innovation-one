package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoreComTddTest {
    @Test
    public void deveSomarDoisValores() {
        int valorA = 1;
        int valorB = 2;

        CalculadoraTdd calculadoraTdd = new CalculadoraTdd();
        int soma = calculadoraTdd.somar(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void deveSomarTresValores() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraTdd calculadoraTdd = new CalculadoraTdd();
        int soma = calculadoraTdd.somar(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}
