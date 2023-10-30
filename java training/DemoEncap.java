public class DemoEncap {
    public static void main(String[] args) {
        Student objStudent=new Student();
        //objStudent.name="ekata rai"; //seeting the  name using var
        //objStudent.setName("rai");
        //System.out.println("Name of Student= "+objStudent.name); //getting the name,using the variable

       // System.out.println(objStudent.getName());
       objStudent.setRoll(82);
       System.out.println(objStudent.getRollNo());
    }
}


class Student{
    String name;
    int rollNo;


//setting the name with the method and using another variable
    void setName(String newName){
        name=newName;
    }
    String getName(){
        return name;
    }


    void setRoll(int No){
        rollNo= No;
    }
    int getRollNo(){
        return rollNo;
    }
}

