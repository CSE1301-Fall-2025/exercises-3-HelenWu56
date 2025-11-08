package module07._1parts;

public class Person 
{
     // instance variables 
     private String name;
     private String email;
     private String phoneNumber;
     
     // constructor: construct a Person copying in the data into the instance variables
     public Person(String initName, String initEmail, String initPhone)
     {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone; //initialize instant variables
     }
     
     // Print all the data for a person
     public void print()
     {
       System.out.println("Name: " + name);  //instant variables in blue
       System.out.println("Email: " + email);
       System.out.println("Phone Number: " + phoneNumber);
     }
     
     // main method for testing
     public static void main(String[] args)
     {
        // call the constructor to create a new person
        Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
        // call p1's print method
        p1.print();  //run the print method using p1 as an instant
        Person p2 = new Person("Jean", "jean@gmail.com", "404 899-9955");
        p2.print();  //call p2's print method
     }
  }