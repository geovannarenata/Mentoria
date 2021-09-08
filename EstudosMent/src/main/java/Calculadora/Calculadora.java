package Calculadora;

public class Calculadora {

        /**
         * Método #1 - Soma
         * */
        public double somar(double num1, double num2) {
            return num1 + num2;
        }

        /**
         * Método #2 - Subtração
         */
        public double subtrair(double num1, double num2) {
            if( num1 < 0) {
                return (num1 + (-num2));
            } else {
                return (num1 - num2);
            }
        }

        /**
         * Método #3 - Divisão
         */
        public double dividir(double num1, double num2) {
            if ( num2 >= 1) {
                return (num1 / num2);
            } else {
                return 1;
            }
        }

        /**
         * Método #4 - Multiplicação
         */
        public int multiplicar(int num1, int num2) {
            if (num2 >=1) {
                return (num1 * num2);
            } else {
                return 0;
            }
        }

        /**
         * Método #5 Fatorial
        */
        public int identificarFatorial(int num) {
            int res = 0;

            if (num >=2) {
                for (int i = 0; i > num; i++) {
                    res = num * (num - 1);
                    num--;
                }
                return res;
            } else {
                return 0;
            }
        }

}
