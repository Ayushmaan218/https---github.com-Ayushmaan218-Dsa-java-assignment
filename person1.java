import java.util.Scanner;
interface DetailInfo{
    public void display();
    public int count();
}
public class person1 implements DetailInfo {
    private String name;
    private static int maxCount = 0;
    public person1(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Number of characters in name: " + count());
    }
    public int count(){
        int count = name.length();
        if(count > maxCount){
            maxCount = count;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name 1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter the name 2 :");
        String str2 = sc.nextLine();
        person1 p1 = new person1(str1);
        person1 p2 = new person1(str2);
        p1.display();
        p2.display();
        System.out.println("Maximum number of charecter in a name is:"+maxCount);
        sc.close();
    }
}
