import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex3
{
	public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        int num;
        String op;
        System.out.println("Digite o numero para a tabuada: ");
        num = leitor.nextInt();
        System.out.println("Qual operacao deseja realizar: (x, /, +, -)");
        op = leitor.next();
       
        for (int i = 1; i < 10; i++) {
            if("x".compareTo(op) == 0) {
                System.out.println(num + " x " + i + " = " + num*i);
            }
            else if("/".compareTo(op) == 0) {
                System.out.println(num + " / " + i + " = " + num/i);
            }
            else if("+".compareTo(op) == 0) {
                System.out.println(num + " + " + i + " = " + (num+i));
            }
            else {
                System.out.println(num + " - " + i + " = " + (num-i));
            }
        }
       
    }
}