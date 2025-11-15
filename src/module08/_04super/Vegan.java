package module08._04super;

public class Vegan extends Student {

    public Vegan(String theName){
        super(theName);
    }

    @Override
    public String getFood(){
        String output = super.getFood(); //go to the getFood superclass --> "Hamburger"
        return "No " + output + ", only Salad";
    }

    public static void main(String[] args)
      { // the p1 is type person
         Person p1 = new Vegan("Javier"); //creating object
         System.out.println(p1.getFood()); //"No Hamburger and Taco, only Salad"
      }

}
