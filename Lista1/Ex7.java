import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex7
{
	public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		Double nota1;
		Double nota2;
		Double media;
		int alunosAprovados =0;
		int alunosExame=0;
		int alunosReprovados=0;
		Double mediaClasse=0.0;
		for(int i=0; i<6; i++) {
			System.out.println("Digite a nota 1: ");
			nota1 = leitor.nextDouble();
			System.out.println("Digite a nota 2: ");
			nota2 = leitor.nextDouble();
			media = (nota1+nota2)/2;
			
			if(media<3) {
				System.out.println("Reprovado");
				alunosReprovados+=1;
			}
			else if(media >= 3 && media <= 7) {
				System.out.println("Exame");
				alunosExame+=1;
			}
			else {
				System.out.println("Aprovado");
				alunosAprovados+=1;
			}
			
			mediaClasse+=media;
		}
		mediaClasse = Math.floor((mediaClasse/6) * 100) / 100;
		System.out.println("Alunos aprovados: " + alunosAprovados);
		System.out.println("Alunos de exame: " + alunosExame);
		System.out.println("Alunos reprovados: " + alunosReprovados);
		System.out.println("Media da classe: " + mediaClasse);
       
    }
}