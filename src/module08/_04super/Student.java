package module08._04super;

class Student extends Person
{
   private int id;
   private static int nextId = 0;
   
   public Student(String theName) //constructor
   {
     super(theName);
     id = nextId;
     nextId++;
   }
   
   @Override
   public String getFood() //
   {
      String output = super.getFood(); //go to the getFood superclass --> "Hamburger"
      return output + " and Taco";
   }
   
   public int getId() {return this.id;}
   public void setId (int theId) 
   {
      this.id = theId;
   }

   public static void main(String[] args)
      { // the p1 is type person
         Person p1 = new Student("Sara"); //creating object
         System.out.println(p1.getFood()); //"Hamburger and Taco"
      }

} 
