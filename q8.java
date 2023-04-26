import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("enter array element");int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("Array elements are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of array elements are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s = s+arr[i][j];
            }
        }
        System.out.println(s);
        sc.close();
    }
}
