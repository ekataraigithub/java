public class DemoInheritance {
     public static void main(String[] args) {
        
        // Vehicle objV = new Vehicle();
        // Bike objB= new Bike();
        // objB.setSpeed(200);
        // System.out.println(objB.getSpeed());
        // objB.setModel("Hero Honda");
        // System.out.println(objB.getModel());

        SportBike objSB= new SportBike();
        objSB.setSpeed(200);
        System.out.println(objSB.getSpeed());
        objSB.setModel("Hero Honda");
        System.out.println(objSB.getModel());
        objSB.setCC(350);
        System.out.println(objSB.getCC());

    }
}


//parent class //grand parent class
class Vehicle{
    int speed;


    void setSpeed(int newSpeed){
        speed= newSpeed;
    }

    int getSpeed(){
        return speed;
    }

}

//child class // parent class
class Bike extends Vehicle{
    String Model;
    void setModel(String newModel){
        Model= newModel;
    }

    String getModel(){
        return Model;
    }
}

//sub-child class  //child class
class SportBike extends Bike{
    int engineCC;
    void setCC(int newCC){
        engineCC= newCC;
    }

    int getCC(){
        return engineCC;
    }
}

class Car extends Vehicle{

}

class Truck extends Vehicle{

}
/* 
class Cartruck extends Car,Truck{
    //not possible in java
}*/



// final class bnane pe uski child class ni ban skti.. we are not able to derive subclass from that class.




   