import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex9
{
	public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		int qtdPacientes = 0;
		Double nHomens =0.0;
		Double idadeHomens=0.0;
		Double mediaIdadeHomens;
		int qtdMulheres =0;
		int qtdPessoas=0;
		int maisVelho = 0;
		String nomeMaisvelho ="";
		String nomeMaisbaixa ="";
		Double maisBaixa = 10.0;
		while(true) {
			String nome;
			String sexo;
			int peso;
			int idade;
			Double altura;
			System.out.println("Digite seu nome: ");
			nome = leitor.next();
			if("fim".compareTo(nome) == 0) {
				break;
			}
			qtdPacientes+=1;
			
			System.out.println("Digite seu sexo: ");
			sexo=leitor.next();
			System.out.println("Digite sua idade: ");
			idade = leitor.nextInt();
			System.out.println("Digite seu peso: ");
			peso = leitor.nextInt();
			System.out.println("Digite sua altura: ");
			altura = leitor.nextDouble();
			
			if("masculino".compareTo(sexo) == 0) {
				nHomens++;
				idadeHomens+=idade;
			}
			
			if("feminino".compareTo(sexo) == 0 && altura >= 1.60 && altura <= 1.70 && peso>70) {
				qtdMulheres++;
			}
			
			if(idade >= 18 && idade <=25) {
				qtdPessoas++;
			}
			
			if("masculino".compareTo(sexo) == 0 && idade>maisVelho) {
				maisVelho = idade;
				nomeMaisvelho = nome;
			}
			
			if("feminino".compareTo(sexo) == 0 && altura<maisBaixa) {
				maisBaixa = altura;
				nomeMaisbaixa = nome;
			}
			
	
		}
		
		mediaIdadeHomens = idadeHomens/nHomens;
		
		System.out.println("Quantidade de pacientes: " + qtdPacientes);
		System.out.println("Média de idade dos homens: " +mediaIdadeHomens + " anos");
		System.out.println("Mulheres acima do peso: " + qtdMulheres);
		System.out.println("Pacientes com idade entre 18 e 25: " + qtdPessoas);
		System.out.println("Paciente mais velho: " + nomeMaisvelho);
		System.out.println("Mulher mais baixa: " + nomeMaisbaixa);
       
    }
}