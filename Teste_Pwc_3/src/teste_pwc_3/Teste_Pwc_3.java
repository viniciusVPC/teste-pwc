package teste_pwc_3;

import java.util.Scanner;

public class Teste_Pwc_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String frase = input.nextLine();
        char[] letras = frase.toCharArray();
        String palindromoAtual = "";
        for (int i = 0; i < letras.length; i++) {
            for (int j = i; j < letras.length; j++) {
                for (int k = i; k < j - i; k++) {
                    if (letras[k] != letras[(j - i) - k]) {
                        break;
                    }
                    if (String.valueOf(letras).substring(i, j - 1).length() > palindromoAtual.length()) {
                        palindromoAtual = String.valueOf(letras).substring(i, j - 1);
                    }
                }
            }
        }
        System.out.println(palindromoAtual);
    }

}
