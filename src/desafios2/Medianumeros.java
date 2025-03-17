package desafios2;

import java.util.Scanner;

public class Medianumeros {
	    public static void main(String[] args)  {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Média de Números");

	        int Quantidade = 0;
	        double Soma = 0;

	        while (true) {
	            double Numero = sc.nextDouble();

	            if (Numero != 0) {
	                Quantidade = Quantidade + 1;
	                Soma = Soma + Numero;
	            } else {
	                double Media = Soma / Quantidade;
	                System.out.println("A média dos números digitados foram de " + Media); 

	                break;
	            }
	        }

	        sc.close();
	    }
	}
