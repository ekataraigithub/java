public class DemoOperator {
    public static void main(String[] args){
        //arithmetic
        
        int num1=2;
        int num2=7;
        int sum=num1+num2;
        System.out.println("Addition"+ sum);

        int sub=num2-num1;
        System.out.println("sub"+sub);

        System.out.println("Multiplication"+num1*num2);
        System.out.println("Division"+2%4);

        //assingment

        short snum=10;
        System.out.println(snum);//10
        snum+=5;
        System.out.println(snum);//15
        snum-=10;
        System.out.println(snum);//25
        snum*=5;
        System.out.println(snum);//
        snum/=4;
        System.out.println(snum);//6
        snum%=3;
        System.out.println(snum);


        //relational
        int numOne=10;
        int numTwo=28;
        System.out.println(numOne==numTwo);//false
        System.out.println(numOne>numTwo);//false
        System.out.println(numOne<numTwo);//true

        //unary
        System.out.println(++numOne);
        System.out.println(--numTwo);

        //logical

        int x =10;
            System.out.println(x>5 && x<15);//true
             System.out.println(x<5 && x<15);//false
              System.out.println(x<5 || x<15);//true

        }
    }
    

