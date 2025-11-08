package module07._5this;

import javax.xml.catalog.Catalog;

public class Cat {

    //instance variables (has-a's)
    //name
    //breed
    //age
    //favorite toy
    //voice
    //fur
    
    private String name;
    private int age;    
    private String voice;
    private int fur;
    //private Cat mother; //Cat as a type, more flexibility

    public Cat(String name, String voice, int fur){
        this.name = name;    //"this" refers to instance variable in the class, to avoid ambiguity
        age = 0;    //created with an initial age of 0, not included as parameter
        this.voice = voice;
        this.fur = fur;
    }

    //methods (can-do)
    //sleep
    //playing
    //eating
    //meowing
    //shedding

    public void meow(){
        System.out.println(name + " says " + voice);  //accessing an instance variable
    }
    
    public void shed(){
        if(this.fur > 100){ //check there is hair to check
        this.fur -= 100; //shed 100 hairs, "this." could be deleted
        }
    }

    public int getFur(){    //see exactly how much hair the cat has remaining
        return fur;
    }

    public static void main(String[] args){
        Cat franklin = new Cat("Franklin", "MEOOOoOWWWW", 1000);
        Cat Lindsay = new Cat("Lindsay", "mew", 100000);     
        //create a couple of cats to represent cat

        while(franklin.getFur() > 0 && Lindsay.getFur() > 0){
            franklin.meow();
            Lindsay.meow();
            franklin.shed();
            Lindsay.shed(); //code run until one of the cat has no more fur left to shed
        }
    }
}
