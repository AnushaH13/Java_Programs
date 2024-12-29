import java.util.Scanner;

public class DecimalToBinary 
{
    public static void main(String[] args) {
        int[] a = new int[10]; 
        int n, i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to convert: ");
        n = scanner.nextInt();
        while (n > 0) {
            a[i] = n % 2; 
            n = n / 2;   
            i++;
        }
        System.out.print("Binary of the given number = ");
        for (i = i - 1; i >= 0; i--) 
		{ 
            System.out.print(a[i]);
        }
        scanner.close();
    }
}