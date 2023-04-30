import java.util.Scanner;

class student{
    int rollNumber;
    String name;
    String course;
    public void Input_Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the course: ");
        course = sc.nextLine();
    }
    public void display_Student(){
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("name: "+name);
        System.out.println("Course: "+course);
    }
}
class Exam extends student{
    int marks1,marks2,marks3;
    public void input_marks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1:");
        marks1 = sc.nextInt();
        System.out.print("Enter mark 2:");
        marks2 = sc.nextInt();
        System.out.print("Enter mark 3:");
        marks3 = sc.nextInt();
    }
    public void display_marks(){
        System.out.println("marks 1: "+ marks1);
        System.out.println("marks 2: "+ marks2);
        System.out.println("marks 3: "+ marks3);
    }
}
public class Result{
    public static void main(String[] args) {
        Exam[] student = new Exam[5];
        for(int i=0;i<student.length;i++){
            System.out.println("Enter details of Student " + (i+1) + ":");
            student[i] = new Exam();
            student[i].Input_Student();
            student[i].input_marks();
        }
        for(int i=0;i<student.length;i++){
            System.out.println("Details of Student " + (i+1) + ":");
            student[i].display_Student();
            student[i].display_marks();
        }
    }
}