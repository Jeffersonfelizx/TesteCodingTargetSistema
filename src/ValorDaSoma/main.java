package ValorDaSoma;

// @JeffersonFelizx //https://www.linkedin.com/in/jeffersonfelizz//

public class main {
    public static void main(String[] args) {

        // Podemos fazer de duas formas
        int INDICE = 13, SOMA = 0, K = 0;

        // existem 2 opções para obter o resultado com
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        // Ou usando o for / Lembre-se de comentar o codigo de repetição que não sera
        // usando pois o mesmo poderar sair com o resultado errado 182 e o certo e 91

        //for(K=0 ; K < INDICE;){
        //    K = K+1;
        //    SOMA = SOMA + K;;
        //}

        System.out.println(SOMA); // imprime o valor final da variável SOMA
    }
}
