import java.util.Scanner;

class person{
  String name;
  int age;
  public person(String n,int a){
    name = n;
    age = a;
  }
}
public class Employee extends person{
  int Eid;
  double salary;
  public Employee(String name, int age, int E, double s){
    super(name,age);
    Eid = E;
    salary = s;
  }
  public void empDisplay(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Employee Id: "+Eid);
    System.out.println("Salary: "+salary);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    String str = sc.nextLine();
    System.out.println("Enter age");
    int age = sc.nextInt();
    System.out.println("Enter Employee Id"); 
    int n = sc.nextInt();
    System.out.println("Enter Salary");
    double S = sc.nextDouble();
    Employee e = new Employee(str,age,n,S);
    e.empDisplay();
    sc.close();
  }
}