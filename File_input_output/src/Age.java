
import java.io.*;

public class Age {
	public static void main(String [] args) throws IOException {

		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader systemIn = new BufferedReader(inStream);

		String my_name, greeting, myAge, variable;

		greeting = "Hello ";

		// Your input name, 
		System.out.println("Please your name");
		my_name = systemIn.readLine();
		
		// Your input age
		System.out.println("Please  your age");
		myAge = systemIn.readLine();

		// Concatenation
		// Output
		System.out.println(greeting + my_name + "! \nYour age is: " + myAge);
	}
}


