package desafios2;

import java.util.Scanner;

public class conversormoedas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op;
		double reais;
		double dolar = 0.20;
		double euro = 0.18;
		double libra = 0.15;
		
		
			System.out.println("Conversor de moedas");
			System.out.println("Escolha qual moeda deseja converter");
			System.out.println("1 - Dólar");
			System.out.println("2 - Euro");
			System.out.println("3 - Libra");
			
			
			op = sc.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("Dólar");
				System.out.println("Digite a quantidade em reais que deseja converter");
				reais = sc.nextDouble();
				double taxadolar = reais * dolar;
				System.out.printf("O valor fica em %.2f dólares\n", taxadolar);
				break;
			
			
			
			case 2:
				System.out.println("Euro");
				System.out.println("Digite a quantidade em reais que deseja converter");
				reais = sc.nextDouble();
				double taxaeuro = reais * euro;
				System.out.printf("O valor fica em €%.2f Euros\n", taxaeuro);
				break;
			
			
			case 3 :
				
				System.out.println("Libra");
				System.out.println("Digite a quantidade em reais que deseja converter");
				reais = sc.nextDouble();
				double taxalibra = reais * libra;
				System.out.printf("O valor fica em £%.2f Euros\n", taxalibra);
				break;
				
			case 0: 
				System.out.println("Sair");
				break;
				
			default:
				System.out.println("op inválida");
			}
			
		sc.close();
	}

}
