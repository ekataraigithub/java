public class DemoClass {
    public static void main(String[] args) {
        Blueprint objb=new Blueprint();
       objb.takeNumber();
       objb.takeName();
    }
}






class Blueprint{
    int num; //instance variable
    String name;

    void takeNumber(){
        num=10;
        System.out.println(num);
    }

    void takeName(){
        name ="Rai";
        System.out.println(name);
    }
}
