package CompleteOElemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// @JeffersonFelizx //https://www.linkedin.com/in/jeffersonfelizz//

public class main {
    public static void main(String[] args) {

         // Elementos 1,3,5,7
        //Poderiamos usar o for e list para somar +2 aos numeros
                // Sequência a)
                int proximoA = proximoElementoA(7);
                System.out.println("Próximo elemento da sequência a): " + proximoA);

                //Elemento 2,4,8,16,32,64
        //Poderiamos usar o for para dobrar o numero anterior 2+2=4+4=8+8=16+16
        // +32+32+64+64+128 e usar uma ArrayList para adicionar o numero e etc
                // Sequência b)
                int proximoB = proximoElementoB(64);
                System.out.println("Próximo elemento da sequência b): " + proximoB);
                // Aqui iramos utilizar a biblioteca Math para RaizQuadrada 2*2 3*3 4*4 e etc
                // Sequência c)
                int proximoC = proximoElementoC(36);
                System.out.println("Próximo elemento da sequência c): " + proximoC);

                // Sequência d)
                int proximoD = proximoElementoD(64);
                System.out.println("Próximo elemento da sequência d): " + proximoD);

                // Sequência e)
                int proximoE = proximoElementoE(8);
                System.out.println("Próximo elemento da sequência e): " + proximoE);

                // Sequência f)
                int proximoF = proximoElementoF(19);
                System.out.println("Próximo elemento da sequência f): " + proximoF);
            }

            //Poderia ter explicado cada coisinha mais abaixo mostra como foi efetuado
            // Implementação das funções

    //Usamo um metodo statico de inteiro para retornar o ultimo numero +2
            static int proximoElementoA(int ultimo) {
                return ultimo + 2;
            }

            static int proximoElementoB(int ultimo) {
                return ultimo * 2;
            }

            static int proximoElementoC(int ultimo) {
                int indice = (int) Math.sqrt(ultimo) + 1;
                return indice * indice;
            }

            static int proximoElementoD(int ultimo) {
                int raiz = (int) Math.sqrt(ultimo);
                return (raiz + 2) * (raiz + 2);
            }

            static int proximoElementoE(int ultimo) {
                int anterior = 5;
                int atual = 8;
                int proximo;
                do {
                    proximo = anterior + atual;
                    anterior = atual;
                    atual = proximo;
                } while (proximo <= ultimo);
                return proximo;
            }

            static int proximoElementoF(int ultimo) {
                return ultimo + 1;
            }
        }
