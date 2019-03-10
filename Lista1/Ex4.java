import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex4
{
	public static void main(String[] args) {
    	Double salario;
    	String linha;
        Scanner leitor = new Scanner(System.in);
        while(true) {
	        linha = leitor.next();
	        if (linha.equals("Fim"))
	            break;
	        salario = Double.parseDouble(linha);
	        if(salario<500) {
	        	salario = salario*1.2;
	        	System.out.println(salario);
	        }
	        else{
	        	System.out.println("Nao teve direiro a aumento");
	        }
        }
       
    }
}