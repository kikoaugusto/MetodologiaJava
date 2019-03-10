import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex6
{
	public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		Double salario;
		Double prestacao;
		System.out.println("Entre com o salario: ");
		salario = leitor.nextDouble();
		System.out.println("Entre com o valor da prestacao: ");
		prestacao = leitor.nextDouble();
		if(prestacao > 0.3*salario) {
			System.out.println("Emprestimo nao concedido");
		}
		else {
			System.out.println("Emprestimo concedido");
		}
       
    }
}