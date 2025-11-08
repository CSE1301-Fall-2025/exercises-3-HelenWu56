package module07._3accessor;

public class Student 
{
    private String name;
    private String email;
    private int id;
    
    public Student(String initName, String initEmail, int initId)
    {
       name = initName;
       email = initEmail;
       id = initId;
    }
    
    // toString() method
    public String toString() 
    { 
      return id + ": " + name + ", " + email;
    }

    //accessor(getter)
    public int getId(){
      return id;
    }

    //System.out.println(me.getId());  //call the getId method

    //(setter: allows to change)
    public void setName(String newName){
      name = newName;
    }

    
    // main method for testing
    public static void main(String[] args)
    {
       Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
       System.out.println(s1);
    }
 }
