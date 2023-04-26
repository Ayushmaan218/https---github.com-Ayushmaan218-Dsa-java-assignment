import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        double arr[][]=new double [n][n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(sumMajorDiagonal(arr));
        sc.close();
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
