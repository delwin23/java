abstract class Animal {
   abstract void walk();
   void breathe() {
       System.out.println("This animal breathes air");
   }
   Animal() {
       System.out.println("You are about to create an Animal.");
   }
}

class Horse extends Animal {
   Horse() {
       System.out.println("Wow, you have created a Horse!");
   }
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}

class Chicken extends Animal {
   Chicken() {
       System.out.println("Wow, you have created a Chicken!");
   }
   void walk() {
       System.out.println("Chicken walks on 2 legs");
 }
}
class Zebra extends Animal{
Zebra(){
System.out.println("u have created a zebra);
}
void walk(){
System.out.println("zebra walks on 4 legs");
}

public class Main {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
      Chicken c1=new Chicken();
      c1.walk();
      horse.breathe();
      Zebra z1=new Zebra();
      z1.walk();
   }
}

