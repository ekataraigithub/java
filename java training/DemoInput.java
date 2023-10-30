import java.util.Scanner;
public class DemoInput {
    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        // System.out.println("Enter Your Name");
        // String name=objScanner.nextLine();
        // System.out.print("Enter Your Age");
        // int age=objScanner.nextInt();
        // System.out.println("Enter Your Salary");
        
        // long salary=objScanner.nextLong();
        // System.out.println("Hello "+name+" Your age is "+age+" years old and salary "+salary);

        System.out.println("Enter your nuumber");
        int a=objScanner.nextInt();
        System.out.println("Enter your nuumber");
        int b=objScanner.nextInt();
        int sum=a+b;
        System.out.println(" Addition of "+a+" and "+b+"="+sum);

    }
}
