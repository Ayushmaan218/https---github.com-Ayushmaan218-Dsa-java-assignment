import java.util.Scanner;

public class Deposit {
    long principal;
    int time;
    double rate;
    double Total_amt;
    public Deposit(){
        principal = 0;
        time = 0;
        rate = 0.0;
        Total_amt = 0.0;
    }
    public Deposit(long p, int t, double r){
        principal = p;
        time = t;
        rate = r;
        calc_amt();
    }
    public Deposit(long p,int t){
        principal = p;
        time = t;
        rate = 0;
    }
    public Deposit(long p,double r){
        principal = p;
        time = 0;
        rate = r;
        calc_amt();
    }
    public void display(){
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + Total_amt);
    }
    public void calc_amt(){
        Total_amt = principal + (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        long p = sc.nextLong();
        System.out.println("Enter the time period");
        int t = sc.nextInt();
        System.out.println("Enter the rate");
        double r = sc.nextDouble();
        Deposit d1 = new Deposit();
        d1.display();
        Deposit d2 = new Deposit(p, t, r);
        d2.display();
        Deposit d3 = new Deposit(p, t);
        d3.display();
        Deposit d4 = new Deposit(p, r);
        d4.display();
        sc.close();
    }
}
