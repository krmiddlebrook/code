/**
	A class that demonstrates how to create and use an 
	ArrayList.
	@author Sami Rollins
**/
//java.util.ArrayList must be imported before it may be used.
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		//An example that creates an ArrayList of 
		//Strings, adds several strings, and prints
		//the list using a standard for loop.
		ArrayList<String> words = new ArrayList<String>();

		//add words to list
		words.add("Hello");
		words.add("Goodbye");
		words.add("Computer Science!");


		//note, this loop uses the Java increment operator
		//print contents of list
		for(int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			System.out.println(word);
		}


		//separating the output
		System.out.println("\n***************\n");

		//An example that creates an ArrayList
		//of Integer, add several ints, and 
		//prints the list using a for-each loop.
		//Note that Java automatically converts
		//from primitive types to their object
		//wrappers.
		//see: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
		ArrayList<Integer> numbers = new ArrayList<Integer>();


		//add numbers to list and print result


		Integer x = new Integer(3);
		numbers.add(x);
		numbers.add(7);
		numbers.add(3);
		numbers.add(19);

		//Even though the get method returns an
		//Integer it is automatically converted to 
		//an int
		//TODO: retrieve first item
		for (int number: numbers) {
			System.out.println(number);
		}

		//separating the output
		System.out.println("\n***************\n");


		//An example that creates an ArrayList of 
		//Names, adds several Names, and prints 
		//the list using a for-each loop.
		//To compile this example make sure that 
		//the Name class is in the same directory
		//and compiled at the same time.		


		Name n1 = new Name("Bob", "Smith", 'X');
		Name n2 = new Name("Sally", "Jones", 'P');
		Name n3 = new Name("Herb", "Zuniga", 'R');

		ArrayList<Name> names = new ArrayList<Name>();

		names.add(n1);
		names.add(n2);



		for(int i = 0; i < names.size(); ++i) {
			Name tmpName = names.get(i);
			System.out.println(tmpName.toString());
		}

		n1.setLast("Jones");

		for(Name name: names) {
			System.out.println(name);
		}

	/*		
		if(names.contains(n3)) {
			System.out.println("names contains: " + n3.toString());
		} else {
			System.out.println("names does not contain: " + n3.toString());
		}
	*/
		
		
	}

}