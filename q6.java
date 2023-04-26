import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
        sc.close();
    }
    public static boolean isOdd(int n){
        while(n>1){
            n=n-2;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
    
}
