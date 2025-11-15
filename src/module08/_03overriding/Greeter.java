package module08._03overriding;

public class Greeter
{
   public String greet()
   {
      return "Hi";
   }
   
   public String greet(String who) //greet(String who) method overloads the greet() method of Greeter
   {
      return "Hello " + who;
   }
   
   public static void main(String[] args)
   {
      Greeter g1 = new Greeter();
      System.out.println(g1.greet());
      Greeter g2 = new MeanGreeter();
      System.out.println(g2.greet());
   }
}
