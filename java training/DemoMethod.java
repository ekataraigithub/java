public class DemoMethod {
   //method in paramerters
     static int instanceNum=35;

     static void show(){
        System.out.println("we are in show() of DemoMethod class");
    }


    public static void main(String[] args) {
        DemoMethod objDemoMethod=new DemoMethod();

        System.out.println(objDemoMethod.instanceNum);
        objDemoMethod.show();
        //Calculator objCalculator=new Calculator();
        // objCalculator.add();
        // objCalculator.sub();
        //objCalculator.mul(newNum1:35,newNum2:45);
        System.out.println(Calculator.num3);
    }
}
  //calcutaor of 2 number in java
class Calculator{
    int num1=20;  //instance
    int num2=30;
    static int num3=40;


    void add(){
        int sum;
        sum=num1+num2;

        System.out.println("Addition of two numvers="+sum);
    }


    void sub(){
        int result;
        result= num1-num2;

        System.out.println("substraction of two numbers="+result);
    }
    void mul(int newNum1,int newNum2){
       int result =newNum1*newNum2;
       System.out.println(result);

    }

    
}
