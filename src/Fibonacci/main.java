package Fibonacci;
// @JeffersonFelizx //https://www.linkedin.com/in/jeffersonfelizz//
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Usando o Scanner para trazer a entrada do usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se pertence a fibonacci");

        int numero = sc.nextInt();

        // Verificando se pertence a fibonacci

        if (pertenceAFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceAFibonacci(int numero) {
        //Definindo os parametros para o calculo
        int a = 0;
        int b = 1;
        int c = a + b;

        //
        while (c <= numero) {
            //Verificando se a soma dos 2 valores são igual o atual
            if (c == numero) {
                return true;
            }
            //Caso contrario irar realizar a soma da proxima operação
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }


}
