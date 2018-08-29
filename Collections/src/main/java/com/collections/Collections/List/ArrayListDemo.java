package com.collections.Collections.List;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.function.Predicate;

/* Array - String arr[] = new String[10] - FixedSized
 * ArrayList<String> ArrList = new ArrayList<String>(); - DynamicSize
 * Initial capacity - ten.
 * 
 * ArrayList can’t be created for primitive data types,
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*<String> - Generic - 
		 * Restricting Collection to Store specific type of Objects*/
		
		//Constructs an empty list with an initial capacity of ten.
		ArrayList<String> traineeName = new ArrayList<String>();
		
		/* in Java 1.8, Until we add First element Capacity will be Zero */
		traineeName.add("Pragati");
		
		/* After Adding First Element to the List, Default Capacity will be 10*/
		traineeName.add("Pooja");
		traineeName.add("Swati");
		traineeName.add("Pooja"); // Can contain the Duplicate Element
		
		System.out.println("List Of Trainee Employee: "+ traineeName );
		//List Of Trainee Employee: [Pragati, Pooja, Swati, Pooja]
		
		//Constructs an empty list with an initial capacity of 100.
		ArrayList<String> employerName = new ArrayList<String>(100);
		employerName.addAll(traineeName);
		
		 // Index ...........[0,        1,     2,      3]
		// List Of Employee: [Pragati, Pooja, Swati, Pooja]
		System.out.println("List Of Employee: "+ employerName);
		
		System.out.println("Get The value from Index-2: "+ employerName.get(2)); // Swati
	
		employerName.add(2, "Rohit");
		employerName.add(3, "Alex");
		
		/* If we add in btween , element will get shifted towards right
		[0,         1,     2,     3,    4,    5]
		[Pragati, Pooja, Rohit, Alex, Swati, Pooja]
		*/
		System.out.println("List Of Employee: After adding New employees "+ employerName);
				
		/* and If we Remove from in between elements will shift towards Left*/
		
		employerName.remove(3);
		System.out.println("Remove Employee from index-3: "+ employerName);
		employerName.remove("Pooja"); // As we have two Pooja's in the List , it will remove the 1st Pooja
		System.out.println("Remove employee Pooja: "+ employerName);
		
		// Java 1.8 feature
		//removeIf(), replaceAll(), forEach()
		// Represents a predicate (boolean-valued function) of one argument.
		employerName.removeIf((String str)->str.contains("oo"));
		System.out.println("removeIf employee- 'oo': "+ employerName);
		
		//employerName.addAll(5, traineeName); -> will throw IndexOutOfBoundsException index > size || index < 0
		employerName.addAll(3, traineeName);
		System.out.println("Adding more Employee "+ employerName);
		
		employerName.forEach(System.out::println);
		System.out.println("------------------------------------------");
		employerName.replaceAll((String str)->str.replace("oo", "u"));
		employerName.forEach(System.out::println);
		System.out.println("------------------------------------------");
		employerName.sort(String.CASE_INSENSITIVE_ORDER);
		employerName.forEach(System.out::println);
		
	}

}
