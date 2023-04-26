import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();int s = 0,m = 1;
        while(n!=0){
            int k = n%10;
            s = s+k;
            m = m*k;
            n = n/10;
        }
        if(s == m){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("It is not a spy number");
        }
        sc.close();
    }
}
