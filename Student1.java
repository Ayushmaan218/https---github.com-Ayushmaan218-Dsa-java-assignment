import java.util.Scanner;

class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        roll = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }
}

class Test extends Student {
    int mark1;
    int mark2;

    public Test(String name, int roll, int mark1, int mark2) {
        super(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

interface Sports {
    int score1 = 10;
    int score2 = 20;
}

class Result extends Test implements Sports {
    int score1;
    int score2;

    public Result(String name, int roll, int mark1, int mark2, int score1, int score2) {
        super(name, roll, mark1, mark2);
        this.score1 = score1;
        this.score2 = score2;
    }

    public void display() {
        super.output();
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        int grandTotal = mark1 + mark2 + score1 + score2;
        System.out.println("Grand total: " + grandTotal);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Result result = new Result("", 0, 0, 0, 10, 20);
        result.input();
        result.display();
    }
}
