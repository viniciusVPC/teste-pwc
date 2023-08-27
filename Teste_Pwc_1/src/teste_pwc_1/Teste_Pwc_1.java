package teste_pwc_1;

import java.util.Scanner;
import java.util.Stack;

public class Teste_Pwc_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> fraseSeparada = new Stack<String>();
        String fraseSaida;

        for (String palavra : input.nextLine().split(" "))
            fraseSeparada.push(palavra);
        
        fraseSaida = fraseSeparada.pop();
        
        while (!fraseSeparada.isEmpty())
            fraseSaida += " " + fraseSeparada.pop();
        
        System.out.println(fraseSaida);
        input.close();
    }

}
