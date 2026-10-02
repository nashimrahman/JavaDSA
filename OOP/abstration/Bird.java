package OOP.abstration;

//abstract class or interface both are same -> we can not creat obj of abstract class
abstract class Bird {

    //abstract methods -> subclass should define these methods
     abstract void fly();
     abstract void eat();

     //normal method
     public void sleep(){
         System.out.println("Bird is sleeping");
     }

}


