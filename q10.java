import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        double arr[][] = new double[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextDouble();
            }
        }
        for(int i =0;i<4;i++){
            System.out.println("Sum of the elements in column " + i + " is " + sumColumn(arr, i));
            sc.close();
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
