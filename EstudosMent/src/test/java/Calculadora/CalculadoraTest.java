package Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

   @Test
    void somarTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(3,5);
        double resultado2 = calculadora.somar(-2, 10);
        double resultado3 = calculadora.somar(2, -10);
        double resultado4= calculadora.somar(0.5, 2);

       Assertions.assertEquals(8, resultado);
       Assertions.assertEquals(8, resultado2);
       Assertions.assertEquals(-8, resultado3);
       Assertions.assertEquals(2.5, resultado4);
   }

   @Test
    void subtrairTest() {
       Calculadora calculadora = new Calculadora();
       double resultado = calculadora.subtrair(10,7);
       double resultado2 = calculadora.subtrair(7,10);
       double resultado3 = calculadora.subtrair(-5,15);
       double resultado4 = calculadora.subtrair(5,15);

       Assertions.assertEquals(3, resultado);
       Assertions.assertEquals(-3, resultado2);
       Assertions.assertEquals(-20, resultado3);
       Assertions.assertEquals(-10, resultado4);
   }

   @Test
    void divisaoTest() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividir(40, 4);
        double resultado2 = calculadora.dividir(8,0);
        double resultado3= calculadora.dividir(-20,2);
        double resultado4= calculadora.dividir(20,-2);

        Assertions.assertEquals(10, resultado);
        Assertions.assertEquals(1, resultado2);
        Assertions.assertEquals(-10, resultado3);
        Assertions.assertEquals(1, resultado4);
   }

   @Test
    void multiplicarTest() {
       Calculadora calculadora = new Calculadora();

       double resultado = calculadora.multiplicar(2,5);
       double resultado2 = calculadora.multiplicar(5,0);
       double resultado3 = calculadora.multiplicar(5,-2);

       Assertions.assertEquals(10, resultado);
       Assertions.assertEquals(0, resultado2);
       Assertions.assertEquals(0, resultado3);
   }

   @Test
    void fatorialTest() {
       Calculadora calculadora = new Calculadora();

       double resultado = calculadora.identificarFatorial(3);

       Assertions.assertEquals(6, resultado);
   }

}
