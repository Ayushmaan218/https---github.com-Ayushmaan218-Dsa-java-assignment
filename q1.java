import java .util.*;
public class q1{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a= sc.nextInt();
            int k= 0;
            while(a!=2){
                a = a/2;
                k++;
            }
            System.out.println(k);
        sc.close();
    }
}
