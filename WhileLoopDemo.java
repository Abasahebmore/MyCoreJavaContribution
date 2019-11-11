package assignWhileLoop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//for(initilization;condition;incr/decr)
		//{
		//statements
		//}
		
		//initilization
		//while(condn)
		//{
		//statements
		//increment/decrement
		//}
		System.out.println("Using while loop");
		int i=1;
		
		while(i<=10) {
			System.out.println("Number: " + i);
			i++;
		}
		
		System.out.println("Do...while loop");
		i=1;
		do {
			System.out.println("Number: " + i);
			i++;
		}while(i<=10);
		
		
		
	}

}
