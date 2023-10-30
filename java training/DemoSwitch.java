import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your day number1 to 7");
        int day=sc.nextInt();

        

        switch(day){
            case 1:
            System.out.println("sun");
            break;
            case 2:
            System.out.println("mon");
            break;
            case 3:
            System.out.println("tue");
            break;
             case 4:
            System.out.println("wed");
            break;
             case 5:
            System.out.println("thu");
            break;
             case 6:
            System.out.println("fri");
            break;
             case 7:
            System.out.println("sat");
            break;

            default:
            System.out.println(" ");
            break;
        }

        }
        
    }

