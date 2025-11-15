package module08._04super;

public class Person 
{
      private String name = null; //instance variable
      
      public Person(String theName) //constuctor
      {
         name = theName;
      }
      
      public String getFood() //a method called getFood
      { //constructor: super();
         return "Hamburger";
      }
      
      public static void main(String[] args)
      {
         Person p = new Student("Javier");
         System.out.println(p.getFood());
      }
   }
