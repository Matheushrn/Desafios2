package desafios2;

import java.util.Scanner;

public class Jogoadvinhacao {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				int maquina =(int) (Math.random() * 10);
				int usuario;
					System.out.println("Bem-vindo ao jogo de advinhação");
					System.out.println("Você tem uma chance para acertar boa sorte!");
					System.out.println("Informe um número: ");
					usuario = sc.nextInt();
					if(usuario == maquina) {
						System.out.println("Parabéns, Você acertou! c:");
					}else if(usuario != maquina){
						System.out.println("Infelizmente Você errou :c");
					}
				
				
				sc.close();
		
	}

}


