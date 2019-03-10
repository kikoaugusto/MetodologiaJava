import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex5
{
	public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		int litros;
		double total = 0;
        System.out.println("Digite o numero de litros de gasolina: ");
        litros = leitor.nextInt();
        total = (litros*2.5) + 6;
        System.out.println("O total da conta eh: " + total + " reais");
       
    }
}