import home.DemoHall;
import home.kitchen.DemoKitchen;
public class DemoPackage {
    public static void main(String[] args) {
        DemoHall objDemoHall=new DemoHall();
        DemoKitchen objDemoKitchen=new DemoKitchen();
        objDemoHall.tvMethod();
        objDemoKitchen.groceryMethod();
    }
}
