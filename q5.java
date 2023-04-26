import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = sum_Of_Digits(n);
        System.out.println("The sum of digits of " + n + " is " + sum);
        sc.close();
    }
    public static int sum_Of_Digits(int n) {
        if (n < 10) {
            return n;
        }

        int sum = 0;

        while (n > 0) {
            
            sum += n % 10;

            n /= 10;
        }

        return sum;
    }
}
