package trabalhandolambdastreamspringframework.atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        List<Integer> contador = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {

            contador.add(i);

        }

        System.out.println("Contagem de 1 até " + numero + ": " + String.join(",", contador.toString().replaceAll("[\\[\\]]", "").split(" , ")));
    }

}
