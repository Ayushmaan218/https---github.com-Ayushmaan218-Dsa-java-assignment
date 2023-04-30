import java.util.Scanner;

public class phone {
    int area_code;
    int exchange;
    int Number;

    public phone(int area_code,int exchange,int number){
        this.area_code = area_code;
        this.exchange = exchange;
        this.Number = number;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area code");
        area_code = sc.nextInt();
        System.out.println("Enter the exchange");
        exchange = sc.nextInt();
        System.out.println("Enter the number");
        Number = sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println("(" +area_code+" "+exchange+" "+Number+")");
    }
    public static void main(String[] args) {
        phone p1 = new phone(212, 767, 8900);
        phone p2 = new phone(0, 0, 0);
        p2.input();
        p1.display();
        p2.display();
    }
    
}
