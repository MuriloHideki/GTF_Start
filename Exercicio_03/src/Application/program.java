package Application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, can1 = 0, can2 = 0, can3 = 0, can4 = 0;
		double percent, votBranco = 0, votNulo = 0;
		do {
		System.out.printf("Números disponíveis: \n1-Candidato 1\n2-Candidato 2\n3-Candidato 3\n4-Candidato 4\n"
				+ "5-Voto nulo\n6-Voto em branco\n");
			num = sc.nextInt();
			switch (num) {
			case 1:
				can1 ++;
				break;
			case 2:
				can2 ++;
				break;
			case 3:
				can3 ++;
				break;
			case 4:
				can4 ++;
				break;
			case 5:
				votNulo ++;
				break;
			case 6:
				votBranco ++;
				break;
			default:
				break;
			}
		}while (num != 0);
		/*O total de votos para cada candidato;
		O total de votos nulos:
		O total de votos em branco;
		A percentagem de votos nulos sobre o total de votos;
		A percentagem de votos em branco sobre o total de votos.*/
		
		System.out.println("----------------Votos---------------");
		System.out.println("Candidato 1 = "+can1+"\nCandidato 2 = "+can2+"\nCandidato 3 = "+can3+"\nCandidato 4 = "+can4);
		System.out.println("Votos nulo = "+votNulo+"\nVotos em branco = "+votBranco);
		percent = 100*(votNulo/(can1 + can2 + can3 + can4 + votBranco));
		System.out.println("A percentagem de votos nulos sobre o total de votos = "+percent);
		percent = 100*(votBranco/(can1 + can2 + can3 + can4 + votNulo));
		System.out.println("A percentagem de votos em branco sobre o total de votos = "+percent);
		sc.close();
	}

}
