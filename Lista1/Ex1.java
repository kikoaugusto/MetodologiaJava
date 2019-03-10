import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex1
{
	public static void main(String[] args) {
       
        double salario;
        double perc;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        salario = leitor.nextDouble();
        System.out.println("Digite seu aumento: ");
        perc = leitor.nextDouble();
       
        salario = salario+((perc/100)*salario);
       
        System.out.println("Seu novo salario eh: " + salario);
       
    }
}