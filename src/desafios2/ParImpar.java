package desafios2;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de Números Pares e Ímpares");

        int Par = 0;
        int Impar = 0;

        while (true) {
            int Numero = sc.nextInt();

            if (Numero != 0) {
                if (Numero % 2 == 0) {
                    Par = Par + Numero;
                } else {
                    Impar = Impar + Numero;
                }
            } else {
                System.out.println("Soma dos Números Pares é de  : " + Par);
                System.out.println("Soma dos Números Impares é de: " + Impar);

                break;
            }
        }

        sc.close();
    }
}


