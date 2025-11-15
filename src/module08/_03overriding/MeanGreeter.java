package module08._03overriding;

public class MeanGreeter extends Greeter //MeanGreeter is a Greeter
{

	@Override //optional annotation
	public String greet()
	{
		return "Go Away";
	}

	public static void main(String[] args){
		Greeter g = new MeanGreeter();  //creating an object of MeanGreeter class
		System.out.println(g.greet());  //"Go Away"
		System.out.println(g.greet("Sara"));  //"Hello Sara"
		//what to do so that it uses the greet method of Greeter class?
	}
}
