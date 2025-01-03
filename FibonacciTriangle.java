import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, n;

        System.out.print("Enter the limit: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a = 0;
            b = 1;
            System.out.print(b + "\t");

            for (int j = 1; j < i; j++) {
                c = a + b;
                System.out.print(c + "\t");
                a = b;
                b = c;
            }
            System.out.println();
        }

        sc.close();
    }
}
