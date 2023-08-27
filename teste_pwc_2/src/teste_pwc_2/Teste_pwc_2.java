package teste_pwc_2;

import java.util.Scanner;

public class Teste_pwc_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();

        char[] letras = frase.toCharArray();
        String novaFrase = "";
        
        for (int i = 0; i < letras.length; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if(letras[j] == letras[i]) count++;
            }
            if(count < 2) novaFrase += letras[i];
        }
        System.out.println(novaFrase);
        input.close();
    }

}
