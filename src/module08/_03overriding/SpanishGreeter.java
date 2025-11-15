package module08._03overriding;

public class SpanishGreeter extends Greeter {
    
    @Override
	public String greet()
	{
		return "Hola!";
	}

public static void main(String[] args) {
        Greeter g1 = new Greeter(); //creating object to test it out
        Greeter g2 = new MeanGreeter();
        Greeter g3 = new SpanishGreeter();

        System.out.println(g1.greet());  // Hi!
        System.out.println(g2.greet());  // Go away.
        System.out.println(g3.greet());  // Hola!
    }
}
