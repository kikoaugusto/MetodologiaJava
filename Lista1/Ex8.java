import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex8
{
	public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		Double contaTotal =0.0;
		while(true) {
			String nome;
			int dias;
			double contaHospede;
			String continua;
			System.out.println("Digite seu nome: ");
			nome = leitor.next();
			System.out.println("Digite quantos dias ficou no hotel: ");
			dias = leitor.nextInt();
			if(dias < 10) {
				contaHospede = dias*40.00 + 15.00;
			}
			else {
				contaHospede = dias*40.00 + 8.00;
			}
			
			contaTotal += contaHospede;
			
			System.out.println("Hospede " + nome + " deve: " + contaHospede + " Reais");
			
			System.out.println("Deseja continuar? (s/n)");
			continua = leitor.next();
			if("n".compareTo(continua) == 0) {
				break;
			}
		}
		
		System.out.println("O hotel arrecadou " + contaTotal + " reais");
       
    }
}