public class DemoConstructor {
    public static void main(String[] args) {
         //NoArgDemo objNoArgDemo = new NoArgDemo();
    }
    //DefaultDemo objDefaultDemo=new DefaultDemo();
     ParaDemo objPD= new ParaDemo("KEC");
    //  objPD.show();
    }


class DefaultDemo{
    //DefaultDemo();
}

class NoArgDemo{
    int num1 =10;
    int num2 =20;
     NoArgDemo(){
        int result=num1+num2;
        System.out.println(result);
        //System.out.println("Hello we are in no arg demo");
    
    }
       void show(){
        System.out.println("Hello we are in show method");
       }

       int show1(){
        return 0;

       }
}
  class ParaDemo{
    String name;
    ParaDemo(String newName){
        name=newName;
        System.out.println(name);
    }
  

   void show(){
    System.out.println("Hello we are in parademo class");
  }
}
