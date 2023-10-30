public class DemoReturn {
    public static void main(String[] args) {

        Operations objo=new Operations();

        //System.out.println(objo.add(););
        //objo.add();
        System.out.println(objo.add1());
        System.out.println(objo.displayName());
        System.out.println((objo.fadd(35,65)));
        
    }
}

class Operations{
    int num1=23;
    int num2=56;

    void add(){// void return type//doesn't provide any return value
        int sum=num1+num2;
        System.out.println(sum);
    }


    int add1(){   //non void return type//return value (int value)
      int result =num1+num2;
     
        return result;
    }
    //  String displayName(){
    //     String name="Delhi kec";
    //     return 0;
    //  }


   String displayName(){
    return null ;
   }

   boolean value(){
    return true;
   }
    float fadd( float a,float b){
        
        return a+b;
    
    }
}


