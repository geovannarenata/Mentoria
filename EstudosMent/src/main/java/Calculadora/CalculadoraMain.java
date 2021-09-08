package Calculadora;

public class CalculadoraMain {

       public static void main(String[] args) {

            Calculadora calculadora = new Calculadora();

            System.out.println(calculadora.somar(5,2));
            System.out.println(calculadora.subtrair(10,8)); // cenário num1 > num2
            System.out.println(calculadora.dividir(10,2));  //cenário num1 > num2
            System.out.println(calculadora.multiplicar(2,3)); // cenário num2 !=
            calculadora.identificarFatorial(5);

       }
}
