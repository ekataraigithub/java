public class DemoJump {
    public static void main(String[] args) {
        int n;
        for(n=0;n<=5;n++){
            System.out.println(n);
            if(n==3){
                System.out.println("we need a break");
               // break;
               continue;
            }
            System.out.println("inside on a last of for loop");
        }
        System.out.println("out of for loop");
    }
    
}
