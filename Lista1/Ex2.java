import java.util.*;
import java.lang.*;
import java.io.*;

public class Ex2
{
	public static void main(String[] args) {
       
        int[] array = new int[10];  
        int temp;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++) {
            temp = leitor.nextInt();
            array[i] = temp;
        }
        for (int i = 0; i < 10; i++) {
            if(array[i]%2 == 0) System.out.println("Par");
            else System.out.println("Impar");
        }
       
    }
}