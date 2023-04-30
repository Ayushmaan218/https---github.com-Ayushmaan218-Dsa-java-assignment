import java.util.Scanner;

public class Student {
    int roll;
    String name;
    double DSA_Marks;
    public Student(int roll, String name, double DSA_Marks){
        this.roll = roll;
        this.name = name;
        this.DSA_Marks = DSA_Marks;
    }
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the roll Number");
        roll = sc.nextInt();
        System.out.println("Enter the DSA marks");
        DSA_Marks = sc.nextDouble();
    }
    public void  showdata(){
        System.out.println("Name:"+name+" roll:"+roll+" DSA Marks:"+DSA_Marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student(0, null, 0);
        Student s2 = new Student(0, null, 0);
        Student s3 = new Student(0, null, 0);
        Student s4 = new Student(0, null, 0);
        Student s5 = new Student(0, null, 0);
        s1.getdata();
        s2.getdata();
        s3.getdata();
        s4.getdata();
        s5.getdata();
        s1.showdata();
        s2.showdata();
        s3.showdata();
        s4.showdata();
        s5.showdata();
    }
    
}
