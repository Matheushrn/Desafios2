package desafios2;

import java.util.Scanner;

public class Calculoemprestimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		double seis = 0.05;
		double doze = 0.10;
		double VinteQuatro = 0.15; 
		
		System.out.println("Taxa de empréstimo");
		
		System.out.println("Digite o valor do empréstimo: ");
		double emprestimo = sc.nextDouble(); 
		
		System.out.println("Escolha quantas parcelas deseja para ver o valor do emprestimo");
		System.out.println("1 - 6 meses");
		System.out.println("2 - 12 meses");
		System.out.println("3 - 24 meses");
		
		op = sc.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("6 meses");
			double ValorFinal6 = emprestimo * (1 + seis);
			System.out.printf("O valor final fica em %.2f Reais \n", ValorFinal6);
			break;
		
		
		
		case 2:
			System.out.println("12 meses");
			double ValorFinal12 = emprestimo * (1 + doze);
			System.out.printf("O valor final fica em %.2f Reais \n", ValorFinal12);
			break;
		
		
		case 3 :
			System.out.println("24 meses");
			double ValorFinal24 = emprestimo * (1 + VinteQuatro);
			System.out.printf("O valor final fica em %.2f Reais \n", ValorFinal24);
			break;
			
		case 0: 
			System.out.println("Obrigado por usar o nosso programa");
			break;
			
		default:
			System.out.println("op inválida");
		}
		
	sc.close();

	}

}
