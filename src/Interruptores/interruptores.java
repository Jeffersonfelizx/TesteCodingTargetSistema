package Interruptores;

import java.util.Scanner;

public class interruptores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // há 3 interruptores e lâmpadas
        int numeroDeInterruptores = 3;
        boolean[] interruptores = new boolean[numeroDeInterruptores]; //representar o estado dos interruptores

        //Ligar o primeiro interruptor
        System.out.println("\nEtapa 1: Ligar o primeiro interruptor...");
        ligarInterruptor(1, interruptores);
        esperar(); // Aguardar alguns minutos

        // Ligar o segundo interruptor
        System.out.println("\nEtapa 2: Ligar o segundo interruptor e entrar na sala...");
        ligarInterruptor(2, interruptores);

        // Identificar o estado de cada lâmpada
        System.out.println("\nIdentificar o estado de cada lâmpada...");
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está acesa. Corresponde ao segundo interruptor.");
            } else {
                if (i == 0) {
                    System.out.println("Lâmpada " + (i + 1) + " está apagada e quente. Corresponde ao primeiro interruptor.");
                } else {
                    System.out.println("Lâmpada " + (i + 1) + " está apagada e fria. Corresponde ao terceiro interruptor.");
                }
            }
        }
    }

    // Método para ligar o interruptor especificado
    public static void ligarInterruptor(int numeroInterruptor, boolean[] interruptores) {
        if (numeroInterruptor > 0 && numeroInterruptor <= interruptores.length) {
            interruptores[numeroInterruptor - 1] = true; // Ligar o interruptor (índice baseado em zero)
            System.out.println("Interruptor " + numeroInterruptor + " ligado.");
        } else {
            System.out.println("Número de interruptor inválido.");
        }
    }

    // Método para simular a espera
    public static void esperar() {
        try {
            Thread.sleep(3000); // Esperar 3 segundos (representando alguns minutos)
        } catch (InterruptedException e) {
            System.out.println("Erro ao aguardar: " + e.getMessage());
        }
    }
}
