package StringReverse;

public class main {
    public static void main(String[] args) {
        String texto = "Target Sistema e Jefferson Felix"; // S
        String invertido = inverterString(texto);
        System.out.println(invertido); //
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }

        return new String(caracteres);
    }
}