public class Main 
{
	//7
	public static String function1(String word, int n)
	{
		String concatenated = "";
		
		for(int i = 0; i < n; i++)
		{
			concatenated = concatenated + word;
		}
		
		return concatenated;
	}
	
	
	
	//8
	public static String function2(String firstName, String lastName)
	{
		String full_name = firstName + " " + lastName;
				
		return full_name;
	}
	
	
	
	//9
	public static boolean function3(int array[])
	{
		int sum = 0;
		
		for(int i : array)
		{
			sum = sum + i;
		}
		
		if(sum > 100)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	//10
	public static double function4(double array[])
	{
		double average = 0;
		
		for(double i : array)
		{
			average = average + i;
		}
		
		average = average / array.length;
		
		return average;
	}
	
	
	
	//11
	public static boolean function5(double array1[], double array2[])
	{
		double average1 = function4(array1);
		double average2 = function4(array2);
		
		if(average1 > average2)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		if(isHotOutside == true && moneyInPocket > 10.5)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	//13
	public static void test()
	{
				//7				
				String concatenated = function1("Hello", 3);
				System.out.println(concatenated);				
				
				
				//8				
				String full_name = function2("Turd-Burglar", "McNuggets");
				System.out.println(full_name);
				
								
				//9				
				int array_int[] = new int[] {100, 0 ,-1};		
				boolean b = function3(array_int);
				System.out.println(b);
				
										
				//10				
				double array_double[] = new double[] {100, 0, 50, 50, 70, 100, 100, 1000}; 
				double average_double = function4(array_double);
				System.out.println(average_double);
								
				
				//11				
				double array_double1[] = new double[] {100, 0, 50, 50, 70, 100,}; 
				double array_double2[] = new double[] {100, 0, 50, 50, 71, 100,}; 
				boolean b1 = function5(array_double1, array_double2);		
				System.out.println(b1);
								
				
				//12				
				boolean b2 = willBuyDrink(true, 10.01);
				System.out.println(b2);
	}
	
	
	
//////main
	public static void main(String args[]) 
	{ 		
		//1-a
 		int ages[] = new int[] {3,9,23,64,2,8,28,93};
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		
		//1-b
		// Arrays are not dynamic
		
		
		//1-c
		int average = 0;
		for(int i : ages)
		{
			average = average + i;
		}
		
		average = average / ages.length;
		
		System.out.println(average);
		
		
		//2-a
		String names[] = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int name_count_average = 0;
		String name 		   = "";
		
		for(int i = 0; i < names.length; i++)
		{
			for(int j = 0; j < names[i].length(); j++)
			{
				name_count_average++;
			}
		}
		
		name_count_average = name_count_average / names.length;
		
		System.out.println(name_count_average);
		
		
		//2-c
		for(String i : names)
		{
			name = name + i + " ";
		}
		
		System.out.println(name);
		
		
		//3
		// .length - 1
		
		
		//4
		// array[0]
				
		
		//5
		int nameLength[] = new int[names.length];
		
		int sum = 0;
		
		for(int i = 0; i < nameLength.length; i++)
		{
			nameLength[i] = names[i].length();
		}
		
		
		//6
		for(int i : nameLength)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		//7
		/*
		String concatenated = function1("Hello", 3);
		System.out.println(concatenated);
		*/
		
		
		//8
		/*
		String full_name = function2("Turd-Burglar", "McNuggets");
		System.out.println(full_name);
		*/
		
		
		//9
		/*
		int array_int[] = new int[] {100, 0 ,-1};		
		boolean b = function3(array_int);
		System.out.println(b);
		*/
		
				
		//10
		/*
		double array_double[] = new double[] {100, 0, 50, 50, 70, 100, 100, 1000}; 
		double average_double = function4(array_double);
		System.out.println(average_double);
		*/
		
		
		//11
		/*
		double array_double1[] = new double[] {100, 0, 50, 50, 70, 100,}; 
		double array_double2[] = new double[] {100, 0, 50, 50, 71, 100,}; 
		boolean b1 = function5(array_double1, array_double2);		
		System.out.println(b1);
		*/
		
		
		//12
		/*
		boolean b2 = willBuyDrink(true, 10.01);
		System.out.println(b2);
		*/
		
		
		//13
		// Test functions commented out and displays the results on console
		//test();
	}
}