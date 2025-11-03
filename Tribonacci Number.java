import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();

        int a = 0, b = 1, c = 1;

        System.out.print("Tribonacci Series: ");

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");
        if (n >= 3) System.out.print(c + " ");

        for (int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}
