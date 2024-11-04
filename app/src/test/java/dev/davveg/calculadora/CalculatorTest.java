package dev.davveg.calculadora;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd2Operands() {
        double total  = Calculator.calcular("5+3");
        assertEquals("x + y operation not working correctly", 8.0 , total);
    }

    public void testAdd1Operand() {
        double total  = Calculator.calcular("4+3+1");
        assertEquals("+X y operation not working correctly", 8.0 , total);
    }

    public void testMult2Operands() {
        double total  = Calculator.calcular("4*2");
        assertEquals("4*X operation not working correctly", 8.0 , total);
    }

    public void testMultipleMult() {
        double total  = Calculator.calcular("1*2*8");
        assertEquals("x*x*x operation not working correctly", 16.0 , total);
    }

    public void testMultAndAdd() {
        double total  = Calculator.calcular("3+2*2+4");
        assertEquals("x*x*x operation not working correctly", 11.0 , total);
    }

    public void testMultAndAdd2() {
        double total  = Calculator.calcular("2*2+3");
        assertEquals("x*x*x operation not working correctly", 7.0 , total);
    }

    public void testMultAndAdd3() {
        double total  = Calculator.calcular("2*2+3*2+2*2 ");
        assertEquals("x*x*x operation not working correctly", 14.0 , total);
    }

    public void testSumSubMultAndDiv() {
        double total  = Calculator.calcular("5*2/5+5");
        assertEquals("x*y/x+x operation not working correctly", 7.0 , total);
    }



}