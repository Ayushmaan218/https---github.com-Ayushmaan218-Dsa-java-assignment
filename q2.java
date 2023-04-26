import java .util.*;
public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight");
        double w = sc.nextDouble();
        System.out.println("Enter the height");
        double h = sc.nextDouble();
        double bmi = w/(h*h);
        if(bmi<=18.5){
            System.out.println("underWeight");
        }
        else if(bmi>18.5 && bmi<=24.9){
            System.out.println("Normal Weight");
        }
        else if(bmi>24.9 && bmi<=29.9){
            System.out.println("OverWeight");
        }
        else{
            System.out.println("Obese");
        }
        sc.close();
    }
}