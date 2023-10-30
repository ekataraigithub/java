import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        int age=sc.nextInt();
        // if(num>0){
        //     System.out.println("positive");

        // }else if(num==0){
        //     System.out.println("zero");{

            
        //     }
        //     else{
        //         System.out.println("negative");
        //     }
          
        //ternary operator
        // string result(num>18)? ""
        String result =(num>0)? "POSITIVE" :"NEGATIVE";
        System.out.println(result);
        }
        
    }


