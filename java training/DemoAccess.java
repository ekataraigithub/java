import home.DemoHall;
public class DemoAccess {

    
     private int num1=10;
    public static void main(String[] args) {

        // DemoAccess objDemoAccess = new DemoAccess();
        // objDemoAccess.display();

        Demo2 objDemo2= new Demo2();
        System.out.println( objDemo2.DefaulNum);
        
        DemoHall objDemoHall=new DemoHall();
        System.out.println(objDemoHall);
        System.out.println(objDemoHall.name1);
        objDemoHall.tvMethod();
    }

    void display()
    {
        System.out.println(num1);
    }
}
  class Demo2{
    private int privateNum=20;//private
    int DefaulNum=30;//default


    void show(){
        System.out.println(privateNum);
    }
  }