package desafios2;

import java.util.Scanner;

public class Fatorial {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Fatorial de um número positivo : ");

        int Numero = sc.nextInt();

        while (true) {
            if (Numero > 0) {
                int fatorial = 1;

                for (int i = 1; i <= Numero; i++) {
                    fatorial *= i;
                }

                System.out.println("O fatorial de " + Numero + " é de : " + fatorial);

                break;
            } else {
                System.out.print("O Número não é positivo, Digite Novamente : ");
                Numero = sc.nextInt();
            }
        }

        sc.close();
    }
}
